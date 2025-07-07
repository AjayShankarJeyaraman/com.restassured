   Feature: User creates a device in Device Management

  Scenario Outline: Create a Device in Device Management
    Given User navigates to wejha application
    When User enters login username "<Username>" and password "<LoginPassword>"
    And User clicks the Login button
    Then User should reach the Dashboard page
    And User clicks the Device Management button
    Then User clicks the Signage Device button
    And User clicks the New Signage Device button
    And User selects the Facility name
    And User enters the Device Name as "<DeviceName>"
    And User enters the Device ID as "<DeviceId>"
    And User clicks the Create button

  Examples:
    | Username                 | LoginPassword | DeviceName          | DeviceId     |
    | ajayshankar918@gmail.com | Ashankar@918  | Main Headquarters   | 12345        |