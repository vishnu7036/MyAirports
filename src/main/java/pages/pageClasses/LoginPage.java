package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.LoginPageLoc;
import pages.pagePopups.LocationPopup;
import utils.CommonFunctions;
import utils.MobileUtils;

public class LoginPage extends MobileUtils  implements LoginPageLoc {

    private AndroidDriver _driver;

    public LoginPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyLoginPage() {
        waitForElementVisibility(btnSubmit, "Login Page Heading");
        boolean ele = _driver.findElement(btnSubmit).isDisplayed();
        Assert.assertTrue(ele, "Login Page is not displayed");
    }

    public void clickOnSignUpBtn() {
        verifyLoginPage();
        scrollToElement("SIGN UP");
//        scrollUp();
        click(btnSignup, "Sign Up button");
    }

    public SignupPage signupPage() {
        return new SignupPage(_driver);
    }

    public void enterEmailID(String text) {
        enterText(txtEmail, text, "email Id text field");
    }

    public void enterPassword(String text) {
        enterText(txtPass, text, "password text field");
    }

    public void clickOnSubmitButton() {
        try {
            Thread.sleep(2000);
            hideKeyboard();
            click(btnSubmit, "Submit button");
            click(btnSubmit, "");
        } catch (Exception ignored) {

        }
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
