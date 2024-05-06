package pages.pagePopups;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import pages.popupLocators.ChooseAirportLoc;
import utils.MobileUtils;

import java.util.List;

public class ChooseAirportPopup extends MobileUtils implements ChooseAirportLoc {
    private AndroidDriver _driver;
    public ChooseAirportPopup(AndroidDriver driver){
        super(driver);
        this._driver = driver;
    }
    public void verifyChooseAirportPopup(){
        isElementVisible(lblHeading,"Choose Airport Page");
    }
    public void closeChooseAirportsPopup(){
        click(btnClose,"close button");
    }
    public void enterTextInSearchField(String text){//KLIA Terminal 2
        enterText(txtSearch,text,"Search text field");
    }
    public void getAirportListAndClickByText(String text) { //KLIA Terminal 2
        getElementsAndClickByText(airportList,text);
    }
}
