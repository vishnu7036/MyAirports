package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.ChangePasswordPageLoc;
import utils.MobileUtils;

public class ChangePasswordPage extends MobileUtils implements ChangePasswordPageLoc {
    private AndroidDriver _driver;

    public ChangePasswordPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyChangePasswordPage() {
        isElementVisible(lblHeading, "Change Password Page");
    }

    public void enterCurrentPassword(String txt) {
        enterText(txtCurrentPass, txt, "Current Password text field");
    }

    public void enterNewPassword(String txt) {
        enterText(txtNewPass, txt, "New Password text field");
    }

    public void enterReEnterNewPassword(String txt) {
        enterText(txtReEnterNewPass, txt, "Re Enter New Password text field");
    }

    public void clickOnSaveButton() {
        click(btnSave, "Save Button");
    }

    public void verifyPasswordChangeSuccessfullyPopup() {
        isElementVisible(lblPassChange, "Password Changed Successfully popup");
    }

    public void clickOnCloseIconOnPasswordChangeSuccessfullyPopup() {
        click(btnClose, "Close Icon");
    }
}
