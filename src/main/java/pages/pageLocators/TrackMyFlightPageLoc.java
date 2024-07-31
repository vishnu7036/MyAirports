package pages.pageLocators;

import org.openqa.selenium.By;
import utils.MobileUtils;

public interface TrackMyFlightPageLoc{
    By lblFlightNum = By.xpath("//*[@text='FLIGHT NUMBER']/following-sibling::*[1]");

}
