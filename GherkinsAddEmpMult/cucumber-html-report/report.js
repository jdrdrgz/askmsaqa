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
  "duration": 89433417435,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.browser_is_up_load_ASK_MSA_VIP_login_page()"
});
formatter.result({
  "duration": 15427094871,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.enter_Username()"
});
formatter.result({
  "duration": 2032843978,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.enter_Password()"
});
formatter.result({
  "duration": 1070646796,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Login_button()"
});
formatter.result({
  "duration": 4545359960,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Employees_dropdown()"
});
formatter.result({
  "duration": 94644743,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Employees()"
});
formatter.result({
  "duration": 1709576856,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.click_Add_Employee_button()"
});
formatter.result({
  "duration": 28224,
  "status": "passed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.supply_all_required_fields_with_valid_values_multiple_times_and_click_Save()"
});
formatter.result({
  "duration": 9774985567,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cbutton type\u003d\"button\" id\u003d\"btnModalSave\" class\u003d\"btn btn-primary\"\u003e...\u003c/button\u003e is not clickable at point (980, 703). Other element would receive the click: \u003cform id\u003d\"formEmployee\" class\u003d\"form-horizontal form-label-left\" novalidate\u003d\"novalidate\"\u003e...\u003c/form\u003e\n  (Session info: chrome\u003d61.0.3163.100)\n  (Driver info: chromedriver\u003d2.31.488763 (092de99f48a300323ecf8c2a4e2e7cab51de5ba8),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 58 milliseconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DESKTOP-3EKF22U\u0027, ip: \u0027192.168.22.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.31.488763 (092de99f48a300323ecf8c2a4e2e7cab51de5ba8), userDataDir\u003dC:\\Users\\JUDYAN~1\\AppData\\Local\\Temp\\scoped_dir12240_30387}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d61.0.3163.100, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 6d75008151162e115bb1ecb791af04a5\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat stepDefinitionAskMsaAddMultEmp.TestAskMsaAddMultEmp.supply_all_required_fields_with_valid_values_multiple_times_and_click_Save(TestAskMsaAddMultEmp.java:88)\r\n\tat ✽.Then Supply all required fields with valid values multiple times and click Save(AddEmpMult.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestAskMsaAddMultEmp.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
});