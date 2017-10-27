Feature: Add Ship

Scenario: Manage Employees - Add Ship - Cancel
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Organization dropdown
Then Click Ships
Then Click Add Ship button
Then Supply all required fields with valid values
Then Click Cancel
Then Verify that user is redirected to Ships Screen
Then Verify that Ship is not added in the table
Then Close Browser