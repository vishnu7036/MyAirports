package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.DeparturePageLoc;
import utils.MobileUtils;

public class DeparturePage extends MobileUtils implements DeparturePageLoc {
    private AndroidDriver _driver;
    public DeparturePage(AndroidDriver driver){
        super(driver);
        this._driver = driver;
    }
    public void verifyDeparturePage(){
        try {
            Thread.sleep(5000);
            isElementVisible(lblHeading, "Departure Page");
        }catch (Exception e){

        }
    }
    public void clickOnBackButton(){
        click(btnBack,"Back button");
    }
}
