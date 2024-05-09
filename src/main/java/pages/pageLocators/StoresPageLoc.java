package pages.pageLocators;

import org.openqa.selenium.By;

public interface StoresPageLoc {

    By lblHeading = By.xpath("//*[@text='Stores']");
    By btnBack = By.xpath("//*[@text='Stores']/../*[1]/*");
    By ddTerminal = By.xpath("//*[@text='Stores']/following-sibling::*[1]/*[2]");
    By btnMenu = By.xpath("//*[@text='Stores']/following-sibling::*[2]/*");
    By txtSearch = By.xpath("//*[@text='Search for Stores']");
    By allStores = By.xpath("//*[@text='Search for Stores']/../../../following-sibling::*/*/*/*[1]");
    By ddTerminalOptions = By.xpath("//*[@text='Search for Stores']/../../../following-sibling::*[2]/*/*/*/*/*");



}
