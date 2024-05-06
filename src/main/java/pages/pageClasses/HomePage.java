package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.HomePageLoc;
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
    public void clickOnFlightsButton(){
        click(getTabs("Flights"),"Flights button");
    }
    public void clickOnDiningButton(){
        click(getTabs("Dining"),"Dining button");
    }
    public void clickOnEssentialAndServicesButton(){
        click(getTabs("Essential & Services"),"Essential & Services button");
    }
    public void clickOnKULTerminal1ShuttleBusButton(){
        click(getTabs("KUL Terminal 1 Shuttle Bus"),"KUL Terminal 1 Shuttle Bus button");
    }
    public void clickOnStoresButton(){
        click(getTabs("Stores"),"Stores button");
    }
    public void clickOnCustomerFeedbackButton(){
        click(getTabs("Customer Feedback"),"Customer Feedback button");
    }
    public void clickOnForwardButton(){
        click(btnForward,"Forward button");
    }
    public void clickOnOnlineShoppingButton(){
        click(getTabs("Online Shopping"),"Online Shopping button");
    }
    public void clickOnTransportButton(){
        click(getTabs("Transport"),"Transport button");
    }
    public void clickOnLoungeButton(){
        click(getTabs("Lounge"),"Lounge button");
    }
    public void clickOnBookingServicesButton(){
        click(getTabs("Booking Services"),"Booking Services button");
    }
    public void clickOnHotels(){
        click(getTabs("Hotels"),"Hotels button");
    }
    public void clickOnBureaudeChangeButton(){
        click(getTabs("Bureau de Change"),"Bureau de Change button");
    }
    public void clickOnBackwardButton(){
        click(btnBackward,"Backward button");
    }
    public void clickOnClinicButton(){
        click(getTabs("Clinic"),"Clinic button");
    }
    public void clickOnTransferCounterButton(){
        click(getTabs("Transfer Counter"),"Transfer Counter button");
    }
    public void clickOnAirlineTicketingCentreButton(){
        click(getTabs("Airline Ticketing Centre"),"Airline Ticketing Centre button");
    }
    public void clickOnBaggageReclaimButton(){
        click(getTabs("Baggage Reclaim"),"Baggage Reclaim button");
    }
    public void clickOnBaggageLockerButton(){
        click(getTabs("Baggage Locker"),"Baggage Locker button");
    }
    public void clickOnInformationCentreButton(){
        click(getTabs("Information Centre"),"Information Centre button");
    }
    public void moveLeft(){
        scrollLeft();
    }
    public void clickOnUserAccount(){
        click(btnUserAccount,"User Account");
    }
}
