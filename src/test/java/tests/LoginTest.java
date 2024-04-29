package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pageClasses.HomePage;
import pages.pageClasses.LandingPage;

public class LoginTest extends BaseTest{
    private LandingPage landingPage;
    private HomePage homePage;
    @BeforeMethod
    public void init(){
        landingPage =new LandingPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void testLoginFeature(){
        landingPage.clickOnGuest();
    }

}
