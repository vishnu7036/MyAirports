Feature: Login and Logout Functionality

  @login
  Scenario: Verify Successful Login with Valid Credentials
    Then the user successfully navigates to the Home page

  @login
  Scenario: Logout Functionality
    And the user clicks on the user account
    Then the user navigates to the user profile page
    And clicks on the Logout button
    Then the user navigates to the Logout page
    And clicks on the Yes button to Logout
    Then navigates to the home page with successfully logged out

