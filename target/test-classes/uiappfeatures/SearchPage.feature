Feature: Search functionality

@functional
Scenario: search mobile through home page
Given user is at landing page
When user search the "mobile" in text field
Then mobile search results should displayed 