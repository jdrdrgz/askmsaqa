Feature: Add Employee

Scenario: Manage Employees - Add Employee - Valid Values
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Employees dropdown
Then Click Employees
Then Click Add Employee button
Then Supply all required fields with valid values
Then Click Save
Then Verify that Employee added successfully message is displayed
Then Verify that user is redirected to Employees Screen
Then Verify that employee is added in the table
Then Close Browser