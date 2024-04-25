Feature: Validating Login Functionality

  Scenario Outline: Verify Successful Login with Valid Credentials
    Given the My Airports application is opened
    When the user clicks on the login button
    Then the user navigates to the login page
    And enters their <email Id> and <password>
    Then the user successfully navigates to the Home page

    Examples:
      | email Id                | password   |
      | iotuatproject@gmail.com | IOTuat@123 |