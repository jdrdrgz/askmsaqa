Feature: Ship Management

Scenario: Ship Management - View Ships
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Organization dropdown
Then Click Ships
Then Verify that Ships Page is displayed
Then Verify that Ships header is displayed
Then Verify that Add Ship button is displayed
Then Verify that Show Entries option is displayed
Then Verify that Search field is displayed
Then Verify that Ships table is displayed
Then Verify that Name Column is present
Then Verify that User Name Column is present
Then Verify that Contact Person Column is present
Then Verify that IMO Column is present
Then Verify that Division Column is present
Then Verify that Status Column is present
Then Verify that Actions Column is present
Then Verify that Edit button is present
Then Verify that Delete Column is present
Then Verify that pagination is present
Then Verify that the Number of entries shown label is present
Then Close Browser