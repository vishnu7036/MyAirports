package pages.pagePopups;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.popupLocators.ChooseAirportPopupLoc;
import utils.MobileUtils;

public class ChooseAirportPopup extends MobileUtils implements ChooseAirportPopupLoc {
    private AndroidDriver _driver;

    public ChooseAirportPopup(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyChooseAirportPopup() {
        isElementVisible(lblHeading, "Choose Airport Page");
    }

    public void closeChooseAirportsPopup() {
        click(btnClose, "close button");
    }

    public void enterTextInSearchField(String text) {//KLIA Terminal 2
        enterText(txtSearch, text, "Search text field");
    }

    public void selectAirportByText(String text) { //KLIA Terminal 2
        getElementsAndClickByText(airportList, text);
    }

    public void verifyAirportNameFromList(String text) {
        _driver.findElements(airportList).forEach(e -> System.out.println(e.getText()));
        boolean found = _driver.findElements(airportList).stream().anyMatch(ele -> ele.getText().equalsIgnoreCase(text));
        Assert.assertTrue(found, "The airport name " + text + " was not found in the list.");
    }
}
