package pages.pageLocators;

import org.openqa.selenium.By;

public interface FlightPageLoc {
    default By getElement(String text){
        return By.xpath(String.format("//*[@text='%s']",text));
    }
    By ddChooseAirport = By.xpath("//*[@text='FLIGHT INFORMATION']/following-sibling::*[2]");
    By txtSearch = By.xpath("//*[contains(@text,'Search Flights by Flight')]");
    By btnGetPreviousFlights = By.xpath("//*[@text='Get Previous Flights']");
    By allFlightsFromDeparture = By.xpath("//*[@text='Departure']/../../../following-sibling::*[1]/*/*/*/*");
    By btnBack = By.xpath("//*[@text='FLIGHT INFORMATION']/../*[1]");
    By allFlightsFromArrival = By.xpath("//*[@text='Arrival']/../../../following-sibling::*[1]/*/*/*/*");

}
