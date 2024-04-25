package utils;

import io.appium.java_client.android.AndroidDriver;
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

    public void waitForElementVisibility(By element, String elementName, int timeOut) {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
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
        try {
            WebElement element = _driver.findElement(locator);
            element.click();
            System.out.println("Clicked on '" + elementName + "' button successfully.");
        } catch (Exception e) {
            System.err.println("Failed to click on '" + elementName + "' button. Exception: " + e.getMessage());
        }
    }

    public void scrollIntoView(By locator, String elementName) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) _driver;
            WebElement element = _driver.findElement(locator);
            waitForElementVisibility(locator, elementName);
            js.executeScript("arguments[0].scrollIntoView()", element);
            System.out.println("Scrolled into view of '" + elementName + "'.");
        } catch (NoSuchElementException e) {
            System.err.println("'" + elementName + "' element not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error occurred while scrolling into view of '" + elementName + "': " + e.getMessage());
        }
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
        Thread.sleep(3000);
//        ele.clear();
        Thread.sleep(10000);
        sendKeys(locator, txt);
        Thread.sleep(3000);
        System.out.println("Entered text '" + txt + "' into '" + elementName + "'.");
    }
    public void hideKeybord(){
        _driver.hideKeyboard();
    }
}
