Feature: View Employee

Scenario: Manage Employees - View Employees
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Employees dropdown
Then Click Employees
Then Verify Employees Header exists
Then Verify Add Employee button exists
Then Verify that Active tab exists
Then Verify that Inactive tab exists
Then Verify that Active Employees Table exists and working
Then Verify that Inactive Employees Table exists and working
Then Verify that a message is displayed on the table if no employees exists
Then Verify that Show Entries is present
Then Verify that Search field is present
Then Verify that Name column is present
Then Verify that Employee Number column is present
Then Verify that Ship column is present
Then Verify that Email column is present
Then Verify that Date of Birth column is present
Then Verify that Action Column is present
Then Verify that Edit button is present if employees table is not empty
Then Verify that Delete button  is present if employees table is not empty
Then Close Browser