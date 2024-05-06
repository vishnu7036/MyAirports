package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.KulTerminalShittleBusPageLoc;
import utils.MobileUtils;

public class KulTerminalShuttleBusPage extends MobileUtils implements KulTerminalShittleBusPageLoc {
    private AndroidDriver _driver;
    public KulTerminalShuttleBusPage(AndroidDriver driver){
        super(driver);
        this._driver = driver;
    }
    public void verifyHeading(){
        isElementVisible(lblHeading,"Terminal Shuttle Bus page");
    }
    public void clickOnBack(){
        click(btnBack,"Back button");
    }
    public void clickOnContinueButton(){
        click(btnContinue,"Continue button");
    }
}
