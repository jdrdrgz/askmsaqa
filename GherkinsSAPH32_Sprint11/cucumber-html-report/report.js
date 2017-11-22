$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EditBookingDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Regular Booking via VIP",
  "description": "",
  "id": "regular-booking-via-vip",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Edit Booking",
  "description": "",
  "id": "regular-booking-via-vip;edit-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Run Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browser is up, load ASK MSA VIP login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter Username",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter Password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click Course Bookings",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click Edit button of a Created Booking",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Set Status of Booking to Cancel",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click Remove button of an employee",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Verify that employee was removed in the list",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Add Employee",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click Update Booking button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify that user is redirected to Booking page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify that successful updated message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Verify that successful updated message is correct",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify that booking details has been updated",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify that Edit button is not available for a Closed Booking",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.run_Browser()"
});
formatter.result({
  "duration": 3983376168,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.browser_is_up_load_ASK_MSA_VIP_login_page()"
});
formatter.result({
  "duration": 4728066027,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.enter_Username()"
});
formatter.result({
  "duration": 1169676495,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.enter_Password()"
});
formatter.result({
  "duration": 1077890483,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.click_Login_button()"
});
formatter.result({
  "duration": 7989050011,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.click_Course_Bookings()"
});
formatter.result({
  "duration": 1415514123,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.click_Edit_button_of_a_Created_Booking()"
});
formatter.result({
  "duration": 3903436891,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.set_Status_of_Booking_to_Cancel()"
});
formatter.result({
  "duration": 1186853258,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.click_Remove_button_of_an_employee()"
});
formatter.result({
  "duration": 2094851290,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.verify_that_employee_was_removed_in_the_list()"
});
formatter.result({
  "duration": 201772114,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.add_Employee()"
});
formatter.result({
  "duration": 1225061900,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.click_Update_Booking_button()"
});
formatter.result({
  "duration": 81764844,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.verify_that_user_is_redirected_to_Booking_page()"
});
formatter.result({
  "duration": 5868844,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.verify_that_successful_updated_message_is_displayed()"
});
formatter.result({
  "duration": 22510210,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.verify_that_successful_updated_message_is_correct()"
});
formatter.result({
  "duration": 3074208130,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Success! You updated a course booking.]\u003e but was:\u003c[Booking updated!]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitionAskMsaSAPH32_Sprint11.TestAskMsaSAPH32_Sprint11.verify_that_successful_updated_message_is_correct(TestAskMsaSAPH32_Sprint11.java:140)\r\n\tat ✽.Then Verify that successful updated message is correct(EditBookingDetails.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.verify_that_booking_details_has_been_updated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.verify_that_Edit_button_is_not_available_for_a_Closed_Booking()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH32_Sprint11.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
});