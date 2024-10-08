package stepDefinitions;

import baseTestSteps.BaseSteps;
import baseTestSteps.BaseStepsForRealDevice;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utils.*;

import java.net.MalformedURLException;

public class WelcomePageSteps {
    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@welcome", order = 0)
    public void launchApplication() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After
    public void closeApplication() {
        BaseSteps.closeDriver();
    }

    @Given("the user launches the application")
    public void the_user_launches_the_application() {
        pm.welcomePage().verifyWelcomePage();
    }

    @Then("the user should be able to view the Malaysia Airports logo")
    public void the_user_should_be_able_to_view_the_malaysia_airports_logo() {
        pm.welcomePage().verifyWelcomePageLogo();
    }

    @And("the user should initially see all buttons and links in English language")
    public void the_user_should_initially_see_all_buttons_and_links_in_english_language() {
        pm.welcomePage().verifyDefaultEnglishLnkSelected();
    }

    @When("the user clicks on BAHASA MALAYSIA in the Welcome Page")
    public void the_user_clicks_on_bahasa_malaysia_in_the_welcome_page() {
        pm.welcomePage().clickOnMalaysiaLink();
    }

    @And("verifies that the app language changes in MALAYSIA language")
    public void verifies_that_the_app_language_changes_in_malaysia_language() {
        pm.welcomePage().verifyChangeLanguageTextInMalaysianLanguage();
        pm.welcomePage().verifyLoginOrSingUpLinkTextInMalaysianLanguage();
        pm.welcomePage().verifyGuestLinkTextInMalaysianLanguage();
        pm.welcomePage().verifyEnglishLinkTextInEnglish();
        pm.welcomePage().verifyChineseLinkTextInChinese();
    }

    @Then("the user clicks on CHINESE in the Welcome Page")
    public void the_user_clicks_on_chinese_in_the_welcome_page() {
        pm.welcomePage().clickOnChineseLink();
    }

    @And("verifies that the app language changes in CHINESE language")
    public void verifies_that_the_app_language_changes_in_chinese_language() {
        pm.welcomePage().verifyChangeLanguageTextInChineseLanguage();
        pm.welcomePage().verifyLoginOrSingUpLinkTextInChineseLanguage();
        pm.welcomePage().verifyGuestLinkTextInChineseLanguage();
    }

    @And("the user clicks on ENGLISH in the Welcome Page")
    public void the_user_clicks_on_english_in_the_welcome_page() {
        pm.welcomePage().clickOnEnglishTextInChinese();
    }

    @Then("verifies that the app language changes in ENGLISH language")
    public void verifies_that_the_app_language_changes_in_english_language() {
        pm.welcomePage().verifyChangeLanguageTextInEnglishLanguage();
        pm.welcomePage().verifyLoginOrSingUpLinkTextInEnglishLanguage();
        pm.welcomePage().verifyGuestLinkTextInEnglishLanguage();
        pm.welcomePage().verifyMalaysiaLinkTextInMalaysia();
        pm.welcomePage().verifyChineseLinkTextInChinese();
    }

}
