Feature: Placing order validation
Scenario: Order confirmation post to product addition
Given I should be at the product page1
When I click on aad to cart button1
Then product should get added to cart1
When I click on place order1
Then order should get placed1

Scenario: Validate the confirmation message of order
Given product is already added to cart 
When I place the order
Then order confirmation message should displyed