package pages.pageLocators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public interface WelcomePageLoc {
    By btnGuest = By.xpath("//*[contains(@text,'GUEST')]");
    By btnLoginOrSignup = AppiumBy.xpath("//*[contains(@text,'LOGIN')]");
    By logoMalaysiaAirports = By.xpath("//*[contains(@text,'GUEST')]/../*[3]");
    By lblChangeLang = By.xpath("//*[@text='CHANGE LANGUAGE']");
    default By getLanguageElements(String text) {
        return By.xpath(String.format("//*[contains(@text,'%s')]", text));
    }
    By lblChangeLangInMalaysia = By.xpath("//*[@text='TUKAR BAHASA']");
    By btnLoginOrSingUpInMalaysia = By.xpath("//*[contains(@text,'LOG MASUK / DAFTAR')]");
    By btnGuestInMalaysia = By.xpath("//*[contains(@text,'TETAMU')]");

    By getLblChangeLangInChinese = By.xpath("//*[@text='选择语言']");
    By btnLoginOrSignupInChinese = By.xpath("//*[contains(@text,'登录 / 注册')]");
    By btnGuestInChinese = By.xpath("//*[contains(@text,'访客')]");
    By btnEnglishInChinese = By.xpath("//*[@text='英文 ']");
}
