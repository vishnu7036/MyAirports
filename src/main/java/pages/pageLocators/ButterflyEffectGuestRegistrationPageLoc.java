package pages.pageLocators;

import org.openqa.selenium.By;

public interface ButterflyEffectGuestRegistrationPageLoc {
    By lblHeading = By.xpath("//*[@text='The Butterfly Effect Guest Registration']");
    By btnBack = By.xpath("(//*[@class='android.widget.ImageView'])[1]");
    By ddAirport = By.xpath("//*[@resource-id='edit-airport']");
    By radBtnAirport = By.xpath("//*[@text='- Select -']/following-sibling::*[1]");
    By txtAirline = By.xpath("//*[@text='Airline']/following-sibling::*[1]");
    By txtFlightNumber = By.xpath("//*[@resource-id='edit-flight-number']");
    By txtDateOfVisit = By.xpath("//*[@resource-id='edit-date-of-visit']");
    default By getCurrentDate(String date, String dat){
        return By.xpath(String.format("//*[@text='%s' or @text='%s']",date, dat));
    }
    By btnCurrentDate = By.xpath("(//*[contains(@class,'TextView')])[2]");
    By txtPassengerFullName = By.xpath("//*[@resource-id='edit-passenger-full-name']");
    By txtPassengerPassportNum = By.xpath("//*[@resource-id='edit-ic-number-or-passport-number']");
    By ddPassengerPassportIssueCountry = By.xpath("//*[@resource-id='edit-nric-passport-issuing-country']");
    By radBtnPassengerPassportIssueCountry = By.xpath("//*[@text='- Select -']/following-sibling::*[1]");
    By txtPassengerAge = By.xpath("//*[@resource-id='edit-passenger-age']");
    By ddPassengerGender = By.xpath("//*[@resource-id='edit-passenger-gender']");
    By radBtnGender = By.xpath("//*[@text='- Select -']/following-sibling::*[1]");
    By txtParentFullName = By.xpath("//*[@resource-id='edit-parent-guardian-s-name']");
    By txtParentPassportNum = By.xpath("//*[@resource-id='edit-parent-guardian-s-ic-number-or-passport-number']");
    By ddParentPassportIssueCountry = By.xpath("//*[@resource-id='edit-parent-guardian-s-nric-passport-issuing-country']");
    By radBtnParentPassportIssueCountry = By.xpath("//*[@text='- Select -']/following-sibling::*[1]");
    By txtParentContactNum = By.xpath("//*[@resource-id='edit-parent-guardian-s-contact-number']");
    By txtAddress = By.xpath("//*[@resource-id='edit-address-2-address']");
    By txtAddress2 = By.xpath("//*[@resource-id='edit-address-2-address-2']");
    By txtCityOrTown = By.xpath("//*[@resource-id='edit-address-2-city']");
    By txtPostalCode = By.xpath("//*[@resource-id='edit-address-2-postal-code']");
    By ddCountry = By.xpath("//*[@resource-id='edit-address-2-country']");
    By radBtnCountry = By.xpath("//*[@text='- Select -']/following-sibling::*[1]");
    By txtEmailAddress = By.xpath("//*[@resource-id='edit-passenger-email']");
    By chckboxAcknowledge = By.xpath("//*[contains(@resource-id,'edit-i-hereby-acknowledge')]");
    By chckboxResponsible = By.xpath("//*[@resource-id='edit-responsible']");
    By chckboxNonTravelling = By.xpath("//*[@resource-id='edit-i-am-a-non-travelling-guardian-and-would-like-to-ask-for-special']");
    By btnRegister = By.xpath("//*[@resource-id='edit-actions-submit']");
    By lblThankYou = By.xpath("//*[@text='Thank You']");
    By lblThankYouDescription = By.xpath("//*[contains(@text,'Thank you for registering')]");
}
