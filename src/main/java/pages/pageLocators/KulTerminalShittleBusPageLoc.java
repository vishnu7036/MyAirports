package pages.pageLocators;

import org.openqa.selenium.By;

public interface KulTerminalShittleBusPageLoc {
    By lblHeading = By.xpath("//*[contains(@text,'SHUTTLE BUS')]");
    By btnBack = By.xpath("//*[contains(@text,'SHUTTLE BUS')]/../*[1]/*");
    By btnContinue = By.xpath("//*[@text='CONTINUE']");

}
