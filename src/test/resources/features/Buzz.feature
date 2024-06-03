Feature: Verify Buzz page and its Functionality.

  @Regression @Smoke
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

  @Regression
  Scenario Outline: Post a message on the Buzz page with 500 character message
    Given User logins to OrangeHRM application
    When User navigate to the Buzz page
    And User post a status update with the message "<Message>"
    Then User should see the status update with the message "<Message>" in the feed
    And User Logout from application
    Examples:
      | Message                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
      | It says I need to type at least ten characters, so here's this. Y'know what? I'm gonna type one hundred characters instead. Actually, I'm going to type five hundred characters. I'm definitely not going to type anywhere near one thousand characters, because that'd be ridiculous. Even if I wanted to type one thousand characters, I have to go to bed now anyway, so I simply don't have the time. I mean, I could just type a bunch of random letters or hold down one key, but that would be no fun at all. |