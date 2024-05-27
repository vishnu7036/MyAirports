package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.pageLocators.FlightPageLoc;
import utils.MobileUtils;

import java.time.Duration;
import java.util.List;

public class FlightPage extends MobileUtils implements FlightPageLoc {
    private AndroidDriver _driver;

    public FlightPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyFlightPage() {
        isElementVisible(getElement("FLIGHT INFORMATION"), "FLIGHT INFORMATION");
    }

    public void clickOnDepartureToggle() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromArrival, "All Flights from Arrival", 20);
            click(getElement("Departure"), "Departure toggle");
        } catch (Exception e) {

        }
    }

    public void clickOnArrivalToggle() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromDeparture, "All Flights from Dispature", 20);
            click(getElement("Arrival"), "Arrival toggle");
        } catch (Exception e) {

        }
    }

    public void clickOnDropDownChooseAirport() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromDeparture, "All Flights from Dispature", 20);
            click(ddChooseAirport, "Choose Airport drop down");
        } catch (InterruptedException e) {

        }
    }

    public void selectFlightFromDeparture() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromDeparture, "All Flights from Dispature", 20);
            _driver.findElements(allFlightsFromDeparture).stream().findFirst().ifPresent(WebElement::click);
        } catch (InterruptedException e) {

        }
    }

    public void selectFlightFromArrival() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromArrival, "All Flights from Arrival", 20);
            Thread.sleep(1000);
            _driver.findElements(allFlightsFromArrival).stream().findFirst().ifPresent(WebElement::click);
        } catch (Exception e) {

        }

    }

    public void clickOnGetPreviousFlights() {
        click(btnGetPreviousFlights, "Get Previous Flights link");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

}
