Feature: Search Product

Scenario: Search for a product
    Given User is on the home page
    When User searches for "Samsung"
    Then User should see results for "Samsung"
