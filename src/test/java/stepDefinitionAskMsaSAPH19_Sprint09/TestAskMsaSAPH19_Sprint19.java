package stepDefinitionAskMsaSAPH19_Sprint09;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH19_Sprint19 {
	
	public static WebDriver driver;
	static ConfigReader config = new ConfigReader();
	Boolean isPresent = false;

	@Given("^Run Browser$")
	public void run_Browser() throws Throwable {
		loadDriver(); 
	    
	}
	
	@When("^Browser is up, load ASK MSA VIP login page$")
	public void browser_is_up_load_ASK_MSA_VIP_login_page() throws Throwable {
		driver.get(config.getASKMSAUrl());
	    
	}
	
	@Then("^Enter Username$")
	public void enter_Username() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getUserName())).sendKeys(config.getUserNameCred());
	    
	}
	
	@Then("^Enter Password$")
	public void enter_Password() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getPassword())).sendKeys(config.getPasswordCred());
	    
	}
	
	@Then("^Click Login button$")
	public void click_Login_button() throws Throwable {
		driver.findElement(By.id(config.getbtnsubmit())).click();
	    
	}

	@Then("^Click Employees dropdown$")
	public void click_Employees_dropdown() throws Throwable {
		driver.findElement(By.id("nav-employees")).click();
	    
	}

	@Then("^Click Employees$")
	public void click_Employees() throws Throwable {
		driver.findElement(By.id("nav-employee")).click();
	    
	}
	
	@Then("^Verify that Employees Page is displayed$")
	public void verify_that_Employees_Page_is_displayed() throws Throwable {
		String expectedEmployeePage = config.getEmployeeUrl();
	    String actualEmployeePage = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedEmployeePage, actualEmployeePage);
	    
	}
	
	@Then("^Verify that Employees header is displayed$")
	public void verify_that_Employees_header_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.xpath(config.getEmployeeHeader())).size()!= 0;
		Assert.assertTrue("Error: Employees Header is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Add Ship button is displayed$")
	public void verify_that_Add_Ship_button_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getAddEmpButtonId())).size()!= 0;
		Assert.assertTrue("Error: Add Employee Button is Missing.",isPresent);
		
	}
	
	@Then("^Verify that Active tab is present$")
	public void verify_that_Active_tab_is_present() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEmpActiveTabId())).size()!= 0;
		Assert.assertTrue("Error: Active tab is Missing.",isPresent);
		
	}
	
	@Then("^Verify that Inactive tab is present$")
	public void verify_that_Inactive_tab_is_present() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEmpInactiveTabId())).size()!= 0;
		Assert.assertTrue("Error: Inactive tab is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Show Entries option is displayed$")
	public void verify_that_Show_Entries_option_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getShowEntriesEmployee())).size()!= 0;
		Assert.assertTrue("Error: Show Entries is Missing.",isPresent);
		
	    
	}
	
	@Then("^Verify that Search field is displayed$")
	public void verify_that_Search_field_is_displayed() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getSearchFilterEmployee())).size()!= 0;
		Assert.assertTrue("Error: Search Field is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Active Employees table is displayed$")
	public void verify_that_Active_Employees_table_is_displayed() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getEmpActiveTable())).size()!= 0;
		Assert.assertTrue("Error: Active Employees table is Missing.",isPresent);
		
	}
	
	@Then("^Verify that Name Column is present$")
	public void verify_that_Name_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Name")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Name column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Employee Number Column is present$")
	public void verify_that_Employee_Number_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Employee Number")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Employee Number column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Ship Column is present$")
	public void verify_that_Ship_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Ship")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Ship column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Email Column is present$")
	public void verify_that_Email_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("E-mail")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: E-mail column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Date of Birth Column is present$")
	public void verify_that_Date_of_Birth_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Date of Birth")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Date of Birth column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Action Column is present$")
	public void verify_that_Action_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Action")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Action column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Bookings button is present$")
	public void verify_that_Bookings_button_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Bookings")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Bookings button is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Edit button is present$")
	public void verify_that_Edit_button_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Edit")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Edit button is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Delete Button is present$")
	public void verify_that_Delete_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Delete")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Delete button is missing.",isPresent);
	    
	}
	
	@Then("^Verify that pagination is present$")
	public void verify_that_pagination_is_present() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getPaginationEmployees())).size()!= 0;
		Assert.assertTrue("Error: Pagination is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that the Number of entries shown label is present$")
	public void verify_that_the_Number_of_entries_shown_label_is_present() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getEntriesInfoEmployee())).size()!= 0;
		Assert.assertTrue("Error: Number of Entries is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Inactive Employees table is present$")
	public void verify_that_Inactive_Employees_table_is_present() throws Throwable {
		driver.findElement(By.id(config.getEmpInactiveTabId())).click();
		Boolean isPresent = driver.findElements(By.id(config.getEmpInactiveTable())).size()!= 0;
		Assert.assertTrue("Error: Inactive Employees Table is Missing.",isPresent);
	    
	}
	
	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	    
	    
	}
	
	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	

	
}
