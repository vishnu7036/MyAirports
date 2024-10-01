package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utils.*;

import java.net.MalformedURLException;

public class LoginPageSteps {
    private AndroidDriver _driver;
    private PageObjectManager pm;


    @Before(value = "@login", order = 0)
    public void launchApp() throws MalformedURLException {
        System.out.println("before Login method is running");
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After(value = "@login")
    public void closeApp() {
        System.out.println("after Login method is running");
        BaseSteps.closeDriver();
    }

    @Before(value = "@login", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Then("the user successfully navigates to the Home page")
    public void the_user_successfully_navigates_to_the_home_page() throws InterruptedException {
        pm.homePage().verifyHomePage();
    }

    @And("the user clicks on the user account")
    public void the_user_clicks_on_the_user_account() {
        pm.homePage().clickOnUserAccount();
    }

    @Then("the user navigates to the user profile page")
    public void the_user_navigates_to_the_user_profile_page() {
        pm.userProfilePage().verifyUserProfilePage();
    }

    @And("clicks on the Logout button")
    public void clicks_on_the_Logout_button() {
        pm.userProfilePage().clickOnLogoutButton();
    }

    @Then("the user navigates to the Logout page")
    public void the_user_navigates_to_the_Logout_page() {
        pm.logoutPage().verifyLogoutPage();
    }

    @And("clicks on the Yes button to Logout")
    public void clicks_on_the_Yes_button_to_Logout() {
        pm.logoutPage().clickOnYesButton();
    }

    @Then("navigates to the home page with successfully logged out")
    public void navigates_to_the_home_page_with_successfully_logged_out() {
        pm.homePage().verifyUserName("Welcome");
    }

}
