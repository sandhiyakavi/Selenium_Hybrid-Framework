@LoginTest
Feature: Leaftaps Login functionality

Scenario: Login with Positive Credentials

And Enter the username as 'Demo'
And Enter the password as 'Demo'
When click on the login button
Then Welcomepage is displayed
