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
    By btnChatBoat = By.xpath("//*[@text='HOME']/../../preceding-sibling::*/*/*/*/*/*/*/*/*/*/*/*/*[2]/*");
    By btnCards = By.xpath("(//*[contains(@class,'HorizontalScrollView')][2]//*[contains(@class,'ImageView')])[1]");
    By btnMenu = By.xpath("//*[@text='KEY INFO']/../following-sibling::*[1]/*/*[2]");
    By btnKeyInfo = By.xpath("//*[@text='KEY INFO']/..");
    By btnEzpaz = By.xpath("//*[@text='EZPaz']/..");
    By btnMaps = By.xpath("//*[@text='MAPS']/..");
    By btnCloseMenu = By.xpath("//*[@text='KEY INFO']/../following-sibling::*[1]/*/*[2]");

}
