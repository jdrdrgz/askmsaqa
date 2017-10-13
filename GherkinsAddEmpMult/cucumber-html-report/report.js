$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddEmpMult.feature");
formatter.feature({
  "line": 1,
  "name": "Add Mult Employee",
  "description": "",
  "id": "add-mult-employee",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Manage Employees - View Employees",
  "description": "",
  "id": "add-mult-employee;manage-employees---view-employees",
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
  "name": "Supply all required fields with valid values multiple times and click Save",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.run_Browser()"
});
formatter.result({
  "duration": 4085829125,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.browser_is_up_load_ASK_MSA_VIP_login_page()"
});
formatter.result({
  "duration": 7474395932,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.enter_Username()"
});
formatter.result({
  "duration": 1149720091,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.enter_Password()"
});
formatter.result({
  "duration": 1089664165,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Login_button()"
});
formatter.result({
  "duration": 2563338247,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Employees_dropdown()"
});
formatter.result({
  "duration": 84592829,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Employees()"
});
formatter.result({
  "duration": 1585914437,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Add_Employee_button()"
});
formatter.result({
  "duration": 19244,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.supply_all_required_fields_with_valid_values_multiple_times_and_click_Save()"
});
formatter.result({
  "duration": 1123894839587,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.close_Browser()"
});
formatter.result({
  "duration": 450564201,
  "status": "passed"
});
});