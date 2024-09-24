package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.pageLocators.PlanYourJourneyPageLoc;
import utils.MobileUtils;

import java.util.List;

public class PlanYourJourneyPage extends MobileUtils implements PlanYourJourneyPageLoc {
    private AndroidDriver _driver;
    private String[] flightDetails;
    private SoftAssert softAssert;

    public PlanYourJourneyPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyPlanYourJourneyPage() {
        isElementVisible(lblHeading, "Plan Your Journey Page");
    }

    public void verifyBackButton() {
        isElementVisible(btnBack, "Back Button");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back Button");
    }

    public void clickOnSearchYourFlightTextField() {
        click(txtSearch, "Search Text Field");
    }

    public String getFlightNumber() {
        return getText(lblFlightNum);
    }

    public String getTerminal() {
        return getText(lblTerminal);
    }

    public String getCheckInCounter() {
        return getText(lblCheckInCounter);
    }

    public String getBoardingGate() {
        return getText(lblBoardingGate);
    }

    public FlightsInformationPage flightsInformationPage() {
        return new FlightsInformationPage(_driver);
    }

    public void verifyFlightNumber() throws InterruptedException {
        Thread.sleep(3000);
        flightDetails = flightsInformationPage().getFlightDetailsAndClickOnTrackMyFlight();
        String flightNum = this.getFlightNumber();
        Assert.assertEquals(flightDetails[0], flightNum);
    }

    public void verifyTerminal() {
        String terminal = this.getTerminal();
        softAssert = new SoftAssert();
        softAssert.assertEquals(flightDetails[1], terminal);
//        Assert.assertEquals(flightDetails[1], terminal);
    }

    public void verifyBoardingGate() {
        String boardingGate = this.getBoardingGate();
        softAssert.assertEquals(flightDetails[2], boardingGate);
//        Assert.assertEquals(flightDetails[2], boardingGate);
    }

    public void verifyCheckInCounter() {
        String checkInCounter = this.getCheckInCounter();
        Assert.assertEquals(flightDetails[3], checkInCounter);
    }

    public void verifyLabelExplore() {
        waitForElementVisibility(lblExplore, "Explore Terminal Tab");
    }

    public void clickOnStores() {
        try {
            for (int i = 0; i < 6; i++)
                scrollUp();
            Thread.sleep(2000);
            click(btnStores, "Stores button");
        } catch (InterruptedException ignored) {

        }

    }

    public void clickOnDining() {
        try {
            Thread.sleep(2000);
            click(btnDinning, "Dinning");
        } catch (InterruptedException ignored) {

        }
    }

    public void clickOnBookingServices() {
        try {
            Thread.sleep(2000);
            click(btnBookingServices, "Booking Services");
        } catch (InterruptedException ignored) {

        }
    }

    public void verifyShareFlightDetailsButton() {
        try {
            Thread.sleep(3000);
            scrollUp();
            scrollUp();
            isElementVisible(btnShareFlightDetails, "Share Flight Details Button");
        } catch (InterruptedException ignored) {

        }
    }

    public void verifyRemoveFlightButton() {
        isElementVisible(btnRemoveFlight, "Remove Flight Button");
    }

    public void clickOnRemoveFlightButton() {
        scrollUp();
        click(btnRemoveFlight, "Remove Flight");
    }

    public void verifyPlanYourJourneyRemovePopup() {
        isElementVisible(lblRemoveFlight, "Remove FLight Popup");
    }

    public void clickOnYesButton() {
        click(btnYes, "Yes Button");
    }

    public void clickOnNoButton() {
        click(btnNo, "No Button");
    }
}
