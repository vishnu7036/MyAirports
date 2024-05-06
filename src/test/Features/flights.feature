Feature: Validate the functionality of Flights flow
  @flight
  Scenario: Verify that all functionalities are working fine in FLIGHTS
    Given open the My airports app from the mobile device
    When Click on the Login button in splash screen
    And Give the login credentials and click on the Submit button
    And Access the Location
    Then click on the Flights icon in the landing page
    Then click on Arrival toggle button in the FLIGHT INFORMATION page
    And click on Departure toggle button in the FLIGHT INFORMATION page
    Then change the terminal by clicking on dropdown button
    And select any flight from available flights for Departure
    Then click back arrow in Departure page
    Then click on Arrival toggle button in the FLIGHT INFORMATION page
    And select any flight from available flights for Arrival
    Then verify the Note message in Arrival page
    Then click back arrow in Arrival page
    Then click on the Get previous Flights link User can see accordingly
    And click on back arrow in FLIGHT INFORMATION page
    Then close the mobile app