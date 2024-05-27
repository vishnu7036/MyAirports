package pages.pageLocators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public interface ContactUsPageLoc {
    By lblHeading = By.xpath("//*[@text='CONTACT  US']");
    By btnBack = By.xpath("//*[@text='CONTACT  US']/preceding-sibling::*/*");
    By btnEmail = By.xpath("//*[@text='Email']");
    By btnContactNum = By.xpath("//*[contains(@text,'KUL Call Centre')]");

    By iconFB = By.xpath("//*[@text='CONTACT  US']/../*[5]/*");
    By iconTwitter = By.xpath("//*[@text='CONTACT  US']/../*[6]/*");
    By iconYoutube = By.xpath("//*[@text='CONTACT  US']/../*[7]/*");
    By iconInsta = By.xpath("//*[@text='CONTACT  US']/../*[8]/*");
    By iconWeb = By.xpath("//*[@text='CONTACT  US']/../*[9]/*");
    By btnDail = AppiumBy.accessibilityId("dial");
    By lblGmail = By.xpath("//*[@text='Welcome to Gmail']");
}
