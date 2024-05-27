package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import pages.pageLocators.ContactUsPageLoc;
import utils.MobileUtils;

public class ContactUsPage extends MobileUtils implements ContactUsPageLoc {
    private AndroidDriver _driver;

    public ContactUsPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyContactUsPage() {
        isElementVisible(lblHeading, "Contact Us Page");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public void clickOnEmail() {
        click(btnEmail, "Email button");
    }

    public void clickOnContactNumber() {
        click(btnContactNum, "Contact Number");
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

    public void verifyDailPad() {
        isElementVisible(btnDail, "Dail Pad");
    }

    public void verifyContactUsLabel() {
        while (true) {
            try {
                if (!_driver.findElement(lblHeading).isDisplayed()) {
                    clickOnDeviceBackButton();
                } else {
                    this.verifyContactUsPage();
                    break;
                }
            } catch (NoSuchElementException e) {
                clickOnDeviceBackButton();
            }
        }
    }


    public void verifyGmail() {
        isElementVisible(lblGmail, "Gmail Page");
    }

}
