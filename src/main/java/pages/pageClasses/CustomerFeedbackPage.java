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
    public void verifyAreYouPassengerPage(){
        isElementVisible(lblPassenger,"Are you a Passenger");
    }
    public void clickOnYesRadioButton(){
        click(radBtnYes,"Yes Radio button");
    }
    public void clickOnNoRadioButton(){
        click(radBtnNo,"No Radio button");
    }
    public void verifyIamPassengerPage(){
        isElementVisible(lblIamPassenger,"I am passenger");
    }
    public void verifyPleaseSelectYouTravelLabel(){
        isElementVisible(lblSelectYourTravel,"Please select your travel");
    }
    public void clickOnInternationalRadioButton(){
        click(radBtnInternational,"International Radio button");
    }
    public void clickOnDomesticRadioButton(){
        click(radBtnDomestic,"Domestic Radio button");
    }
    public void verifyYouAreLabel(){
        isElementVisible(lblYouAre,"You are/were.....");
    }
    public void clickOnDepartingRadioButton(){
        click(radBtnDeparting,"Departing Radio button");
    }
    public void clickOnArrivingRadioButton(){
        click(radBtnArriving,"Arriving Radio button");
    }
    public void clickOnTransitRadioButton(){
        click(radBtnTransit,"Transit Radio button");
    }
    public void verifyAreaOfComplaintOptionPage(){
        isElementVisible(lblAreaOfYourComplaint,"Select the area of you Complaint");
    }
    public void clickOnToiletsButton(){
        click(btnToilets,"Toilets Option");
    }
    public RegisterComplaintPage registerComplaintPage(){
        return new RegisterComplaintPage(_driver);
    }

}
