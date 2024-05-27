package pages.pageLocators;

import org.openqa.selenium.By;

public interface ChangePasswordPageLoc {
    By lblHeading = By.xpath("//*[@text='CHANGE  PASSWORD ']");
    By btnBack = By.xpath("//*[@text='CHANGE  PASSWORD ']/preceding-sibling::*[1]/*");
    By txtCurrentPass = By.xpath("//*[@text='Current Password']");
    By txtNewPass = By.xpath("//*[@text='New Password']");
    By txtReEnterNewPass = By.xpath("//*[@text='Re-Enter New Password']");
    By lblDescription = By.xpath("//*[contains(@text,'Password should be minimum')]");
    By btnSave = By.xpath("//*[@text='SAVE']");
    By lblPassChange = By.xpath("//*[@text='Password changed successfully ']");
    By btnClose = By.xpath("//*[@text='Password changed successfully ']/preceding-sibling::*[2]/*");
}
