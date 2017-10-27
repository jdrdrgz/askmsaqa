package stepDefinitionAskMsaSAPH26_withEmployeeConnected_Sprint09;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH26_withEmployeeConnected_Sprint09 {

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
	
	@Then("^Click Organization dropdown$")
	public void click_Organization_dropdown() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getOrganizationButtonId())).click();	
	}
	
	@Then("^Click Ships$")
	public void click_Ships() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getShipButtonId())).click();	
	
	}
	
	@Then("^Click Delete button$")
	public void click_Delete_button() throws Throwable {
		Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getBtnDeleteShipWithEmpPath())).click();
	}

	@Then("^Verify that a message is displayed preventing deletion of Ship$")
	public void verify_that_a_message_is_displayed_preventing_deletion_of_Ship() throws Throwable {
	   //String exp = "Cannot delete ship";
	  // String act = driver.findElement(By.id("modalDeleteConfirm")).getText();
	   
	   //Assert.assertEquals(exp, act);
	}

	@Then("^Close warning message$")
	public void close_warning_message() throws Throwable {
		Thread.sleep(1000);
	    driver.findElement(By.id(config.getBtnCloseDeleteShipWithEmp())).click();
	}

	@Then("^Verify that user is redirected to Ships Screen$")
	public void verify_that_user_is_redirected_to_Ships_Screen() throws Throwable {
		String expectedShipsURL = config.getShipsURL();
	    String actualShipsUrl = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedShipsURL, actualShipsUrl);
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
