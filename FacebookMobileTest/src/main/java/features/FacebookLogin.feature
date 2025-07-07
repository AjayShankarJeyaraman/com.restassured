Feature: Facebook Login

  Scenario: Valid login
    Given Facebook app is launched
    When user enters valid "testuser@example.com" and "testpassword"
    Then user should be logged in successfully
