Feature: Regular Booking via VIP 

Scenario: Add Booking - Blank Values
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Course Bookings
Then Click Book a Course button
Then Click Add Booking button
Then Verify that an error message is displayed in Course 
Then Select a Course and click Add Booking button
Then Verify that an error message is displayed in Location 
Then Select a Location and click Add Booking button
Then Verify that an error message is displayed in Course Dates 
Then Select a Course Date and click Add Booking button
Then Verify that an error message is displayed in Employee 
Then Close Browser