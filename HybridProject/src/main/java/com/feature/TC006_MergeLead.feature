Feature: MergeLead Functionality
@MergeLead
Scenario: merge lead in Leaftap

And Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on the login button
Then Welcomepage is displayed
When click on the CRM/SFA 'CRM/SFA' link
When Click on the 'Leads' link
When Click on the 'Merge Leads' link
When Click on the From Lead icon
When Go to the lead window
When Enter the First name as 'Vidhya' in the Lead Window
When Click on Find leads button in the lead window
When Click on the first entry from the result in the lead window
When move to main window
When Click on the To Lead icon
When Go to the lead window
When Enter the First name as 'babu' in the Lead Window
When Click on Find leads button in the lead window
When move to main window
When Click on the Merge button
When Click ok in the alert displayed
Then verify the leads are merged