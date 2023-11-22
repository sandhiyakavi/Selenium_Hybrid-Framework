Feature: EditLead Functionality

Scenario Outline: Edit  Companyname in Leads

And Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on the login button
Then Welcomepage is displayed
When click on the CRMSFA link
When click on the Leads link
When Click on the Find Leads link
When Click on the phone link
When Enter the phone number as <phoneNumber>
When Click on Find leads button
When Get the lead id from the first entry
When Click on the first entry from the result
When Click on the Delete button
When Click on the Find Leads link
Then verify the leadid is deleted

Examples:
|phoneNumber|
|'91'|
|'81'|