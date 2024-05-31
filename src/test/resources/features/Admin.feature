Feature: Verify Access to HR Administration Panel


  Scenario: Verify Admin page
    Given User logins to OrangeHRM application
    When User Navigates to Admin
#    And User click the Add button

  @Smoke
  Scenario: Verify hr admin panel
    Given User logins to OrangeHRM application
    When User Navigates to Admin
    Then User should be able to access the HR Administration panel without any issues



#  Scenario: Add a new system user
#    Given User logins to OrangeHRM application
#    When User Navigates to Admin
#    And User click the Add button in the System Users section
#    And User select "ESS" from the "User Role" dropdown
#    And User enter "" in the "Username" field
#    And User select "Enabled" from the "Status" dropdown
#    And User enter "John Doe" in the "Employee Name" field
#    And User enter "password123" in the "Password" field
#    And User enter "password123" in the "Confirm Password" field
#    And User click the "Save" button
#    Then User should see "jdoe" in the system user list



