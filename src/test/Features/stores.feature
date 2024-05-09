Feature: Validate the Functionality of stores flow

  @Stores
  Scenario: Verify that all functionalities are working fine in Stores
    Given the user clicks on the Stores button on the home page
    Then the user navigates to the Stores page
    And clicks on the terminal dropdown to change the terminal in the Stores page
    Then clicks on any of the Stores from the Stores list
    And verifies that the user navigates to the same Stores page
    Then clicks on the favorite to add to favorites
    Then verifies the Rating Review text in the POI details page
    Then verifies the Take Me There text in the POI details page
    And verifies the back arrow icon in the POI details page
    And clicks on the back arrow icon in the POI details page
    Then verifies that the Stores page is displayed
    And verifies the back arrow icon in the Stores page and clicks on the back arrow icon
    Then verifies that it takes the user to the home page