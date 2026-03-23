Feature: Order Information
Scenario: fetech current placed order details
Given User is at orders page
When User click on order button
And User click on current order
Then User should see current order details

Scenario: fetech previously placed order details
Given User is at orders page
When User click on order button
And User click on order history
Then User should see previous order details

Scenario: fetch the cancelled order deatils
Given User is at orders page
When User click on order button
And User click on cancel order button
Then User should see cancelled order details