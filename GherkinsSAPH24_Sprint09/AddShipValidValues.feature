Feature: Add Ship

Scenario: Manage Employees - Add Ship - Valid Values
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Organization dropdown
Then Click Ships
Then Click Add Ship button
Then Supply all required fields with valid values
Then Click Save
Then Verify that Ship was added successfully message is displayed
Then Verify that user is redirected to Ships Screen
Then Verify that Ship is added in the table
Then Close Browser