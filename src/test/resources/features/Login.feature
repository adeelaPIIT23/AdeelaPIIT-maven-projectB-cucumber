Feature: Login

Scenario: Login with valid credentials
    Given User is on the login page
    When User enters username "adeela_piitbootcamp2@gmail.com" and password "HybridF@123"
    Then User should be logged in successfully
