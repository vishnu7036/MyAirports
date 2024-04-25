package pages.pageLocators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public interface LandingPageLoc {
    By btnGuest = By.xpath("//*[contains(@text,'GUEST')]");
    By btnLoginOrSignup = AppiumBy.xpath("//*[contains(@text,'LOGIN')]");
}
