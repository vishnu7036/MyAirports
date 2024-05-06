package pages.pageLocators;

import org.openqa.selenium.By;

public interface DeparturePageLoc {
    By lblHeading = By.xpath("//*[@text='DEPARTURE']");
    By btnBack = By.xpath("//*[@text='DEPARTURE']/../*[1]");
}
