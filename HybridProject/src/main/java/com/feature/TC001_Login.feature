@LoginTest
Feature: Leaftaps Login functionality

Scenario: Login with Positive Credentials

And Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on the login button
Then Welcomepage is displayed
