Feature: validating login functionality of adactin application
Scenario Outline: validating adastin with valid username and password
Given :user is on adactin
When : user is going to enter "<username>" and "<password>"
And :user should click login button
Then : user shpould verify by seeing the home page
Examples:
|username|password|
|dhineshdpn|2FM3EI|
|DHINESHCHARLS|HI HELLO|

 
