package pages.pageClasses;

import com.mailosaur.MailosaurException;
import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.SignupPageLoc;
import utils.CommonFunctions;
import utils.MobileUtils;

import java.io.IOException;

public class SignupPage extends MobileUtils implements SignupPageLoc {
    private final AndroidDriver _driver;
    private String email;

    public SignupPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifySignupPageHeading() {
        isElementVisible(lblHeading, "Signup Page");
    }

    public void enterFirstName(int number) {
        enterRandomAlphabetic(getLocatorForText("First Name"), "First Name", number);
    }

    public void enterLastName(int number) {
        enterRandomAlphabetic(getLocatorForText("Last Name"), "Last Name", number);
    }

    public void enterEmail() {
        email = getEmailId();
        enterText(getLocatorForText("Email ID"), email, "Email ID text field");
    }

    public void enterPassword(String password) {
        _driver.hideKeyboard();
        enterText(getLocatorForText("Password"), password, "Password text field");
    }

    public void clickOnMalaysiaDropdown() {
        click(ddMalaysia, "Drop down");
    }

    public void clickOnCreateAccountBtn() {
        _driver.hideKeyboard();
        for (int i = 0; i < 2; i++)
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

    public String getOTP() throws MailosaurException, IOException, InterruptedException {
        return getOTPFromEmail(email);
    }

}
