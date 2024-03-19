Feature: Login page feature

Scenario: Login Page Title
Given user is on login page
When user gets the title of the page
Then login page title should  be "#1 Free CRM Power Up your Entire Business Free Forever"

Scenario: Forgot Password Link
Given user is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
Then user clicks on LogIn button
When user enters username "akanksha18794@gmail.com"
And user enters password "Test@123"
And user clicks on signin button
Then user gets the title of the home page
And page title should be "Cogmento CRM"
