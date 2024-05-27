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

    @Before(value = "@Butterfly", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        homePage = new HomePage(_driver);
        butterflyEffectPage = new ButterflyEffectPage(_driver);
    }

    @After("@Butterfly")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@Butterfly", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication("iotuatproject@gmail.com", "Mind@123");
    }

    @Given("the user selects the Butterfly Effect card from the carousel slides on the home page")
    public void the_user_selects_the_butterfly_effect_card_from_the_carousel_slides_on_the_home_page() {
        homePage.clickOnButterflyCard();
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

}
