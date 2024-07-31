package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.SettingsPageLoc;
import utils.MobileUtils;

public class SettingsPage extends MobileUtils implements SettingsPageLoc {
    private AndroidDriver _driver;

    public SettingsPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifySettingsPage() {
        try{
            Thread.sleep(2000);
            isElementVisible(lblHeading, "Settings Page");
        }catch(InterruptedException ignored){

        }
    }

    public void clickOnBackIcon() {
        click(btnBack, "Back Icon");
    }

    public void clickOnChangePassword() {
        click(btnChangePassword, "Change password");
    }
}
