package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.pageLocators.FlightPageLoc;
import utils.MobileUtils;

import java.time.Duration;
import java.util.List;

public class FlightPage extends MobileUtils implements FlightPageLoc {
    private AndroidDriver _driver;

    public FlightPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyFlightPage() {
        isElementVisible(getElement("FLIGHT INFORMATION"), "FLIGHT INFORMATION");
    }

    public void clickOnDepartureToggle() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elements = _driver.findElements(allFlightsFromArrival);
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        click(getElement("Departure"), "Departure toggle");
    }

    public void clickOnArrivalToggle() {
        try {
            List<WebElement> elements = _driver.findElements(allFlightsFromDeparture);
            WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfAllElements(elements));
            click(getElement("Arrival"), "Arrival toggle");
        } catch (Exception e) {

        }
    }

    public void clickOnDropDownChooseAirport() {
        click(ddChooseAirport, "Choose Airport drop down");
    }

    public void selectFlightFromDeparture() {
        _driver.findElements(allFlightsFromDeparture).stream().findFirst().ifPresent(WebElement::click);
    }

    public void selectFlightFromArrival() {
        try {
            Thread.sleep(3000);
            List<WebElement> elements = _driver.findElements(allFlightsFromArrival);
            WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfAllElements(elements));
            elements.stream().findFirst().ifPresent(WebElement::click);
        } catch (Exception e) {

        }

    }

    public void clickOnGetPreviousFlights() {
        click(btnGetPreviousFlights, "Get Previous Flights link");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

}
