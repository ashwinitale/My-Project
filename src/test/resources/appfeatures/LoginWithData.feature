Feature: Login functionality validation with data
Scenario:Login with set of credentials
Given User should be at the login page
When User enters the username as "testuser"
And user enters the password as "Test@1234"
And user clicks on login 1 button
Then user should get logged into application