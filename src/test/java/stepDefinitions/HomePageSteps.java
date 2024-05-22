package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClasses.HomePage;

import java.net.MalformedURLException;

public class HomePageSteps {
    private AndroidDriver _driver;
    private HomePage homePage;

    @Before(value = "@homePage", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        homePage = new HomePage(_driver);
    }

    @After("@flight")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@flight", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
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
}
