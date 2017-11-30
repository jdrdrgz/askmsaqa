Feature: Regular Booking History

Scenario:Regular Booking history page
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Course Bookings dropdown
Then Click Course Bookings
Then Verify that Course Bookings Page is displayed
Then Verify that Course Bookings header is displayed
Then Verify that Course Bookings header text is correct
Then Verify that Book a Course button is displayed
Then Verify that Show Entries option is displayed
Then Verify that Search field is displayed
Then Verify that Bookings table is displayed
Then Verify that Date Booked Column is present
Then Verify that Reference Number Column is present
Then Verify that Project Code Column is present
Then Verify that Course Column is present
Then Verify that Location Column is present
Then Verify that Schedule Column is present
Then Verify that Status Column is present
Then Verify that Actions Column is present
Then Verify that pagination is present
Then Verify that the Number of entries shown label is present
Then Verify that Edit button is present
Then Verify that Details Button is present
Then Close Browser