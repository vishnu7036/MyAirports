package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.CustomerFeedbackPageLoc;
import utils.CommonFunctions;
import utils.MobileUtils;

public class CustomerFeedbackPage extends MobileUtils implements CustomerFeedbackPageLoc {
    private final AndroidDriver _driver;

    public CustomerFeedbackPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyCustomerFeedbackPage() {
        try{
            Thread.sleep(2000);
            isElementVisible(lblHeading, "Customer Feedback");
        }catch(InterruptedException ignored){

        }
    }

    public void verifyFileComplaintButton() {
        isElementVisible(btnFileComplaint, "File Complaint button");
    }

    public void verifyMakeSuggestionButton() {
        isElementVisible(btnMakeSuggestion, "Make Suggestion button");
    }

    public void verifyGiveComplaintButton() {
        isElementVisible(btnGiveComplaint, "Give Complaint button");
    }

    public void clickOnFileComplaintButton() {
        click(btnFileComplaint, "File Complaint button");
    }

    public void clickOnMakeSuggestionButton() {
        click(btnMakeSuggestion, "Make Suggestion button");
    }

    public void clickOnGiveComplimentButton() {
        click(btnGiveComplaint, "Give Complaint button");
    }

    public void clickOnPreviousButton() {
        click(btnPrevious, "Previous button");
    }

    public void clickOnNextButton() {
        click(btnNext, "Next button");
    }

    public void verifyTerminalPage() {
        isElementVisible(lblTerminal, "Terminal Page");
    }

    public void clickOnCloseIcon() {
        click(btnClose, "Close Icon");
    }

    public void clickOnTerminalOne() {
        click(getTerminal("KUL Terminal 1"), "KUL Terminal 1");
    }

    public void clickOnTerminalTwo() {
        click(getTerminal("KUL Terminal 2"), "KUL Terminal 2");
    }

    public void clickOnKotaKinabaluInternationalAirport() {
        click(getTerminal("Kota Kinabalu International Airport"), "Kota Kinabalu International Airport");
    }

    public void clickOnKuchingInternationalAirport() {
        click(getTerminal("Kuching International Airport"), "Kuching International Airport");
    }

    public void clickOnPenangInternationAirport() {
        click(getTerminal("Penang International Airport"), "Penang International Airport");
    }
    public GiveAComplimentPage giveAComplimentPage(){
        return new GiveAComplimentPage(_driver);
    }
    public MakeASuggestionPage makeASuggestionPage(){
        return new MakeASuggestionPage(_driver);
    }
}
