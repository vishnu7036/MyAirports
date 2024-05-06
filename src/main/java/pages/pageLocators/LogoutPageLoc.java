package pages.pageLocators;

import org.openqa.selenium.By;

public interface LogoutPageLoc {
    By lblHeading = By.xpath("//*[contains(@text,'DO YOU WANT')]");
    By btnYes = By.xpath("//*[@text='Yes']");
    By lnkNotToLogout = By.xpath("//*[contains(@text,'I DO NOT WANT')]");
    By btnBack = By.xpath("//*[contains(@text,'DO YOU WANT')]/preceding-sibling::*[1]/*");
}
