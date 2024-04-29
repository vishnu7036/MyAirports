package utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

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
        int scrollDistance = (int) (height * 0.4); // Adjust this value as needed
        TouchAction touchAction = new TouchAction(_driver);
        touchAction.longPress(PointOption.point(centerX, centerY))
                .moveTo(PointOption.point(centerX, centerY + scrollDistance)) // Move down
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

    public void isElementPresent(By locator, String elementName) {
        try {
            waitForElementVisibility(locator, elementName);
            _driver.findElement(locator).isDisplayed();
            System.out.println("'" + elementName + "' element is present.");
        } catch (Exception e) {
            System.err.println("Error occurred while checking presence of '" + elementName + "' element: " + e.getMessage());
            Assert.fail();
        }
    }

    public void click(By locator, String elementName) {
        WebElement element = _driver.findElement(locator);
        element.click();
        System.out.println("Clicked on '" + elementName + "' button successfully.");
    }

    public void sendKeys(By locator, String txt) {
        WebElement ele = _driver.findElement(locator);
        Actions act = new Actions(_driver);
        act.click(ele).sendKeys(txt);
    }

    public void enterText(By locator, String txt, String elementName) throws InterruptedException {
        waitForElementVisibility(locator, elementName);
        WebElement ele = _driver.findElement(locator);
        ele.click();
        ele.sendKeys(txt);
        System.out.println("Entered text '" + txt + "' into '" + elementName + "'.");
    }

    public void hideKeybord() {
        _driver.hideKeyboard();
    }
}
