package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClasses.*;
import pages.pagePopups.LocationPopup;

import java.net.MalformedURLException;

public class LoginPageSteps {
    private AndroidDriver _driver;
    private WelcomePage welcomePage;
    private LoginPage loginPage;
    private LocationPopup locationPopup;
    private HomePage homePage;
    private UserProfilePage userProfilePage;
    private LogoutPage logoutPage;

    @Before(value = "@login",order = 0)
    public void launchApp() throws MalformedURLException {
        System.out.println("before Login method is running");
        _driver = BaseSteps.getDriver();
        welcomePage = new WelcomePage(_driver);
        loginPage = new LoginPage(_driver);
        locationPopup = new LocationPopup(_driver);
        homePage = new HomePage(_driver);
        userProfilePage = new UserProfilePage(_driver);
        logoutPage = new LogoutPage(_driver);
    }

    @After(value = "@login")
    public void closeApp() {
        System.out.println("after Login method is running");
        BaseSteps.closeDriver();
    }
    @Before(value = "@login",order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required(){
        BaseSteps.loginApplication("vishnug4881@gmail.com","Test@123");
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
        homePage.verifyUserName("Welcome");
    }

}
