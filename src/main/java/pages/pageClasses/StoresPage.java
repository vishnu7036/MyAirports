package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebElement;
import pages.pageLocators.StoresPageLoc;
import utils.MobileUtils;

import java.util.List;

public class StoresPage extends MobileUtils implements StoresPageLoc {
    private AndroidDriver _driver;

    public StoresPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyStoresPage() {
        isElementVisible(lblHeading, "Stores page");
    }

    public void clickOnBackIcon() {
        click(btnBack, "Back button in Stores");
    }

    public void verifyBackIcon() {
        isElementVisible(btnBack, "Back Icon");
    }

    public void clickOnAnyOneOfStore() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allStores, "All Stores", 20);
            getElements(allStores).stream().findFirst().ifPresent(WebElement::click);
        } catch (Exception e) {

        }
    }
    public void waitForAllStoresVisible(){
        try{
            Thread.sleep(2000);
            waitForAllElementsVisible(allStores, "All Stores", 20);
        }catch (Exception e){

        }

    }

    public String getTextFromAnyOneOfStore() {
        return getElements(allStores).stream().findFirst().get().getText();
    }

    public void clickOnTerminalDropDown() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allStores, "All stores", 20);
            click(ddTerminal, "Drop Down");
        } catch (Exception e) {

        }
    }

    public void verifyMenuButton() {
        isElementVisible(btnMenu, "Menu button");
    }

    public SingleStorePage singleStorePage() {
        return new SingleStorePage(_driver);
    }

    public void clickOnTerminalBasedOnText(String text) {
        getElementsAndClickByText(ddTerminalOptions, text);
    }

}
