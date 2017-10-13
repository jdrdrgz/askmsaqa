Feature: Edit Profile - Blank Fields

Scenario: Edit Profile - Blank Fields 
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Profile dropdown
Then Click Profile option
Then Click Edit Profile button
Then Set All Fields Blank
Then Click Save Changes button
Then Validate Error Messages for Blank Fields are displayed
Then Close Browser Driver for Blank First Name