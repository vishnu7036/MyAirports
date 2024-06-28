package pages.pageLocators;

import org.openqa.selenium.By;

public interface ArrivalPageLoc {
    By lblHeading = By.xpath("//*[@text='ARRIVAL']");
    By btnBack = By.xpath("//*[@text='ARRIVAL']/../*[1]");
    By lblNote = By.xpath("//*[contains(@text,'Note:')]");
    By lblTerminal = By.xpath("//*[@text='TERMINAL']/following-sibling::*");
    By lblFlightNum = By.xpath("//*[@text='FLIGHT NUMBER']/following-sibling::*[1]");
    By lblAirline = By.xpath("//*[@text='AIRLINE']/following-sibling::*[1]");
    By btnTrackMyFlight = By.xpath("//*[@text='TRACK MY FLIGHT']");
    By lblYouAreTracking = By.xpath("//*[@text='You are now tracking ']");
    By btnDone = By.xpath("//*[@text='DONE']");
}
