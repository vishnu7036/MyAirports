package pages.pageLocators;

import org.openqa.selenium.By;

public interface LoginPageLoc {
    By lblLogin = By.xpath("//*[@text=' LOGIN']");
    By txtEmail = By.xpath("//*[@text='Email ID']");
    By txtPass = By.xpath("//*[@text='Enter Password']");
    By btnSignup = By.xpath("//*[contains(@text,'SIGN UP')]");
    By btnSubmit = By.xpath("//*[@text='SUBMIT']");
}
