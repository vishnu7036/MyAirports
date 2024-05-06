package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClasses.*;
import pages.pagePopups.LocationPopup;

import java.net.MalformedURLException;

public class LoginPageSteps {
    private AndroidDriver _driver;
    private LandingPage landingPage;
    private LoginPage loginPage;
    private LocationPopup locationPopup;
    private HomePage homePage;
    private UserProfilePage userProfilePage;
    private LogoutPage logoutPage;

    @Before("@login")
    public void launchApp() throws MalformedURLException {
        System.out.println("before Login method is running");
        _driver = BaseSteps.getDriver();
        landingPage = new LandingPage(_driver);
        loginPage = new LoginPage(_driver);
        locationPopup = new LocationPopup(_driver);
        homePage = new HomePage(_driver);
        userProfilePage = new UserProfilePage(_driver);
        logoutPage = new LogoutPage(_driver);
    }

    @After("@login")
    public void closeApp() {
        System.out.println("after Login method is running");
        BaseSteps.closeDriver();
    }

    @Given("the user launches the My Airports application")
    public void the_user_launches_the_My_Airports_application() {
        landingPage.verifyLandingPage();
    }

    @When("the user clicks on the login or signup button")
    public void the_user_clicks_on_the_login_or_signup_button() {
        landingPage.clickOnLoginOrSignup();
    }

    @Then("the user navigates to the login page")
    public void the_user_navigates_to_the_login_page() {
        loginPage.verifyLoginPage();
    }

    @And("enters their email Id and password")
    public void enter_email_and_password() throws InterruptedException {
        loginPage.enterEmailID("iotuatproject@gmail.com");
        loginPage.enterPassword("IOTuat@123");
    }

    @Then("clicks on the login button")
    public void clicks_on_the_login_button() {
        loginPage.clickOnSubmitButton();
    }
    @And("enables the location")
    public void enables_the_location(){
        locationPopup.verifyLocationPopupHeading();
    }

    @Then("the user successfully navigates to the Home page")
    public void the_user_successfully_navigates_to_the_home_page() throws InterruptedException {
        homePage.verifyHomePage();
    }

    @And("the user clicks on the user account")
    public void the_user_clicks_on_the_user_account() {
        homePage.clickOnUserAccount();
    }

    @Then("the user navigates to the user profile page")
    public void the_user_navigates_to_the_user_profile_page() {
        userProfilePage.verifyUserProfilePage();
    }

    @And("clicks on the Logout button")
    public void clicks_on_the_Logout_button() {
        userProfilePage.clickOnLogoutButton();
    }

    @Then("the user navigates to the Logout page")
    public void the_user_navigates_to_the_Logout_page() {
        logoutPage.verifyLogoutPage();
    }

    @And("clicks on the Yes button to Logout")
    public void clicks_on_the_Yes_button_to_Logout() {
        logoutPage.clickOnYesButton();
    }

    @Then("navigates to the home page with successfully logged out")
    public void navigates_to_the_home_page_with_successfully_logged_out() {
        homePage.verifyUser("Welcome");
    }

}
