package pages.pageLocators;

import org.openqa.selenium.By;

public interface FavouritesPageLoc {
    By lblHeading = By.xpath("//*[@text='FAVOURITES']");
    By btnBack = By.xpath("//*[@text='FAVOURITES']/preceding-sibling::*[1]/*");
    By btnFav = By.xpath("(//*[@text='FAVOURITES']/following-sibling::*[2]/*/*[2]//*[contains(@class,'TextView')])[1]");
}
