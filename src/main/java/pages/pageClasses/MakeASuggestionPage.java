package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.MakeASuggestionPageLoc;
import utils.CommonFunctions;
import utils.MobileUtils;

public class MakeASuggestionPage extends MobileUtils implements MakeASuggestionPageLoc {
    private final AndroidDriver _driver;

    public MakeASuggestionPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyMakeASuggestionPage() {
        isElementVisible(lblHeading, "Make A Suggestion Page");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back Button");
    }

    public void enterSuggestion(String text) {
        enterText(txtSuggestion, text, "Give Your Suggestion");
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
        click(giveRating("5"), "1 Star Rating");
    }

    public void verifyThankYouForYourValuableSuggestion() {
        isElementVisible(lblValuableSuggestion, "Thank You For Your Valuable Suggestion popup");
    }

    public void clickOnThankYouForYourValuableSuggestionClosePopup() {
        click(btnClose, "Close button");
    }

    public void clickOnSubmitButton() {
        new CommonFunctions(_driver).clickOnSubmitButton();
    }
}
