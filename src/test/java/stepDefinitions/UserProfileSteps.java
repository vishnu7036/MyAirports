package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClasses.*;
import pages.pagePopups.ChooseAirportPopup;
import pages.pagePopups.EditPhotoPopup;

import java.net.MalformedURLException;

public class UserProfileSteps {
    private AndroidDriver _driver;
    private HomePage homePage;
    private FlightPage flightPage;
    private ChooseAirportPopup chooseAirport;
    private DeparturePage departurePage;
    private ArrivalPage arrivalPage;
    private UserProfilePage userProfilePage;
    private EditPhotoPopup editPhotoPopup;

    @Before(value = "@camera", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        homePage = new HomePage(_driver);
        flightPage = new FlightPage(_driver);
        chooseAirport = new ChooseAirportPopup(_driver);
        departurePage = new DeparturePage(_driver);
        arrivalPage = new ArrivalPage(_driver);
        userProfilePage = new UserProfilePage(_driver);
        editPhotoPopup = new EditPhotoPopup(_driver);
    }

    @After("@camera")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@camera", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
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
}
