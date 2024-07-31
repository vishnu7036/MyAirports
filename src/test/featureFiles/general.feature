Feature: Verifying the General Page

  @general
  Scenario: Verify the About Page
    Given the user clicks on the user account from the homepage
    When the user clicks on the General button from the user profile page
    Then the General page should be displayed
    And the user clicks on the About button from the General page
    And the About page should be displayed
    Then the user clicks on the back icon from the About page
    And the user should be navigated back to the General page