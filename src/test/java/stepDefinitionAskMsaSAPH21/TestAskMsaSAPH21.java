package stepDefinitionAskMsaSAPH21;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH21 {

	public static WebDriver driver;
	static ConfigReader config = new ConfigReader();

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

	@Then("^Click Edit Employee button$")
	public void click_Edit_Employee_button() throws Throwable {
		driver.findElement(By.xpath(config.getEditEmp())).click();
	}
	
	@Then("^Supply fields with valid values$")
	public void supply_fields_with_valid_values() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id(config.getAddEmpFNameField())).clear();
		driver.findElement(By.id(config.getAddEmpLNameField())).clear();
		driver.findElement(By.id(config.getAddEmpNumField())).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.id(config.getAddEmpFNameField())).sendKeys(config.getEditEmpFNameValue());
		driver.findElement(By.id(config.getAddEmpLNameField())).sendKeys(config.getEditEmpLNameValue());
		driver.findElement(By.id(config.getAddEmpNumField())).sendKeys(config.getEditEmpNumValue());
		
	}
	
	@Then("^Click Save$")
	public void click_Save() throws Throwable {
		driver.findElement(By.id(config.getAddEmpSaveBtnId())).click();
	}
	
	@Then("^Verify that user is redirected to Employees Screen$")
	public void verify_that_user_is_redirected_to_Employees_Screen() throws Throwable {
		String expectedAddEmpSuccessMsg = config.getEditEmpSuccessString();
	    String actualAddEmpSuccessMsg = driver.findElement(By.id(config.getEmpMessageId())).getText();
	    
	    Assert.assertEquals(expectedAddEmpSuccessMsg, actualAddEmpSuccessMsg);
	}
	
	@Then("^Verify that successful edit message is displayed$")
	public void verify_that_successful_edit_message_is_displayed() throws Throwable {
		 String expectedEmpURL = config.getEmployeeUrl();
		 String actualEmpUrl = driver.getCurrentUrl();
		    
		 Assert.assertEquals(expectedEmpURL, actualEmpUrl);
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
