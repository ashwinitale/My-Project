Feature: opening bank account
Scenario: opening bank account with nominee
Given User is at accounts page
When user enters the following data
| Firsname | Lastname | Email | Phone |
| Erin | Smith | erin.smith@gmail.com | 9988776655 |
| Robert | Jackson | robert.jackson@gmail.com | 9876543210 |
And user clicks on submit button
Then user should get confirmation