Feature: Ship Management

Scenario: Manage Employees - Delete Ship without Employee
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Organization dropdown
Then Click Ships
Then Click Delete button
Then Verify that a confirmation message is displayed
Then Click Delete
Then Verify that user is redirected to Ships Screen
Then Verify that ship has been deleted
Then Close Browser