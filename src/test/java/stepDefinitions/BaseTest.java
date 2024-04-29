package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.pageClases.LandingPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public static AndroidDriver driver;

    public static AndroidDriver getDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 6 pro API 30");
        options.setApp("C://Users//mobileApkFiles//prod 2.apk");
        options.setUdid("emulator-5554");
        options.setPlatformName("Android");
        options.setPlatformVersion("Android 11");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return driver;
    }

    public static void closeDriver() {
        if (driver != null)
            driver.quit();
    }

}
