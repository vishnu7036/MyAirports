package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.GeneralPageLoc;
import utils.MobileUtils;

public class GeneralPage extends MobileUtils implements GeneralPageLoc {
    private AndroidDriver _driver;

    public GeneralPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }
    public void clickOnAbout(){
        click(getText("About"),"About Button");
    }
    public void verifyGeneralPage(){
        isElementVisible(lblGeneralHeading,"General page");
    }
    public void verifyAboutPage(){
        isElementVisible(lblAboutHeading,"About page");
    }
    public void clickOnBackButtonFromGeneralPage(){
        click(btnBackGeneral,"General back button");
    }
    public void clickOnBackButtonFromAboutPage(){
        click(btnBackAbout,"About back button");
    }
}
