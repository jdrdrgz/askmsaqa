Feature: Add Ship

Scenario: Manage Employees - Add Ship - Blank Values
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Organization dropdown
Then Click Ships
Then Click Add Ship button
Then Click Save
Then Verify that error messages are displayed
Then Verify that Ship is not added in the table
Then Close Browser