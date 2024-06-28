package pages.pagePopups;

import io.appium.java_client.android.AndroidDriver;
import pages.pageClasses.*;
import pages.popupLocators.MenuPopupLoc;
import utils.MobileUtils;

public class MenuPopup extends MobileUtils implements MenuPopupLoc {
    private AndroidDriver _driver;

    public MenuPopup(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyMenuPopup() {
        isElementVisible(imgMenu, "Menu Popup");
    }

    public void verifySpecialAssistanceButton() {
        isElementVisible(getText("SPECIAL ASSISTANCE"), "SPECIAL ASSISTANCE button");
    }

    public void verifyFlightsButton() {
        isElementVisible(getText("FLIGHTS"), "FLIGHTS button");
    }

    public void verifyPromotionsButton() {
        isElementVisible(getText("PROMOTIONS"), "PROMOTIONS button");
    }

    public void verifyOnlineShoppingButton() {
        isElementVisible(getText("ONLINE SHOPPING"), "ONLINE SHOPPING button");
    }

    public void verifyGeneralButton() {
        isElementVisible(getText("GENERAL"), "GENERAL button");
    }

    public void verifyKeyInfoButton() {
        isElementVisible(getText("KEY INFO"), "KEY INFO button");
    }

    public void verifyFeedbackButton() {
        isElementVisible(getText("FEEDBACK"), "FEEDBACK button");
    }

    public void verifySettingsButton() {
        isElementVisible(getText("SETTINGS"), "SETTINGS button");
    }

    public void verifyMyProfileButton() {
        isElementVisible(getText("MY PROFILE"), "MY PROFILE button");
    }

    public void clickOnSpecialAssistanceButton() {
        click(getText("SPECIAL ASSISTANCE"), "SPECIAL ASSISTANCE button");
    }

    public void clickOnFlightsButton() {
        click(getText("FLIGHTS"), "FLIGHTS button");
    }

    public void clickOnPromotionsButton() {
        click(getText("PROMOTIONS"), "PROMOTIONS button");
    }

    public void clickOnOnlineShoppingButton() {
        click(getText("ONLINE SHOPPING"), "ONLINE SHOPPING button");
    }

    public void clickOnGeneralButton() {
        click(getText("GENERAL"), "GENERAL button");
    }

    public void clickOnKeyInfoButton() {
        click(getText("KEY INFO"), "KEY INFO button");
    }

    public void clickOnFeedbackButton() {
        click(getText("FEEDBACK"), "FEEDBACK button");
    }

    public void clickOnSettingsButton() {
        click(getText("SETTINGS"), "SETTINGS button");
    }

    public void clickOnMyProfileButton() {
        click(getText("MY PROFILE"), "MY PROFILE button");
    }

    public SpecialAssistancePage specialAssistancePage() {
        return new SpecialAssistancePage(_driver);
    }

    public FlightsInformationPage flightPage() {
        return new FlightsInformationPage(_driver);
    }

    public PromotionsPage promotionsPage() {
        return new PromotionsPage(_driver);
    }

    public GeneralPage generalPage() {
        return new GeneralPage(_driver);
    }

    public KeyInfoPage keyInfoPage() {
        return new KeyInfoPage(_driver);
    }

    public CustomerFeedbackPage customerFeedbackPage() {
        return new CustomerFeedbackPage(_driver);
    }

    public SettingsPage settingsPage() {
        return new SettingsPage(_driver);
    }

    public UserProfilePage userProfilePage() {
        return new UserProfilePage(_driver);
    }

}
