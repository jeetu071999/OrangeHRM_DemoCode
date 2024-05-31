Feature: Verify Buzz page

  @regression @Smoke
  Scenario: Navigate to Buzz page and verify its accessibility
    Given User logins to OrangeHRM application
    When User navigate to the Buzz page
    Then User should see the Buzz page title
    And User Logout from application


  @Smoke
  Scenario Outline: Post a status update on the Buzz page
    Given User logins to OrangeHRM application
    When User navigate to the Buzz page
    And User post a status update with the message "<Message>"
    Then User should see the status update with the message "<Message>" in the feed
    And User Logout from application
    Examples:
      | Message                       |
      | Hello, this is a test update! |