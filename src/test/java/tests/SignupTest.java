package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pageClases.HomePage;
import pages.pageClases.LandingPage;

public class SignupTest extends BaseTest {
    private LandingPage landingPage;
    private HomePage homePage;

    @BeforeMethod
    public void init() {
        landingPage = new LandingPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void createAccount() {
//        landingPage.clickOnLoginOrSignup();
//        landingPage.loginPage().clickOnSignUpBtn();
//        landingPage.loginPage().signupPage().enterFirstName();
//        landingPage.loginPage().signupPage().enterLastName();
//        landingPage.loginPage().signupPage().enterEmailID();
//        landingPage.loginPage().signupPage().enterPassword();
//        landingPage.loginPage().signupPage().clickOnCreateAccountBtn();
    }

}
