$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DeleteEmployee.feature");
formatter.feature({
  "line": 1,
  "name": "Delete Employee",
  "description": "",
  "id": "delete-employee",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Manage Employees - Delete Employee",
  "description": "",
  "id": "delete-employee;manage-employees---delete-employee",
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
  "name": "Click Employees dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click Employees",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click Delete button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Verify that a confirmation before deleting employee is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click Delete button on the confirmation dialog box",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify that user is redirected to Employees Screen",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Verify that employee deleted message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAskMsaSAPH22.run_Browser()"
});
formatter.result({
  "duration": 4075072078,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.browser_is_up_load_ASK_MSA_VIP_login_page()"
});
formatter.result({
  "duration": 2211841111,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.enter_Username()"
});
formatter.result({
  "duration": 1158292730,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.enter_Password()"
});
formatter.result({
  "duration": 1099476747,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.click_Login_button()"
});
formatter.result({
  "duration": 1729135503,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.click_Employees_dropdown()"
});
formatter.result({
  "duration": 86169191,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.click_Employees()"
});
formatter.result({
  "duration": 1098305029,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.click_Delete_button()"
});
formatter.result({
  "duration": 91893078,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.verify_that_a_confirmation_before_deleting_employee_is_displayed()"
});
formatter.result({
  "duration": 24622762,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.click_Delete_button_on_the_confirmation_dialog_box()"
});
formatter.result({
  "duration": 2936084905,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.verify_that_user_is_redirected_to_Employees_Screen()"
});
formatter.result({
  "duration": 21647282,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.verify_that_employee_deleted_message_is_displayed()"
});
formatter.result({
  "duration": 44544111,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH22.close_Browser()"
});
formatter.result({
  "duration": 153128616,
  "status": "passed"
});
});