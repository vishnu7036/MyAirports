package pages.pagePopups;

import io.appium.java_client.android.AndroidDriver;
import pages.popupLocators.EditPhotoPopupLoc;
import utils.MobileUtils;

public class EditPhotoPopup extends MobileUtils implements EditPhotoPopupLoc {
    private AndroidDriver _driver;

    public EditPhotoPopup(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyEditPopupWindow() {
        isElementVisible(lblHeading, "Edit Photo popup");
    }

    public void verifyUseCameraButton() {
        isElementVisible(btnUseCamera, "USE CAMERA button");
    }

    public void verifyFromAlbumButton() {
        isElementVisible(btnFromAlbum, "FROM ALBUM button");
    }

    public void verifyClearButton() {
        isElementVisible(btnClear, "CLEAR button");
    }

    public void verifyCloseIconInEditPhotoPopupWindow() {
        isElementVisible(btnClose, "Close Icon");
    }

    public void clickOnCloseIconInEditPhotoPopupWindow() {
        click(btnClose, "Close Icon");
    }

}
