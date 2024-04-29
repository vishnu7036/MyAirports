package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClases.LandingPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LoginTest {
    private LandingPage landingPage;

    @Before
    public void getDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 6 pro API 30");
        options.setApp("C://Users//mobileApkFiles//prod 2.apk");
        options.setUdid("emulator-5554");
        options.setPlatformName("Android");
        options.setPlatformVersion("Android 11");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        landingPage = new LandingPage(driver);
    }

    @After
    public void say_after() {
        System.out.println("After");
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
