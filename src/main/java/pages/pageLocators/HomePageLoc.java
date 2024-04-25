package pages.pageLocators;

import org.openqa.selenium.By;

public interface HomePageLoc {
    By txtheading = By.xpath("//*[contains(@text,'Allow MYairports')]");
    By btnlocation = By.xpath("//*[contains(@text,'While using the app')]");
    By lblUser = By.xpath("//*[@text='ioc']");

}
