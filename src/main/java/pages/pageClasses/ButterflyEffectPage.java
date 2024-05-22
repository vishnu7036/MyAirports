package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.ButterflyEffectPageLoc;
import utils.MobileUtils;

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

    public void clickOnHereHyperlink() throws InterruptedException {
        Thread.sleep(5000);
    }

    public ButterflyEffectGuestRegistrationPage butterflyEffectGuestRegistrationPage() {
        return new ButterflyEffectGuestRegistrationPage(_driver);
    }

}
