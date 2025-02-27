package utils;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class MobileUtils {
    private final int default_timeout = 60;
    private static final String apiKey = "6RiX0Czf5TNTKiGuRBlGQS87siijkepw";
    private static final String serverId = "ftfdwl0t";
    private static final String serverDomain = "ftfdwl0t.mailosaur.net";//he-horse@ebsg9iwy.mailosaur.net
    private AndroidDriver _driver;

    public MobileUtils(AndroidDriver driver) {
        _driver = driver;
    }

    public void scrollToElement(String text){
        _driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\"))"));
    }
    public void scrollUp() {
        int width = _driver.manage().window().getSize().getWidth();
        int height = _driver.manage().window().getSize().getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        int scrollDistance = (int) (height * 0.4);
        TouchAction touchAction = new TouchAction(_driver);
        touchAction.longPress(PointOption.point(centerX, centerY))
                .moveTo(PointOption.point(centerX, centerY - scrollDistance))
                .release()
                .perform();
    }

    public void scrollDown() {
        int width = _driver.manage().window().getSize().getWidth();
        int height = _driver.manage().window().getSize().getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        int scrollDistance = (int) (height * 0.2);
        TouchAction touchAction = new TouchAction(_driver);
        touchAction.longPress(PointOption.point(centerX, centerY))
                .moveTo(PointOption.point(centerX, centerY + scrollDistance)) // Move down
                .release()
                .perform();
    }

    public void scrollLeft(int distanceFromBottom) {
        int width = _driver.manage().window().getSize().getWidth();
        int height = _driver.manage().window().getSize().getHeight();
        int centerX = width / 2;
        int centerY = height - distanceFromBottom;
        int scrollDistance = (int) (width * 0.4);
        TouchAction touchAction = new TouchAction(_driver);
        touchAction.longPress(PointOption.point(centerX, centerY))
                .moveTo(PointOption.point(centerX - scrollDistance, centerY)) // Move left
                .release()
                .perform();
    }

    public void scrollRight(int distanceFromBottom) {
        int width = _driver.manage().window().getSize().getWidth();
        int height = _driver.manage().window().getSize().getHeight();
        int centerX = width / 2;
        int centerY = height - distanceFromBottom;
        int scrollDistance = (int) (width * 0.4);
        TouchAction touchAction = new TouchAction(_driver);
        touchAction.longPress(PointOption.point(centerX, centerY))
                .moveTo(PointOption.point(centerX + scrollDistance, centerY)) // Move right
                .release()
                .perform();
    }

    public void waitForElementVisibility(By locator, String elementName, int timeOut) {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println(elementName + "element is visible");
    }

    public void waitForElementVisibility(By locator, String elementName) {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(default_timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println(elementName + " element is visible.");
    }

    public void waitForAllElementsVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(default_timeout));
        List<WebElement> elements = _driver.findElements(locator);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void click(By locator, String elementName) {
        waitForElementVisibility(locator, "");
        WebElement element = _driver.findElement(locator);
        element.click();
        System.out.println("Clicked on '" + elementName + "' successfully.");
    }

    public void enterText(By locator, String txt, String elementName) {
        waitForElementVisibility(locator, elementName);
        WebElement ele = _driver.findElement(locator);
        ele.click();
        ele.clear();
        ele.sendKeys(txt);
        System.out.println("Entered text '" + txt + "' into '" + elementName + "'.");
    }

    public void hideKeyboard() {
        try {
            Thread.sleep(1000);
            if (_driver.isKeyboardShown())
                _driver.hideKeyboard();
        } catch (Exception ignored) {

        }
    }

    public void isElementVisible(By locator, String elementName) {
        waitForElementVisibility(locator, elementName);
        boolean displayed = _driver.findElement(locator).isDisplayed();
        if (displayed)
            System.out.println(elementName + " is visible");
        else
            Assert.fail(elementName + " is not visible");
    }

    public List<WebElement> getElements(By locator) {
        return _driver.findElements(locator);
    }

    public void getElementsAndClickByText(By locator, String elementName) {
        List<WebElement> elements = _driver.findElements(locator);
        for (WebElement element : elements) {
            String text = element.getText();
            if (text.contains(elementName)) {
                element.click();
                break;
            }
        }
    }

    public void enterRandomAlphabetic(By locator, String elementName, int number) {
        String text = RandomStringUtils.randomAlphabetic(number);
        this.enterText(locator, text.toLowerCase(), elementName);
    }

    public String generateEmailId() {
        String text = RandomStringUtils.randomAlphabetic(4);
        return text.toLowerCase() + "@" + serverDomain;
    }

    public String getOTPFromEmail(String email) throws MailosaurException, IOException, InterruptedException {
        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams params = new MessageSearchParams();
        params.withServer(serverId);

        SearchCriteria criteria = new SearchCriteria();

        criteria.withSentTo(email);

        Message message = mailosaur.messages().get(params, criteria);
        String code = message.text().codes().get(0).value();
        System.out.println(code);
        return code;
    }

    public static String getRandomAlphabet() {
        return RandomStringUtils.randomAlphabetic(5);
    }

    public void verifyText(By locator, String ExpectedText) {
        String actualText = _driver.findElement(locator).getText();
        Assert.assertEquals(actualText, ExpectedText);
    }

    public void clickOnDeviceBackButton() {
        _driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void clickOnDeviceHomeButton() {
        _driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public String getText(By locator) {
        return _driver.findElement(locator).getText();
    }

    public void clickElementWithPointOptions(By by, double eleWidth, double eleHeight) {
        this.waitForElementVisibility(by, "here link");
        WebElement ele = _driver.findElement(by);
        Point loc = ele.getLocation();
        Dimension fieldSize = ele.getSize();
        int width = ((int) (fieldSize.getWidth() * eleWidth)) + loc.getX();
        int height = ((int) (fieldSize.getHeight() * eleHeight)) + loc.getY();
        TouchAction action = new TouchAction((_driver));
        action.tap(PointOption.point(width, height)).perform();
    }

}
