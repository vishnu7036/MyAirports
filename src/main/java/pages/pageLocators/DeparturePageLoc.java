package pages.pageLocators;

import org.openqa.selenium.By;

public interface DeparturePageLoc {
    By lblHeading = By.xpath("//*[@text='DEPARTURE']");
    By btnBack = By.xpath("//*[@text='DEPARTURE']/../*[1]");
    By lblTerminal = By.xpath("//*[@text='TERMINAL']/following-sibling::*[1]");
    By lblFlightNum = By.xpath("//*[@text='FLIGHT NUMBER']/following-sibling::*[1]");
    By lblAirline = By.xpath("//*[@text='AIRLINE']/following-sibling::*[1]");
    By btnTrackMyFlight = By.xpath("//*[@text='TRACK MY FLIGHT']");
}
