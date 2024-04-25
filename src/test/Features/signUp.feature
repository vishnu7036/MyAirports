Feature: User Signup Process

  Scenario Outline: Signup with Valid Information
    Given My Airports application is opened
    When the user clicks on the login or Signup button
    And the user navigates to the Login page
    Then proceeds to the Signup page by clicking on the signup button
    And the user is prompted to enter their <First Name>, <Last Name>, <Email ID>, and <Password>
    Then clicks on the Create Account button
    And the user account is successfully created
    Examples:
      | First Name | Last Name | Email ID                | Password |
      | Mind       | Graph     | vishnu.g@mind-graph.com | Mind@123 |