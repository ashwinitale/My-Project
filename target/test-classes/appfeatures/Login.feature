Feature: Login functionality
Scenario: Login to application with correct credentials
Given I am at the login page
When I enter the ussername
And I enter password
And I click on login button
Then I should be able to login


