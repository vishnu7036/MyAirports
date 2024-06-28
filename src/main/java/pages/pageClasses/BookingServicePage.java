package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.BookingServicePageLoc;
import utils.MobileUtils;

public class BookingServicePage extends MobileUtils implements BookingServicePageLoc {
    private AndroidDriver _driver;

    public BookingServicePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyBookingServicePage() {
        isElementVisible(lblHeading, "Booking Service Heading");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back Button");
    }
}
