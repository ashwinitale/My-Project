Feature: opening bank account
Scenario: opening bank account with nominee
Given User is at the accounts page
When User enters the following data
| Firstname | Lastname | Email | Phone |
| Ashwini | Tale | taleashwini@gmail.com | 9876543210 |
| Shrisha | Tale | taleshrishu@gmail.com | 1234567890 |
And User click on the submit button
Then User should get confirmation