Feature: Add to Cart

Scenario: Add a product to the cart
    Given User is on the product page for "Samsung"
    When User adds the product to the cart
    Then The product should be added to the cart successfully
