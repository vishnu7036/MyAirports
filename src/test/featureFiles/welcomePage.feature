Feature:Language Selection Functionality and UI Validation on the Welcome Screen

  @welcome
  Scenario: Verify Presence of Links and Buttons on the Welcome Page
    Given the user launches the application
    Then the user should be able to view the Malaysia Airports logo
    And the user should initially see all buttons and links in English language

  @welcome
  Scenario: Verify User's Ability to Change Language
    When the user clicks on BAHASA MALAYSIA in the Welcome Page
    And verifies that the app language changes in MALAYSIA language
    Then the user clicks on CHINESE in the Welcome Page
    And verifies that the app language changes in CHINESE language
    And the user clicks on ENGLISH in the Welcome Page
    Then verifies that the app language changes in ENGLISH language