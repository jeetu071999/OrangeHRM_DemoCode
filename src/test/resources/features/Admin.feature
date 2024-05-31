Feature: Verify Access to HR Administration Panel


  @Smoke
  Scenario: Verify hr admin panel
    Given User logins to OrangeHRM application
    When User Navigates to Admin
    Then User should be able to access the HR Administration panel without any issues
    And User Logout from application






