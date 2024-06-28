package pages.pageLocators;

import org.openqa.selenium.By;

public interface PlanYourJourneyPageLoc {
    By lblHeading = By.xpath("//*[@text='Plan your journey']    ");
    By btnBack = By.xpath("//*[@text='Plan your journey']/preceding-sibling::*[2]/*");
    By txtSearch = By.xpath("//*[@text='Search your flight']");
    By txtAddMoreFlights = By.xpath("//*[@text='Add more flights']");
    By lblFlightNum = By.xpath("//*[@text='Flight Number']/following-sibling::*[2]");
    By lblBoardingGate = By.xpath("//*[@text='Boarding Gate']/following-sibling::*[2]");
    By lblTerminal = By.xpath("//*[@text='Terminal']/following-sibling::*[2]");
    By lblCheckInCounter = By.xpath("//*[@text='Check-in Counter']/following-sibling::*[2]");
    By lblExplore = By.xpath("(//*[contains(@text,'Explore')])[1]");
    By btnStores = By.xpath("//*[@text='Stores']/preceding-sibling::*[3]/*");
    By btnDinning = By.xpath("//*[@text='Dining']/preceding-sibling::*[3]/*");
    By btnBookingServices = By.xpath("//*[@text='Booking Services']/preceding-sibling::*[3]/*");
    By btnShareFlightDetails = By.xpath("//*[contains(@text,'Departing')]/../../../../../following-sibling::*[1]");
    By btnRemoveFlight = By.xpath("//*[contains(@text,'Departing')]/../../../../../following-sibling::*[2]");
    By lblRemoveFlight = By.xpath("//*[contains(@text,'Are you sure you want to leave this page?')]");
    By btnYes = By.xpath("//*[@text='Yes']");
    By btnNo = By.xpath("//*[@text='No']");
}
