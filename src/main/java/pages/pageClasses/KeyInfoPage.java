package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.KeyInfoPageLoc;
import utils.MobileUtils;

public class KeyInfoPage extends MobileUtils implements KeyInfoPageLoc {
    private AndroidDriver _driver;
    public KeyInfoPage(AndroidDriver driver){
        super(driver);
        this._driver = driver;
    }
    public void verifyKeyInfoPage() {
        try{
            Thread.sleep(2000);
            isElementVisible(lblHeading, "Arrival Page");
        }catch(InterruptedException ignored){

        }
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }
}
