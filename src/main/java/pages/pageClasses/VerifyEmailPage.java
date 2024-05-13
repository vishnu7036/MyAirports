package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import pages.pageLocators.VerifyEmailPageLoc;
import utils.MobileUtils;

import java.util.List;


public class VerifyEmailPage extends MobileUtils implements VerifyEmailPageLoc {
    private AndroidDriver _driver;

    public VerifyEmailPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void validateVerifyEmailPage() {
        isElementVisible(lblHeading, "Verify Email page");
    }

    public void validateVerifyEmailPageDescription() {
        isElementVisible(lblDescription, "Verify Email Page Description");
    }

    public void clickOnSubmitButton() {
        hideKeyboard();
        click(btnSubmit, "");
        click(btnSubmit, "Submit button");
    }

    public void clickOnResendVerificationLink() {
        click(lnkResend, "Resend verification Link");
    }

    public void enterOTP(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            List<WebElement> elements = _driver.findElements(otp);
            elements.get(i).click();
            elements.get(i).sendKeys(String.valueOf(c));
        }
    }
}
