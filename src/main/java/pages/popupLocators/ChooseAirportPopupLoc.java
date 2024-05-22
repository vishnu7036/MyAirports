package pages.popupLocators;

import org.openqa.selenium.By;

public interface ChooseAirportPopupLoc {
    By lblHeading = By.xpath("//*[@text='Choose Airport']");
    By btnClose = By.xpath("//*[@text='Choose Airport']/following-sibling::*[1]");
    By txtSearch = By.xpath("//*[@text='Choose Airport']/following-sibling::*[2]");
    By airportList = By.xpath("//*[@text='Search Airport']/following-sibling::*[1]/*/*/*/*");


}
