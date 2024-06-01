package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.pageLocators.FlightPageLoc;
import pages.pagePopups.ChooseAirportPopup;
import utils.MobileUtils;

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
            waitForAllElementsVisible(allFlightsFromDeparture, "All Flights from Departure", 20);
            click(getElement("Arrival"), "Arrival toggle");
        } catch (Exception e) {

        }
    }

    public void clickOnDropDownChooseAirport() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromDeparture, "All Flights from Departure", 20);
            click(ddChooseAirport, "Choose Airport drop down");
        } catch (InterruptedException e) {

        }
    }

    public void selectFlightFromDeparture() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromDeparture, "All Flights from Departure", 20);
            _driver.findElements(allFlightsFromDeparture).stream().findFirst().ifPresent(WebElement::click);
        } catch (InterruptedException ignored) {

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

    public String getDropDownText() {
        return _driver.findElement(lblDropDownName).getText();

    }

    public void verifyDepartureTerminal() throws InterruptedException {
        String actText = this.getDropDownText();
        String expText = departurePage().verifyTerminal();
        Assert.assertEquals(actText, expText);
    }

    public void verifyArrivalTerminal() throws InterruptedException {
        String actText = this.getDropDownText();
        String expText = arrivalPage().verifyTerminal();
        Assert.assertEquals(actText, expText);
    }

    public void clickOnGetPreviousFlights() {
        click(lnkGetPreviousFlights, "Get Previous Flights link");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public ArrivalPage arrivalPage() {
        return new ArrivalPage(_driver);
    }

    public DeparturePage departurePage() {
        return new DeparturePage(_driver);
    }

    public ChooseAirportPopup chooseAirportPopup() {
        return new ChooseAirportPopup(_driver);
    }

    public void searchFlightByNumber(String text) {
        enterText(txtSearch, text, "Search Field");
    }

    public void searchFlightByAirline(String text) {
        enterText(txtSearch, text, "Search Field");
    }

    public void clickOnDisplayedFlightNumber() {
        click(lblFlightDetails, "Flight Number");
    }

    public void clickOnDisplayedAirlineName() {
        click(lblFlightDetails, "Airline Name");
    }

    public String getDisplayedFlightNumber() {
        return getText(lblFlightDetails);
    }

    public String getDisplayedAirlineName() {
        return getText(lblFlightDetails);
    }


}
