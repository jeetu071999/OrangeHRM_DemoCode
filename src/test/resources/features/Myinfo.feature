Feature: Verify Access My Info

  Scenario Outline: Update MyInfo
    Given User logins to OrangeHRM application
    When User Navigates to Info
    And User Updates first name"<Name>" -->click save
    Then User Should see success message "<Message>"
    Examples:
      | Name  | Message |
      | Jeetu | Success |


