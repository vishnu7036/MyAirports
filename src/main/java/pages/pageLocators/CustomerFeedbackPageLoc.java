package pages.pageLocators;

import org.openqa.selenium.By;

public interface CustomerFeedbackPageLoc {
    By lblHeading = By.xpath("//*[contains(@text,'Customer')]");
    By btnClose = By.xpath("//*[contains(@text,'Customer')]/preceding-sibling::*/*");
    By btnFileComplaint = By.xpath("//*[@text='File a Complaint']");
    By btnMakeSuggestion = By.xpath("//*[@text='Make a Suggestion']");
    By btnGiveComplaint = By.xpath("//*[@text='Give a Compliment']");
    By btnPrevious = By.xpath("//*[@text='Previous']");
    By btnNext = By.xpath("//*[@text='Next']");
    By lblTerminal = By.xpath("//*[contains(@text,'terminal')]");
    By lblPassenger = By.xpath("//*[contains(@text,'passenger?')]");
    By radBtnYes = By.xpath("//*[@text='Yes']/preceding-sibling::*[1]/*[1]");
    By radBtnNo = By.xpath("//*[@text='No']/preceding-sibling::*[1]/*[1]");
    By lblIamPassenger = By.xpath("//*[contains(@text,'I am a Passenger')]");
    By lblSelectYourTravel = By.xpath("//*[contains(@text,'Please select your')]");
    By radBtnInternational = By.xpath("//*[@text='International']/preceding-sibling::*[1]/*[1]");
    By radBtnDomestic = By.xpath("//*[@text='Domestic']/preceding-sibling::*[1]/*[1]");
    By lblYouAre = By.xpath("//*[contains(@text,'are/were')]");
    By radBtnDeparting = By.xpath("//*[@text='Departing']/preceding-sibling::*[1]/*[1]");
    By radBtnArriving = By.xpath("//*[@text='Arriving']/preceding-sibling::*[1]/*[1]");
    By radBtnTransit = By.xpath("//*[@text='Transit']/preceding-sibling::*[1]/*[1]");
    By lblAreaOfYourComplaint = By.xpath("//*[contains(@text,'area of your complaint')]");
    By btnToilets = By.xpath("//*[@text='Toilets']");
    default By getTerminal(String text){
        return By.xpath(String.format("//*[@text='%s']",text));
    }

}
