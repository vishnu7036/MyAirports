package pages.pageLocators;

import org.openqa.selenium.By;

public interface RegisterComplaintPageLoc {
    By lblRegisterComplaint = By.xpath("//*[@text='REGISTER COMPLAINT']");
    By btnBack = By.xpath("//*[@text='REGISTER COMPLAINT']/preceding-sibling::*[1]/*");
    By txtDescription = By.xpath("//*[@text='Description']");
    By btnUploadPhoto = By.xpath("//*[@text='Upload Photos/Video:']/following-sibling::*[1]/*");
    By txtLocation = By.xpath("//*[@text='Location']");
    By txtFlightNum = By.xpath("//*[@text='Flight number']");
    By btnSubmit = By.xpath("//*[@text='SUBMIT']");
    By lblComplaintRegister = By.xpath("//*[contains(@text,'COMPLAINT REGISTERED')]");
    By btnClose = By.xpath("//*[contains(@text,'COMPLAINT REGISTERED')]/preceding-sibling::*[2]/*");
}
