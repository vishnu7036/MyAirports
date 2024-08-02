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
        clickElementWithPointOptions(lnkHere, 0.20, 0.50);
    }

    public ButterflyEffectGuestRegistrationPage butterflyEffectGuestRegistrationPage() {
        return new ButterflyEffectGuestRegistrationPage(_driver);
    }

}
