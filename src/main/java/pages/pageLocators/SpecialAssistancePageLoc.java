package pages.pageLocators;

import org.openqa.selenium.By;

public interface SpecialAssistancePageLoc {
    By lblHeading = By.xpath("//*[@text='SPECIAL ASSISTANCE ']");
    By btnBack = By.xpath("//*[@text='SPECIAL ASSISTANCE ']/preceding-sibling::*[3]/*");
    By btnTravellingWithChildren = By.xpath("//*[contains(@text,'Travelling')]");
    By btnOthers = By.xpath("//*[contains(@text,'Assistance for a person')]");
    By btnAssistance = By.xpath("//*[@text='Others']");
}
