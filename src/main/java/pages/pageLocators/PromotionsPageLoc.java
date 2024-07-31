package pages.pageLocators;

import org.openqa.selenium.By;

public interface PromotionsPageLoc {
    By lblHeading = By.xpath("//*[@text='PROMOTIONS']");
    By btnBack = By.xpath("//*[@text='PROMOTIONS']/preceding-sibling::*[1]/*");
    By txtSearch = By.xpath("//*[@text='PROMOTIONS']/../following-sibling::*[2]/*[1]/*/*[1]");
    By ddTerminal = By.xpath("//*[@text='PROMOTIONS']/../following-sibling::*[1]/*[1]");
    By promotionsBanner = By.xpath("(//*[@text='PROMOTIONS']/../following-sibling::*[2]/*[2]/*/*/*/*[2]//*[contains(@text,'')][1])[last()]");
    By lblBanner = By.xpath("(//*[@class='android.widget.TextView'])[1]");
    By btnBannerBack = By.xpath("(//*[@class='android.widget.TextView'])[1]/preceding-sibling::*[1]/*");
    By btnTerminal2 = By.xpath("//*[@text='KUL Terminal 2']");
    By btnTerminal1 = By.xpath("(//*[@text='KUL Terminal 1'])[2]");
}
