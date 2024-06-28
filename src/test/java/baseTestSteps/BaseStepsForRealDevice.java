package baseTestSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.pageClasses.WelcomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
/*
If you are starting the appium server programmatically then the URL should be "http://127.0.0.1:4723"
If you are starting the appium server manually through Desktop/cmd then the URL should be "http://127.0.0.1:4723/wd/hub"
 */

public class BaseStepsForRealDevice {

    public static AndroidDriver driver;
    public static AppiumDriverLocalService service;
    public final static int time_out = 40;
    public static WelcomePage welcomePage;

    public static AndroidDriver getDriver() throws MalformedURLException {
        String dir = System.getProperty("user.dir");
//        service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Mind-Graph//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();
//        service.start();
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("realme 10 Pro+5G");
//        options.setUdid("4TDA8HV85D7H7T4T");
//        options.setPlatformName("Android");
//        options.setPlatformVersion("Android 14");
//        options.setAppPackage("Klia.mahb.ios");
//        options.setAppActivity("Klia.mahb.ios.MainActivity");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "realme 10 Pro+5G");
        caps.setCapability("udid", "8P7LKVVONZMBBUY5");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "Android 14");
        caps.setCapability("appPackage", "klia.mahb.ios");
        caps.setCapability("appActivity", "klia.mahb.ios.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, caps);
//        driver = new AppiumDriver(url, caps);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time_out));
        return driver;
    }

    public static void closeDriver() {
        if (driver != null)
            driver.quit();
//        if (service != null)
//            service.stop();
    }

    public static void loginApplication(String email, String password) {
        welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePage();
        welcomePage.clickOnLoginOrSignup();
        welcomePage.loginPage().verifyLoginPage();
        welcomePage.loginPage().enterEmailID(email);
        welcomePage.loginPage().enterPassword(password);
        welcomePage.loginPage().clickOnSubmitButton();
        welcomePage.loginPage().locationPopup().verifyLocationPopupHeading();
    }

}
