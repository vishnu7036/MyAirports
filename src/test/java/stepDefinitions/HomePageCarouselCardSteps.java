package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utils.*;

import java.net.MalformedURLException;

public class HomePageCarouselCardSteps {
    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@butterflyEffect or @trackMyFlight or @planMyJourney or @Promotions or @butterflyEffects", order = 0)
    public void init() throws MalformedURLException {
        this._driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After("@butterflyEffect or @trackMyFlight or @planMyJourney or @Promotions or @butterflyEffects")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@butterflyEffect or @trackMyFlight or @planMyJourney or @Promotions or @butterflyEffects", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Given("the user selects the Butterfly Effect card from the carousel slides on the home page")
    public void the_user_selects_the_butterfly_effect_card_from_the_carousel_slides_on_the_home_page() {
        pm.homePage().clickOnButterflyCarouselCard();
    }

    @Then("the Butterfly Page should be displayed")
    public void the_butterfly_page_should_be_displayed() {
        pm.butterflyEffectPage().verifyButterflyEffectPage();
    }

    @And("verify the presence of the back icon on the Butterfly Page")
    public void verify_the_presence_of_the_back_icon_on_the_butterfly_page() {
        pm.butterflyEffectPage().verifyBackButton();
    }

    @Then("click on back icon on the Butterfly Page")
    public void click_on_back_icon_on_the_Butterfly_Page() {
        pm.butterflyEffectPage().clickOnBackButton();
    }

    @And("Verify that the user is redirected to the Home Page")
    public void Verify_that_the_user_is_redirected_to_the_Home_Page() {
        pm.homePage().verifyHomePage();
    }

    @And("the user clicks on the here link to navigate to the Register page")
    public void the_user_clicks_on_the_link_to_navigate_to_the_register_page() throws InterruptedException {
        pm.butterflyEffectPage().clickOnHereHyperlink();
    }

    @Then("the Butterfly Effect Guest Registration Page should be displayed")
    public void the_butterfly_effect_guest_registration_page_should_be_displayed() {
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().verifyButterflyEffectGuestRegistrationPage();
    }

    @And("the user enters all valid credentials on the Butterfly Effect Guest Registration Page")
    public void the_user_enters_all_valid_credentials_on_the_butterfly_effect_guest_registration_page() {
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnAirportDropDown();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnAirport();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterAirline("Mind");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterFlightNumber("123");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterDateOfVisit();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterPassengerFullName("Mind");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterPassengerPassportNumber("12345678");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnPassengerPassportIssueCountryDropDown();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnPassengerPassportIssueCountry();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterPassengerAge("25");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnPassengerGenderDropDown();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnPassengerGender();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterParentFullName("Graph");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterParentPassportNumber("87654321");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnParentPassportIssuingCountryDropDown();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnParentPassportIssueCountry();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterParentContactNumber("1234567890");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterAddress("32, My Stree");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterAddress2("Kingston");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterCity("New York");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterPostalCode("12401");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnCountryDropDown();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnCountry();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().enterEmailAddress("Mind@gmail.com");
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnAcknowledgeCheckBox();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnIamResponsibleCheckBox();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnNonTravellingCheckBox();
    }

    @Then("the user clicks on the Register button")
    public void the_user_clicks_on_the_register_button() {
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().clickOnRegister();
    }

    @And("verify the user is navigated to the Thank You page after entering all valid credentials")
    public void verify_the_user_is_navigated_to_the_thank_you_page_after_entering_all_valid_credentials() {
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().verifyThankYouPage();
        pm.butterflyEffectPage().butterflyEffectGuestRegistrationPage().verifyThankYouPageDescription();
    }

    @Given("verify the user is on the Home Page")
    public void the_user_is_on_the_home_page() {
        pm.homePage().verifyHomePage();
    }

    @When("the user clicks on the Flights button on the Home Page")
    public void the_user_clicks_on_the_flights_button_on_the_home_page() {
        pm.homePage().clickOnFlightsIcon();
    }

    @And("selects a flight then the user clicks on the Track My Flight button to track the flight")
    public void selects_a_flight() throws InterruptedException {
        pm.flightsInformationPage().clickOnFlight();
        actualFlightNum = pm.flightsInformationPage().clickOnTrackMyFlight();
        Thread.sleep(3000);
        pm.flightsInformationPage().clickOnBackButton();
    }
    private String actualFlightNum;

    @Then("navigates back to the Home Page")
    public void navigates_back_to_the_home_page() {
        pm.homePage().verifyHomePage();
    }

    @Then("the user clicks on the Flights carousel card on the Home Page")
    public void the_user_clicks_on_the_flights_carousel_card_on_the_home_page() {
        pm.homePage().clickOnFlightsCarouselCard();
    }

    @Then("verifies that the flight has been added to the My Flights page")
    public void verifies_that_the_flight_has_been_added_to_the_my_flights_page() throws InterruptedException {
        pm.trackMyFlightPage().verifyFlightNumber(actualFlightNum);
    }

    @When("the user clicks on the PLAN MY JOURNEY Carousel card on the Home Page")
    public void the_user_clicks_on_the_plan_my_journey_carousel_card_on_the_home_page() {
        pm.homePage().clickOnPlanMyJourneyCarouselCard();
    }

    @Then("verify the user lands on the PLAN MY JOURNEY page")
    public void verify_the_user_lands_on_the_plan_my_journey_page() {
        pm.planYourJourneyPage().verifyPlanYourJourneyPage();
    }

    @Then("click on the Search text field on the Plan Your Journey page")
    public void click_on_the_search_text_field_on_the_plan_your_journey_page() {
        pm.planYourJourneyPage().clickOnSearchYourFlightTextField();
    }

    @And("verify it navigates to the FLIGHTS INFORMATION page")
    public void verify_it_navigates_to_the_flights_information_page() {
        pm.planYourJourneyPage().flightsInformationPage().verifyFlightsInformationPage();
    }

    @Then("track any one of the flights and verify the same flight is added to the PLAN MY JOURNEY page")
    public void track_any_one_of_the_flights_and_verify_the_same_flight_is_added_to_the_PLAN_MY_JOURNEY_page() throws InterruptedException {
        pm.planYourJourneyPage().verifyFlightNumber();
        pm.planYourJourneyPage().verifyTerminal();
        pm.planYourJourneyPage().verifyBoardingGate();
        pm.planYourJourneyPage().verifyCheckInCounter();
    }

    @Then("click on the Stores, Dining, and Booking Service buttons on the PLAN MY JOURNEY page and verify each button navigates to their individual pages")
    public void click_on_the_stores_dining_and_booking_service_buttons_on_the_plan_my_journey_page_and_verify_each_button_navigates_to_their_individual_pages() {
//        planYourJourneyPage.verifyLabelExplore();
        pm.planYourJourneyPage().clickOnStores();
        pm.homePage().storesPage().verifyStoresPage();
        pm.homePage().storesPage().clickOnBackIcon();
        pm.planYourJourneyPage().verifyLabelExplore();
        pm.planYourJourneyPage().clickOnDining();
        pm.homePage().dinningPage().verifyDinningPage();
        pm.homePage().dinningPage().clickOnBackButton();
        pm.planYourJourneyPage().verifyLabelExplore();
        pm.planYourJourneyPage().clickOnBookingServices();
        pm.homePage().bookingServicePage().verifyBookingServicePage();
        pm.homePage().bookingServicePage().clickOnBackButton();
        pm.planYourJourneyPage().verifyLabelExplore();
    }

    @Then("verify the Share Flight Details button and Remove Flight button are visible on the PLAN MY JOURNEY page")
    public void verify_the_share_flight_details_button_and_remove_flight_button_are_visible_on_the_plan_my_journey_page() {
        pm.planYourJourneyPage().verifyShareFlightDetailsButton();
        pm.planYourJourneyPage().verifyRemoveFlightButton();
    }

    @Then("click on the Remove Flight button")
    public void click_on_the_remove_flight_button() {
        pm.planYourJourneyPage().clickOnRemoveFlightButton();
    }

    @Then("verify a confirmation popup is displayed to confirm removal")
    public void verify_a_confirmation_popup_is_displayed_to_confirm_removal() {
        pm.planYourJourneyPage().verifyPlanYourJourneyRemovePopup();
    }

    @Then("click on the Yes button to remove the flight from the PLAN MY JOURNEY page")
    public void click_on_the_yes_button_to_remove_the_flight_from_the_plan_my_journey_page() {
        pm.planYourJourneyPage().clickOnYesButton();
    }

    @Then("verify it navigates to the Home Page after clicking the Yes button to remove the flight")
    public void verify_it_navigates_to_the_home_page_after_clicking_the_yes_button_to_remove_the_flight() {
        pm.homePage().verifyHomePage();
    }

    @When("the user clicks on the Promotions Carousel card on the Home Page")
    public void the_user_clicks_on_the_promotions_carousel_card_on_the_home_page() {
        pm.homePage().clickOnPromotionsCarouselCard();
    }

    @Then("the user lands on the Promotions page")
    public void the_user_lands_on_the_promotions_page() {
        pm.promotionsPage().verifyPromotionsPage();
    }

    @And("the Search text field and Terminal dropdown is displayed on the Promotions page")
    public void the_search_text_field_and_terminal_dropdown_is_displayed_on_the_promotions_page() {
        pm.promotionsPage().verifySearchTextField();
        pm.promotionsPage().verifyTerminalDropDown();
    }

    @Then("the user is able to change the Terminal")
    public void the_user_is_able_to_change_the_terminal() {
        pm.promotionsPage().clickOnTerminalDropDown();
        pm.promotionsPage().clickOnTerminal2();
    }

    @And("the user clicks on any one of the banners on the Promotions page")
    public void the_user_clicks_on_any_one_of_the_banners_on_the_promotions_page() throws InterruptedException {
        textFromBanner = pm.promotionsPage().getTextFromBanner();
        pm.promotionsPage().clickOnBanner();
    }

    private String textFromBanner;

    @Then("the user navigates to the same Promotions page")
    public void the_user_navigates_to_the_same_promotions_page() {
        pm.promotionsPage().verifyBanner(textFromBanner);
    }

    @And("the back button is displayed on the selected banner page")
    public void the_back_button_is_displayed_on_the_selected_banner_page() {
        pm.promotionsPage().verifyBackButtonFromBannerPage();
    }

    @Then("the user clicks on the back button and navigates to the Promotions page")
    public void the_user_clicks_on_the_back_button_and_navigates_to_the_promotions_page() {
        pm.promotionsPage().clickOnBackFromBannerPage();
        pm.promotionsPage().verifyPromotionsPage();
    }

    @Then("the back button is displayed on the Promotions page")
    public void the_back_button_is_displayed_on_the_promotions_page() {
        pm.promotionsPage().verifyBackButton();
    }

    @And("the user clicks on the back button from the Promotions page and lands on the Home Page")
    public void the_user_clicks_on_the_back_button_from_the_promotions_page_and_lands_on_the_home_page() {
        pm.promotionsPage().clickOnBackButton();
        pm.homePage().verifyHomePage();
    }

}
