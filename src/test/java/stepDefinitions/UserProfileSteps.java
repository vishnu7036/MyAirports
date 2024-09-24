package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.pageClasses.*;
import pages.pagePopups.EditPhotoPopup;

import java.net.MalformedURLException;

public class UserProfileSteps {
    private static final Logger log = LoggerFactory.getLogger(UserProfileSteps.class);
    private AndroidDriver _driver;
    private HomePage homePage;
    private UserProfilePage userProfilePage;
    private EditPhotoPopup editPhotoPopup;
    private SettingsPage settingsPage;
    private ChangePasswordPage changePasswordPage;
    private LogoutPage logoutPage;
    private LoginPage loginPage;
    private GeneralPage generalPage;
    private ContactUsPage contactUsPage;
    private EditProfilePage editProfilePage;
    private FavouritesPage favouritesPage;
    private CustomerFeedbackPage customerFeedbackPage;

    @Before(value = "@camera or @password or @contactUs or @editProfile or @favourites or @customerFeedback or @giveCompliment or @makeSuggestion or @fileComplaintFromPassenger", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        homePage = new HomePage(_driver);
        userProfilePage = new UserProfilePage(_driver);
        editPhotoPopup = new EditPhotoPopup(_driver);
        settingsPage = new SettingsPage(_driver);
        changePasswordPage = new ChangePasswordPage(_driver);
        logoutPage = new LogoutPage(_driver);
        loginPage = new LoginPage(_driver);
        generalPage = new GeneralPage(_driver);
        contactUsPage = new ContactUsPage(_driver);
        editProfilePage = new EditProfilePage(_driver);
        favouritesPage = new FavouritesPage(_driver);
        customerFeedbackPage = new CustomerFeedbackPage(_driver);
    }

    @After(value = "@camera or @password or @contactUs or @editProfile or @favourites or @customerFeedback or @giveCompliment or @makeSuggestion or @fileComplaintFromPassenger")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@camera or @password or @contactUs or @editProfile or @favourites or @customerFeedback or @giveCompliment or @makeSuggestion or @fileComplaintFromPassenger", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication("vishnug4881@gmail.com", "Test@123");
    }

    @Given("the user clicks on the User Profile button on the homepage")
    public void the_user_clicks_on_the_user_profile_button_on_the_homepage() {
        homePage.clickOnUserAccount();
    }

    @Then("the user clicks on the Camera Icon on the User Profile page")
    public void the_user_clicks_on_the_camera_icon_on_the_user_profile_page() {
        userProfilePage.clickOnCameraIcon();
    }

    @Then("verify all buttons in the Edit Photo popup window")
    public void verify_all_buttons_in_the_edit_photo_popup_window() {
        editPhotoPopup.verifyEditPopupWindow();
        editPhotoPopup.verifyUseCameraButton();
        editPhotoPopup.verifyFromAlbumButton();
        editPhotoPopup.verifyClearButton();
        editPhotoPopup.verifyCloseIconInEditPhotoPopupWindow();
    }

    @Then("the user clicks on the Close button in the Edit Photo popup window")
    public void the_user_clicks_on_the_close_button_in_the_edit_photo_popup_window() {
        editPhotoPopup.clickOnCloseIconInEditPhotoPopupWindow();
    }

    @Then("the user clicks on the Settings button on the User Profile page")
    public void the_user_clicks_on_the_settings_button_on_the_user_profile_page() {
        userProfilePage.clickOnSettings();
    }

    @Then("the user lands on the Settings page")
    public void the_user_lands_on_the_settings_page() {
        settingsPage.verifySettingsPage();
    }

    @And("the user clicks on the Change Password button on the Settings page")
    public void the_user_clicks_on_the_change_password_button_on_the_settings_page() {
        settingsPage.clickOnChangePassword();
    }

    @Then("the user lands on the Change Password page")
    public void the_user_lands_on_the_change_password_page() {
        changePasswordPage.verifyChangePasswordPage();
    }

    @And("the user enters the Current Password, New Password, and Re-enter Password for password change")
    public void the_user_enters_the_current_password_new_password_and_re_enter_password_for_password_change() {
        changePasswordPage.enterCurrentPassword("Test@123");
        changePasswordPage.enterNewPassword("Mind@123");
        changePasswordPage.enterReEnterNewPassword("Mind@123");
    }

    @Then("the user clicks on the Save button")
    public void the_user_clicks_on_the_save_button() {
        changePasswordPage.clickOnSaveButton();
        changePasswordPage.clickOnSaveButton();
    }

    @And("a Password Change Successful popup appears")
    public void a_password_change_successful_popup_appears() {
        changePasswordPage.verifyPasswordChangeSuccessfullyPopup();
    }

    @Then("the user closes the popup and logs out of the application")
    public void the_user_closes_the_popup_and_logs_out_of_the_application() {
        changePasswordPage.clickOnCloseIconOnPasswordChangeSuccessfullyPopup();
        settingsPage.clickOnBackIcon();
        userProfilePage.clickOnLogoutButton();
        logoutPage.clickOnYesButton();
    }

    @And("the user logs in again with the new password")
    public void the_user_logs_in_again_with_the_new_password() {
        homePage.clickOnUserAccount();
        loginPage.enterEmailID("vishnug4881@gmail.com");
        loginPage.enterPassword("Mind@123");
        loginPage.clickOnSubmitButton();
        loginPage.clickOnSubmitButton();
    }

    @Then("the user is able to successfully log in with the new credentials")
    public void the_user_is_able_to_successfully_log_in_with_the_new_credentials() {
        homePage.verifyHomePage();
//        homePage.verifyUser("ioc");
        homePage.clickOnUserAccount();
        userProfilePage.clickOnSettings();
        settingsPage.clickOnChangePassword();
        changePasswordPage.enterCurrentPassword("Mind@123");
        changePasswordPage.enterNewPassword("Test@123");
        changePasswordPage.enterReEnterNewPassword("Test@123");
        changePasswordPage.clickOnSaveButton();
        changePasswordPage.clickOnSaveButton();
        changePasswordPage.verifyPasswordChangeSuccessfullyPopup();
        changePasswordPage.clickOnCloseIconOnPasswordChangeSuccessfullyPopup();
    }


    @Then("the user clicks on the General button from the User Profile page")
    public void the_user_clicks_on_the_general_button_from_the_user_profile_page() {
        userProfilePage.clickOnGeneral();
    }

    @And("the user lands on the General page")
    public void the_user_lands_on_the_general_page() {
        generalPage.verifyGeneralPage();
    }

    @Then("the user clicks on the Contact Us button")
    public void the_user_clicks_on_the_contact_us_button() {
        generalPage.clickOnContactUs();
    }

    @And("the user lands on the Contact Us page")
    public void the_user_lands_on_the_contact_us_page() {
        contactUsPage.verifyContactUsPage();
    }

    @Then("the user clicks on the contact number")
    public void the_user_clicks_on_the_contact_number() {
        contactUsPage.clickOnContactNumber();
    }

    @And("the user verifies that it takes them to the dial pad")
    public void the_user_verifies_that_it_takes_them_to_the_dial_pad() {
        contactUsPage.verifyDailPad();
    }

    @And("the user returns from daily pad to the application and verifies the Contact Us page")
    public void the_user_returns_to_the_application_and_verifies_the_contact_us_page() {
        contactUsPage.clickOnDeviceBackButton();
        contactUsPage.clickOnDeviceBackButton();
        contactUsPage.clickOnDeviceBackButton();
        contactUsPage.verifyContactUsPage();

    }

    @Then("the user clicks on Email")
    public void the_user_clicks_on_email() {
        contactUsPage.clickOnEmail();
    }

    @And("the user verifies that it takes them to the email application")
    public void the_user_verifies_that_it_takes_them_to_the_email_application() {
        contactUsPage.verifyGmail();
    }

    @And("the user returns from Gmail to the application and verifies the Contact Us page")
    public void the_user_returns_from_Gmail_to_the_application_and_verifies_the_Contact_Us_page() {
        contactUsPage.clickOnDeviceBackButton();
        contactUsPage.verifyContactUsPage();
    }

    @Then("click on back icon from Contact Us page")
    public void click_on_back_icon_from_Contact_Us_page() {
        contactUsPage.clickOnBackButton();
    }

    @And("verify the user lands on General Page")
    public void verify_the_user_lands_on_General_Page() {
        generalPage.verifyGeneralPage();
    }


    @Then("the user clicks on the Edit icon")
    public void the_user_clicks_on_the_edit_icon() {
        userProfilePage.clickOnEditIcon();
    }

    @And("changes the First Name of the user from the Edit Profile Page and Save")
    public void changes_the_first_name_of_the_user_from_the_edit_profile_page_and_save() throws InterruptedException {
        editProfilePage.verifyEditProfilePage();
        editProfilePage.enterFirstName("Mind");
        editProfilePage.clickOnSave();
        text = editProfilePage.getFirstName();
    }

    private String text;

    @Then("clicks on the Back icon from the Edit Profile Page")
    public void clicks_on_the_back_icon_from_the_edit_profile_page() {
        editProfilePage.clickOnBackButton();
    }

    @And("verifies that the user name has been changed in the User Profile Page")
    public void verifies_that_the_user_name_has_been_changed_in_the_user_profile_page() throws InterruptedException {
        userProfilePage.verifyUserName(text);
        userProfilePage.clickOnEditIcon();
        editProfilePage.enterFirstName("ioc");
        editProfilePage.clickOnSave();
    }


    @Then("the user clicks on the Favorites icon")
    public void the_user_clicks_on_the_favorites_icon() {
        userProfilePage.clickOnFavourites();
    }

    @And("verifies that the user lands on the Favorites page")
    public void verifies_that_the_user_lands_on_the_favorites_page() {
        favouritesPage.verifyFavouritesPage();
    }

    @Then("clicks on any one of the favorite items, such as Convenience Store, ATM Machine, etc., from the Favorites Page")
    public void clicks_on_any_one_of_the_favorite_items_such_as_convenience_store_atm_machine_etc_from_the_favorites_page() {
        favouritesPage.getTextFromFirstDisplayedFavouriteStore();
        favouritesPage.clickOnFirstDisplayedFavouriteStore();
    }

    @And("verifies that the user navigates to the selected favorite item page")
    public void verifies_that_the_user_navigates_to_the_selected_favorite_item_page() {
        favouritesPage.verifySameStoreHasBeenOpened();
    }

    @Then("clicks on the Back button from the store page")
    public void clicks_on_the_back_button_from_the_store_page() {
        favouritesPage.singleStorePage().clickOnBackIcon();
    }

    @And("clicks on the Back button from the Favorites page")
    public void clicks_on_the_back_button_from_the_favorites_page() {
        favouritesPage.clickOnBackButton();
    }

    @Then("verifies that the user lands on the User Profile page")
    public void verifies_that_the_user_lands_on_the_user_profile_page() {
        userProfilePage.verifyUserProfilePage();
    }


    @When("the user clicks on the Feedback icon")
    public void the_user_clicks_on_the_feedback_icon() {
        userProfilePage.clickOnFeedback();
    }

    @Then("the user should land on the Feedback Page")
    public void the_user_should_land_on_the_feedback_page() {
        customerFeedbackPage.verifyCustomerFeedbackPage();
    }

    @And("all buttons present on the Feedback Page should be verified")
    public void all_buttons_present_on_the_feedback_page_should_be_verified() {
        customerFeedbackPage.verifyFileComplaintButton();
        customerFeedbackPage.verifyGiveComplaintButton();
        customerFeedbackPage.verifyMakeSuggestionButton();
    }

    @When("the user clicks on the File a Complaint button")
    public void the_user_clicks_on_the_file_a_complaint_button() {
        customerFeedbackPage.clickOnFileComplaintButton();
    }

    @Then("the user should land on the Terminal Page")
    public void the_user_should_land_on_the_terminal_page() {
        customerFeedbackPage.verifyTerminalPage();
    }

    @When("the user clicks on the Previous button on the Terminal Page")
    public void the_user_clicks_on_the_previous_button_on_the_terminal_page() {
        customerFeedbackPage.clickOnPreviousButton();
    }

    @Then("the user should be navigated back to the Feedback Page")
    public void the_user_should_be_navigated_back_to_the_feedback_page() {
        customerFeedbackPage.verifyCustomerFeedbackPage();
    }

    @When("the user clicks on the Make a Suggestion button again")
    public void the_user_clicks_on_the_make_a_suggestion_button_again() {
        customerFeedbackPage.clickOnMakeSuggestionButton();
    }

    @When("the user clicks on the Give a Compliment button again")
    public void the_user_clicks_on_the_give_a_Compliment_button_again() {
        customerFeedbackPage.clickOnGiveComplimentButton();
    }

    @When("the user clicks on the Close icon from the Customer Feedback Page")
    public void the_user_clicks_on_the_close_icon_from_the_customer_feedback_page() {
        customerFeedbackPage.clickOnCloseIcon();
    }

    @Then("the user should land back on the User Profile page")
    public void the_user_should_land_back_on_the_user_profile_page() {
        userProfilePage.verifyUserProfilePage();
    }

    @And("the user clicks on the Give a Compliment button")
    public void the_user_clicks_on_the_give_a_compliment_button() {
        customerFeedbackPage.clickOnGiveComplimentButton();
    }

    @Then("the user clicks on any one of the terminals on the Terminal Page")
    public void the_user_clicks_on_any_one_of_the_terminals_on_the_terminal_page() {
        customerFeedbackPage.clickOnTerminalTwo();
    }

    @And("the user should land on the Give A Compliment Page")
    public void the_user_should_land_on_the_give_a_compliment_page() {
        customerFeedbackPage.giveAComplimentPage().verifyGiveAComplimentPage();
    }

    @When("the user gives a compliment")
    public void the_user_gives_a_compliment() {
        customerFeedbackPage.giveAComplimentPage().enterCompliment("Testing please ignore");
    }

    @And("clicks on the Submit button")
    public void clicks_on_the_submit_button() {
        customerFeedbackPage.giveAComplimentPage().clickOnFiveStarRating();
        customerFeedbackPage.giveAComplimentPage().clickOnSubmitButton();
    }

    @Then("the user should see the Thank You For Your Compliment popup")
    public void the_user_should_see_the_Thank_You_For_Your_Compliment_popup() {
        customerFeedbackPage.giveAComplimentPage().verifyThankYouForYourComplimentPopup();
    }

    @And("closes the popup")
    public void closes_the_popup() {
        customerFeedbackPage.giveAComplimentPage().clickOnThankYouForYourComplimentClosePopup();
    }

    @Then("the user should land back on the Home Page")
    public void the_user_should_land_back_on_the_home_page() {
        homePage.verifyHomePage();
    }

    @Then("the user clicks on the Make A Suggestion button")
    public void the_user_clicks_on_the_make_a_suggestion_button() {
        customerFeedbackPage.clickOnMakeSuggestionButton();
    }

    @Then("the user should land on the Make A Suggestion Page")
    public void the_user_should_land_on_the_make_a_suggestion_page() {
        customerFeedbackPage.makeASuggestionPage().verifyMakeASuggestionPage();
    }

    @When("the user gives a Suggestion")
    public void the_user_gives_a_suggestion() {
        customerFeedbackPage.makeASuggestionPage().enterSuggestion("More signage, seating");
    }

    @Then("the user should see the Thank You For Your Valuable Suggestion Popup")
    public void the_user_should_see_the_thank_you_for_your_valuable_suggestion_popup() {
        customerFeedbackPage.makeASuggestionPage().verifyThankYouForYourValuableSuggestion();
    }

    @Then("verify the user is navigated to Are You a Passenger page")
    public void verify_the_user_is_navigated_to_are_you_a_passenger_page() {
        customerFeedbackPage.verifyAreYouPassengerPage();
    }

    @Then("the user clicks on the Yes radio button on the Are You a Passenger page")
    public void the_user_clicks_on_the_yes_radio_button_on_the_are_you_a_passenger_page() {
        customerFeedbackPage.clickOnYesRadioButton();
    }

    @Then("verify the user is navigated to the I am a Passenger page")
    public void verify_the_user_is_navigated_to_the_i_am_a_passenger_page() {
        customerFeedbackPage.verifyIamPassengerPage();
    }

    @Then("the user selects the International and Departing radio buttons on the I am a Passenger page")
    public void the_user_selects_the_international_and_departing_radio_buttons_on_the_i_am_a_passenger_page() {
        customerFeedbackPage.clickOnInternationalRadioButton();
        customerFeedbackPage.clickOnDepartingRadioButton();
    }

    @Then("verify the user is navigated to the Complaint Options page")
    public void verify_the_user_is_navigated_to_the_complaint_options_page() {
        customerFeedbackPage.verifyAreaOfComplaintOptionPage();
    }

    @Then("the user selects the Toilets option on the Complaint page")
    public void the_user_selects_the_toilets_option_on_the_complaint_page() {
        customerFeedbackPage.clickOnToiletsButton();
    }

    @Then("verify the user lands on the Register Complaint page")
    public void verify_the_user_lands_on_the_register_complaint_page() {
        customerFeedbackPage.registerComplaintPage().verifyRegisterComplaintPage();
    }

    @Then("the user fills in all mandatory fields on the Register Complaint page")
    public void the_user_fills_in_all_mandatory_fields_on_the_register_complaint_page() {
        customerFeedbackPage.registerComplaintPage().enterDescription();
        customerFeedbackPage.registerComplaintPage().enterLocation();
        customerFeedbackPage.registerComplaintPage().enterFlightNumber();
    }

    @Then("the user clicks on the Submit button on the Register Complaint page")
    public void the_user_clicks_on_the_submit_button_on_the_register_complaint_page() {
        customerFeedbackPage.registerComplaintPage().clickOnSubmitButton();
    }

    @And("verify the Complaint Successfully Registered popup")
    public void verifyTheComplaintSuccessfullyRegisteredPopup() {
        customerFeedbackPage.registerComplaintPage().verifyComplaintSuccessfullyRegisteredPopup();
        customerFeedbackPage.registerComplaintPage().verifyCloseIconInRegisteredComplaintPopup();
        customerFeedbackPage.registerComplaintPage().clickOnCloseIcon();
    }
}
