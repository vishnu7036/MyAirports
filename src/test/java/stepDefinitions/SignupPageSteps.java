package stepDefinitions;

import baseTestSteps.BaseSteps;
import com.mailosaur.MailosaurException;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utils.*;

import java.io.IOException;
import java.net.MalformedURLException;

public class SignupPageSteps {
    private AndroidDriver _driver;
    private PageObjectManager pm;
    private String email;

    @Before("@signup")
    public void launchApp() throws MalformedURLException {
        System.out.println("before signup method is running");
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
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
        pm.welcomePage().clickOnLoginOrSignup();
    }

    @And("the user navigates to the Login page")
    public void the_user_navigates_to_the_login_page() {
        pm.loginPage().verifyLoginPage();
    }

    @Then("proceeds to the Signup page by clicking on the signup button")
    public void proceeds_to_the_signup_page_by_clicking_on_the_signup_button() {
        pm.loginPage().clickOnSignUpBtn();
    }

    @And("the user is prompted to enter their First Name, Last Name, Email ID, and Password")
    public void the_user_is_prompted_to_enter_their_FirstName_LastName_EmailID_and_Password() {
        pm.signupPage().enterFirstName(5);
        pm.signupPage().enterLastName(5);
        email = pm.signupPage().enterEmail();
        pm.signupPage().enterPassword("Mind@123");
    }

    @Then("clicks on the Create Account button")
    public void the_user_fills_in_the_required_information() {
        pm.signupPage().clickOnTermsAndConditionsCheckBox();
        pm.signupPage().clickOnCreateAccountBtn();
    }

    @And("the user navigates to verify Email page")
    public void the_user_navigates_to_verify_Email_page() {
        pm.verifyEmailPage().validateVerifyEmailPage();
    }

    @Then("enter OTP and click on submit button to create a new account")
    public void enter_OTP_and_click_on_submit_button_to_create_a_new_account() throws MailosaurException, IOException, InterruptedException {
        String otp = pm.signupPage().getOTP();
        pm.verifyEmailPage().enterOTP(otp);
        pm.verifyEmailPage().clickOnSubmitButton();
    }

    @And("the user account is successfully created")
    public void the_user_account_is_successfully_created() throws MailosaurException, IOException, InterruptedException {
        pm.signupPage().verifySuccessfullyCreatedPopup();
        pm.signupPage().clickOnLoginButton();
    }

    @When("the user logs in with the new credentials")
    public void the_user_logs_in_with_the_new_credentials() {
        pm.loginPage().enterEmailID(email);
        pm.loginPage().enterPassword("Mind@123");
        pm.loginPage().clickOnSubmitButton();
        pm.locationPopup().verifyLocationPopupHeading();
    }

    @Then("the user is able to login into the application successfully")
    public void the_user_is_able_to_login_into_the_application_successfully() {
        pm.homePage().verifyHomePage();
    }

}
