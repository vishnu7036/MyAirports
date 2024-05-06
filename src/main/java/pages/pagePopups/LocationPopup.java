package pages.pagePopups;

import io.appium.java_client.android.AndroidDriver;
import pages.popupLocators.LocationPopupLoc;
import utils.MobileUtils;

public class LocationPopup extends MobileUtils implements LocationPopupLoc {
    private final AndroidDriver _driver;

    public LocationPopup(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyLocationPopupHeading() {
        try {
            waitForElementVisibility(lblHeading, "Location access Heading");
            boolean ele = _driver.findElement(lblHeading).isDisplayed();
            if (ele) {
                System.out.println("Location Popup is displayed");
                this.clickOnWhileUsingTheAppButton();
            } else
                System.out.println("Location Popup is not displayed");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

    public void clickOnWhileUsingTheAppButton() {
        click(btnWhileUsingTheApp, "While using the app button");
    }

    public void clickOnOnlyThisTimeButton() {
        click(btnOnlyThisTime, "Only this time button");
    }

    public void clickOnDenyButton() {
        click(btnDeny, "Deny button");
    }
}
