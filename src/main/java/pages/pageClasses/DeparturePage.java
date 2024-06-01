package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.DeparturePageLoc;
import utils.MobileUtils;

public class DeparturePage extends MobileUtils implements DeparturePageLoc {
    private AndroidDriver _driver;

    public DeparturePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyDeparturePage() {
        try {
            Thread.sleep(5000);
            isElementVisible(lblHeading, "Departure Page");
        } catch (Exception e) {

        }
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public String verifyTerminal() throws InterruptedException {
        Thread.sleep(2000);
        isElementVisible(lblTerminal, "Terminal Name");
        return _driver.findElement(lblTerminal).getText();
    }

    public String getFlightNumber() {
        return _driver.findElement(lblFlightNum).getText();
    }

    public String getAirlineName() {
        return _driver.findElement(lblAirline).getText();
    }

    public void clickOnTrackMyFlight() {
        click(btnTrackMyFlight, "Track My Flight button");
    }

}
