$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CancelAddEmployee.feature");
formatter.feature({
  "line": 1,
  "name": "Add Employee",
  "description": "",
  "id": "add-employee",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Manage Employees - Add Employee - Cancel",
  "description": "",
  "id": "add-employee;manage-employees---add-employee---cancel",
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
  "name": "Click Add Employee button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Supply fields with valid values",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click Cancel",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify that user is redirected to Employees Screen",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.run_Browser()"
});
formatter.result({
  "duration": 4026906330,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.browser_is_up_load_ASK_MSA_VIP_login_page()"
});
formatter.result({
  "duration": 2712657466,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.enter_Username()"
});
formatter.result({
  "duration": 1155553304,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.enter_Password()"
});
formatter.result({
  "duration": 1093675886,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Login_button()"
});
formatter.result({
  "duration": 1666663673,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Employees_dropdown()"
});
formatter.result({
  "duration": 83075683,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Employees()"
});
formatter.result({
  "duration": 1428382353,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Add_Employee_button()"
});
formatter.result({
  "duration": 24803,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
});