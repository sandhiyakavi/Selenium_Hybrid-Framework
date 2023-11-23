Feature: DuplicateLead Functionality
@DuplicateLead
Scenario Outline: duplicate lead in Leaftap

And Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on the login button
Then Welcomepage is displayed
When click on the CRM/SFA 'CRM/SFA' link
When Click on the 'Leads' link
When Click on the 'Find Leads' link
When Click on the phone link
When Enter the phone number as <phoneNumber>
When Click on Find leads button
When Click on the first entry from the result
When Click on the Duplicate button
When Click on the create Lead button
Then verify the lead is duplicated

Examples:
|phoneNumber|
|'91'|
|'81'|