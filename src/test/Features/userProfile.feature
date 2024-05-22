Feature: User Profile Page Validations
  @camera
  Scenario: Verify Camera Popup Window UI Validations
    Given the user clicks on the User Profile button on the homepage
    Then the user clicks on the Camera Icon on the User Profile page
    And verify all buttons in the Edit Photo popup window
    Then the user clicks on the Close button in the Edit Photo popup window