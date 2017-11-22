Feature: Regular Booking via VIP 

Scenario: Add Booking for Multiple Employees
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Course Bookings
Then Click Book a Course button
Then Select A Course
Then Verify that Location Drop Down is Enabled
Then Select a Location
Then Verify that Course Dates Drop Down is Enabled
Then Select a Course Date
Then Verify that On-Board check box is NOT ticked
Then Select an Employee with registered email address and click Add to List button
Then Select another Employee with registered email address and click Add to List button
Then Tick Email Booking Details checkbox if available
Then Click Add Booking button
Then Verify that user is redirected to Booking page
Then Verify that successful booking message is displayed
Then Verify that successful booking message is correct
Then Verify that Booking is added in the table
Then Close Browser