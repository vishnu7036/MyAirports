Feature: Verify all carousel slides on the home page

  @Butterfly
  Scenario: Verify the navigation flow of the Butterfly Effect carousel card
    Given the user selects the Butterfly Effect card from the carousel slides on the home page
    Then the Butterfly Page should be displayed
    And verify the presence of the back icon on the Butterfly Page

  @Butterfly
  Scenario: Verify successful user registration with valid credentials
    Given the user selects the Butterfly Effect card from the carousel slides on the home page
    Then the Butterfly Page should be displayed
    And the user clicks on the here link to navigate to the Register page
    Then the Butterfly Effect Guest Registration Page should be displayed
    And the user enters all valid credentials on the Butterfly Effect Guest Registration Page
    Then the user clicks on the Register button
    And verify the user is navigated to the Thank You page after entering all valid credentials