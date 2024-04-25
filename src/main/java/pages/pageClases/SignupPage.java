package pages.pageClases;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import pages.pageLocators.SignupPageLoc;
import utils.CommonFunctions;
import utils.MobileUtils;

public class SignupPage extends MobileUtils implements SignupPageLoc {
    private final AndroidDriver _driver;

    public SignupPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifySignupPageHeading() {
        isElementPresent(lblHeading, "Signup Page");
    }

    public void enterFirstName(String firstName) throws InterruptedException {
        enterText(getLocatorForText("First Name"), firstName, "First Name text field");
        WebElement ele =_driver.findElement(getLocatorForText("First Name"));
        ele.click();
        Thread.sleep(2000);
        ele.sendKeys(firstName);
    }

    public void enterLastName(String lastName) throws InterruptedException {
//        enterText(getLocatorForText("Last Name"), lastName, "Last Name text field");
        WebElement ele =_driver.findElement(getLocatorForText("Last Name"));
        ele.click();
        Thread.sleep(2000);
        ele.sendKeys(lastName);
    }

    public void enterEmailID(String emailID) throws InterruptedException {
//        enterText(getLocatorForText("Email ID"), emailID, "Email ID text field");
        WebElement ele =_driver.findElement(getLocatorForText("Email ID"));
        ele.click();
        Thread.sleep(2000);
        ele.sendKeys(emailID);
    }

    public void enterPassword(String password) throws InterruptedException {
//        enterText(getLocatorForText("Password"), password, "Password text field");
        WebElement ele =_driver.findElement(getLocatorForText("Password"));
        ele.click();
        Thread.sleep(2000);
        ele.sendKeys(password);
    }

    public void clickOnMalaysiaDropdown() {
        click(ddMalaysia, "Drop down");
    }

    public void clickOnCreateAccountBtn() {
        click(getLocatorForButton("CREATE ACCOUNT"), "Create Account button");
    }

    public void clickOnLoginBtn() {
        click(getLocatorForButton("LOGIN"), "Login button");
    }

    public void clickOnGuestBtn() {
        click(getLocatorForButton("GUEST"), "Guest button");
    }

    public void clickOnBackButton() {
        new CommonFunctions(_driver).clickOnBackIcon();
    }

}
