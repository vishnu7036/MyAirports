package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonFunctions extends MobileUtils {
    private final By btnBack = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    private final By btnSave = By.xpath("//*[@text='SAVE']");
    private final By btnSubmit = By.xpath("//*[@text='SUBMIT']");
    private final By btnOk = By.xpath("//*[@text='OK']");

    private final AndroidDriver _driver;

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

    public void clickOnOkButton() {
        click(btnOk, "Ok button");
    }
}
