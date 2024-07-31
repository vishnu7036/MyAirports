Feature: Verify all carousel slides on the home page

  @butterflyEffect
  Scenario: Verify the navigation flow of the Butterfly Effect carousel card
    Given the user selects the Butterfly Effect card from the carousel slides on the home page
    Then the Butterfly Page should be displayed
    And verify the presence of the back icon on the Butterfly Page
    Then click on back icon on the Butterfly Page
    And Verify that the user is redirected to the Home Page

  @butterflyEffect
  Scenario: verify user successfully Register with Valid credentials using the Butterfly Effect carousel card
    Given the user selects the Butterfly Effect card from the carousel slides on the home page
    Then the Butterfly Page should be displayed
    And the user clicks on the here link to navigate to the Register page
    Then the Butterfly Effect Guest Registration Page should be displayed
    And the user enters all valid credentials on the Butterfly Effect Guest Registration Page
    Then the user clicks on the Register button
    And verify the user is navigated to the Thank You page after entering all valid credentials

  @trackMyFlight
  Scenario: Add a flight to the Flights Carousel Card and verify its addition
    Given verify the user is on the Home Page
    When the user clicks on the Flights button on the Home Page
    And selects a flight then the user clicks on the Track My Flight button to track the flight
    And navigates back to the Home Page
    Then the user clicks on the Flights carousel card on the Home Page
    And verifies that the flight has been added to the My Flights page

  @planMyJourney
  Scenario: Add a Arrival flight to the Plan My Journey Carousel Card and verify its validation
    Given verify the user is on the Home Page
    When the user clicks on the PLAN MY JOURNEY Carousel card on the Home Page
    Then verify the user lands on the PLAN MY JOURNEY page
    Then click on the Search text field on the Plan Your Journey page
    And verify it navigates to the FLIGHTS INFORMATION page
    Then track any one of the flights and verify the same flight is added to the PLAN MY JOURNEY page
    Then click on the Stores, Dining, and Booking Service buttons on the PLAN MY JOURNEY page and verify each button navigates to their individual pages
    Then verify the Share Flight Details button and Remove Flight button are visible on the PLAN MY JOURNEY page
    And click on the Remove Flight button
    And verify a confirmation popup is displayed to confirm removal
    Then click on the Yes button to remove the flight from the PLAN MY JOURNEY page
    Then verify it navigates to the Home Page after clicking the Yes button to remove the flight

  @Promotions
  Scenario: Verify the navigation flow of the Promotions carousel card
    Given verify the user is on the Home Page
    When the user clicks on the Promotions Carousel card on the Home Page
    Then the user lands on the Promotions page
    And the Search text field and Terminal dropdown is displayed on the Promotions page
    Then the user is able to change the Terminal
    And the user clicks on any one of the banners on the Promotions page
    Then the user navigates to the same Promotions page
    And the back button is displayed on the selected banner page
    Then the user clicks on the back button and navigates to the Promotions page
    Then the back button is displayed on the Promotions page
    And the user clicks on the back button from the Promotions page and lands on the Home Page



