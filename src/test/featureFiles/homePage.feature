Feature: Verify Home Page Functionality

  @homePage
  Scenario: Verify that users are able to view all personalized menus
    Given the user is able to view flights, dining, essentials & services, shuttle bus, stores, and customer feedback in the first slide
    When the user clicks on the Next arrow button for the next slide
    Then the user is able to view online shopping, transportation, lounge, booking services, hotels, and bureau de change in the second slide
    When the user clicks on the Next arrow button for the next slide
    Then the user is able to view clinic, transfer counter, airline ticketing center, baggage reclaim, baggage locker, and information center in the last slide

  @flights @Ignore
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

  @menu @Ignore
  Scenario: Verify the menu button functionality
    Given the user is on the Home Page
    When the user clicks on the Menu button from the Home Page
    Then all the buttons should be displayed in the Menu

    When the user clicks on the SPECIAL ASSISTANCE feature in the Menu
    Then the user should be navigated to the SPECIAL ASSISTANCE Page
    When the user clicks on the Back button on the SPECIAL ASSISTANCE Page
    Then the user should be navigated back to the Home Page

    When the user clicks on the Menu button again
    And the user selects the FLIGHTS feature in the Menu
    Then the user should be navigated to the FLIGHTS Information Page
    When the user clicks on the Back button on the FLIGHTS Information Page
    Then the user should be navigated back to the Home Page

    When the user clicks on the Menu button again
    And the user selects the PROMOTIONS feature in the Menu
    Then the user should be navigated to the PROMOTIONS Page
    When the user clicks on the Back button on the PROMOTIONS Page
    Then the user should be navigated back to the Home Page

    When the user clicks on the Menu button again
    And the user selects the GENERAL feature in the Menu
    Then the user should be navigated to the GENERAL Page
    When the user clicks on the Back button on the GENERAL Page
    Then the user should be navigated back to the Home Page

    When the user clicks on the Menu button again
    And the user selects the KEY INFO feature in the Menu
    Then the user should be navigated to the KEY INFO Page
    When the user clicks on the Back button on the KEY INFO Page
    Then the user should be navigated back to the Home Page

    When the user clicks on the Menu button again
    And the user selects the FEEDBACK feature in the Menu
    Then the user should be navigated to the FEEDBACK Page
    When the user clicks on the Back button on the FEEDBACK Page
    Then the user should be navigated back to the Home Page

    When the user clicks on the Menu button again
    And the user selects the SETTINGS feature in the Menu
    Then the user should be navigated to the SETTINGS Page
    When the user clicks on the Back button on the SETTINGS Page
    Then the user should be navigated back to the Home Page

    When the user clicks on the Menu button again
    And the user selects the MY PROFILE feature in the Menu
    Then the user should be navigated to the MY PROFILE Page
    When the user clicks on the Back button on the MY PROFILE Page
    Then the user should be navigated back to the Home Page
