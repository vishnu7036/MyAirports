package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.EditProfilePageLoc;
import utils.MobileUtils;

public class EditProfilePage extends MobileUtils implements EditProfilePageLoc {
    private AndroidDriver _driver;

    public EditProfilePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyEditProfilePage() {
        isElementVisible(lblHeading, "Edit Profile Page");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public void enterFirstName(String text) {
        enterText(txtFirstName, text, "First Name");
    }

    public void enterLastName(String text) {
        enterText(txtLastName, text, "Last Name");
    }

    public void enterDate(String text) {
        enterText(txtDate, text, "Date");
    }

    public void enterPassportNumber(String text) {
        enterText(txtPassportNum, text, "Passport Number");
    }

    public void enterEmail(String text) {
        enterText(txtEmail, text, "Email");
    }

    public void enterMobileNumber(String text) {
        enterText(txtMobileNum, text, "Mobile Number");
    }

    public void enterAddress(String text) {
        enterText(txtPassportNum, text, "Address");
    }

    public void clickOnSave() throws InterruptedException {
        hideKeyboard();
        click(btnSave, "Save button");
        click(btnSave, "Save button");
        Thread.sleep(10000);
    }

    public String getFirstName() {
        return _driver.findElement(txtFirstName).getText();
    }
}
