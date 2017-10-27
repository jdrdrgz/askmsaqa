package stepDefinitionAskMsaSAPH22;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH22 {
	
	public static WebDriver driver;
	static ConfigReader config = new ConfigReader();
	Boolean isPresent;

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

	@Then("^Click Delete button$")
	public void click_Delete_button() throws Throwable {
		driver.findElement(By.xpath(config.getDeleteEmp())).click();

	}

	@Then("^Verify that a confirmation before deleting employee is displayed$")
	public void verify_that_a_confirmation_before_deleting_employee_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getDeleteEmp())).size()!= 0;
		   if (isPresent == true){
		    System.out.println("Delete Confirmation is Present");
		  } else{
		    System.out.println("Error: Delete Confirmation is Missing");
		   }

	}

	@Then("^Click Delete button on the confirmation dialog box$")
	public void click_Delete_button_on_the_confirmation_dialog_box() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id(config.getDeleteConfirmationBtnEmp())).click();

	}

	@Then("^Verify that user is redirected to Employees Screen$")
	public void verify_that_user_is_redirected_to_Employees_Screen() throws Throwable {
	    String expectedEmpURL = config.getEmployeeUrl();
		 String actualEmpUrl = driver.getCurrentUrl();
		    
		 Assert.assertEquals(expectedEmpURL, actualEmpUrl);

	}

	@Then("^Verify that employee deleted message is displayed$")
	public void verify_that_employee_deleted_message_is_displayed() throws Throwable {
		String expectedDeleteEmpSuccessMsg = config.getDeleteEmpMessage();
		String actualDeleteEmpSuccessMsg = driver.findElement(By.id(config.getEmpMessageId())).getText();
	    
	    Assert.assertEquals(expectedDeleteEmpSuccessMsg, actualDeleteEmpSuccessMsg);

	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		driver.close();

	}
	
	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
}
