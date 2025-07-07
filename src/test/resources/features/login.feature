Feature: Login Functionality
  As a user
  I want to be able to log in to the application
  So that I can access my account

  @smoke @login
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    Then I should be logged in successfully
    And I should see the dashboard

  @login
  Scenario: Failed login with invalid credentials
    Given I am on the login page
    When I enter invalid username and password
    And I click on the login button
    Then I should see an error message
    And I should remain on the login page 