Feature: Verify Home Page Functionality

  @homePage
  Scenario: Verify that users are able to view all personalized menus
    Given the user is able to view flights, dining, essentials & services, shuttle bus, stores, and customer feedback in the first slide
    When the user clicks on the Next arrow button for the next slide
    Then the user is able to view online shopping, transportation, lounge, booking services, hotels, and bureau de change in the second slide
    When the user clicks on the Next arrow button for the next slide
    Then the user is able to view clinic, transfer counter, airline ticketing center, baggage reclaim, baggage locker, and information center in the last slide

  @flights
  Scenario Outline: Verify the Flights Functionality
    Given the user is on the Home Page
    When the user clicks on the Menu button from the Home Page
    Then the user should see the Menu popup appear over the Home Page
    And the user selects the Flights feature from the menu
    Then the user should land on the Flights Information Page
    And the user navigates between the Departure and Arrival toggle buttons
    And verifies that flights are loading according to the toggle buttons
    Then the user clicks on the dropdown to change the Terminals
    And verifies that <Terminal one> and <Terminal two> are displayed in the dropdown
    Then the user selects one of the terminals from the dropdown
    And verifies that flights are displaying according to the selected terminal
    Then the user searches for a flight based on the Flight Number
    And verifies that the flight is displayed according to the Flight Number
    Then the user searches for flights based on the Airline name
    And verifies that flights are displayed according to the Airline names
    Then the user clicks on the back button from the Flights Information Page
    And verifies that the user lands back on the Home Page
    Examples:
      | Terminal one          | Terminal two          |
      | KUL - KLIA Terminal 1 | KUL - KLIA Terminal 2 |