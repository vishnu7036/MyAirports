package utils;

import io.appium.java_client.android.AndroidDriver;
import pages.pageClasses.*;
import pages.pagePopups.*;

public class PageObjectManager {
    AndroidDriver _driver;

    public ArrivalPage arrivalPage;
    public BookingServicePage bookingServicePage;
    public BusInformationPage busInformationPage;
    public ButterflyEffectPage butterflyEffectPage;
    public ButterflyEffectGuestRegistrationPage butterflyEffectGuestRegistrationPage;
    public ChangePasswordPage changePasswordPage;
    public ContactUsPage contactUsPage;
    public ConversationsPage conversationsPage;
    public CustomerFeedbackPage customerFeedbackPage;
    public DeparturePage departurePage;
    public DinningPage dinningPage;
    public EditProfilePage editProfilePage;
    public FavouritesPage favouritesPage;
    public FlightsInformationPage flightsInformationPage;
    public GeneralPage generalPage;
    public GiveAComplimentPage giveAComplimentPage;
    public HomePage homePage;
    public KeyInfoPage keyInfoPage;
    public KulTerminalShuttleBusPage kulTerminalShuttleBusPage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    public MakeASuggestionPage makeASuggestionPage;
    public PlanYourJourneyPage planYourJourneyPage;
    public PromotionsPage promotionsPage;
    public RegisterComplaintPage registerComplaintPage;
    public SettingsPage settingsPage;
    public SignupPage signupPage;
    public SingleStorePage singleStorePage;
    public SpecialAssistancePage specialAssistancePage;
    public StoresPage storesPage;
    public TrackMyFlightPage trackMyFlightPage;
    public UserProfilePage userProfilePage;
    public VerifyEmailPage verifyEmailPage;
    public WelcomePage welcomePage;
    public ChooseAirportPopup chooseAirportPopup;
    public EditPhotoPopup editPhotoPopup;
    public LocationPopup locationPopup;
    public MenuPopup menuPopup;
    public YouAreNowTrackingPopup youAreNowTrackingPopup;

    public PageObjectManager(AndroidDriver driver) {
        this._driver = driver;
    }

    public ArrivalPage arrivalPage() {
        if (arrivalPage == null) {
            arrivalPage = new ArrivalPage(_driver);
        }
        return arrivalPage;
    }

    public BookingServicePage bookingServicePage() {
        if (bookingServicePage == null) {
            bookingServicePage = new BookingServicePage(_driver);
        }
        return bookingServicePage;
    }

    public BusInformationPage busInformationPage() {
        if (busInformationPage == null) {
            busInformationPage = new BusInformationPage(_driver);
        }
        return busInformationPage;
    }

    public ButterflyEffectPage butterflyEffectPage() {
        if (butterflyEffectPage == null) {
            butterflyEffectPage = new ButterflyEffectPage(_driver);
        }
        return butterflyEffectPage;
    }

    public ButterflyEffectGuestRegistrationPage butterflyEffectGuestRegistrationPage() {
        if (butterflyEffectGuestRegistrationPage == null) {
            butterflyEffectGuestRegistrationPage = new ButterflyEffectGuestRegistrationPage(_driver);
        }
        return butterflyEffectGuestRegistrationPage;
    }

    public ChangePasswordPage changePasswordPage() {
        if (changePasswordPage == null) {
            changePasswordPage = new ChangePasswordPage(_driver);
        }
        return changePasswordPage;
    }

    public ContactUsPage contactUsPage() {
        if (contactUsPage == null) {
            contactUsPage = new ContactUsPage(_driver);
        }
        return contactUsPage;
    }

    public ConversationsPage conversationsPage() {
        if (conversationsPage == null) {
            conversationsPage = new ConversationsPage(_driver);
        }
        return conversationsPage;
    }

    public CustomerFeedbackPage customerFeedbackPage() {
        if (customerFeedbackPage == null) {
            customerFeedbackPage = new CustomerFeedbackPage(_driver);
        }
        return customerFeedbackPage;
    }

    public DeparturePage departurePage() {
        if (departurePage == null) {
            departurePage = new DeparturePage(_driver);
        }
        return departurePage;
    }

    public DinningPage dinningPage() {
        if (dinningPage == null) {
            dinningPage = new DinningPage(_driver);
        }
        return dinningPage;
    }

    public EditProfilePage editProfilePage() {
        if (editProfilePage == null) {
            editProfilePage = new EditProfilePage(_driver);
        }
        return editProfilePage;
    }

    public FavouritesPage favouritesPage() {
        if (favouritesPage == null) {
            favouritesPage = new FavouritesPage(_driver);
        }
        return favouritesPage;
    }

    public FlightsInformationPage flightsInformationPage() {
        if (flightsInformationPage == null) {
            flightsInformationPage = new FlightsInformationPage(_driver);
        }
        return flightsInformationPage;
    }

    public GeneralPage generalPage() {
        if (generalPage == null) {
            generalPage = new GeneralPage(_driver);
        }
        return generalPage;
    }

    public GiveAComplimentPage giveAComplimentPage() {
        if (giveAComplimentPage == null) {
            giveAComplimentPage = new GiveAComplimentPage(_driver);
        }
        return giveAComplimentPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage(_driver);
        }
        return homePage;
    }

    public KeyInfoPage keyInfoPage() {
        if (keyInfoPage == null) {
            keyInfoPage = new KeyInfoPage(_driver);
        }
        return keyInfoPage;
    }

    public KulTerminalShuttleBusPage kulTerminalShuttleBusPage() {
        if (kulTerminalShuttleBusPage == null) {
            kulTerminalShuttleBusPage = new KulTerminalShuttleBusPage(_driver);
        }
        return kulTerminalShuttleBusPage;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(_driver);
        }
        return loginPage;
    }

    public LogoutPage logoutPage() {
        if (logoutPage == null) {
            logoutPage = new LogoutPage(_driver);
        }
        return logoutPage;
    }

    public MakeASuggestionPage makeASuggestionPage() {
        if (makeASuggestionPage == null) {
            makeASuggestionPage = new MakeASuggestionPage(_driver);
        }
        return makeASuggestionPage;
    }

    public PlanYourJourneyPage planYourJourneyPage() {
        if (planYourJourneyPage == null) {
            planYourJourneyPage = new PlanYourJourneyPage(_driver);
        }
        return planYourJourneyPage;
    }

    public PromotionsPage promotionsPage() {
        if (promotionsPage == null) {
            promotionsPage = new PromotionsPage(_driver);
        }
        return promotionsPage;
    }

    public RegisterComplaintPage registerComplaintPage() {
        if (registerComplaintPage == null) {
            registerComplaintPage = new RegisterComplaintPage(_driver);
        }
        return registerComplaintPage;
    }

    public SettingsPage settingsPage() {
        if (settingsPage == null) {
            settingsPage = new SettingsPage(_driver);
        }
        return settingsPage;
    }

    public SignupPage signupPage() {
        if (signupPage == null) {
            signupPage = new SignupPage(_driver);
        }
        return signupPage;
    }

    public SingleStorePage singleStorePage() {
        if (singleStorePage == null) {
            singleStorePage = new SingleStorePage(_driver);
        }
        return singleStorePage;
    }

    public SpecialAssistancePage specialAssistancePage() {
        if (specialAssistancePage == null) {
            specialAssistancePage = new SpecialAssistancePage(_driver);
        }
        return specialAssistancePage;
    }

    public StoresPage storesPage() {
        if (storesPage == null) {
            storesPage = new StoresPage(_driver);
        }
        return storesPage;
    }

    public TrackMyFlightPage trackMyFlightPage() {
        if (trackMyFlightPage == null) {
            trackMyFlightPage = new TrackMyFlightPage(_driver);
        }
        return trackMyFlightPage;
    }

    public UserProfilePage userProfilePage() {
        if (userProfilePage == null) {
            userProfilePage = new UserProfilePage(_driver);
        }
        return userProfilePage;
    }

    public VerifyEmailPage verifyEmailPage() {
        if (verifyEmailPage == null) {
            verifyEmailPage = new VerifyEmailPage(_driver);
        }
        return verifyEmailPage;
    }

    public WelcomePage welcomePage() {
        if (welcomePage == null) {
            welcomePage = new WelcomePage(_driver);
        }
        return welcomePage;
    }

    public ChooseAirportPopup chooseAirportPopup() {
        if (chooseAirportPopup == null) {
            chooseAirportPopup = new ChooseAirportPopup(_driver);
        }
        return chooseAirportPopup;
    }

    public EditPhotoPopup editPhotoPopup() {
        if (editPhotoPopup == null) {
            editPhotoPopup = new EditPhotoPopup(_driver);
        }
        return editPhotoPopup;
    }

    public LocationPopup locationPopup() {
        if (locationPopup == null) {
            locationPopup = new LocationPopup(_driver);
        }
        return locationPopup;
    }

    public MenuPopup menuPopup() {
        if (menuPopup == null) {
            menuPopup = new MenuPopup(_driver);
        }
        return menuPopup;
    }

    public YouAreNowTrackingPopup youAreNowTrackingPopup() {
        if (youAreNowTrackingPopup == null) {
            youAreNowTrackingPopup = new YouAreNowTrackingPopup(_driver);
        }
        return youAreNowTrackingPopup;
    }
}
