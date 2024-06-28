package pages.pageLocators;

import org.openqa.selenium.By;

public interface FlightsInformationPageLoc {
    default By getElement(String text){
        return By.xpath(String.format("//*[@text='%s']",text));
    }
    By ddChooseAirport = By.xpath("//*[@text='FLIGHT INFORMATION']/following-sibling::*[2]");
    By lblDropDownName = By.xpath("//*[@text='FLIGHT INFORMATION']/following-sibling::*[2]/*[1]");
    By txtSearch = By.xpath("//*[@text='FLIGHT INFORMATION']/following-sibling::*[3]/*[3]/*[1]");
    By lnkGetPreviousFlights = By.xpath("//*[@text='Get Previous Flights']");
    By allFlightsFromDeparture = By.xpath("//*[@text='Departure']/../../../following-sibling::*[1]/*/*/*/*");
    By btnBack = By.xpath("//*[@text='FLIGHT INFORMATION']/../*[1]");
    By allFlightsFromArrival = By.xpath("//*[@text='Arrival']/../../../following-sibling::*[1]/*/*/*/*");
    By lblFlightNumFromDeparture = By.xpath("//*[@text='Departure']/../../../following-sibling::*[1]/*/*/*/*[1]/*/*[4]");
    By lblFlightNumFromArrival = By.xpath("//*[@text='Arrival']/../../../following-sibling::*[1]/*/*/*/*[1]/*/*[4]");
    By lblFlightDetails = By.xpath("//*[@text='FLIGHT INFORMATION']/following-sibling::*[3]/*[4]/*/*/*/*/*");
    By lblFlightStatus = By.xpath("//*[@text='FLIGHT INFORMATION']/following-sibling::*[4]/*/*/*/*/*/*[last()]");
}
