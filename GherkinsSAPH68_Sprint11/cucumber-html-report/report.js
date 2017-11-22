$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddBookingValidEmployeeWithoutEmail.feature");
formatter.feature({
  "line": 1,
  "name": "Regular Booking via VIP",
  "description": "",
  "id": "regular-booking-via-vip",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add Booking - Valid Values without Employee Email",
  "description": "",
  "id": "regular-booking-via-vip;add-booking---valid-values-without-employee-email",
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
  "name": "Click Book a Course button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Select A Course",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Verify that Location Drop Down is Enabled",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Select a Location",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify that Course Dates Drop Down is Enabled",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Select a Course Date",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify that On-Board check box is NOT ticked",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Select an Employee without registered email address and click Add to List button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Verify that No Email Registered is displayed in the Email Booking Details column if email is not available",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click Add Booking button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Verify that successful booking message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify that successful booking message is correct",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Verify that user is redirected to Booking page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Verify that Booking is added in the table",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.run_Browser()"
});
formatter.result({
  "duration": 5087883427,
  "error_message": "org.openqa.selenium.WebDriverException: disconnected: unable to connect to renderer\n  (Session info: chrome\u003d62.0.3202.94)\n  (Driver info: chromedriver\u003d2.31.488763 (092de99f48a300323ecf8c2a4e2e7cab51de5ba8),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 2.05 seconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DESKTOP-3EKF22U\u0027, ip: \u002710.10.5.18\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.31.488763 (092de99f48a300323ecf8c2a4e2e7cab51de5ba8), userDataDir\u003dC:\\Users\\JUDYAN~1\\AppData\\Local\\Temp\\scoped_dir10256_5519}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d62.0.3202.94, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 4d75b845038764261be1c133dd72c373\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:694)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:925)\r\n\tat stepDefinitionAskMsaSAPH68_Sprint11.TestAskMsaSAPH68_Sprint11.loadDriver(TestAskMsaSAPH68_Sprint11.java:202)\r\n\tat stepDefinitionAskMsaSAPH68_Sprint11.TestAskMsaSAPH68_Sprint11.run_Browser(TestAskMsaSAPH68_Sprint11.java:24)\r\n\tat ✽.Given Run Browser(AddBookingValidEmployeeWithoutEmail.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.browser_is_up_load_ASK_MSA_VIP_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.enter_Username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.enter_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.click_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.click_Course_Bookings()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.click_Book_a_Course_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.select_A_Course()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.verify_that_Location_Drop_Down_is_Enabled()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.select_a_Location()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.verify_that_Course_Dates_Drop_Down_is_Enabled()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.select_a_Course_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.verify_that_On_Board_check_box_is_NOT_ticked()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.select_an_Employee_without_registered_email_address_and_click_Add_to_List_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.verify_that_No_Email_Registered_is_displayed_in_the_Email_Booking_Details_column_if_email_is_not_available()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.click_Add_Booking_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.verify_that_successful_booking_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.verify_that_successful_booking_message_is_correct()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.verify_that_user_is_redirected_to_Booking_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.verify_that_Booking_is_added_in_the_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAskMsaSAPH68_Sprint11.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
});