package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClasses.LandingPage;

import java.net.MalformedURLException;

public class LoginTest {
    private AndroidDriver _driver;
    private LandingPage landingPage;

    @Before("@login")
    public void launchApp() throws MalformedURLException {
        System.out.println("before Login method is running");
        _driver = BaseTest.getDriver();
        landingPage = new LandingPage(_driver);
    }

    @After("@login")
    public void closeApp() {
        System.out.println("after Login method is running");
        BaseTest.closeDriver();
    }

    @Given("the My Airports application is opened")
    public void the_my_airports_application_is_opened() {
        System.out.println("Application is Opened");
    }

    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        landingPage.clickOnLoginOrSignup();
    }

    @Then("the user navigates to the login page")
    public void the_user_navigates_to_the_login_page() {
        landingPage.loginPage().verifyLoginPage();
    }

    @And("^enters their (.*) and (.*)$")
    public void enter_email_and_password(String email, String password) throws InterruptedException {
        landingPage.loginPage().enterEmailID(email);
        landingPage.loginPage().enterPassword(password);
        landingPage.loginPage().hideKeyboard();
        landingPage.loginPage().clickOnSubmitButton();
    }

    @Then("the user successfully navigates to the Home page")
    public void the_user_successfully_navigates_to_the_home_page() {
        landingPage.loginPage().locationPopup().verifyLocationPopupHeading();
        landingPage.loginPage().homePage().verifyHomePage();
    }
}
