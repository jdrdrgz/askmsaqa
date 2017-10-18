package stepDefinitionAskMsaSAPH33;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH33 {

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

	@Then("^Click Add Employee button$")
	public void click_Add_Employee_button() throws Throwable {
		driver.findElement(By.id(config.getAddEmpButtonId())).click();
	    
	}

	@Then("^Click Save$")
	public void click_Save() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id("btnModalSave")).click();
	}

	@Then("^Verify that an error message is displayed$")
	public void verify_that_an_error_message_is_displayed() throws Throwable {
	    String expBlankErrMsg = config.getRequiredFieldErrMsg();
	    
	    String actualFNameErr = driver.findElement(By.id(config.getBlankFNameEmp())).getText();
	    String actualLNameErr = driver.findElement(By.id(config.getBlankLNameEmp())).getText();
	    String actualEmpNumErr = driver.findElement(By.id(config.getBlankEmpNum())).getText();
	    String actualShipErr = driver.findElement(By.id(config.getBlankShipEmp())).getText();
	    
	    Assert.assertEquals(expBlankErrMsg, actualFNameErr);
	    Assert.assertEquals(expBlankErrMsg, actualLNameErr);
	    Assert.assertEquals(expBlankErrMsg, actualEmpNumErr);
	    Assert.assertEquals(expBlankErrMsg, actualShipErr);
	    
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
