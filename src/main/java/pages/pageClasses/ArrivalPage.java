package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.ArrivalPageLoc;
import utils.MobileUtils;

import java.util.Arrays;

public class ArrivalPage extends MobileUtils implements ArrivalPageLoc {
    private AndroidDriver _driver;

    public ArrivalPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyArrivalPage() {
        try {
            Thread.sleep(3000);
            isElementVisible(lblHeading, "Arrival Page");
        } catch (Exception e) {

        }
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public void verifyNote() {
        String[] parts = _driver.findElement(lblNote).getText().split(":");
        String text = parts[1].trim();
//        String text = Arrays.stream(parts).skip(1).findFirst().orElse("");
        Assert.assertEquals(text, "Please verify the tag number on your luggage before retrieving them");
    }

    public String verifyTerminal() throws InterruptedException {
        Thread.sleep(2000);
        isElementVisible(lblTerminal, "Terminal Name");
        return _driver.findElement(lblTerminal).getText();
    }
}
