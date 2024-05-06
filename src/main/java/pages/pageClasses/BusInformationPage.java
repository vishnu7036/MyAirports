package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.BusInformationPageLoc;
import utils.MobileUtils;

public class BusInformationPage extends MobileUtils implements BusInformationPageLoc {
    private AndroidDriver _driver;

    public BusInformationPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyBusInformationPage() {
        isElementVisible(lblHeading, "Bus Information page");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public void clickOnPassengersDropDown() {
        click(dd, "Passengers drop down");
    }
}
