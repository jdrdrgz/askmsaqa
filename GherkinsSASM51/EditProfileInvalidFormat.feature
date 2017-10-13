Feature: Manage VIP Profile

Scenario: Edit Profile - Invalid Field Format
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Profile dropdown
Then Click Profile option
Then Click Edit Profile button
Then Enter Invalid values 
Then Click Save Changes button
Then Validate Error Message
Then Close Browser Driver