Feature: Edit Employee

Scenario: Manage Employees - Edit Employee
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Employees dropdown
Then Click Employees
Then Click Edit Employee button
Then Supply fields with valid values
Then Click Save
Then Verify that user is redirected to Employees Screen
Then Verify that successful edit message is displayed
Then Close Browser