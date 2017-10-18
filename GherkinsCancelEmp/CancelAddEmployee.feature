Feature: Add Employee

Scenario: Manage Employees - Add Employee - Cancel
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Employees dropdown
Then Click Employees
Then Click Add Employee button
Then Supply fields with valid values
Then Click Cancel
Then Verify that user is redirected to Employees Screen
Then Close Browser