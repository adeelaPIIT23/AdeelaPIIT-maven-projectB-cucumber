Feature: Login

Scenario: Login with valid credentials
    Given User is on the login page
    When User enters username "testuser" and password "testpass"
    Then User should be logged in successfully
