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
    private LandingPage landingPage;
    private LoginPage loginPage;
    private LocationPopup locationPopup;
    private HomePage homePage;
    private FlightPage flightPage;
    private ChooseAirportPopup chooseAirport;
    private DeparturePage departurePage;
    private ArrivalPage arrivalPage;

    @Before("@flight")
    public void launchApp() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        landingPage = new LandingPage(_driver);
        loginPage = new LoginPage(_driver);
        locationPopup = new LocationPopup(_driver);
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

    @Given("open the My airports app from the mobile device")
    public void open_the_my_airports_app_from_the_mobile_device() {
        System.out.println("My airports application opened");
    }

    @When("Click on the Login button in splash screen")
    public void click_on_the_login_button_in_splash_screen() {
        landingPage.clickOnLoginOrSignup();
    }

    @And("Give the login credentials and click on the Submit button")
    public void give_the_login_credentials_and_click_on_the_submit_button() {
        loginPage.enterEmailID("iotuatproject@gmail.com");
        loginPage.enterPassword("IOTuat@123");
        loginPage.clickOnSubmitButton();
    }

    @And("Access the Location")
    public void access_the_location() {
        locationPopup.verifyLocationPopupHeading();
    }

    @Then("click on the Flights icon in the landing page")
    public void click_on_the_flights_icon_in_the_landing_page() {
        homePage.clickOnFlightsButton();
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
