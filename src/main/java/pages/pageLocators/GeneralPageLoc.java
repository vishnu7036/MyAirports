package pages.pageLocators;

import org.openqa.selenium.By;

public interface GeneralPageLoc {
    By lblGeneralHeading = By.xpath("//*[@text='GENERAL']");
    By btnBackGeneral = By.xpath("//*[@text='GENERAL']/preceding-sibling::*/*");

    default By getText(String txt) {
        return By.xpath(String.format("//*[@text='%s']", txt));
    }

    By iconFB = By.xpath("//*[@text='GENERAL']/../*[5]/*");
    By iconTwitter = By.xpath("//*[@text='GENERAL']/../*[6]/*");
    By iconYoutube = By.xpath("//*[@text='GENERAL']/../*[7]/*");
    By iconInsta = By.xpath("//*[@text='GENERAL']/../*[8]/*");
    By iconWeb = By.xpath("//*[@text='GENERAL']/../*[9]/*");
    By lblAboutHeading = By.xpath("//*[@text='ABOUT']");
    By btnBackAbout = By.xpath("//*[@text='ABOUT']/preceding-sibling::*/*");
    By lblAboutDescription = By.xpath("//*[contains(@text,'Opened in 1998, KL International Airport (KLIA) (IATA Code: KUL)')]");
    //About, Contact Us, Terms of Use, //*[@text='Privacy Policy.']
}
