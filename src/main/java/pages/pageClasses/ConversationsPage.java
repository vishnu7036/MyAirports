package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.ConversationsPageLoc;
import utils.MobileUtils;

public class ConversationsPage extends MobileUtils implements ConversationsPageLoc {
    private AndroidDriver _driver;
    public ConversationsPage(AndroidDriver driver){
        super(driver);
        this._driver = driver;
    }
    public void verifyConversationsPage(){
        isElementVisible(lblHeading,"Conversations page");
    }
    public void verifyNo(){

    }

}
