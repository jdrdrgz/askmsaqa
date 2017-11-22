Feature: Regular Booking via VIP 

Scenario: Add Booking - View Add Booking Page
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Course Bookings
Then Click Book a Course button
Then Verify that Book a Course module is displayed
Then Verify that Book a Course header is displayed
Then Verify that Course Drop Down is displayed
Then Verify that Location Drop Down is displayed
Then Verify that Location Drop Down is disabled
Then Verify that Course Dates Drop Down is displayed
Then Verify that Course Dates Drop Down is disabled
Then Verify that Comments is displayed
Then Verify that On-Board checkbox is displayed
Then Verify that Employees drop down is displayed
Then Verify that Add to List button is present
Then Verify that Employee Participants table is displayed
Then Verify that Add Booking button is displayed
Then Verify that Cancel button is displayed
Then Verify that Name Column is present
Then Verify that Email Booking Detail is present
Then Verify that Actions Column is present
Then Verify that Show Entries option is displayed
Then Verify that pagination is present
Then Verify that the Number of entries shown label is present 
Then Close Browser