package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.TrackMyFlightPageLoc;
import utils.MobileUtils;

public class TrackMyFlightPage extends MobileUtils implements TrackMyFlightPageLoc {
    private AndroidDriver _driver;

    public TrackMyFlightPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public String getFlightNumberFromFlightsCarouselCard() {
        waitForElementVisibility(lblFlightNum, "Flight Number");
        return getText(lblFlightNum);
    }

    public void verifyFlightNumber(String actualFlightNum) throws InterruptedException {
//        String actualFlightNum = flightsInformationPage().getFlightNumberFromDepartureFlight();
        Thread.sleep(8000);
        String expFlightNum = getFlightNumberFromFlightsCarouselCard();
        Assert.assertEquals(actualFlightNum, expFlightNum);
    }

    public FlightsInformationPage flightsInformationPage() {
        return new FlightsInformationPage(_driver);
    }
}
