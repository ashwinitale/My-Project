Feature: Signup functionality
Scenario: signup to the applicatin
Given user at the signup page
When user enters the name as username "testuser"
And user enters the password as "Test@12"
And user clicks on the login 1.55 button
Then user should get logged into applicationS