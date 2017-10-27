Feature: Delete Employee

Scenario: Manage Employees - Delete Employee
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Employees dropdown
Then Click Employees
Then Click Delete button
Then Verify that a confirmation before deleting employee is displayed
Then Click Delete button on the confirmation dialog box
Then Verify that user is redirected to Employees Screen
Then Verify that employee deleted message is displayed
Then Close Browser