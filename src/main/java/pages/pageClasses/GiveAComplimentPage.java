package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.GiveAComplimentPageLoc;
import utils.CommonFunctions;
import utils.MobileUtils;

public class GiveAComplimentPage extends MobileUtils implements GiveAComplimentPageLoc {

    private final AndroidDriver _driver;

    public GiveAComplimentPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyGiveAComplimentPage() {
        isElementVisible(lblHeading, "Give A Compliment Page");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public void enterCompliment(String text) {
        enterText(txtCompliment, text, "Give A Compliment");
    }

    public void verifyRateOfExperienceLabel() {
        isElementVisible(lblRateOfExperience, "Rate of Experience Label");
    }

    public void clickOnOneStarRating() {
        click(giveRating("1"), "1 Star Rating");
    }

    public void clickOnTwoStarRating() {
        click(giveRating("2"), "1 Star Rating");
    }

    public void clickOnThreeStarRating() {
        click(giveRating("3"), "1 Star Rating");
    }

    public void clickOnFourStarRating() {
        click(giveRating("4"), "1 Star Rating");
    }

    public void clickOnFiveStarRating() {
        hideKeyboard();
        click(giveRating("5"), "1 Star Rating");
    }

    public void verifyThankYouForYourComplimentPopup() {
        isElementVisible(lblThankForYourCompliment, "Thank You For Your Compliment popup");
    }

    public void clickOnThankYouForYourComplimentClosePopup() {
        click(btnClose, "Close button");
    }

    public void clickOnSubmitButton() {
        new CommonFunctions(_driver).clickOnSubmitButton();
    }
}
