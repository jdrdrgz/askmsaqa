Feature: Manage VIP Profile

Scenario: Edit Profile - Cancel Changes
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Profile dropdown
Then Click Profile option
Then Click Edit Profile button
Then Enter Valid Values on all Fields
Then Click Cancel button
Then Validate that the User was redirected to previous page
Then Validate that no changes was made
Then Close Browser Driver for All fields are valid