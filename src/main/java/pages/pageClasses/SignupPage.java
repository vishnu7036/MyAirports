package pages.pageClasses;

import com.mailosaur.MailosaurException;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;
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

    public String enterEmail() {
        email = generateEmailId();
        enterText(getLocatorForText("Email ID"), email, "Email ID text field");
        return email;
    }

    public void enterPassword(String password) {
        hideKeyboard();
        enterText(getLocatorForText("Password"), password, "Password text field");
    }

    public void clickOnMalaysiaDropdown() {
        click(ddMalaysia, "Drop down");
    }

    public void clickOnTermsAndConditionsCheckBox() {
        try {
            hideKeyboard();
            Thread.sleep(2000);
            click(chkboxTerms, "Terms & Conditions Check Box");
            click(chkboxTerms, "");
        } catch (Exception ignored) {

        }
    }

    public void clickOnCreateAccountBtn() {
        try {
            scrollToElement("CREATE ACCOUNT");
//            scrollUp();
            Thread.sleep(1500);
            click(getLocatorForButton("CREATE ACCOUNT"), "Create Account button");
            boolean displayed = _driver.findElement(verifyEmailPage().lblHeading).isDisplayed();
            if (!displayed) {
                this.enterFirstName(5);
                this.enterLastName(5);
                this.enterEmail();
                hideKeyboard();
                click(getLocatorForButton("CREATE ACCOUNT"), "Create Account button");
                click(getLocatorForButton("CREATE ACCOUNT"), "");
            }
        } catch (NoSuchElementException | InterruptedException ignored) {

        }
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

    public void verifySuccessfullyCreatedPopup() {
        isElementVisible(lblSuccessfullyCreated, "Successfully Created Popup");
    }

    public void clickOnLoginButton() {
        click(btnLogin, "Login button");
    }

    public VerifyEmailPage verifyEmailPage() {
        return new VerifyEmailPage(_driver);
    }

}
