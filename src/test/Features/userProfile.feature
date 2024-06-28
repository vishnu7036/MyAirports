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

  @favourites
  Scenario: Verify the navigation flow of the Favorites Page
    Given the user clicks on the User Profile button on the homepage
    Then the user clicks on the Favorites icon
    And verifies that the user lands on the Favorites page
    Then clicks on any one of the favorite items, such as Convenience Store, ATM Machine, etc., from the Favorites Page
    And verifies that the user navigates to the selected favorite item page
    Then clicks on the Back button from the store page
    And verifies that the user lands on the Favorites page
    And clicks on the Back button from the Favorites page
    Then verifies that the user lands on the User Profile page

  @customerFeedback
  Scenario: Verify the navigation flow of the Feedback Page
    Given the user clicks on the User Profile button on the homepage
    When the user clicks on the Feedback icon
    Then the user should land on the Feedback Page
    And all buttons present on the Feedback Page should be verified
    When the user clicks on the File a Complaint button
    Then the user should land on the Terminal Page
    When the user clicks on the Previous button on the Terminal Page
    Then the user should be navigated back to the Feedback Page
    When the user clicks on the Make a Suggestion button again
    Then the user should land on the Terminal Page
    When the user clicks on the Previous button on the Terminal Page
    Then the user should be navigated back to the Feedback Page
    When the user clicks on the Give a Compliment button again
    Then the user should land on the Terminal Page
    When the user clicks on the Previous button on the Terminal Page
    Then the user should be navigated back to the Feedback Page
    When the user clicks on the Close icon from the Customer Feedback Page
    Then the user should land back on the User Profile page

  @giveCompliment
  Scenario: User verifies the Give A Compliment button functionality
    Given the user clicks on the User Profile button on the homepage
    When the user clicks on the Feedback icon
    Then the user should land on the Feedback Page
    And the user clicks on the Give a Compliment button
    Then the user clicks on any one of the terminals on the Terminal Page
    And the user should land on the Give A Compliment Page
    When the user gives a compliment
    And clicks on the Submit button
    Then the user should see the Thank You For Your Compliment popup
    And closes the popup
    Then the user should land back on the Home Page

  @makeSuggestion
  Scenario: User verifies the Make A Suggestion button functionality
    Given the user clicks on the User Profile button on the homepage
    When the user clicks on the Feedback icon
    Then the user should land on the Feedback Page
    And the user clicks on the Make A Suggestion button
    Then the user clicks on any one of the terminals on the Terminal Page
    And the user should land on the Make A Suggestion Page
    When the user gives a Suggestion
    And clicks on the Submit button
    Then the user should see the Thank You For Your Valuable Suggestion Popup
    And closes the popup
    Then the user should land back on the Home Page
