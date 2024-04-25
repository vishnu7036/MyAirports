package pages.pageClases;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.HomePageLoc;
import utils.MobileUtils;

public class HomePage extends MobileUtils implements HomePageLoc {
    private final AndroidDriver _driver;

    public HomePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyHomePage() {
        String userName = _driver.findElement(lblUser).getText();
        Assert.assertEquals(userName, "ioc");
    }


}
