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
    default By getTerminal(String text){
        return By.xpath(String.format("//*[@text='%s']",text));
    }

}
