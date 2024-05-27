package pages.pageLocators;

import org.openqa.selenium.By;

public interface SingleStorePageLoc {
    By lblHeading = By.xpath("//*[@text='About']/../*[1]/following-sibling::*[1]");
    By lblTakeMeThere = By.xpath("//*[@text='Take Me There']");
    By lblRatingReview = By.xpath("//*[@text='RATING REVIEW']");
    By btnBack = By.xpath("//*[@text='About']/../*[1]/*");
    By ddOptions = By.xpath("//*[@text='Search for Stores']/../../../following-sibling::*[2]/*/*/*/*/*");
    By btnFavourite = By.xpath("//*[@text='Favourite']/../*[1]");
}
