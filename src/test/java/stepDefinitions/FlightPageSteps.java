package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClasses.*;
import pages.pagePopups.ChooseAirportPopup;
import pages.pagePopups.LocationPopup;

import java.net.MalformedURLException;

public class FlightPageSteps {
    private AndroidDriver _driver;
    private HomePage homePage;
    private FlightPage flightPage;
    private ChooseAirportPopup chooseAirport;
    private DeparturePage departurePage;
    private ArrivalPage arrivalPage;

    @Before(value = "@flight", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        homePage = new HomePage(_driver);
        flightPage = new FlightPage(_driver);
        chooseAirport = new ChooseAirportPopup(_driver);
        departurePage = new DeparturePage(_driver);
        arrivalPage = new ArrivalPage(_driver);
    }

    @After("@flight")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@flight", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Then("click on the Flights icon in the landing page")
    public void click_on_the_flights_icon_in_the_landing_page() {
        homePage.clickOnFlightsIcon();
    }

    @Then("click on Arrival toggle button in the FLIGHT INFORMATION page")
    public void click_on_arrival_toggle_button_in_the_flight_information_page() {
        flightPage.verifyFlightPage();
        flightPage.clickOnArrivalToggle();
    }

    @And("click on Departure toggle button in the FLIGHT INFORMATION page")
    public void click_on_departure_toggle_button_in_the_flight_information_page() throws InterruptedException {
        flightPage.clickOnDepartureToggle();
    }

    @Then("change the terminal by clicking on dropdown button")
    public void change_the_terminal_by_clicking_on_dropdown_button() {
        flightPage.clickOnDropDownChooseAirport();
        chooseAirport.verifyChooseAirportPopup();
        chooseAirport.getAirportListAndClickByText("KLIA Terminal 2");
    }

    @And("select any flight from available flights for Departure")
    public void select_any_flight_from_available_flights_for_departure() {
        flightPage.selectFlightFromDeparture();
    }

    @Then("click back arrow in Departure page")
    public void click_back_arrow_in_departure_page() {
        departurePage.verifyDeparturePage();
        departurePage.clickOnBackButton();
    }

    @Then("select any flight from available flights for Arrival")
    public void select_any_flight_from_available_flights_for_arrival() {
        flightPage.clickOnArrivalToggle();
        flightPage.selectFlightFromArrival();
    }

    @And("verify the Note message in Arrival page")
    public void verify_the_note_message_in_arrival_page() {
        arrivalPage.verifyArrivalPage();
        arrivalPage.verifyNote();
    }

    @Then("click back arrow in Arrival page")
    public void click_back_arrow_in_arrival_page() {
        arrivalPage.clickOnBackButton();
    }

    @Then("click on the Get previous Flights link User can see accordingly")
    public void click_on_the_get_previous_flights_link_user_can_see_accordingly() {
        flightPage.clickOnGetPreviousFlights();
    }

    @And("click on back arrow in FLIGHT INFORMATION page")
    public void click_on_back_arrow_in_flight_information_page() {
        flightPage.clickOnBackButton();
    }

    @Then("close the mobile app")
    public void close_the_mobile_app() {
        homePage.verifyHomePage();
    }
}
