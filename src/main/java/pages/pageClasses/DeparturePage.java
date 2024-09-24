package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.DeparturePageLoc;
import pages.pagePopups.YouAreNowTrackingPopup;
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

    public String getTerminal() throws InterruptedException {
        Thread.sleep(2000);
        isElementVisible(lblTerminal, "Terminal Name");
        return getText(lblTerminal);
    }

    public String getFlightNumber() {
        waitForElementVisibility(lblFlightNum,"Flight Number");
        return getText(lblFlightNum);
    }

    public String getAirlineName() {
        try {
        Thread.sleep(3000);
            waitForElementVisibility(lblAirline, "Airline");
        } catch (Exception ignored){

        }
        return getText(lblAirline);
    }

    public String getBoardingGate() {
        waitForElementVisibility(lblBoardingGate,"Boarding gate");
        return getText(lblBoardingGate);
    }

    public String getCheckInCounter() {
        waitForElementVisibility(lblCheckInCounter,"Check In Counter");
        return getText(lblCheckInCounter);
    }

    public void clickOnTrackMyFlight() {
        click(btnTrackMyFlight, "Track My Flight button");
    }

    public void verifyYouAreNoeTrackingPopup() {
        isElementVisible(lblYouAreTracking, "You are now Tracking");
    }

    public void clickOnDoneButton() {
        click(btnDone, "Done button");
    }
    public YouAreNowTrackingPopup youAreNowTrackingPopup(){
        return new YouAreNowTrackingPopup(_driver);
    }

}
