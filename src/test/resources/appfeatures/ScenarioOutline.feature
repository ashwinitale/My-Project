Feature: Signup functionality
 Scenario Outline: signup to application
 Given user is at signup page 
 When user enters name as "<name>" on thr form
 And user select gender as "<gender>"
 And user select the slotnumber <slotnumber>
 Then user gets created 
 
 Examples:
 | name | gender | slotnumber |
 | Eder | Male | 1 |
 | Ron | Male | 2 |
 | Diana | Female | 3 |
 | Alex | Male | 4 |