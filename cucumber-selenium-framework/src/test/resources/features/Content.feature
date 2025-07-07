Feature: User validates the Wejha application

  @smoke
  Scenario Outline: Valid login and content creation
    Given User navigates to the Wejha application
    When User enters login username "<Username>" and password "<LoginPassword>"
    And User clicks the Login button
    Then User should be navigated to the Dashboard page
    When User clicks the Content Management button
    And User enters values in the New Content form
    And User uploads the file
    And User selects the Landscape radio button
    And User clicks the Upload button
    Then User should see the new content created successfully

    Examples:
      | Username                   | LoginPassword |
      | ajayshankarj123@gmail.com | Ashankar@918  |
