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
When Click on the first entry from the result
When Click on the Edit button
When Update the company name as <companyName>
When Click on the update button
Then Viewleadpage is displayed

Examples:
|phoneNumber|companyName|
|'98'|'Manulife'|
|'99'|'PayPay'|