package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.DinningPageLoc;
import pages.pageLocators.HomePageLoc;
import utils.CommonFunctions;
import utils.MobileUtils;

public class HomePage extends MobileUtils implements HomePageLoc {
    private final AndroidDriver _driver;

    public HomePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyHomePage() {
        boolean displayed = _driver.findElement(imgHome).isDisplayed();
        Assert.assertTrue(displayed, "Home Page is not displayed");
    }

    public void verifyUser(String text) {
        String userName = _driver.findElement(lblUser).getText();
        Assert.assertEquals(userName, text);
    }

    public void clickOnFlightsIcon() {
        click(getTabs("Flights"), "Flights Icon");
    }

    public void verifyFlightsIcon() {
        isElementVisible(getTabs("Flights"), "Flights Menu Icon");
    }

    public void clickOnDiningIcon() {
        click(getTabs("Dining"), "Dining Icon");
    }

    public void verifyDinningIcon() {
        isElementVisible(getTabs("Dining"), "Dining Menu Icon");
    }

    public void clickOnEssentialAndServicesIcon() {
        click(getTabs("Essential & Services"), "Essential & Services Icon");
    }

    public void verifyEssentialAndServicesIcon() {
        isElementVisible(getTabs("Essential & Services"), "Flights Icon");
    }

    public void clickOnKULTerminal1ShuttleBusIcon() {
        click(getTabs("KUL Terminal 1 Shuttle Bus"), "KUL Terminal 1 Shuttle Bus Icon");
    }

    public void verifyKULTerminal1ShuttleBusIcon() {
        isElementVisible(getTabs("KUL Terminal 1 Shuttle Bus"), "KUL Terminal 1 Shuttle Bus Icon");
    }

    public void clickOnStoresIcon() {
        click(getTabs("Stores"), "Stores Icon");
    }

    public void verifyStoresIcon() {
        isElementVisible(getTabs("Stores"), "Stores Icon");
    }

    public void clickOnCustomerFeedbackIcon() {
        click(getTabs("Customer Feedback"), "Customer Feedback Icon");
    }

    public void verifyCustomerFeedbackIcon() {
        isElementVisible(getTabs("Customer Feedback"), "Customer Feedback Icon");
    }

    public void clickOnForwardButton() {
        click(btnForward, "Forward Icon");
    }

    public void clickOnOnlineShoppingIcon() {
        click(getTabs("Online Shopping"), "Online Shopping Icon");
    }

    public void verifyOnlineShoppingIcon() {
        isElementVisible(getTabs("Online Shopping"), "Online Shopping Icon");
    }

    public void clickOnTransportIcon() {
        click(getTabs("Transport"), "Transport Icon");
    }

    public void verifyTransportIcon() {
        isElementVisible(getTabs("Transport"), "Transport Icon");
    }

    public void clickOnLoungeIcon() {
        click(getTabs("Lounge"), "Lounge Icon");
    }

    public void verifyLoungeIcon() {
        isElementVisible(getTabs("Lounge"), "Lounge Icon");
    }

    public void clickOnBookingServicesIcon() {
        click(getTabs("Booking Services"), "Booking Services Icon");
    }

    public void verifyBookingServicesIcon() {
        isElementVisible(getTabs("Booking Services"), "Booking Services Icon");
    }

    public void clickOnHotelsIcon() {
        click(getTabs("Hotels"), "Hotels Icon");
    }

    public void verifyHotelsIcon() {
        isElementVisible(getTabs("Hotels"), "Hotels Icon");
    }

    public void clickOnBureaudeChangeIcon() {
        click(getTabs("Bureau de Change"), "Bureau de Change Icon");
    }

    public void verifyBureaudeChangeIcon() {
        isElementVisible(getTabs("Bureau de Change"), "Bureau de Change Icon");
    }

    public void clickOnBackwardIcon() {
        click(btnBackward, "Backward Icon");
    }

    public void clickOnClinicIcon() {
        click(getTabs("Clinic"), "Clinic Icon");
    }

    public void verifyClinicIcon() {
        isElementVisible(getTabs("Clinic"), "Clinic Icon");
    }

    public void clickOnTransferCounterIcon() {
        click(getTabs("Transfer Counter"), "Transfer Counter Icon");
    }

    public void verifyTransferCounterIcon() {
        isElementVisible(getTabs("Transfer Counter"), "Transfer Counter Icon");
    }

    public void clickOnAirlineTicketingCentreIcon() {
        click(getTabs("Airline Ticketing Centre"), "Airline Ticketing Centre Icon");
    }

    public void verifyAirlineTicketingCentreIcon() {
        isElementVisible(getTabs("Airline Ticketing Centre"), "Airline Ticketing Centre Icon");
    }

    public void clickOnBaggageReclaimIcon() {
        click(getTabs("Baggage Reclaim"), "Baggage Reclaim Icon");
    }

    public void verifyBaggageReclaimIcon() {
        isElementVisible(getTabs("Baggage Reclaim"), "Baggage Reclaim Icon");
    }

    public void clickOnBaggageLockerIcon() {
        click(getTabs("Baggage Locker"), "Baggage Locker button");
    }

    public void verifyBaggageLockerIcon() {
        isElementVisible(getTabs("Baggage Locker"), "Baggage Locker Icon");
    }

    public void clickOnInformationCentreIcon() {
        click(getTabs("Information Centre"), "Information Centre button");
    }

    public void verifyInformationCentreIcon() {
        isElementVisible(getTabs("Information Centre"), "Information Centre Icon");
    }

    public void moveLeft() {
        scrollLeft(500);
    }

    public void clickOnUserAccount() {
        click(btnUserAccount, "User Account");
    }

    public void clickOnChatBot() {
        click(btnChatBoat, "Chat Bot image");
    }

    public void verifyChatBot() {
        isElementVisible(btnChatBoat, "Chat Bot image");
    }

    public void clickOnButterflyCarouselCard() {
        try {
            Thread.sleep(5000);
            for (int i = 0; i < 3; i++)
                scrollLeft(500);
            click(btnCards, "Butterfly Carousel Card");
        } catch (Exception ignored) {

        }
    }

    public void clickOnPlanMyJourneyCarouselCard() {
        click(btnCards, "Plan My Journey Carousel Card");
        new CommonFunctions(_driver).clickOnOkButton();
    }

    public void clickOnFlightsCarouselCard() {
        scrollLeft(500);
        click(btnCards, "Flights Carousel Card");
    }


    public void verifyHomeButton() {
        isElementVisible(btnHome, "Home button");
    }

    public void verifyKeyInfoButton() {
        isElementVisible(btnKeyInfo, "Key Info button");
    }

    public void verifyEzpazButton() {
        isElementVisible(btnEzpaz, "EZpaz button");
    }

    public void verifyMapsButton() {
        isElementVisible(btnMaps, "Maps button");
    }

    public void verifyMenuButton() {
        isElementVisible(btnMenu, "Menu button");
    }

    public void clickOnHomeButton() {
        click(btnHome, "Home button");
    }

    public void clickOnKeyInfoButton() {
        click(btnKeyInfo, "Key Info button");
    }

    public void clickOnEzpazButton() {
        click(btnEzpaz, "EZpaz button");
    }

    public void clickOnMapsButton() {
        click(btnMaps, "Maps button");
    }

    public void clickOnMenuButton() {
        click(btnMenu, "Menu button");
    }

    public void clickOnCloseMenuButton() {
        click(btnCloseMenu, "Close Menu button");
    }

    public StoresPage storesPage() {
        return new StoresPage(_driver);
    }

    public DinningPage dinningPage() {
        return new DinningPage(_driver);
    }

    public BookingServicePage bookingServicePage() {
        return new BookingServicePage(_driver);
    }
}
