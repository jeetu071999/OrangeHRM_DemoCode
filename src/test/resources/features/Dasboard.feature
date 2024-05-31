Feature: Verify Access to Dashboard


  @Smoke
  Scenario: Verify Dashboard page
    Given User logins to OrangeHRM application
    When  User Navigates to Dashboard
    Then User should be able to access the Dashboard page without any issues


