package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.LoginPageLoc;
import pages.pagePopups.LocationPopup;
import utils.CommonFunctions;
import utils.MobileUtils;

public class LoginPage extends MobileUtils implements LoginPageLoc {

    private AndroidDriver _driver;

    public LoginPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyLoginPage() {
        waitForElementVisibility(lblLogin, "Login Page Heading");
        boolean ele = _driver.findElement(lblLogin).isDisplayed();
        Assert.assertTrue(ele, "Login Page is not displayed");
    }

    public void clickOnSignUpBtn() {
        verifyLoginPage();
        scrollUp();
        click(btnSignup, "Sign Up button");
    }

    public SignupPage signupPage() {
        return new SignupPage(_driver);
    }

    public void enterEmailID(String text) {
        enterText(txtEmail, text, "email Id text field");
    }

    public void enterPassword(String text) {
        this.hideKeyboard();
        enterText(txtPass, text, "password text field");
    }

    public void clickOnSubmitButton() {
        hideKeyboard();
        click(btnSubmit, "Submit button");
        click(btnSubmit, "Submit button");
    }

    public void hideKeyboard() {
        _driver.hideKeyboard();
    }

    public void clickOnBackButton() {
        new CommonFunctions(_driver).clickOnBackIcon();
    }

    public HomePage homePage() {
        return new HomePage(_driver);
    }

    public LocationPopup locationPopup() {
        return new LocationPopup(_driver);
    }

}
