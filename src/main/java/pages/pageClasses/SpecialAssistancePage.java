package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.SpecialAssistancePageLoc;
import utils.MobileUtils;

public class SpecialAssistancePage extends MobileUtils implements SpecialAssistancePageLoc {
    private AndroidDriver _driver;

    public SpecialAssistancePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifySpecialAssistancePage() {
        try {
            Thread.sleep(2000);
            isElementVisible(lblHeading, "Arrival Page");
        }catch (InterruptedException ignored){

        }
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public void clickOnTravellingWithChildrenButton() {
        click(btnTravellingWithChildren, "Travelling With Children button");
    }

    public void clickOnAssistanceButton() {
        click(btnAssistance, "Assistance for a person with reduced mobility and hidden disabilities button");
    }

    public void clickOnOtherButton() {
        click(btnOthers, "Others button");
    }
}
