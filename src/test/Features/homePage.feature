Feature: Verify Home Page Functionality
  @homePage
  Scenario: Verify that users are able to view all personalized menus
    Given the user is able to view flights, dining, essentials & services, shuttle bus, stores, and customer feedback in the first slide
    When the user clicks on the Next arrow button for the next slide
    Then the user is able to view online shopping, transportation, lounge, booking services, hotels, and bureau de change in the second slide
    When the user clicks on the Next arrow button for the next slide
    Then the user is able to view clinic, transfer counter, airline ticketing center, baggage reclaim, baggage locker, and information center in the last slide
