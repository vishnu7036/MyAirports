Feature: User Profile Page Validations

  @camera
  Scenario: Verify Camera Popup Window UI Validations
    Given the user clicks on the User Profile button on the homepage
    Then the user clicks on the Camera Icon on the User Profile page
    And verify all buttons in the Edit Photo popup window
    Then the user clicks on the Close button in the Edit Photo popup window

  @password
  Scenario: User changes password successfully
    Given the user clicks on the User Profile button on the homepage
    Then the user clicks on the Settings button on the User Profile page
    Then the user lands on the Settings page
    And the user clicks on the Change Password button on the Settings page
    Then the user lands on the Change Password page
    And the user enters the Current Password, New Password, and Re-enter Password for password change
    Then the user clicks on the Save button
    And a Password Change Successful popup appears
    Then the user closes the popup and logs out of the application
    And the user logs in again with the new password
    Then the user is able to successfully log in with the new credentials

  @contactUs
  Scenario: Verify the Contact Us button functionality
    Given the user clicks on the User Profile button on the homepage
    Then the user clicks on the General button from the User Profile page
    And the user lands on the General page
    Then the user clicks on the Contact Us button
    And the user lands on the Contact Us page
    Then the user clicks on the contact number
    And the user verifies that it takes them to the dial pad
    And the user returns from daily pad to the application and verifies the Contact Us page
    Then the user clicks on Email
    And the user verifies that it takes them to the email application
    And the user returns from Gmail to the application and verifies the Contact Us page
    Then click on back icon from Contact Us page
    And verify the user lands on General Page

  @editProfile
  Scenario: Validate Edit Functionality in User Profile Page
    Given the user clicks on the User Profile button on the homepage
    Then the user clicks on the Edit icon
    And changes the First Name of the user from the Edit Profile Page and Save
    Then clicks on the Back icon from the Edit Profile Page
    And verifies that the user name has been changed in the User Profile Page


