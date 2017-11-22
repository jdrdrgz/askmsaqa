Feature: Regular Booking via VIP 

Scenario: Edit Booking Details
Scenario: Cancel Booking if status is Created
Scenario: Cancel Booking if status is Closed



Feature: Booking History via VIP 
Scenario: View Booking History Page
	Then Verify that Booking Reference, Course Dates, Course Name are displayed
Scenario: View Booking Details Page
	Then Verify that Who did the booking is displayed
	Then Verify that When did the booking happen?= is displayed
	Then Verify that Course Details? is displayed
	Then Verify that Employees booked? is displayed
Scenario: View Booking History per Employee Page
Scenario: Filter Booking by Cancelled Status
Scenario: Filter Booking by Closed Status
Scenario: Filter Booking by Created Status
Scenario: View booking history for any Employee across Divisions/Ships
Scenario: Ships can only view booking history of employees connected on their Ship, but will see history also for other Ships the person has been connected to in the past
Scenario: Ships can only view booking history of employees connected on connected Ship, but will see history also for other Ships the person has been connected to in the past


Feature: On Board Booking History
Scenario: Course history for courses attended on board Ships is available in the Booking History


Feature: On-Board Booking

Scenario: View Booking Page
Scenario: Add Booking - Valid Values with Employee Email
Scenario: Add Booking - Valid Values without Enployee Email
Scenario: Add Booking - Blank Values
Scenario: Add Booking - Invalid Values
Scenario: Add Booking - Field Limit Exceeded
Scenario: Add Booking - Cancel Add
Scenario: Edit Booking Details
Scenario: Cancel Booking Status
Scenario: VIP can select a Course for the Ship and also the employees that will attend.
Scenario: Select person(s) from registered Active Employees with option to search for person
Scenario: Select if Course Confirmation Email will be sent for each individual Employee
Scenario: The Ship the Employee is connected to is stored together with the booking statistics.
Scenario: Email is sent to each Employee with booking confirmation (similar layout as mail sent for private booking) - Manual
Scenario: Attending employees can be easily changed (Add/remove)
Scenario: After course is finished, it will be stored in a similar way as regular Courses on training facilities
    
	
	
Feature: Add Course Schedule for On-board booking
Scenario: View Course Schedule Page
Scenario: Add Course Schedule - View Add Course Schedule Page
	Then Verify that On-board checkbox is displayed
	Then Verify that if On-board check box is ticked, Company drop down is displayed
	Then Verify that if On-board check box is ticked, Location drop down is disabled
	Then Verify that if On-board check box is ticked, Ship drop down is displayed
	Then Verify that if On-board check box is ticked, Start Date is not required
	Then Verify that if On-board check box is ticked, End Date is not required
Scenario: Add Course Schedule
Scenario: Admin will confirm Start and End date before the Course is stored in the Booking History

Feature: Booking History via WP-ADMIN
Scenario: View Booking History Page
Scenario: Close Booking



