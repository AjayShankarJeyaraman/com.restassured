Feature: User Registration and Login on Wejha Application

  Scenario Outline: Complete registration and login flow on Wejha
    Given User navigates to wejha application 
    When User clicks on the "Register" button
    And User enters email "<Email>" and clicks Send OTP
    And User navigates to Gmail and retrieves the OTP
    And User enters the retrieved OTP in the OTP field
    And User clicks the Submit button after entering OTP
    Then User should be navigated to the Create Account page
    When User enters full name "<FullName>" and "<UserName>"   # FIXED PARAMETER
    And User sets password "<Password>" and confirm password "<ConfirmPassword>"
    And User clicks the Continue button on personal details page
    Then User enters company name "<CompanyName>", registration number "<RegNumber>", phone "<Phone>", email "<CompanyEmail>", and address "<Address>"
    And User selects country as India
    And User selects state as Tamilnadu
    And User selects city as Coimbatore
    And User enters pincode "<PinCode>"
    And User selects employee count option "250+"
    And User clicks the Submit button on company details page
    Then User sees account creation confirmation popup and is navigated to the login page
    When User enters login username "<Username>" and password "<LoginPassword>"
    And User clicks the Login button
    Then User should be logged in successfully

    Examples:
      | Email           | FullName     | UserName | Password  | ConfirmPassword | CompanyName | RegNumber | Phone       | CompanyEmail       | Address          | PinCode | Username                  | LoginPassword |
      | ajay@gmail.com  | Ajay Shankar | Ajay     | Test@123  | Test@123        | AjayCorp    | 987654321 | 9876543210  | info@ajaycorp.com  | 123, Street Name | 641001  | ajayshankar918@gmail.com  | Ashankar@918  |
