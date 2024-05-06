package pages.pageLocators;

import org.openqa.selenium.By;

public interface ArrivalPageLoc {
    By lblHeading = By.xpath("//*[@text='ARRIVAL']");
    By btnBack = By.xpath("//*[@text='ARRIVAL']/../*[1]");
    By lblNote = By.xpath("//*[contains(@text,'Note:')]");
}
