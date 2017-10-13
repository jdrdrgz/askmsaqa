Feature: Add Mult Employee

Scenario: Manage Employees - View Employees
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Employees dropdown
Then Click Employees
Then Click Add Employee button
Then Supply all required fields with valid values multiple times and click Save
Then Close Browser