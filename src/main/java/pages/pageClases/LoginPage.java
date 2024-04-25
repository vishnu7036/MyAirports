package pages.pageClases;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.pageLocators.LoginPageLoc;
import utils.CommonFunctions;
import utils.MobileUtils;

public class LoginPage extends MobileUtils implements LoginPageLoc {

    private AndroidDriver _driver;

    public LoginPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void clickOnSignUpBtn() {
        scrollIntoView(btnSignup, "Sign Up button");
        click(btnSignup, "Sign Up button");
    }

    public SignupPage signupPage() {
        return new SignupPage(_driver);
    }

    public void enterEmailID(String text) throws InterruptedException {
        WebElement ele = _driver.findElement(txtEmail);
        ele.click();
        Thread.sleep(3000);
        ele.sendKeys(text);
        Thread.sleep(3000);
    }

    public void enterPassword(String text) throws InterruptedException {
        WebElement ele = _driver.findElement(txtPass);
        ele.click();
        Thread.sleep(2000);
        ele.sendKeys(text);
    }

    public void clickOnSubmitButton() {
        click(btnSubmit, "Submit button");
        click(btnSubmit, "Submit button");
//        _driver.findElement(btnSubmit).click();
    }

    public void hideKeyboard() {
        _driver.hideKeyboard();
    }

    public void clickOnBackButton() {
        new CommonFunctions(_driver).clickOnBackIcon();
    }

    public void verifyLoginPage() {
        waitForElementVisibility(lblLogin, "Login Page Heading");
        boolean ele = _driver.findElement(lblLogin).isDisplayed();
        Assert.assertTrue(ele, "Login Page is not displayed");
    }

    public HomePage homePage() {
        return new HomePage(_driver);
    }

    public LocationPopup locationPopup() {
        return new LocationPopup(_driver);
    }

    public void clickOnSignup() {
        TouchAction touchAction = new TouchAction(_driver);

    }

}
