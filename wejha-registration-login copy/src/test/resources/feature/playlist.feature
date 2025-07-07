Feature: User creates Playlist in Content Management

  Scenario Outline: Create a new playlist from uploaded media
    Given User navigates to wejha application
    When User enters login username "<Username>" and password "<LoginPassword>"
    And User clicks the Login button
    Then User should reach the Dashboard page
    And User clicks the Content Management button
    And User clicks My Content
    And User clicks the New Playlist button
    And User enters playlist name "<PlaylistName>" and description "<Description>"
    Then User selects all uploaded media
    And User clicks the Playlist Continue button

    Examples:
      | Username                  | LoginPassword | PlaylistName | Description |
      | ajayshankar918@gmail.com  | Ashankar@918  | Playlist_1   | Automated-1 |