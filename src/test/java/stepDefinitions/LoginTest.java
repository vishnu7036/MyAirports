package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.pageClases.LandingPage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LoginTest extends BaseTest {
    private LandingPage landingPage;

    @Before
    public void init() {
        AndroidDriver _driver = super.driver;
        landingPage = new LandingPage(_driver);
    }

    @Given("the My Airports application is opened")
    public void launch_My_Airports_application() throws MalformedURLException {
//        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Mind-Graph//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();
//        service.start();
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("platformName", "Android");
//        cap.setCapability("automationName", "uiautomator2");
//        cap.setCapability("udid", "emulator-5554");
//        cap.setCapability("deviceName", "Pixel 4 API 30");
//        cap.setCapability("app", "C://Users//mobileApkFiles//prod 2.apk");

//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("Pixel 6 pro API 30");
//        options.setApp("C://Users//mobileApkFiles//prod 2.apk");
//        options.setUdid("emulator-5554");
//        options.setPlatformName("Android");
//        options.setPlatformVersion("Android 11");
//
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//        driver = new AndroidDriver(url, options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        landingPage = new LandingPage(driver);
        System.out.println("Application is Opened");
    }

    @When("the user clicks on the login button")
    public void click_on_login_button() {
        landingPage.clickOnLoginOrSignup();
    }

    @Then("the user navigates to the login page")
    public void verify_user_on_login_page() {
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
    public void verify_user_in_homePage() {
        landingPage.loginPage().locationPopup().verifyLocationPopupHeading();
        landingPage.loginPage().homePage().verifyHomePage();
    }

    @After
    public void applicationClose() {
        System.out.println("Application is closed");
    }
}
