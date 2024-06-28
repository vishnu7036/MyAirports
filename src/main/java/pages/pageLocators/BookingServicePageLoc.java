package pages.pageLocators;

import org.openqa.selenium.By;

public interface BookingServicePageLoc {
    By lblHeading = By.xpath("//*[@text='Booking Services']");
    By btnBack = By.xpath("//*[@text='Booking Services']/preceding-sibling::*[1]/*");
}
