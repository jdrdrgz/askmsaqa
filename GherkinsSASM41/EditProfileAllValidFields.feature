Feature: Manage VIP Profile

Scenario: Edit Profile - All fields are valid
Given Run Browser for Valid Fields
When Browser is up, load ASK MSA VIP login page for Valid Fields
Then Enter Username for Valid Fields
Then Enter Password for Valid Fields
Then Click Login button for Valid Fields
Then Click Profile dropdown for Valid Fields
Then Click Profile option for Valid Fields
Then Click Edit Profile button for Valid Fields
Then Enter Valid Values for All Valid Fields
Then Click Save Changes button for Valid Fields
Then Validate Successfully Saved Message is displayed for Valid Fields
Then Validate All Values are displayed correctly for Valid Fields
Then Revert All Values are displayed correctly for Valid Fields
Then Close Browser Driver for All fields are valid