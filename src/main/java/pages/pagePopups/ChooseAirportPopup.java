package pages.pagePopups;

import io.appium.java_client.android.AndroidDriver;
import pages.popupLocators.ChooseAirportPopupLoc;
import utils.MobileUtils;

public class ChooseAirportPopup extends MobileUtils implements ChooseAirportPopupLoc {
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
