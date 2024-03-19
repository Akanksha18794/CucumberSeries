Feature: Home Page Feature

Background:
Given user has already logged in to application
|username|password|
|akanksha18794@gmail.com|Test@123|

Scenario: HomePage Title
Given user is on Home page
Then user gets the title of the home page
Then page title should be "Cogmento CRM"

Scenario: HomePage section count
Given user is on Home page
Then user gets the home page section
|Home|
|Calender|
|Contacts|
|Companies|
|Deals|
|Tasks|
|Cases|
|Calls|
|Documents|
|Email|
|Campaigns|
|Forms|
|Reports|
And Homepage section count should be 13



