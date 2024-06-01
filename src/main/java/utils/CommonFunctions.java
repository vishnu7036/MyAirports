package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonFunctions extends MobileUtils {
    private By btnBack = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    private By btnSave = By.xpath("//*[@text='SAVE']");
    private By btnSubmit = By.xpath("//*[@text='SUBMIT']");

    private AndroidDriver _driver;

    public CommonFunctions(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void clickOnBackIcon() {
        WebElement ele = _driver.findElement(btnBack);
        waitForElementVisibility(btnBack, "Back Button", 10);
        ele.click();
    }

    public void clickOnSubmitButton() {
        click(btnSubmit, "Submit button");
    }

    public void clickOnSaveButton() {
        click(btnSave, "Save button");
    }

}
