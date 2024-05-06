package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.LogoutPageLoc;
import utils.MobileUtils;

public class LogoutPage extends MobileUtils implements LogoutPageLoc {
    private AndroidDriver _driver;

    public LogoutPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyLogoutPage() {
        isElementVisible(lblHeading, "Logout page");
    }

    public void clickOnYesButton() {
        click(btnYes, "Yes button");
    }

    public void clickOnNotWantToLogoutLink() {
        click(lnkNotToLogout, "I DO NOT WANT TO LOGOUT link");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }
}
