
Feature: Sending email Campaign 
@sanity
Scenario:  Create campaign 
Given user should be at the campaign page
When User click on the create campaign
And User enetrs the information
When Campaign should get created

@regression
Scenario: Campaign Shedule
Given user should be at the campaign page
When User click on the shedule campaign
And User enetrs sheduled time 
When Campaign should get sheduled

@functional
Scenario: Validate sent Campaign 
Given user should be at the campaign page
When User click on the send campaign
When Campaign should see the sent count of email 