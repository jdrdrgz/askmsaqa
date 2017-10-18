Feature: Add Employee

Scenario: Manage Employees - Add Employee - Blank Values
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Employees dropdown
Then Click Employees
Then Click Add Employee button
Then Click Save
Then Verify that an error message is displayed
Then Close Browser