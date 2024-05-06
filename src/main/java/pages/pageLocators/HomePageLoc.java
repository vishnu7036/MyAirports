package pages.pageLocators;

import org.openqa.selenium.By;

public interface HomePageLoc {
    By btnHome = By.xpath("//*[@text='HOME']/..");
    By imgHome = By.xpath("//*[contains(@text,'Special')]/../preceding-sibling::*/*");
    By lblUser = By.xpath("//*[contains(@text,'Special')]/../following-sibling::*/*[2]");

    default By getTabs(String txt) {
        return By.xpath(String.format("//*[@text='%s']/..", txt));
    }

    By btnForward = By.xpath("//*[contains(@class,'HorizontalScrollView')][1]/following-sibling::*[1]/*");
    By btnBackward = By.xpath("//*[contains(@class,'HorizontalScrollView')][1]/preceding-sibling::*[1]/*");
    By btnUserAccount = By.xpath("//*[contains(@text,'Special')]/../following-sibling::*/*[1]");


}
