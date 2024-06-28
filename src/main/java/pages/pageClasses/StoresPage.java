package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.pageLocators.StoresPageLoc;
import utils.MobileUtils;

import java.time.Duration;
import java.util.List;

public class StoresPage extends MobileUtils implements StoresPageLoc {
    private AndroidDriver _driver;

    public StoresPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyStoresPage() {
        try {
            Thread.sleep(3000);
            isElementVisible(lblHeading, "Stores page");
        } catch (InterruptedException ignored) {

        }
    }

    public void clickOnBackIcon() {
        this.waitForAllStoresVisible();
        click(btnBack, "Back button in Stores");
    }

    public void verifyBackIcon() {
        isElementVisible(btnBack, "Back Icon");
    }

    public void clickOnAnyOneOfStore() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allStores);
            getElements(allStores).stream().findFirst().ifPresent(WebElement::click);
        } catch (Exception e) {

        }
    }

    public void waitForAllStoresVisible() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allStores);
        } catch (Exception e) {

        }
    }

    public String getTextFromAnyOneOfStore() {
        return getElements(allStores).stream().findFirst().get().getText();
    }

    public void clickOnTerminalDropDown() {
        try {
            Thread.sleep(2000);
            waitForAllElementsVisible(allStores);
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
