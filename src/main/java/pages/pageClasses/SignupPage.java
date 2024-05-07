package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.SignupPageLoc;
import utils.CommonFunctions;
import utils.MobileUtils;

public class SignupPage extends MobileUtils implements SignupPageLoc {
    private final AndroidDriver _driver;

    public SignupPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifySignupPageHeading() {
        isElementVisible(lblHeading, "Signup Page");
    }

    public void enterFirstName(String firstName) throws InterruptedException {
        enterText(getLocatorForText("First Name"), firstName, "First Name text field");
    }

    public void enterLastName(String lastName) throws InterruptedException {
        enterText(getLocatorForText("Last Name"), lastName, "Last Name text field");
    }

    public void enterEmailID(String emailID) throws InterruptedException {
        enterText(getLocatorForText("Email ID"), emailID, "Email ID text field");
    }

    public void enterPassword(String password) throws InterruptedException {
       _driver.hideKeyboard();
        enterText(getLocatorForText("Password"), password, "Password text field");
    }

    public void clickOnMalaysiaDropdown() {
        click(ddMalaysia, "Drop down");
    }

    public void clickOnCreateAccountBtn() {
        _driver.hideKeyboard();
        click(getLocatorForButton("CREATE ACCOUNT"), "Create Account button");
    }

    public void clickOnLoginBtn() {
        click(getLocatorForButton("LOGIN"), "Login button");
    }

    public void clickOnGuestBtn() {
        click(getLocatorForButton("GUEST"), "Guest button");
    }

    public void clickOnBackButton() {
        new CommonFunctions(_driver).clickOnBackIcon();
    }


}
