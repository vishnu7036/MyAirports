package pages.pageLocators;

import org.openqa.selenium.By;

public interface VerifyEmailPageLoc {
    By lblHeading = By.xpath("//*[@text='VERIFY EMAIL']");
    By lblDescription = By.xpath("//*[contains(@text,'Please check')]");
    By otp = By.xpath("//*[contains(@text,'Please check')]/following-sibling::*[contains(@class,'EditText')]");
    By lnkResend = By.xpath("//*[contains(@text,'RESEND')]");
    By btnSubmit = By.xpath("//*[@text='SUBMIT']");
}
