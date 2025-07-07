Feature: Complete user registration and login with OTP from Gmail

  Scenario: User completes full registration and logs in successfully

    Given User navigates to the registration page
    When User clicks on the "Register" button
    And User enters email "ajayshankarjeyaraman@gmail.com" and submits
    Then User should be navigated to OTP verification page

    When User retrieves OTP from Gmail and enters it
    And User enters full name "Ajay Shankar"
    And User enters username "ajay97"
    And User sets password "Password@123" and confirms password
    And User clicks on the Continue button
    Then User should be navigated to the company details page

    When User enters company name "AICTec PVt Ltd "
    And User enters registration number "123456789"
    And User enters phone number "9876543210"
    And User enters company email "ajayshankar@gmail.com"
    And User enters address "Coimbatore -6514"
    And User selects country "India"
    And User selects state "Tamil Nadu"
    And User selects city "Coimbatore"
    And User enters pincode "600402"
    And User enters total devices "5"
    And User clicks on the Submit button
    Then User should see the message "Account created successfully"

    When User logs in using username "ajay97" and password "Password@123"
    Then User should be redirected to the dashboard
