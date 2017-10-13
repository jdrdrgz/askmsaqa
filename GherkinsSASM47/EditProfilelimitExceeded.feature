Feature: Manage VIP Profile

Scenario: Edit Profile - Exceed Character Limit
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Profile dropdown
Then Click Profile option 
Then Click Edit Profile button
Then Enter Values more than the character limit
Then Click Save button
Then Verify that correct error messages are displayed
Then Close Browser Driver