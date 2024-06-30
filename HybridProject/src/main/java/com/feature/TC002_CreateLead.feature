Feature: CreateLead Functionality

Scenario Outline: CreateLead with mandatory fields

#Given Launch the browser
#And Load the url
And Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on the login button
Then Welcomepage is displayed
When click on the CRMSFA link
When click on the Leads link
When click on the Create Lead link
When Enter the company name as <companyName>
When Enter the first name as <firstName>
When Enter the last name as <lastName>
When click on create button
Then Viewleadpage is displayed

Examples:
|companyName|firstName|lastName|
|'Wipro'|'Dharani'|'S'|
|'Topcoder'|'Sandhiya'|'S'|
