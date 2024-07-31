package pages.pageClasses;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.pageLocators.ButterflyEffectPageLoc;
import utils.MobileUtils;

import java.util.List;

public class ButterflyEffectPage extends MobileUtils implements ButterflyEffectPageLoc {
    private AndroidDriver _driver;

    public ButterflyEffectPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyButterflyEffectPage() {
        isElementVisible(lblHeading, "Butterfly Effect page");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public void verifyBackButton() {
        isElementVisible(btnBack, "Back button");
    }

    public void clickOnHereHyperlink() {
//        click(lnkHere, "Here Link");
//        WebElement ele = _driver.findElement(By.xpath("//*[@text='Click here to register.']"));
//        ele.findElement(By.xpath("//*[contains(@text,'here')]")).click();

        WebElement element = _driver.findElement(By.xpath("//*[@text='Click here to register.']"));

        // Get the element's location and size
        int startX = element.getLocation().getX();
        int startY = element.getLocation().getY();
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();

        // Calculate the approximate tap coordinates for the "here" text
        int tapX = startX + (int) (width * 0.35); // Adjust the multiplier based on the position of "here"
        int tapY = startY + (int) (height * 0.5); // Adjust if necessary

        System.out.println("Tap Coordinates: (" + tapX + ", " + tapY + ")");

        // Perform the tap action
        new TouchAction(_driver)
                .tap(TapOptions.tapOptions().withPosition(PointOption.point(tapX, tapY)))
                .perform();
    }

    public ButterflyEffectGuestRegistrationPage butterflyEffectGuestRegistrationPage() {
        return new ButterflyEffectGuestRegistrationPage(_driver);
    }

}
