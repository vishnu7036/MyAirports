package pages.pageLocators;

import org.openqa.selenium.By;

public interface BusInformationPageLoc {
    By lblHeading = By.xpath("//*[@text='BUS INFORMATION']");
    By btnBack = By.xpath("//*[@text='BUS INFORMATION']/../*[1]");
    By dd = By.xpath("//*[@text='BUS INFORMATION']/following-sibling::*[2]/*[1]");

}
