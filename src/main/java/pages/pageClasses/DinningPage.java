package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.DinningPageLoc;
import utils.MobileUtils;

public class DinningPage extends MobileUtils implements DinningPageLoc {
    private AndroidDriver _driver;

    public DinningPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyDinningPage() {
        isElementVisible(lblHeading, "Dinning Heading");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back Button");
    }

    public void clickOnSearchTextField() {
        click(txtSearch, "Search text field");
    }

//    public void waitForAllStoresVisible() {
//        try {
//            Thread.sleep(2000);
//            waitForAllElementsVisible(allStores);
//        } catch (Exception e) {
//
//        }
//    }
}
