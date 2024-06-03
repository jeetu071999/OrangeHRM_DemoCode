Feature: Verify OrangeHRM Login page

  @Smoke
  Scenario:Verify Login Page
    Given User logins to OrangeHRM application
    Then User Logout from application


  @Regression
  Scenario Outline: verify Login page
    Given User logins to OrangeHRM application with "<Username>" and "<Password>"
    Then User Logout from application
    Examples:
      | Username | Password |
      | Admin    | admin123 |

  @Manual
  Scenario Outline: verify Login page with BLANK INPUT
    Given User logins to OrangeHRM application with "<Username>" and "<Password>"
    Then User Logout from application
    Examples:
      | Username | Password |
      |          |          |







