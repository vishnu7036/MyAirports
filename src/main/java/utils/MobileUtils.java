package utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class MobileUtils {
    private final int default_timeout = 10;

    private final AndroidDriver _driver;

    public MobileUtils(AndroidDriver driver) {
        this._driver = driver;
    }

    public void scrollUp() {
        int width = _driver.manage().window().getSize().getWidth();
        int height = _driver.manage().window().getSize().getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        // Calculate the scroll distance as a fraction of the screen height
        int scrollDistance = (int) (height * 0.4); // Adjust this value as needed
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
        // Calculate the scroll distance as a fraction of the screen height
        int scrollDistance = (int) (height * 0.2); // Adjust this value as needed
        TouchAction touchAction = new TouchAction(_driver);
        touchAction.longPress(PointOption.point(centerX, centerY))
                .moveTo(PointOption.point(centerX, centerY + scrollDistance)) // Move down
                .release()
                .perform();
    }

    public void scrollLeft() {
        int width = _driver.manage().window().getSize().getWidth();
        int height = _driver.manage().window().getSize().getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        // Calculate the scroll distance as a fraction of the screen width
        int scrollDistance = (int) (width * 0.2); // Adjust this value as needed
        TouchAction touchAction = new TouchAction(_driver);
        touchAction.longPress(PointOption.point(centerX, centerY))
                .moveTo(PointOption.point(centerX - scrollDistance, centerY)) // Move left
                .release()
                .perform();
    }

    public void scrollRight() {
        int width = _driver.manage().window().getSize().getWidth();
        int height = _driver.manage().window().getSize().getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        // Calculate the scroll distance as a fraction of the screen width
        int scrollDistance = (int) (width * 0.2); // Adjust this value as needed
        TouchAction touchAction = new TouchAction(_driver);
        touchAction.longPress(PointOption.point(centerX, centerY))
                .moveTo(PointOption.point(centerX + scrollDistance, centerY)) // Move right
                .release()
                .perform();
    }

    public void scrollLeft(int distanceFromBottom, int scrollDistance) {
        int width = _driver.manage().window().getSize().getWidth();
        int height = _driver.manage().window().getSize().getHeight();
        int centerX = width / 2;
        int centerY = height - distanceFromBottom; // Distance from bottom

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
        int centerY = height - distanceFromBottom; // Distance from bottom
        // Calculate the scroll distance as a fraction of the screen width
        int scrollDistance = (int) (width * 0.2); // Adjust this value as needed
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

    public void click(By locator, String elementName) {
        WebElement element = _driver.findElement(locator);
        element.click();
        System.out.println("Clicked on '" + elementName + "' successfully.");
    }

    public void sendKeys(By locator, String elementName) {
        WebElement ele = _driver.findElement(locator);
        Actions act = new Actions(_driver);
        act.click(ele).sendKeys(elementName);
    }

    public void enterText(By locator, String txt, String elementName) {
        waitForElementVisibility(locator, elementName);
        WebElement ele = _driver.findElement(locator);
        ele.click();
        ele.sendKeys(txt);
        System.out.println("Entered text '" + txt + "' into '" + elementName + "'.");
    }

    public void hideKeyboard() {
        _driver.hideKeyboard();
    }

    public void isElementVisible(By locator, String elementName) {
        boolean displayed = _driver.findElement(locator).isDisplayed();
        if(displayed)
            System.out.println(elementName+" is visible");
        else
            Assert.fail("Element " + elementName + " is not visible");
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

    public void enterRandomAlphabetic(By locator, String elementName, int number){
        String text = RandomStringUtils.randomAlphabetic(number);
        this.enterText(locator,text,elementName);
    }
    public void enterRandomEmail(){
//        RandomStringUtils.ra/
    }
}
