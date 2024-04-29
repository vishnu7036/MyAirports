package pages.pageLocators;

import org.openqa.selenium.By;

public interface SignupPageLoc {
    default By getLocatorForText(String loc) {
        return By.xpath(String.format("//*[contains(@text,'%s')]", loc));
    }

    default By getLocatorForButton(String loc) {
        return By.xpath(String.format("//*[contains(@text,'%s')]",loc));
    }

    By ddMalaysia = By.xpath("//*[@text='Malaysia']/..");
    By lblHeading = By.xpath("//*[@text='SIGN UP']");

}
