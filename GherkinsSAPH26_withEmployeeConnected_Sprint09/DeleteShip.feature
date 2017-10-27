Feature: Ship Management

Scenario: Manage Employees - Delete Ship with Employee
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Organization dropdown
Then Click Ships
Then Click Delete button
Then Verify that a message is displayed preventing deletion of Ship
Then Close warning message
Then Verify that user is redirected to Ships Screen
Then Close Browser