package pages.pageLocators;

import org.openqa.selenium.By;

public interface MyFlightsPageLoc {
    By lblHeading = By.xpath("//*[@text='MY FLIGHTS']");
    By btnBack = By.xpath("//*[@text='MY FLIGHTS']/preceding-sibling::*/*");
    By flightsList = By.xpath("//*[@text='MY FLIGHTS']/following-sibling::*[3]/*/*/*");
}
