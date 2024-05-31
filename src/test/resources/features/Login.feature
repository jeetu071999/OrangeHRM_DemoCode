Feature: Verify OrangeHRM Login page

  @Smoke
  Scenario:Verify Login Page
    Given User logins to OrangeHRM application
    Then User Navigates to Userprofile --> Logout
#     User logout from application


  @Smoke @Regression
  Scenario Outline: verify Login page
    Given User logins to OrangeHRM application with "<Username>" and "<Password>"
    Examples:
      | Username | Password |
      | Admin    | admin123 |









