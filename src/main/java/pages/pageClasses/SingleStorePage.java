package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.SingleStorePageLoc;
import utils.MobileUtils;

public class SingleStorePage extends MobileUtils implements SingleStorePageLoc {
    private AndroidDriver _driver;

    public SingleStorePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifySingleStorePage() {
        isElementVisible(lblHeading, "Individual store");
    }

    public String verifySingleStorePageHeading() {
        return _driver.findElement(lblHeading).getText();
    }

    public void verifyTakeMeThereLbl() {
        isElementVisible(lblTakeMeThere, "Take Me There Label");
    }

    public void verifyRatingReviewLbl() {
        isElementVisible(lblRatingReview, "RATING REVIEW Label");
    }

    public void clickOnBackIcon() {
        click(btnBack, "Back Icon");
    }

    public void verifyBackButton() {
        isElementVisible(btnBack, "Back button");
    }

    public void clickOnFavourite() {
        click(btnFavourite, "Favourite button");
    }

}
