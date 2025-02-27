package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.pageLocators.FlightsInformationPageLoc;
import pages.pagePopups.ChooseAirportPopup;
import utils.MobileUtils;

import java.util.List;

public class FlightsInformationPage extends MobileUtils implements FlightsInformationPageLoc {
    private AndroidDriver _driver;
    public String flightNum;

    public FlightsInformationPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyFlightsInformationPage() {
        try {
            Thread.sleep(2000);
            isElementVisible(getElement("FLIGHT INFORMATION"), "FLIGHT INFORMATION");
        } catch (InterruptedException ignored) {

        }
    }

    public void clickOnDepartureToggle() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromArrival);
            click(getElement("Departure"), "Departure toggle");
        } catch (Exception e) {

        }
    }

    public void clickOnArrivalToggle() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromDeparture);
            click(getElement("Arrival"), "Arrival toggle");
        } catch (Exception e) {

        }
    }

    public void clickOnDropDownChooseAirport() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromDeparture);
            click(ddChooseAirport, "Choose Airport drop down");
        } catch (InterruptedException e) {

        }
    }

    public void selectFlightFromDeparture() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromDeparture);
            _driver.findElements(allFlightsFromDeparture).stream().findFirst().ifPresent(WebElement::click);
        } catch (InterruptedException ignored) {

        }
    }

    public void selectFlightFromArrival() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allFlightsFromArrival);
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
        String expText = departurePage().getTerminal();
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

    public String clickOnTrackMyFlight() throws InterruptedException {
        String flightNum = departurePage().getFlightNumber();
        System.out.println(flightNum);
        departurePage().clickOnTrackMyFlight();
        departurePage().youAreNowTrackingPopup().verifyHeading();
        departurePage().youAreNowTrackingPopup().clickOnDoneButton();
//        departurePage().youAreNowTrackingPopup().enterEmail();
//        departurePage().youAreNowTrackingPopup().clickOnTermsAndConditionsCheckBox();
//        departurePage().youAreNowTrackingPopup().clickOnSubmitButton();
//        Thread.sleep(3000);
        departurePage().clickOnBackButton();
        Thread.sleep(3000);
        return flightNum;
    }

    public String getFlightNumberFromDepartureFlight() {
        return flightNum;
    }

    public void clickOnFlight() throws InterruptedException {
        boolean found = false;
        while (!found) {
            List<WebElement> list = _driver.findElements(lblFlightStatus);
            list.remove(list.size() - 1);
            list.remove(0);
            for (WebElement ele : list) {
                String text = ele.getText().replace("\n", " ").trim();
                System.out.println(text);
                if (!text.equalsIgnoreCase("GATE CLOSED") && !text.equalsIgnoreCase("FLIGHT DEPART")) {
                    ele.click();
                    found = true;
                    break;
                }
            }
            if (!found) {
                scrollUp();
                Thread.sleep(2500);
            }
        }
    }

    public String getFlightNumberToTrack() throws InterruptedException {
        boolean found = false;
        String flightNumber = null;
        List<WebElement> list = _driver.findElements(lblFlightStatus);
        list.remove(list.size() - 1);
        for (WebElement ele : list) {
            String text = ele.getText();
            if (!text.contains("CLOSED") && !text.contains("DEPART")) {
                ele.click();
                Thread.sleep(3000);
                flightNumber = arrivalPage().getFlightNumber();
            }
        }
        if (!found) {
            scrollUp();
        }
        return flightNumber;
    }

    public String[] getFlightDetailsAndClickOnTrackMyFlight() throws InterruptedException {
        boolean found = false;
        String flightNumber = null;
        String terminal = null;
        String boardingGate = null;
        String checkInCounter = null;
        while (!found) {
            List<WebElement> list = _driver.findElements(lblFlightStatus);
            list.remove(list.size() - 1);
            list.remove(0);
            for (WebElement ele : list) {
                String text = ele.getText().replace("\n", " ").trim();
                System.out.println(text);
                if (!text.equalsIgnoreCase("GATE CLOSED") && !text.equalsIgnoreCase("FLIGHT DEPART")) {
                    ele.click();
                    Thread.sleep(3000);
                    flightNumber = departurePage().getFlightNumber();
                    terminal = departurePage().getTerminal();
                    boardingGate = departurePage().getBoardingGate();
                    checkInCounter = departurePage().getCheckInCounter();
                    departurePage().clickOnTrackMyFlight();
                    found = true;
                    break;
                }
            }
            if (!found) {
                scrollUp();
                Thread.sleep(2500);
            }
        }
        return new String[]{flightNumber, terminal, boardingGate, checkInCounter};
    }

}
