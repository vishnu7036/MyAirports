package pages.pageLocators;

import org.openqa.selenium.By;

public interface DinningPageLoc {
    By lblHeading = By.xpath("//*[@text='Dining']");
    By btnBack = By.xpath("//*[@text='Dining']/preceding-sibling::*[1]/*");
    By txtSearch = By.xpath("//*[@text='Dining']/following-sibling::*[3]/*/*/*[1]");

}
