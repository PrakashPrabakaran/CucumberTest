Feature: This is the login feature for Orange HRMM
Scenario Outline: This is login scenario or else situations
Given Login pagee
When  user enters "<UserName>" and "<Password>"
And click on the submit buttons

Examples:
|UserName|Password|
|Admin   |admin123|
