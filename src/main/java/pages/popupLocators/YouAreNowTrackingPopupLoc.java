package pages.popupLocators;

import org.openqa.selenium.By;

public interface YouAreNowTrackingPopupLoc {
    By lblHeading = By.xpath("//*[contains(@text,'You are now tracking')]");
    By txtEmail = By.xpath("//*[contains(@text,'Enter Email')]");
    By chckbxTerms = By.xpath("//*[contains(@text,'Terms & Conditions')]/../preceding-sibling::*[1]");
    By btnSkip = By.xpath("//*[@text='SKIP']");
    By btnSubmit = By.xpath("//*[@text='SUBMIT']");
}
