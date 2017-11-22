Feature: Regular Booking via VIP 

Scenario: Add Booking - Valid Values without Employee Email
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
Then Select an Employee without registered email address and click Add to List button
Then Verify that No Email Registered is displayed in the Email Booking Details column if email is not available 
Then Click Add Booking button
Then Verify that successful booking message is displayed
Then Verify that successful booking message is correct
Then Verify that user is redirected to Booking page
Then Verify that Booking is added in the table
Then Close Browser