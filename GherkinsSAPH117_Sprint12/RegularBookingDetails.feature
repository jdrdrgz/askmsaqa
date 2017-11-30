Feature: Regular Booking Details

Scenario:Regular Booking history details
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Course Bookings dropdown
Then Click Course Bookings
Then Click Details button of a Regular Booking
Then Verify that Booking Details page is displayed
Then Verify that Reference Number is displayed
Then Verify that Course is displayed
Then Verify that Ordered Date is displayed
Then Verify that Course Code is displayed
Then Verify that Project Code is displayed
Then Verify that Start Date is displayed
Then Verify that End Date is displayed
Then Verify that Unknown is displayed if no date is available
Then Verify that Price is displayed
Then Verify that Price value is not contractual
Then Verify that price is Not available if 0 or null
Then Verify that Location is displayed
Then Verify that Location Description is displayed
Then Verify that employees table is present
Then verify that employees table is not empty
Then Verify that Show Entries option is displayed
Then Verify that Search field is displayed
Then Verify that pagination is present
Then Verify that the Number of entries shown label is present
Then Verify that Date Booked Column is present
Then Verify that Employee Column is present
Then Verify that Employee Number Column is present
Then Verify that Ship Column is present
Then Verify that Actions Column is present
Then Verify that Booking button is present