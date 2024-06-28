package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClasses.*;

import java.net.MalformedURLException;

public class HomePageCarouselSlidesSteps {
    private AndroidDriver _driver;
    private HomePage homePage;
    private ButterflyEffectPage butterflyEffectPage;
    private FlightsInformationPage flightsInformationPage;
    private PlanYourJourneyPage planYourJourneyPage;


    @Before(value = "@butterflyEffect or @trackMyFlight or @planMyJourney", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        homePage = new HomePage(_driver);
        butterflyEffectPage = new ButterflyEffectPage(_driver);
        flightsInformationPage = new FlightsInformationPage(_driver);
        planYourJourneyPage = new PlanYourJourneyPage(_driver);
    }

    @After("@butterflyEffect or @trackMyFlight or @planMyJourney")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@butterflyEffect or @trackMyFlight or @planMyJourney", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication("iotuatproject@gmail.com", "Mind@123");
    }

    @Given("the user selects the Butterfly Effect card from the carousel slides on the home page")
    public void the_user_selects_the_butterfly_effect_card_from_the_carousel_slides_on_the_home_page() {
        homePage.clickOnButterflyCarouselCard();
    }

    @Then("the Butterfly Page should be displayed")
    public void the_butterfly_page_should_be_displayed() {
        butterflyEffectPage.verifyButterflyEffectPage();
    }

    @And("verify the presence of the back icon on the Butterfly Page")
    public void verify_the_presence_of_the_back_icon_on_the_butterfly_page() {
        butterflyEffectPage.verifyBackButton();
    }


    @And("the user clicks on the here link to navigate to the Register page")
    public void the_user_clicks_on_the_link_to_navigate_to_the_register_page() throws InterruptedException {
        butterflyEffectPage.clickOnHereHyperlink();
    }

    @Then("the Butterfly Effect Guest Registration Page should be displayed")
    public void the_butterfly_effect_guest_registration_page_should_be_displayed() {
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().verifyButterflyEffectGuestRegistrationPage();
    }

    @And("the user enters all valid credentials on the Butterfly Effect Guest Registration Page")
    public void the_user_enters_all_valid_credentials_on_the_butterfly_effect_guest_registration_page() {
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnAirportDropDown();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnAirport();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterAirline("Mind");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterFlightNumber("123");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterDateOfVisit();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterPassengerFullName("Mind");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterPassengerPassportNumber("12345678");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnPassengerPassportIssueCountryDropDown();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnPassengerPassportIssueCountry();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterPassengerAge("25");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnPassengerGenderDropDown();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnPassengerGender();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterParentFullName("Graph");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterParentPassportNumber("87654321");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnParentPassportIssuingCountryDropDown();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnParentPassportIssueCountry();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterParentContactNumber("1234567890");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterAddress("32, My Stree");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterAddress2("Kingston");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterCity("New York");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterPostalCode("12401");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnCountryDropDown();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnCountry();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().enterEmailAddress("Mind@gmail.com");
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnAcknowledgeCheckBox();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnIamResponsibleCheckBox();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnNonTravellingCheckBox();
    }

    @Then("the user clicks on the Register button")
    public void the_user_clicks_on_the_register_button() {
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().clickOnRegister();
    }

    @And("verify the user is navigated to the Thank You page after entering all valid credentials")
    public void verify_the_user_is_navigated_to_the_thank_you_page_after_entering_all_valid_credentials() {
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().verifyThankYouPage();
        butterflyEffectPage.butterflyEffectGuestRegistrationPage().verifyThankYouPageDescription();
    }

    @Given("verify the user is on the Home Page")
    public void the_user_is_on_the_home_page() {
        homePage.verifyHomePage();
    }

    @When("the user clicks on the Flights button on the Home Page")
    public void the_user_clicks_on_the_flights_button_on_the_home_page() {
        homePage.clickOnFlightsIcon();
    }

    @And("selects a flight then the user clicks on the Track My Flight button to track the flight")
    public void selects_a_flight() throws InterruptedException {
        flightsInformationPage.clickOnFlightToTrackTheFlight();
        Thread.sleep(3000);
        flightsInformationPage.clickOnBackButton();
    }

    @Then("navigates back to the Home Page")
    public void navigates_back_to_the_home_page() {
        homePage.verifyHomePage();
    }

    @Then("the user clicks on the Flights carousel card on the Home Page")
    public void the_user_clicks_on_the_flights_carousel_card_on_the_home_page() {
        homePage.clickOnFlightsCarouselCard();
    }

    @Then("verifies that the flight has been added to the My Flights page")
    public void verifies_that_the_flight_has_been_added_to_the_my_flights_page() {

    }

    @When("the user clicks on the PLAN MY JOURNEY Carousel card on the Home Page")
    public void the_user_clicks_on_the_plan_my_journey_carousel_card_on_the_home_page() {
        homePage.clickOnPlanMyJourneyCarouselCard();
    }

    @Then("verify the user lands on the PLAN MY JOURNEY page")
    public void verify_the_user_lands_on_the_plan_my_journey_page() {
        planYourJourneyPage.verifyPlanYourJourneyPage();
    }

    @Then("click on the Search text field on the Plan Your Journey page")
    public void click_on_the_search_text_field_on_the_plan_your_journey_page() {
        planYourJourneyPage.clickOnSearchYourFlightTextField();
    }

    @And("verify it navigates to the FLIGHTS INFORMATION page")
    public void verify_it_navigates_to_the_flights_information_page() {
        planYourJourneyPage.flightsInformationPage().verifyFlightsInformationPage();
    }

    @Then("track any one of the flights and verify the same flight is added to the PLAN MY JOURNEY page")
    public void track_any_one_of_the_flights_and_verify_the_same_flight_is_added_to_the_PLAN_MY_JOURNEY_page() throws InterruptedException {
        planYourJourneyPage.verifyFlightNumber();
        planYourJourneyPage.verifyTerminal();
        planYourJourneyPage.verifyBoardingGate();
        planYourJourneyPage.verifyCheckInCounter();
    }

    @Then("click on the Stores, Dining, and Booking Service buttons on the PLAN MY JOURNEY page and verify each button navigates to their individual pages")
    public void click_on_the_stores_dining_and_booking_service_buttons_on_the_plan_my_journey_page_and_verify_each_button_navigates_to_their_individual_pages() {
        planYourJourneyPage.clickOnStores();
        homePage.storesPage().verifyStoresPage();
        homePage.storesPage().clickOnBackIcon();
        planYourJourneyPage.clickOnDining();
        homePage.dinningPage().verifyDinningPage();
        homePage.dinningPage().clickOnBackButton();
        planYourJourneyPage.clickOnBookingServices();
        homePage.bookingServicePage().verifyBookingServicePage();
        homePage.bookingServicePage().clickOnBackButton();
    }

    @Then("verify the Share Flight Details button and Remove Flight button are visible on the PLAN MY JOURNEY page")
    public void verify_the_share_flight_details_button_and_remove_flight_button_are_visible_on_the_plan_my_journey_page() {
        planYourJourneyPage.verifyShareFlightDetailsButton();
        planYourJourneyPage.verifyRemoveFlightButton();
    }

    @Then("click on the Remove Flight button")
    public void click_on_the_remove_flight_button() {
        planYourJourneyPage.clickOnRemoveFlightButton();
    }

    @Then("verify a confirmation popup is displayed to confirm removal")
    public void verify_a_confirmation_popup_is_displayed_to_confirm_removal() {
        planYourJourneyPage.verifyPlanYourJourneyRemovePopup();
    }

    @Then("click on the Yes button to remove the flight from the PLAN MY JOURNEY page")
    public void click_on_the_yes_button_to_remove_the_flight_from_the_plan_my_journey_page() {
        planYourJourneyPage.clickOnYesButton();
    }

    @Then("verify it navigates to the Home Page after clicking the Yes button to remove the flight")
    public void verify_it_navigates_to_the_home_page_after_clicking_the_yes_button_to_remove_the_flight() {
        homePage.verifyHomePage();
    }

}
