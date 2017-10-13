package stepDefinitionAskMsaViewEmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaViewEmp {

	public static WebDriver driver;
	static ConfigReader config = new ConfigReader();
	public Boolean isPresent;
	
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

	@Then("^Verify Employees Header exists$")
	public void verify_Employees_Header_exists() throws Throwable {
	    
	    
	}

	@Then("^Verify Add Employee button exists$")
	public void verify_Add_Employee_button_exists() throws Throwable {

		isPresent = driver.findElements(By.id(config.getAddEmpButtonId())).size()!= 0;
		   if (isPresent == true){
		   System.out.println("Add Employee button is Present");
		   } else{
		    System.out.println("Error: Add Employee button is Missing");
		   }
	    
	}

	@Then("^Verify that Active tab exists$")
	public void verify_that_Active_tab_exists() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEmpActiveTabId())).size()!= 0;
		   if (isPresent == true){
		   System.out.println("Active Tab is Present");
		   } else{
		    System.out.println("Error: Active Tab is Missing");
		   }
	    
	    
	}

	@Then("^Verify that Inactive tab exists$")
	public void verify_that_Inactive_tab_exists() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEmpInactiveTabId())).size()!= 0;
		   if (isPresent == true){
		   System.out.println("Inactive Tab is Present");
		   } else{
		    System.out.println("Error: Inactive Tab is Missing");
		   }
	    
	}

	@Then("^Verify that Active Employees Table exists and working$")
	public void verify_that_Active_Employees_Table_exists_and_working() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEmpActiveTable())).size()!= 0;
		   if (isPresent == true){
		   System.out.println("Active Employees Table is Present");
		   } else{
		    System.out.println("Error: Active Employees Table is Missing");
		   }
	    
	}

	@Then("^Verify that Inactive Employees Table exists and working$")
	public void verify_that_Inactive_Employees_Table_exists_and_working() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEmpInactiveTable())).size()!= 0;
		   if (isPresent == true){
		   System.out.println("Inactive Employees Table is Present");
		   } else{
		    System.out.println("Error: Inactive Employees Table is Missing");
		   }
	    
	}

	@Then("^Verify that a message is displayed on the table if no employees exists$")
	public void verify_that_a_message_is_displayed_on_the_table_if_no_employees_exists() throws Throwable {
	    
	    
	}

	@Then("^Verify that Show Entries is present$")
	public void verify_that_Show_Entries_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Search field is present$")
	public void verify_that_Search_field_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Name column is present$")
	public void verify_that_Name_column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Employee Number column is present$")
	public void verify_that_Employee_Number_column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Ship column is present$")
	public void verify_that_Ship_column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Email column is present$")
	public void verify_that_Email_column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Date of Birth column is present$")
	public void verify_that_Date_of_Birth_column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Action Column is present$")
	public void verify_that_Action_Column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Edit button is present if employees table is not empty$")
	public void verify_that_Edit_button_is_present_if_employees_table_is_not_empty() throws Throwable {
	    
	    
	}

	@Then("^Verify that Delete button  is present if employees table is not empty$")
	public void verify_that_Delete_button_is_present_if_employees_table_is_not_empty() throws Throwable {
	    
	    
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
