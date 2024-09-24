package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import pages.pageLocators.PromotionsPageLoc;
import utils.MobileUtils;

public class PromotionsPage extends MobileUtils implements PromotionsPageLoc {
    private AndroidDriver _driver;

    public PromotionsPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyPromotionsPage() {
        try {
            Thread.sleep(2000);
            isElementVisible(lblHeading, "Arrival Page");
        } catch (InterruptedException ignored) {

        }
    }

    public void verifyBackButton() {
        isElementVisible(btnBack, "Back button");
    }

    public void verifyTerminalDropDown() {
        isElementVisible(ddTerminal, "Terminal drop down");
    }

    public void clickOnTerminalDropDown() {
        click(ddTerminal, "Terminal drop down");
    }

    public void clickOnTerminal2() {
        click(btnTerminal2, "Terminal 2");
    }

    public void clickOnTerminal1() {
        click(btnTerminal1, "Terminal 1");
    }

    public void verifySearchTextField() {
        isElementVisible(txtSearch, "Search text field");
    }

    public String getTextFromBanner() {
        try {
            Thread.sleep(2000);
            if (_driver.findElement(promotionsBanner).isDisplayed())
                return getText(promotionsBanner);
        } catch (NoSuchElementException e) {
            System.out.println("Promotions banners not found.");
        } catch (InterruptedException ignored) {

        }
        return "";
    }

    public void clickOnBanner() throws InterruptedException {
        Thread.
                sleep(2000);
        click(promotionsBanner, "Promotions Banner");
    }

    public void verifyBanner(String textFromBanner) {
        try {
            Thread.sleep(3000);
            String bannerName = getText(lblBanner);
            Assert.assertTrue(textFromBanner.equalsIgnoreCase(bannerName));
//            Assert.assertEquals(textFromBanner, bannerName);
        } catch (InterruptedException ignored) {

        }
    }

    public void clickOnBackFromBannerPage() {
        click(btnBannerBack, "Banner back button");
    }

    public void verifyBackButtonFromBannerPage() {
        isElementVisible(btnBannerBack, "Banner Back button");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

}
