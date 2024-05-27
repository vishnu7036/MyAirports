package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.WelcomePageLoc;
import utils.MobileUtils;

public class WelcomePage extends MobileUtils implements WelcomePageLoc {
    private AndroidDriver _driver;

    public WelcomePage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyWelcomePage() {
        waitForElementVisibility(logoMalaysiaAirports, "LOGIN/SIGNUP button", 30);
        isElementVisible(logoMalaysiaAirports, "Landing Page");
    }

    public void clickOnLoginOrSignup() {
        waitForElementVisibility(btnLoginOrSignup, "LOGIN/SIGNUP button", 30);
        click(btnLoginOrSignup, "Login or Signup button");
    }
    public void verifyWelcomePageLogo(){
        isElementVisible(logoMalaysiaAirports,"Malaysia Airports logo");
    }
    public void verifyDefaultEnglishLnkSelected(){
        String text = _driver.findElement(btnLoginOrSignup).getText();
        Assert.assertTrue(text.contains("LOGIN"),"Login or Signup Link is in English Language");
    }
    public void verifyEnglishLinkTextInEnglish(){
        String text = _driver.findElement(getLanguageElements("ENGLISH")).getText();
        Assert.assertTrue(text.contains("ENGLISH"));
    }
    public void verifyMalaysiaLinkTextInMalaysia(){
        String text = _driver.findElement(getLanguageElements("MALAYSIA")).getText();
        Assert.assertTrue(text.contains("MALAYSIA"));
    }
    public void verifyChineseLinkTextInChinese(){
        String text = _driver.findElement(getLanguageElements("中文")).getText();
        Assert.assertTrue(text.contains("中文"));
    }

    public void clickOnGuest() {
        click(btnGuest, "GUEST Button");
    }

    public void clickOnEnglishLink() {
        click(getLanguageElements("ENGLISH"), "ENGLISH Link");
    }

    public void clickOnMalaysiaLink() {
        click(getLanguageElements("MALAYSIA"), "BAHASA MALAYSIA Link");
    }

    public void clickOnChineseLink() {
        click(getLanguageElements("中文"), "CHINESE Link");
    }

    public void verifyChangeLanguageTextInEnglishLanguage(){
        String text = _driver.findElement(lblChangeLang).getText();
        Assert.assertTrue(text.contains("CHANGE LANGUAGE"),"Change language Label displayed in English Language");
    }
    public void verifyLoginOrSingUpLinkTextInEnglishLanguage(){
        String text = _driver.findElement(btnLoginOrSignup).getText();
        Assert.assertTrue(text.contains("LOGIN"),"Login or Signup Link is in English Language");
    }
    public void verifyGuestLinkTextInEnglishLanguage(){
        String text = _driver.findElement(btnGuest).getText();
        Assert.assertTrue(text.contains("GUEST"),"Guest Link displayed in English Language");
    }


    public void verifyChangeLanguageTextInMalaysianLanguage(){
        String text = _driver.findElement(lblChangeLangInMalaysia).getText();
        Assert.assertTrue(text.contains("TUKAR BAHASA"),"Change language Label displayed in Malaysian Language");
    }
    public void verifyLoginOrSingUpLinkTextInMalaysianLanguage(){
        String text = _driver.findElement(btnLoginOrSingUpInMalaysia).getText();
        Assert.assertTrue(text.contains("LOG MASUK / DAFTAR"),"Login or Signup Link is in Malaysian Language");
    }
    public void verifyGuestLinkTextInMalaysianLanguage(){
        String text = _driver.findElement(btnGuestInMalaysia).getText();
        Assert.assertTrue(text.contains("TETAMU"),"Guest Link displayed in Malaysian Language");
    }


    public void verifyChangeLanguageTextInChineseLanguage(){
        String text = _driver.findElement(getLblChangeLangInChinese).getText();
        Assert.assertTrue(text.contains("选择语言"),"Change language Label displayed in Chinese Language");
    }
    public void verifyLoginOrSingUpLinkTextInChineseLanguage(){
        String text = _driver.findElement(btnLoginOrSignupInChinese).getText();
        Assert.assertTrue(text.contains("登录 / 注册"),"Login or Signup Link is in Chinese Language");
    }
    public void verifyGuestLinkTextInChineseLanguage(){
        String text = _driver.findElement(btnGuestInChinese).getText();
        Assert.assertTrue(text.contains("访客"),"Guest Link displayed in Chinese Language");
    }
    public void clickOnEnglishTextInChinese(){
        click(btnEnglishInChinese,"English");
    }


    public LoginPage loginPage() {
        return new LoginPage(_driver);
    }

}
