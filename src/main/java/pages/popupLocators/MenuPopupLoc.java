package pages.popupLocators;

import org.openqa.selenium.By;

public interface MenuPopupLoc {
    By imgMenu = By.xpath("//*[@text='SPECIAL ASSISTANCE']/../../../../../*[2]");
    default By getText(String text){
        return By.xpath(String.format("//*[@text='%s']",text));
    }
    //MY PROFILE, SETTINGS, FEEDBACK, KEY INFO, GENERAL, ONLINE SHOPPING, PROMOTIONS, FLIGHTS, SPECIAL ASSISTANCE

}
