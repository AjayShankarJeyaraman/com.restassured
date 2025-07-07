@MyContent
Feature: User creates My Content in Content Management

  @UploadMedia
  Scenario Outline: Create and upload new media content
    Given User navigates to wejha application
    When User enters login username "<Username>" and password "<LoginPassword>"
    And User clicks the Login button
    Then User should reach the Dashboard page
    And User clicks the Content Management button
    And User clicks My Content
    And User clicks the New Content button
    And User uploads media via Upload button
    Then User clicks the Continue button
    And User enters the description "<Description>" and media tags "<MediaTags>"
    And User clicks the Upload button

    Examples:  
      | Username                  | LoginPassword | Description | MediaTags     |
      | ajayshankar918@gmail.com  | Ashankar@918  | Automated-1 | automationTag |
