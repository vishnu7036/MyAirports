package baseTestSteps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import pages.pageClasses.WelcomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
/*
If you are starting the appium server programmatically then the URL should be "http://127.0.0.1:4723"
If you are starting the appium server manually through Desktop/cmd then the URL should be "http://127.0.0.1:4723/wd/hub"
 */

public class BaseSteps {

    public static AndroidDriver driver;
    public static AppiumDriverLocalService service;
    public final static int time_out = 60;
    public static WelcomePage welcomePage;

    public static AndroidDriver getDriver() throws MalformedURLException {
        String dir = System.getProperty("user.dir");
//        service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Mind-Graph//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();
//        service.start();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 6 pro API 30");
        options.setApp(dir + "//src//main//resources//prod 2.apk");
        options.setUdid("emulator-5554");
        options.setPlatformName("Android");
        options.setPlatformVersion("Android 11");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time_out));
        return driver;
    }

    public static void closeDriver() {
        if (driver != null)
            driver.quit();
//        if (service != null)
//            service.stop();
    }

    public static void loginApplication() {
        welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePage();
        welcomePage.clickOnLoginOrSignup();
        welcomePage.loginPage().verifyLoginPage();
        welcomePage.loginPage().enterEmailID("iotuatproject@gmail.com");
        welcomePage.loginPage().enterPassword("IOTuat@123");
        welcomePage.loginPage().clickOnSubmitButton();
        welcomePage.loginPage().locationPopup().verifyLocationPopupHeading();
    }

}
