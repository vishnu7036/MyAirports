package pages.pagePopups;

import io.appium.java_client.android.AndroidDriver;
import pages.popupLocators.YouAreNowTrackingPopupLoc;
import utils.MobileUtils;

public class YouAreNowTrackingPopup extends MobileUtils implements YouAreNowTrackingPopupLoc {
    private AndroidDriver _driver;

    public YouAreNowTrackingPopup(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyHeading() {
        isElementVisible(lblHeading, "You are now tracking popup");
    }

    public void enterEmail() {
        enterText(txtEmail, "vishnupavan7036@gmail.com", "Email text field");
    }

    public void clickOnTermsAndConditionsCheckBox() {
        click(chckbxTerms, "Terms and Conditions");
    }

    public void clickOnSubmitButton() {
        try {
            Thread.sleep(1000);
            click(btnSubmit, "Submit button");
        } catch (Exception ignored) {

        }
    }
}
