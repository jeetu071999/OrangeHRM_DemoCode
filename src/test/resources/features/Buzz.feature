Feature: Verify Buzz page
#  Scenario: Navigate to Buzz page and verify its accessibility
#    Given User logins to OrangeHRM application
#    When User navigate to the Buzz page
#    Then User should see the Buzz page title


  @Smoke
  Scenario Outline: Post a status update on the Buzz page
    Given User logins to OrangeHRM application
    When User navigate to the Buzz page
    And User post a status update with the message "<Message>"
    Then User should see the status update with the message "<Message>" in the feed
    Examples:
      | Message                       |
      | Hello, this is a test update! |