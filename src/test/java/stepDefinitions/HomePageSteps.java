package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.pageClasses.FlightPage;
import pages.pageClasses.HomePage;
import pages.pagePopups.MenuPopup;

import java.net.MalformedURLException;

public class HomePageSteps {
    private AndroidDriver _driver;
    private HomePage homePage;
    private MenuPopup menuPopup;
    private FlightPage flightPage;

    @Before(value = "@homePage or @flights", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        homePage = new HomePage(_driver);
        menuPopup = new MenuPopup(_driver);
        flightPage = new FlightPage(_driver);
    }

    @After("@homePage or @flights")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@homePage or @flights", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication("iotuatproject@gmail.com", "Mind@123");
    }

    @Given("the user is able to view flights, dining, essentials & services, shuttle bus, stores, and customer feedback in the first slide")
    public void the_user_is_able_to_view_flights_dining_essentials_services_shuttle_bus_stores_and_customer_feedback_in_the_first_slide() {
        homePage.verifyFlightsIcon();
        homePage.verifyDinningIcon();
        homePage.verifyEssentialAndServicesIcon();
        homePage.verifyKULTerminal1ShuttleBusIcon();
        homePage.verifyStoresIcon();
        homePage.verifyCustomerFeedbackIcon();
    }

    @When("the user clicks on the Next arrow button for the next slide")
    public void the_user_clicks_on_the_next_arrow_button_for_the_next_slide() {
        homePage.clickOnForwardButton();
    }

    @Then("the user is able to view online shopping, transportation, lounge, booking services, hotels, and bureau de change in the second slide")
    public void the_user_is_able_to_view_online_shopping_transportation_lounge_booking_services_hotels_and_bureau_de_change_in_the_second_slide() {
        homePage.verifyOnlineShoppingIcon();
        homePage.verifyTransportIcon();
        homePage.verifyLoungeIcon();
        homePage.verifyBookingServicesIcon();
        homePage.verifyHotelsIcon();
        homePage.verifyBureaudeChangeIcon();
    }

    @Then("the user is able to view clinic, transfer counter, airline ticketing center, baggage reclaim, baggage locker, and information center in the last slide")
    public void the_user_is_able_to_view_clinic_transfer_counter_airline_ticketing_center_baggage_reclaim_baggage_locker_and_information_center_in_the_last_slide() {
        homePage.verifyClinicIcon();
        homePage.verifyTransferCounterIcon();
        homePage.verifyAirlineTicketingCentreIcon();
        homePage.verifyBaggageReclaimIcon();
        homePage.verifyBaggageLockerIcon();
        homePage.verifyInformationCentreIcon();
    }


    @Given("the user is on the Home Page")
    public void the_user_is_on_the_home_page() {
        homePage.verifyHomePage();
    }

    @When("the user clicks on the Menu button from the Home Page")
    public void the_user_clicks_on_the_menu_button_from_the_home_page() {
        homePage.clickOnMenuButton();
    }

    @Then("the user should see the Menu popup appear over the Home Page")
    public void the_user_should_see_the_menu_popup_appear_over_the_home_page() {
        menuPopup.verifyMenuPopup();
    }

    @Then("the user selects the Flights feature from the menu")
    public void the_user_selects_the_flights_feature_from_the_menu() {
        menuPopup.clickOnFlightsButton();
    }

    @Then("the user should land on the Flights Information Page")
    public void the_user_should_land_on_the_flights_information_page() {
        flightPage.verifyFlightPage();
    }

    @Then("the user navigates between the Departure and Arrival toggle buttons")
    public void the_user_navigates_between_the_departure_and_arrival_toggle_buttons() {
        flightPage.clickOnArrivalToggle();
        flightPage.clickOnDepartureToggle();
    }

    @Then("verifies that flights are loading according to the toggle buttons")
    public void verifies_that_flights_are_loading_according_to_the_toggle_buttons() {
        flightPage.selectFlightFromDeparture();
        flightPage.departurePage().verifyDeparturePage();
        flightPage.departurePage().clickOnBackButton();
        flightPage.clickOnArrivalToggle();
        flightPage.selectFlightFromArrival();
        flightPage.arrivalPage().verifyArrivalPage();
        flightPage.arrivalPage().clickOnBackButton();
    }

    @Then("the user clicks on the dropdown to change the Terminals")
    public void the_user_clicks_on_the_dropdown_to_change_the_terminals() {
        flightPage.clickOnDropDownChooseAirport();
    }

    @Then("^verifies that (.*) and (.*) are displayed in the dropdown$")
    public void verifies_that_terminal_one_and_terminal_two_are_displayed_in_the_dropdown(String terminalOne, String terminalTwo) {
        flightPage.chooseAirportPopup().verifyAirportNameFromList(terminalOne);
        flightPage.chooseAirportPopup().verifyAirportNameFromList(terminalTwo);
    }

    @Then("the user selects one of the terminals from the dropdown")
    public void the_user_selects_one_of_the_terminals_from_the_dropdown() {
        flightPage.chooseAirportPopup().selectAirportByText("KUL - KLIA Terminal 2");
    }

    @Then("verifies that flights are displaying according to the selected terminal")
    public void verifies_that_flights_are_displaying_according_to_the_selected_terminal() throws InterruptedException {
        flightPage.selectFlightFromArrival();
        flightPage.verifyArrivalTerminal();
        flightPage.arrivalPage().clickOnBackButton();
        flightPage.clickOnDepartureToggle();
        flightPage.selectFlightFromDeparture();
        flightPage.verifyDepartureTerminal();
        flightPage.departurePage().clickOnBackButton();
    }

    @Then("the user searches for a flight based on the Flight Number")
    public void the_user_searches_for_a_flight_based_on_the_flight_number() {
        flightPage.selectFlightFromDeparture();
        String flightNumber = flightPage.departurePage().getFlightNumber();
        flightPage.departurePage().clickOnBackButton();
        flightPage.searchFlightByNumber(flightNumber);
        displayedFlightNumber = flightPage.getDisplayedFlightNumber();
        flightPage.clickOnDisplayedFlightNumber();
    }

    private String displayedFlightNumber;

    @Then("verifies that the flight is displayed according to the Flight Number")
    public void verifies_that_the_flight_is_displayed_according_to_the_flight_number() {
        flightPage.selectFlightFromDeparture();
        String expFlightNumber = flightPage.departurePage().getFlightNumber();
        Assert.assertEquals(displayedFlightNumber, expFlightNumber);
        flightPage.departurePage().clickOnBackButton();
    }

    @Then("the user searches for flights based on the Airline name")
    public void the_user_searches_for_flights_based_on_the_airline_name() {
        flightPage.selectFlightFromDeparture();
        String flightName = flightPage.departurePage().getAirlineName();
        flightPage.departurePage().clickOnBackButton();
        flightPage.searchFlightByAirline(flightName);
        displayedAirlineName = flightPage.getDisplayedAirlineName();
        flightPage.clickOnDisplayedAirlineName();
    }

    private String displayedAirlineName;

    @Then("verifies that flights are displayed according to the Airline names")
    public void verifies_that_flights_are_displayed_according_to_the_airline_names() {
        flightPage.selectFlightFromDeparture();
        String expAirlineName = flightPage.departurePage().getAirlineName();
        Assert.assertEquals(displayedAirlineName, expAirlineName);
        flightPage.departurePage().clickOnBackButton();
    }

    @Then("the user clicks on the back button from the Flights Information Page")
    public void the_user_clicks_on_the_back_button_from_the_flights_information_page() {
        flightPage.clickOnBackButton();
    }

    @Then("verifies that the user lands back on the Home Page")
    public void verifies_that_the_user_lands_back_on_the_home_page() {
        homePage.verifyHomePage();
    }
}
