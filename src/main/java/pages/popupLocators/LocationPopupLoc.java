package pages.popupLocators;

import org.openqa.selenium.By;

public interface LocationPopupLoc {
    By lblHeading = By.xpath("//*[@text='Allow MYairports to access this device’s location?']");
    By btnWhileUsingTheApp = By.xpath("//*[@text='While using the app']");
    By btnOnlyThisTime = By.xpath("//*[@text='Only this time']");
    By btnDeny = By.xpath("//*[@text='Deny']");
}
