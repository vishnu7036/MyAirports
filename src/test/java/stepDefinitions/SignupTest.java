package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.pageClases.LandingPage;
import pages.pageClases.LocationPopup;
import pages.pageClases.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SignupTest {
    private AndroidDriver driver;
    private LandingPage landingPage;
    private LoginPage loginPage;
    private LocationPopup locationPopup;

    @Given("My Airports application is opened")
    public void my_airports_application_is_opened() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceName", "Pixel 4 API 30");
        cap.setCapability("app", "C://Users//mobileApkFiles//prod 2.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        landingPage = new LandingPage(driver);
        loginPage = new LoginPage(driver);
        locationPopup = new LocationPopup(driver);
    }

    @When("the user clicks on the login or Signup button")
    public void the_user_clicks_on_the_login_or_signup_button() {
        landingPage.clickOnLoginOrSignup();
    }

    @And("the user navigates to the Login page")
    public void the_user_navigates_to_the_login_page() {
        loginPage.verifyLoginPage();
    }

    @Then("proceeds to the Signup page by clicking on the signup button")
    public void proceeds_to_the_signup_page_by_clicking_on_the_signup_button() {
        landingPage.loginPage().clickOnSignUpBtn();
        loginPage.clickOnSignUpBtn();
    }

    @And("^the user is prompted to enter their (.*), (.*), (.*), and (.*)$")
    public void the_user_is_prompted_to_enter_their_mind_graph_vishnu_g_mind_graph_com_and_mind(String firstName, String lastName, String email, String password) throws InterruptedException {
        loginPage.clickOnSubmitButton();
        landingPage.loginPage().signupPage().enterFirstName(firstName);
        landingPage.loginPage().signupPage().enterLastName(lastName);
        landingPage.loginPage().signupPage().enterEmailID(email);
        landingPage.loginPage().signupPage().enterPassword(password);
        landingPage.loginPage().signupPage().clickOnCreateAccountBtn();
    }

    @Then("clicks on the Create Account button")
    public void the_user_fills_in_the_required_information() {
        landingPage.loginPage().signupPage().clickOnCreateAccountBtn();
    }

    @And("the user account is successfully created")
    public void the_user_account_is_successfully_created() {
        System.out.println("User account has been created");
    }

}
