Feature: Logout

Scenario: Logout from the application
    Given User is logged in
    When User clicks on the logout button
    Then User should be logged out successfully
