package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.PromotionsPageLoc;
import utils.MobileUtils;

public class PromotionsPage extends MobileUtils implements PromotionsPageLoc {
    private AndroidDriver _driver;

    public PromotionsPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyPromotionsPage() {
        try {
            Thread.sleep(2000);
            isElementVisible(lblHeading, "Arrival Page");
        } catch (InterruptedException ignored) {

        }
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }
}
