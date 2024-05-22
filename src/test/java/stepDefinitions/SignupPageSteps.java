package stepDefinitions;

import baseTestSteps.BaseSteps;
import com.mailosaur.MailosaurException;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClasses.VerifyEmailPage;
import pages.pageClasses.WelcomePage;
import pages.pageClasses.LoginPage;
import pages.pageClasses.SignupPage;

import java.io.IOException;
import java.net.MalformedURLException;

public class SignupPageSteps {
    private AndroidDriver _driver;
    private WelcomePage welcomePage;
    private LoginPage loginPage;
    private SignupPage signupPage;
    private VerifyEmailPage verifyEmailPage;

    @Before("@signup")
    public void launchApp() throws MalformedURLException {
        System.out.println("before signup method is running");
        _driver = BaseSteps.getDriver();
        welcomePage = new WelcomePage(_driver);
        loginPage = new LoginPage(_driver);
        signupPage = new SignupPage(_driver);
        verifyEmailPage = new VerifyEmailPage(_driver);
    }

    @After("@signup")
    public void closeApp() {
        System.out.println("after signup method is running");
        BaseSteps.closeDriver();
    }

    @Given("My Airports application is opened")
    public void my_airports_application_is_opened() throws MalformedURLException {
        System.out.println("given");
    }

    @When("the user clicks on the login or Signup button")
    public void the_user_clicks_on_the_login_or_signup_button() {
        welcomePage.clickOnLoginOrSignup();
    }

    @And("the user navigates to the Login page")
    public void the_user_navigates_to_the_login_page() {
        loginPage.verifyLoginPage();
    }

    @Then("proceeds to the Signup page by clicking on the signup button")
    public void proceeds_to_the_signup_page_by_clicking_on_the_signup_button() {
        loginPage.clickOnSignUpBtn();
    }

    @And("^the user is prompted to enter their (.*), (.*), (.*), and (.*)$")
    public void the_user_is_prompted_to_enter_their_mind_graph_vishnu_g_mind_graph_com_and_mind(String firstName, String lastName, String email, String password) throws InterruptedException {
        signupPage.enterFirstName(5);
        signupPage.enterLastName(5);
        signupPage.enterEmail();
        signupPage.enterPassword(password);
    }

    @Then("clicks on the Create Account button")
    public void the_user_fills_in_the_required_information() {
        signupPage.clickOnCreateAccountBtn();
    }

    @And("the user navigates to verify Email page")
    public void the_user_navigates_to_verify_Email_page() {
        verifyEmailPage.validateVerifyEmailPage();
    }

    @Then("enter OTP and click on submit button to create a new account")
    public void enter_OTP_and_click_on_submit_button_to_create_a_new_account() throws MailosaurException, IOException, InterruptedException {
        String otp = signupPage.getOTP();
        verifyEmailPage.enterOTP(otp);
        verifyEmailPage.clickOnSubmitButton();
    }

    @And("the user account is successfully created")
    public void the_user_account_is_successfully_created() throws MailosaurException, IOException, InterruptedException {
        System.out.println("user created account successfully");
    }

}
