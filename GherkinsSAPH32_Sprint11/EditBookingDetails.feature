Feature: Regular Booking via VIP 

Scenario: Edit Booking
Given Run Browser
When Browser is up, load ASK MSA VIP login page
Then Enter Username
Then Enter Password
Then Click Login button
Then Click Course Bookings
Then Click Edit button of a Created Booking
Then Set Status of Booking to Cancel
Then Click Remove button of an employee
Then Verify that employee was removed in the list
Then Add Employee
Then Click Update Booking button
Then Verify that user is redirected to Booking page
Then Verify that successful updated message is displayed
Then Verify that successful updated message is correct
Then Verify that booking details has been updated
Then Verify that Edit button is not available for a Closed Booking
Then Close Browser