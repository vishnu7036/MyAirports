package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import pages.pageLocators.ButterflyEffectGuestRegistrationPageLoc;
import utils.MobileUtils;

import java.time.LocalDate;

public class ButterflyEffectGuestRegistrationPage extends MobileUtils implements ButterflyEffectGuestRegistrationPageLoc {
    private AndroidDriver _driver;

    public ButterflyEffectGuestRegistrationPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyButterflyEffectGuestRegistrationPage() {
        isElementVisible(lblHeading, "Butterfly Effect Guest Registration Page");
    }

    public void clickOnBackButton() {
        click(btnBack, "Back button");
    }

    public void clickOnAirportDropDown() {
        scrollToElement("Date of Visit");
        click(ddAirport, "Airport dropdown");
    }

    public void clickOnAirport() {
        click(ddOptionAirport, "Airport Radio button");
    }

    public void enterAirline(String text) {
        enterText(txtAirline, text, "Airline text field");
    }

    public void enterFlightNumber(String text) {
        hideKeyboard();
        enterText(txtFlightNumber, text, "Flight Number text field");
    }

    public void enterDateOfVisit() {
        hideKeyboard();
        click(txtDateOfVisit, "Date of visit");
        hideKeyboard();
        String date = String.valueOf(LocalDate.now()).split("-")[2];
        String dat = String.valueOf(date.charAt(1));
        click(getCurrentDate(dat,date), "Selected current Date");
    }

    public void enterPassengerFullName(String text) {
        scrollToElement("Gender");
        enterText(txtPassengerFullName, text, "Passenger Full Name text field");
    }

    public void enterPassengerPassportNumber(String text) {
        hideKeyboard();
        enterText(txtPassengerPassportNum, text, "Passenger passport Number text field");
    }

    public void clickOnPassengerPassportIssueCountryDropDown() {
        hideKeyboard();
        scrollToElement("NRIC / Passport Issuing Country");
        click(ddPassengerPassportIssueCountry, "Passenger Passport Issuing Country drop down");
    }

    public void clickOnPassengerPassportIssueCountry() {
        click(ddOptionsPassengerPassportIssueCountry, "Passenger Passport Issuing Country Radio button");
    }

    public void enterPassengerAge(String text) {
        enterText(txtPassengerAge, text, "Passenger Age text field");
    }

    public void clickOnPassengerGenderDropDown() {
        hideKeyboard();
        click(ddPassengerGender, "Gender drop down");
    }

    public void clickOnPassengerGender() {
        click(ddOptionPassengerGender, "Airport Radio button");
    }

    public void enterParentFullName(String text) {
        scrollToElement("Full Name");
        enterText(txtParentFullName, text, "Parent Full Name text field");
    }

    public void enterParentPassportNumber(String text) {
        hideKeyboard();
        enterText(txtParentPassportNum, text, "Parent Passport Number text field");
    }

    public void clickOnParentPassportIssuingCountryDropDown() {
        hideKeyboard();
        click(ddParentPassportIssueCountry, "Parent Passport Issuing country drop down");
    }

    public void clickOnParentPassportIssueCountry() {
        click(ddOptionsParentPassportIssueCountry, "Parent Passport Issuing Country Radio button");
    }

    public void enterParentContactNumber(String text) {
        scrollToElement("Contact Number");
        enterText(txtParentContactNum, text, "Parent contact number text field");
    }

    public void enterAddress(String text) {
        hideKeyboard();
        enterText(txtAddress, text, "Address text field");
    }

    public void enterAddress2(String text) {
        hideKeyboard();
        enterText(txtAddress2, text, "Address2 text field");
    }

    public void enterCity(String text) {
        hideKeyboard();
        enterText(txtCityOrTown, text, "City or Town text field");
    }

    public void enterPostalCode(String text) {
        hideKeyboard();
        scrollToElement("ZIP/Postal Code");
        enterText(txtPostalCode, text, "Postal code text field");
    }

    public void clickOnCountryDropDown() {
        hideKeyboard();
        click(ddCountry, "Country drop down");
    }

    public void clickOnCountry() {
        click(ddOptionCountry, "Country Radio button");
    }

    public void enterEmailAddress(String text) {
        scrollToElement("Email Address");
        enterText(txtEmailAddress, text, "Email Address");
    }

    public void clickOnAcknowledgeCheckBox() {
        click(chckboxAcknowledge, "Acknowledge check box");
    }

    public void clickOnIamResponsibleCheckBox() {
        click(chckboxResponsible, "I am Responsible check box");
    }

    public void clickOnNonTravellingCheckBox() {
        click(chckboxNonTravelling, "I am a non-Travelling check box");
    }

    public void clickOnRegister() {
        scrollToElement("Register");
        click(btnRegister, "Register button");
    }

    public void verifyThankYouPage() {
        isElementVisible(lblThankYou, "Thank You Page");
    }

    public void verifyThankYouPageDescription() {
        verifyText(lblThankYouDescription, "Thank you for registering with us on the Butterfly Effect Project.");
    }

}
