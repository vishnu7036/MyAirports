package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.FavouritesPageLoc;
import utils.MobileUtils;

public class FavouritesPage extends MobileUtils implements FavouritesPageLoc {
    private AndroidDriver _driver;

    public FavouritesPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyFavouritesPage() {
        isElementVisible(lblHeading, "Favourites Page");
    }

    public void verifyBackButton() {
        isElementVisible(btnBack, "Back button");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back Button");
    }

    public String getTextFromFirstDisplayedFavouriteStore() {
        return _driver.findElement(btnFav).getText();
    }

    public void clickOnFirstDisplayedFavouriteStore() {
        click(btnFav, "Favourite Store");
    }

    public SingleStorePage singleStorePage() {
        return new SingleStorePage(_driver);
    }

    public void verifySameStoreHasBeenOpened() {
        String actText = this.getTextFromFirstDisplayedFavouriteStore();
        String expText = singleStorePage().verifySingleStorePageHeading();
        Assert.assertEquals(actText, expText);
    }

}
