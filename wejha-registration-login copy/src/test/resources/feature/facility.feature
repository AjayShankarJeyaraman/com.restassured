  Feature: User Creates Facilities in Facility Management

  Scenario Outline: Create a new facility with location details
    Given User navigates to wejha application
    When User enters login username "<Username>" and password "<LoginPassword>"
    And User clicks the Login button
    Then User should reach the Dashboard page
    And User clicks on Facility Management
    And User clicks on Facilities
    And User clicks the "New Facility" button
    When User uploads facility image from "<ImagePath>"
    And User enters facility name as "<FacilityName>"
    And User enters facility ID as "<FacilityID>"
    And User enters facility description as "<Description>"
    And User selects time zone as "<TimeZone>"
    And User selects country as "<Country>"
    And User selects state as "<State>"
    And User selects city as "<City>"
    And User enters pincode as "<Pincode>"
    And User Enters area as "<Area>"
    And User enters latitude as "<Latitude>"
    And User enters longitude as "<Longitude>"
    And User enters zone as "<Zone>"
    And User clicks the "Create Facility" button
    Then User should see "<FacilityName>" in facilities list

    Examples:
      | Username                  | LoginPassword | ImagePath                             | FacilityName       | FacilityID | Description          | TimeZone      | Country | State     | City        |  Area           |Pincode  | Latitude | Longitude | Zone  |
      | ajayshankar918@gmail.com  | Ashankar@918  | /Users/agmac26/Downloads/facility.png | Main Headquarters  | FAC-001    | Primary office       | Asia/Kolkata  | India   | Tamilnadu | Coimbatore  |  Sulur          |641001   | 11.0168  | 76.9558   | East  |
      