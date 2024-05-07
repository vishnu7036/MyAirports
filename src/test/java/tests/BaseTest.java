package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected AndroidDriver driver;
    @BeforeClass
    public void launchApplication() throws MalformedURLException {
        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Mind-Graph//AppData//Roaming//npm//node_modules//appium//build//lib//main"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
        cap.setCapability(MobileCapabilityType.APP,"C://Users//mobileApkFiles//prod 2.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url,cap);
    }
//    @BeforeMethod
//    public void launchApplicationAtuo() throws URISyntaxException, MalformedURLException {
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("prod2");
//        options.setApp("C://Users//Mind-Graph//IdeaProjects//prod2Testing//src//main//resources");
//
//        URI uri = new URI("http://127.0.0.1:4723");
//        AndroidDriver driver = new AndroidDriver(uri.toURL(),options);
//    }
}
