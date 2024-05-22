package pages.popupLocators;

import org.openqa.selenium.By;

public interface EditPhotoPopupLoc {
    By lblHeading = By.xpath("//*[@text='EDIT PHOTO']");
    By btnUseCamera = By.xpath("//*[@text='USE CAMERA']");
    By btnFromAlbum = By.xpath("//*[@text='FROM ALBUM']");
    By btnClear = By.xpath("//*[@text='CLEAR']");
    By btnClose = By.xpath("//*[@text='EDIT PHOTO']/preceding-sibling::*[1]/*");
}
