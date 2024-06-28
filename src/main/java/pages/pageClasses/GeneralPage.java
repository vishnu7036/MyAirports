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

    public void clickOnAbout() {
        click(getText("About"), "About Button");
    }
    public void clickOnContactUs(){
        click(getText("Contact Us"),"Contact Us");
    }
    public void clickOnTermsOfUse(){
        click(getText("Terms of Use"),"Terms of Use Us");
    }
    public void clickOnPrivacyPolicy(){
        click(getText("Privacy Policy."),"Privacy Policy Us");
    }

    public void verifyGeneralPage() {
        try{
            Thread.sleep(2000);
            isElementVisible(lblGeneralHeading, "General page");
        }catch(InterruptedException ignored){

        }
    }

    public void verifyAboutPage() {
        isElementVisible(lblAboutHeading, "About page");
    }

    public void clickOnBackButton() {
        click(btnBackGeneral, "General back button");
    }

    public void clickOnBackButtonFromAboutPage() {
        click(btnBackAbout, "About back button");
    }

    public void verifyFaceBookIcon() {
        isElementVisible(iconFB, "Facebook Icon");
    }

    public void verifyTwitterIcon() {
        isElementVisible(iconTwitter, "Twitter Icon");
    }

    public void verifyYoutubeIcon() {
        isElementVisible(iconYoutube, "Youtube Icon");
    }

    public void verifyInstagramIcon() {
        isElementVisible(iconInsta, "Instagram Icon");
    }

    public void verifyWebIcon() {
        isElementVisible(iconWeb, "Web Icon");
    }
}
