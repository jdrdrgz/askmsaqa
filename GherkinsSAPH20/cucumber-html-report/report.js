$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddEmployeeValidValues.feature");
formatter.feature({
  "line": 1,
  "name": "Add Employee",
  "description": "",
  "id": "add-employee",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Manage Employees - Add Employee - Valid Values",
  "description": "",
  "id": "add-employee;manage-employees---add-employee---valid-values",
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
  "name": "Verify that employee is added in the table",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAskMsaSAPH20.run_Browser()"
});
formatter.result({
  "duration": 4755720252,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH20.browser_is_up_load_ASK_MSA_VIP_login_page()"
});
formatter.result({
  "duration": 20632142457,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH20.enter_Username()"
});
formatter.result({
  "duration": 1188723622,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH20.enter_Password()"
});
formatter.result({
  "duration": 1100828499,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH20.click_Login_button()"
});
formatter.result({
  "duration": 4425090851,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH20.click_Employees_dropdown()"
});
formatter.result({
  "duration": 86262843,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH20.click_Employees()"
});
formatter.result({
  "duration": 2848752975,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH20.verify_that_employee_is_added_in_the_table()"
});
formatter.result({
  "duration": 131158043,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaSAPH20.close_Browser()"
});
formatter.result({
  "duration": 2337934252,
  "status": "passed"
});
});