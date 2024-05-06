Feature: Login and Logout Functionality

  Background: Enter Login Credentials
    Given the user launches the My Airports application
    When the user clicks on the login or signup button
    Then the user navigates to the login page
    And enters their email Id and password
    Then clicks on the login button
    And enables the location

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

