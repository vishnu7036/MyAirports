package pages.pageLocators;

import org.openqa.selenium.By;

public interface UserProfilePageLoc {
    By lblHeading = By.xpath("//*[@text='Hello']");
    By btnBack = By.xpath("//*[@text='Logout']/preceding-sibling::*[1]/*");
    By btnLogout = By.xpath("//*[@text='Logout']");
    By btnEdit = By.xpath("//*[@text='Logout']/../following-sibling::*[1]/*[3]/*");
    By btnCamera = By.xpath("//*[@text='Logout']/../following-sibling::*[1]/*[1]/*");
    default By getElementName(String text){
        return By.xpath(String.format("//*[@text='%s']",text));
    }
    By lblUserName = By.xpath("//*[@text='Logout']/following-sibling::*[2]");

}
