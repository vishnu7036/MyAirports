package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.RegisterComplaintPageLoc;
import utils.MobileUtils;

public class RegisterComplaintPage extends MobileUtils implements RegisterComplaintPageLoc {
    private AndroidDriver _driver;

    public RegisterComplaintPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyRegisterComplaintPage() {
        isElementVisible(lblRegisterComplaint, "Register Complaint");
    }

    public void enterDescription() {
        enterText(txtDescription, "Testing Please ignore", "Description text area field");
    }

    public void enterLocation() {
        enterText(txtLocation, "Test Malaysia", "Location text field");
    }

    public void enterFlightNumber() {
        hideKeyboard();
        enterText(txtFlightNum, "Test 123", "Flight Number text field");
    }

    public void clickOnBackButton() {
        click(btnBack, "back button");
    }

    public void clickOnSubmitButton() {
        hideKeyboard();
        click(btnSubmit, "Submit button");
    }

    public void verifyComplaintSuccessfullyRegisteredPopup() {
        isElementVisible(lblComplaintRegister, "Complaint Successfully Registered Popup");
    }

    public void verifyCloseIconInRegisteredComplaintPopup() {
        isElementVisible(btnClose, "Close Icon");
    }

    public void clickOnCloseIcon() {
        click(btnClose, "Close Icon");
    }
}
