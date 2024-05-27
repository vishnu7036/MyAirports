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

    @Before(value = "@camera or @password or @contactUs or @editProfile or @favourites", order = 0)
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
    }

    @After(value = "@camera or @password or @contactUs or @editProfile or @favourites")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@camera or @password or @contactUs or @editProfile or @favourites", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication("iotuatproject@gmail.com", "Mind@123");
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
        changePasswordPage.enterCurrentPassword("Mind@123");
        changePasswordPage.enterNewPassword("Test@123");
        changePasswordPage.enterReEnterNewPassword("Test@123");
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
        loginPage.enterEmailID("iotuatproject@gmail.com");
        loginPage.enterPassword("Test@123");
        loginPage.clickOnSubmitButton();
        loginPage.clickOnSubmitButton();
    }

    @Then("the user is able to successfully log in with the new credentials")
    public void the_user_is_able_to_successfully_log_in_with_the_new_credentials() {
        homePage.verifyHomePage();
        homePage.verifyUser("ioc");
        homePage.clickOnUserAccount();
        userProfilePage.clickOnSettings();
        settingsPage.clickOnChangePassword();
        changePasswordPage.enterCurrentPassword("Test@123");
        changePasswordPage.enterNewPassword("Mind@123");
        changePasswordPage.enterReEnterNewPassword("Mind@123");
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
}
