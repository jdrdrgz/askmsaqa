Feature: Regular Booking via VIP 

Scenario: Add Booking - Cancel Add
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
Then Tick Email Booking Details checkbox if available
Then Click Cancel button
Then Verify that user is redirected to Booking page
Then Verify that Booking is not added in the table
Then Close Browser