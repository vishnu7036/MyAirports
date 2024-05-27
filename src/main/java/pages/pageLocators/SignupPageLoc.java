package pages.pageLocators;

import org.openqa.selenium.By;

public interface SignupPageLoc {
    default By getLocatorForText(String loc) {
        return By.xpath(String.format("//*[contains(@text,'%s')]", loc));
    }

    default By getLocatorForButton(String loc) {
        return By.xpath(String.format("//*[contains(@text,'%s')]",loc));
    }
    By chkboxTerms = By.xpath("//*[@text='Terms & Conditions']/preceding-sibling::*[1]");
    By ddMalaysia = By.xpath("//*[@text='Malaysia']/..");
    By lblHeading = By.xpath("//*[@text='SIGN UP']");
    By lblSuccessfullyCreated = By.xpath("//*[contains(@text,'SUCCESSFULLY CREATED')]");
    By btnLogin = By.xpath("//*[@text='LOGIN']");
    By lblUserExists = By.xpath("//*[@text='Username or EmailAddress already exist']");

}
