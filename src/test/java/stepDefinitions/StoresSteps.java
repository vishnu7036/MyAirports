package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.pageClasses.*;

import java.net.MalformedURLException;

public class StoresSteps {
    private AndroidDriver _driver;
    private HomePage homePage;
    private StoresPage storesPage;
    private String textFromAnyOneOfStore;

    @Before(value = "@Stores", order = 0)
    public void launchApp() throws MalformedURLException {
        System.out.println("before Login method is running");
        _driver = BaseSteps.getDriver();
        homePage = new HomePage(_driver);
        storesPage = new StoresPage(_driver);
    }

    @After("@Stores")
    public void closeApp() {
        System.out.println("after Login method is running");
        BaseSteps.closeDriver();
    }

    @Before(value = "@Stores", order = 1)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication("vishnug4881@gmail.com","Test@123");
    }

    @Given("the user clicks on the Stores button on the home page")
    public void the_user_clicks_on_the_stores_button_on_the_home_page() {
        homePage.clickOnStoresIcon();
    }

    @Then("the user navigates to the Stores page")
    public void the_user_navigates_to_the_stores_page() {
        storesPage.verifyStoresPage();
    }

    @And("clicks on the terminal dropdown to change the terminal in the Stores page")
    public void clicks_on_the_terminal_dropdown_to_change_the_terminal_in_the_stores_page() {
        storesPage.clickOnTerminalDropDown();
        storesPage.clickOnTerminalBasedOnText("KUL Terminal 2");
    }

    @Then("clicks on any of the Stores from the Stores list")
    public void clicks_on_any_of_the_stores_from_the_stores_list() {
        storesPage.waitForAllStoresVisible();
        textFromAnyOneOfStore = storesPage.getTextFromAnyOneOfStore();
        storesPage.clickOnAnyOneOfStore();
    }

    @And("verifies that the user navigates to the same Stores page")
    public void verifies_that_the_user_navigates_to_the_same_stores_page() {
        storesPage.singleStorePage().verifySingleStorePage();
        String lblHeadingSingleStore = storesPage.singleStorePage().verifySingleStorePageHeading();
        Assert.assertEquals(textFromAnyOneOfStore, lblHeadingSingleStore);
    }

    @Then("clicks on the favorite to add to favorites")
    public void clicks_on_the_favorite_to_add_to_favorites() {
        storesPage.singleStorePage().clickOnFavourite();
    }

    @Then("verifies the Rating Review text in the POI details page")
    public void verifies_the_Rating_Review_text_in_the_POI_details_page() {
        storesPage.singleStorePage().verifyRatingReviewLbl();
    }

    @Then("verifies the Take Me There text in the POI details page")
    public void verifies_the_Take_Me_There_text_in_the_POI_details_page() {
        storesPage.singleStorePage().verifyTakeMeThereLbl();
    }

    @And("verifies the back arrow icon in the POI details page")
    public void verifies_the_back_arrow_icon_in_the_poi_details_page() {
        storesPage.singleStorePage().verifyBackButton();
    }

    @And("clicks on the back arrow icon in the POI details page")
    public void clicks_on_the_back_arrow_icon_in_the_poi_details_page() {
        storesPage.singleStorePage().clickOnBackIcon();
    }

    @Then("verifies that the Stores page is displayed")
    public void verifies_that_the_stores_page_is_displayed() {
        storesPage.verifyStoresPage();
    }

    @And("verifies the back arrow icon in the Stores page and clicks on the back arrow icon")
    public void verifies_the_back_arrow_icon_in_the_stores_page_and_clicks_on_the_back_arrow_icon() {
        storesPage.verifyBackIcon();
        storesPage.clickOnBackIcon();
    }

    @Then("verifies that it takes the user to the home page")
    public void verifies_that_it_takes_the_user_to_the_home_page() {
        homePage.verifyHomePage();
    }

}
