package pages.pageLocators;

import org.openqa.selenium.By;

public interface DeparturePageLoc {
    By lblHeading = By.xpath("//*[@text='DEPARTURE']");
    By btnBack = By.xpath("//*[@text='DEPARTURE']/../*[1]");
    By lblTerminal = By.xpath("//*[@text='TERMINAL']/following-sibling::*[1]");
    By lblFlightNum = By.xpath("//*[@text='FLIGHT NUMBER']/following-sibling::*[1]");
    By lblAirline = By.xpath("//*[@text='AIRLINE']/following-sibling::*[1]");
    By lblBoardingGate = By.xpath("//*[@text='BOARDING GATE']/following-sibling::*[2]");
    By lblCheckInCounter = By.xpath("//*[@text='CHECK-IN COUNTER']/following-sibling::*[2]");
    By btnTrackMyFlight = By.xpath("//*[@text='TRACK MY FLIGHT']");
    By lblYouAreTracking = By.xpath("//*[contains(@text,'You are now tracking')]");
    By btnDone = By.xpath("//*[@text='DONE']");
}
