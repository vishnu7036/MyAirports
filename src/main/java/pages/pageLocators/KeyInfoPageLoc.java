package pages.pageLocators;

import org.openqa.selenium.By;

public interface KeyInfoPageLoc {
    By lblHeading = By.xpath("(//*[@text='KEY INFO'])[1]");
    By btnBack = By.xpath("(//*[@text='KEY INFO'])[1]/preceding-sibling::*[1]/*");
}
