Feature: Ship Management

Scenario: Manage Employees - Edit Ship
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Organization dropdown
Then Click Ships
Then Click Edit button
Then Change fields with valid values
Then Click Save
Then Verify that Ship was updated successfully message is displayed
Then Verify that user is redirected to Ships Screen
Then Verify that Ship is updated in the table
Then Close Browser