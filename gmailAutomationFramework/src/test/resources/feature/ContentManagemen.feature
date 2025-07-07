
Feature: User creates My Content in Content Management

 
  Scenario Outline: Create and upload new media content
    Given User navigates to wejha application
    When User enters login username "<Username>" and password "<LoginPassword>"
    And User clicks the Login button
    Then User should reach the Dashboard page
    And User clicks the Content Management button
    And User clicks My Content
    And User clicks the New Content button
    Then User click "+" button to Upload the photo
    And Click the Portrait options
    And User Enter the Media tags "<MediaTags>"
    Then the user click audience preference
    And user click the male text
    And user select result as all
    And user add the upload button

    Examples:  
      | Username                  | LoginPassword | MediaTags     |
      | ajayshankarj123@gmail.com | Ashankar@918  | automationTag |
