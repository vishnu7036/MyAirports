package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.UserProfilePageLoc;
import utils.MobileUtils;

public class UserProfilePage extends MobileUtils implements UserProfilePageLoc {
    private AndroidDriver _driver;

    public UserProfilePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyUserProfilePage() {
        isElementVisible(lblHeading, "User Profile page");
    }

    public void clickOnLogoutButton() {
        click(btnLogout, "Logout button");
    }

    public void verifyPromotionsButton() {
        isElementVisible(getElementName("Promotions"), "Promotions button");
    }

    public void verifyInboxButton() {
        isElementVisible(getElementName("Inbox"), "Inbox button");
    }

    public void verifyFavouritesButton() {
        isElementVisible(getElementName("Favourites"), "Favourites button");
    }

    public void verifySettingsButton() {
        isElementVisible(getElementName("Settings"), "Settings button");
    }

    public void verifyGeneralButton() {
        isElementVisible(getElementName("General"), "General button");
    }

    public void verifyFeedbackButton() {
        isElementVisible(getElementName("Feedback"), "Feedback button");
    }

    public void verifyEditIcon() {
        isElementVisible(btnEdit, "Edit Icon");
    }

    public void verifyCameraIcon() {
        isElementVisible(btnCamera, "Camera Icon");
    }

    public void clickOnPromotions() {
        click(getElementName("Promotions"), "Promotions button");
    }

    public void clickOnInbox() {
        click(getElementName("Inbox"), "Inbox button");
    }

    public void clickOnFavourites() {
        click(getElementName("Favourites"), "Favourites button");
    }

    public void clickOnSettings() {
        click(getElementName("Settings"), "Settings button");
    }

    public void clickOnGeneral() {
        click(getElementName("General"), "General button");
    }

    public void clickOnFeedback() {
        click(getElementName("Feedback"), "Feedback button");
    }

    public void clickOnEditIcon() {
        click(btnEdit, "Edit Icon");
    }

    public void clickOnCameraIcon() {
        click(btnCamera, "Camera Icon");
    }

    public void verifyUserName(String actualText) {
        String expText = _driver.findElement(lblUserName).getText();
        Assert.assertTrue(expText.contains(actualText), "User name is not same");
    }

    public EditProfilePage editProfilePage() {
        return new EditProfilePage(_driver);
    }

    public String getFirstNameFromEditProfilePage() {
        return editProfilePage().getFirstName();
    }

}
