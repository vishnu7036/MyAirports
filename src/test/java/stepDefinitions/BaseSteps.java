package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
/*
If you are starting the appium server programatically then the URL should be "http://127.0.0.1:4723"
If you are starting the appium server manually through Desktop/cmd then the URL should be "http://127.0.0.1:4723/wd/hub"
 */

public class BaseSteps {

    public static AndroidDriver driver;
    public static AppiumDriverLocalService service;
    public final static int time_out = 60;

    public static AndroidDriver getDriver() throws MalformedURLException {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Mind-Graph//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 6 pro API 30");
        options.setApp("C://Users//Mind-Graph//IdeaProjects//MyAirports//src//main//resources//prod 2.apk");
//        options.setApp("C://Users//mobileApkFiles//prod 2.apk");
        options.setUdid("emulator-5554");
//        options.setUdid("RZCTB0AY5JW");
        options.setPlatformName("Android");
        options.setPlatformVersion("Android 11");
//        options.setAppPackage("klia.mahb.ios");
//        options.setAppActivity("klia.mahb.ios.MainActivity");
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time_out));
        return driver;
    }

    public static void closeDriver() {
        if (driver != null)
            driver.quit();
        if (service != null)
            service.stop();
    }

}
