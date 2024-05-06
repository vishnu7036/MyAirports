package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.utility.RandomString;
import pages.pageLocators.StoresPageLoc;
import utils.MobileUtils;

public class StoresPage extends MobileUtils implements StoresPageLoc {
    private AndroidDriver _driver;
    public StoresPage(AndroidDriver driver){
        super(driver);
        this._driver = driver;
    }
    public void verifyStoresPage(){

    }
    public void generateRandomString(){
        String make = RandomString.make(5);

    }
}
