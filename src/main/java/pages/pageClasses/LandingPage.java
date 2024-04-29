package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.LandingPageLoc;
import utils.MobileUtils;

public class LandingPage extends MobileUtils implements LandingPageLoc {
    private AndroidDriver _driver;

    public LandingPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void clickOnLoginOrSignup() {
        waitForElementVisibility(btnLoginOrSignup, "Login button", 120);
        click(btnLoginOrSignup, "Login or Signup button");
    }

    public void clickOnGuest() {
        click(btnGuest, "Guest Button");
    }

    public LoginPage loginPage() {
        return new LoginPage(_driver);
    }

}
