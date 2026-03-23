Feature: Manage profile functionality


Background: 
Given I have logged into the app
And I am at home page

Scenario: Addition of profile
When I click on add profile button
And I enter the data
Then Profile should get added

Scenario: Updation of profile
When I click on edit profile button
And I modify the data
Then Profile should get updated

Scenario: Deletion of profile
When I click on delete profile button
Then Profile should get deleted