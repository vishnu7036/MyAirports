package pages.pageLocators;

import org.openqa.selenium.By;

public interface PromotionsPageLoc {
    By lblHeading = By.xpath("//*[@text='PROMOTIONS']");
    By btnBack = By.xpath("//*[@text='PROMOTIONS']/preceding-sibling::*[1]/*");
}
