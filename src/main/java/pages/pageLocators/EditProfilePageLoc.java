package pages.pageLocators;

import org.openqa.selenium.By;

public interface EditProfilePageLoc {
    By lblHeading = By.xpath("//*[@text='EDIT  PROFILE']");
    By btnBack = By.xpath("//*[@text='EDIT  PROFILE']/preceding-sibling::*[1]/*");
    By txtFirstName = By.xpath("//*[@text='EDIT  PROFILE']/following-sibling::*[2]/*/*/*/*[2]");
    By txtLastName = By.xpath("//*[@text='EDIT  PROFILE']/following-sibling::*[2]/*/*/*/*[4]");
    By ddGender = By.xpath("//*[@text='EDIT  PROFILE']/following-sibling::*[2]/*/*/*/*[5]");
    By txtDate = By.xpath("//*[@text='EDIT  PROFILE']/following-sibling::*[2]/*/*/*/*[6]");
    By txtPassportNum = By.xpath("//*[@text='EDIT  PROFILE']/following-sibling::*[2]/*/*/*/*[8]");
    By txtEmail = By.xpath("//*[@text='EDIT  PROFILE']/following-sibling::*[2]/*/*/*/*[10]");
    By txtMobileNum = By.xpath("//*[@text='EDIT  PROFILE']/following-sibling::*[2]/*/*/*/*[11]");
    By txtAddress = By.xpath("//*[@text='EDIT  PROFILE']/following-sibling::*[2]/*/*/*/*[13]");
    By txtCountry = By.xpath("//*[@text='EDIT  PROFILE']/following-sibling::*[2]/*/*/*/*[14]");
    By btnSave = By.xpath("//*[@text='SAVE']");
}
