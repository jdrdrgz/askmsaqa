Feature: Employee Management

Scenario: Employee Management - View Employees Page
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Employees dropdown
Then Click Employees
Then Verify that Employees Page is displayed
Then Verify that Employees header is displayed
Then Verify that Add Ship button is displayed
Then Verify that Active tab is present
Then Verify that Inactive tab is present
Then Verify that Show Entries option is displayed
Then Verify that Search field is displayed
Then Verify that Active Employees table is displayed
Then Verify that Name Column is present
Then Verify that Employee Number Column is present
Then Verify that Ship Column is present
Then Verify that Email Column is present
Then Verify that Date of Birth Column is present
Then Verify that Action Column is present
Then Verify that Bookings button is present
Then Verify that Edit button is present
Then Verify that Delete Button is present
Then Verify that pagination is present
Then Verify that the Number of entries shown label is present
Then Verify that Inactive Employees table is present
Then Close Browser