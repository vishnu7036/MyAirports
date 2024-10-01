package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class GeneralPageSteps {
    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@general", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After("@general")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@general", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Given("the user clicks on the user account from the homepage")
    public void the_user_clicks_on_the_user_account_from_the_homepage() {
        pm.homePage().clickOnUserAccount();
    }

    @When("the user clicks on the General button from the user profile page")
    public void the_user_clicks_on_the_general_button_from_the_user_profile_page() {
        pm.userProfilePage().verifyUserProfilePage();
        pm.userProfilePage().clickOnGeneral();
    }

    @Then("the General page should be displayed")
    public void the_general_page_should_be_displayed() {
        pm.generalPage().verifyGeneralPage();
    }

    @And("the user clicks on the About button from the General page")
    public void the_user_clicks_on_the_about_button_from_the_general_page() {
        pm.generalPage().clickOnAbout();
    }

    @And("the About page should be displayed")
    public void the_about_page_should_be_displayed() {
        pm.generalPage().verifyAboutPage();
    }

    @Then("the user clicks on the back icon from the About page")
    public void the_user_clicks_on_the_back_icon_from_the_about_page() {
        pm.generalPage().clickOnBackButtonFromAboutPage();
    }

    @And("the user should be navigated back to the General page")
    public void the_user_should_be_navigated_back_to_the_general_page() {
        pm.generalPage().verifyGeneralPage();
    }
}
