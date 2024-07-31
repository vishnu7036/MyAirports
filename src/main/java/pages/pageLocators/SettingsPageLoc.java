package pages.pageLocators;

import org.openqa.selenium.By;

public interface SettingsPageLoc {
    By lblHeading = By.xpath("//*[@text='SETTINGS']");
    By btnBack = By.xpath("//*[@text='SETTINGS']/preceding-sibling::*[1]/*");
    By btnChangePassword = By.xpath("//*[contains(@text,'Change')]");
    By btnLanguages = By.xpath("//*[@text='Languages']");
    By btnDeleteAccount = By.xpath("//*[contains(@text,'Delete')]");
    By lblPermissions = By.xpath("//*[@text='PERMISSIONS']");
    By tglBtnNotifications = By.xpath("");
    By tglBtnCamera = By.xpath("");
    By tglBtnMedia = By.xpath("");
    By tglBtnLocation = By.xpath("");
    By lblVersion = By.xpath("");
    By btnCheckForUpdates = By.xpath("");
}
