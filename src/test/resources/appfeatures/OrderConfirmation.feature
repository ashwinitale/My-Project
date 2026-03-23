Feature: Placing order validation
Scenario: Order confirmation post to product addition
Given I should be at the product page
When I click on aad to cart button
Then product should get added to cart
When I click on place order
Then order should get placed