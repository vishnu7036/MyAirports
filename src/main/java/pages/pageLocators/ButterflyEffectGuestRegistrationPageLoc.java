package pages.pageLocators;

import org.openqa.selenium.By;

public interface ButterflyEffectGuestRegistrationPageLoc {
    By lblHeading = By.xpath("//*[@text='The Butterfly Effect Guest Registration']");
    By btnBack = By.xpath("(//*[@class='android.widget.ImageView'])[1]");
    By ddAirport = By.xpath("//*[@resource-id='airport']");
    By ddOptionAirport = By.xpath("(//*[@text='KLIA Terminal 2'])[2]");
    By txtAirline = By.xpath("//*[@resource-id='airline']");
    By txtFlightNumber = By.xpath("//*[@resource-id='flightNumber']");
    By txtDateOfVisit = By.xpath("//*[@resource-id='dateOfVisit']");
    default By getCurrentDate(String date, String dat){
        return By.xpath(String.format("//*[@text='%s' or @text='%s']",date, dat));
    }
    By btnCurrentDate = By.xpath("(//*[contains(@class,'TextView')])[2]");
    By txtPassengerFullName = By.xpath("//*[@resource-id='fullName']");
    By txtPassengerPassportNum = By.xpath("//*[@resource-id='nricPassportNumber']");
    By ddPassengerPassportIssueCountry = By.xpath("//*[@resource-id='nricPassportIssuingCountry']");
    By ddOptionsPassengerPassportIssueCountry = By.xpath("(//*[@text='Afghanistan'])[2]");
    By txtPassengerAge = By.xpath("//*[@resource-id='age']");
    By ddPassengerGender = By.xpath("//*[@resource-id='gender']");
    By ddOptionPassengerGender = By.xpath("//*[@text='Male']");
    By txtParentFullName = By.xpath("//*[@resource-id='parentFullName']");
    By txtParentPassportNum = By.xpath("//*[@resource-id='parentNricPassportNumber']");
    By ddParentPassportIssueCountry = By.xpath("//*[@resource-id='parentNricPassportIssuingCountry']");
    By ddOptionsParentPassportIssueCountry = By.xpath("(//*[@text='Afghanistan'])[2]");
    By txtParentContactNum = By.xpath("//*[@text='Contact Number']/../following-sibling::*/*/*/*/*/following-sibling::*[1]");
    By txtAddress = By.xpath("//*[@resource-id='address']");
    By txtAddress2 = By.xpath("//*[@resource-id='address2']");
    By txtCityOrTown = By.xpath("//*[@resource-id='city']");
    By txtPostalCode = By.xpath("//*[@resource-id='zipCode']");
    By ddCountry = By.xpath("//*[@resource-id='country']");
    By ddOptionCountry = By.xpath("(//*[@text='Afghanistan'])[2]");
    By txtEmailAddress = By.xpath("//*[@resource-id='email']");
    By chckboxAcknowledge = By.xpath("//*[@resource-id='acknowlegment']");
    By chckboxResponsible = By.xpath("(//*[contains(@text,'I am responsible to accompany')])[1]");
    By chckboxNonTravelling = By.xpath("(//*[contains(@text,'I am a non-travelling guardian')])[1]");
    By btnRegister = By.xpath("//*[@resource-id='edit-actions-submit']");
    By lblThankYou = By.xpath("//*[@text='Thank You']");
    By lblThankYouDescription = By.xpath("//*[contains(@text,'Thank you for registering')]");
}
