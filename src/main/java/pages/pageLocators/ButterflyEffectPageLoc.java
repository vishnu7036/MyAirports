package pages.pageLocators;

import org.openqa.selenium.By;

public interface ButterflyEffectPageLoc {
    By lblHeading = By.xpath("//*[@text='The Butterfly Effect']");
    By btnBack = By.xpath("//*[@text='The Butterfly Effect']/preceding-sibling::*[1]/*");
    By lnkHere = By.xpath("//*[contains(@text,'here')]");
}
