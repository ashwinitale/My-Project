Feature: Homepage functionality

@sanity
Scenario: verify title of page
Given user is at landing page
Then page title should conatain "Shopping"

@regression
Scenario: verify cart icon is displaying
Given user is at landing page
Then cart icon should displayed

@functional
Scenario: checkout the deal section
Given user is at landing page
When user click on deals
Then user should redirect to deal page