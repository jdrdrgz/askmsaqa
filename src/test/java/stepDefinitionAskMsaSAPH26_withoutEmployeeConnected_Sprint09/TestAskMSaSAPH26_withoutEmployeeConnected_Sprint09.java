package stepDefinitionAskMsaSAPH26_withoutEmployeeConnected_Sprint09;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMSaSAPH26_withoutEmployeeConnected_Sprint09 {
	
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
	    driver.findElement(By.xpath(config.getBtnDeleteShipWithoutEmpPath())).click();
	}
	

	@Then("^Verify that a confirmation message is displayed$")
	public void verify_that_a_confirmation_message_is_displayed() throws Throwable {
	    
	}
	
	@Then("^Click Delete$")
	public void click_Delete() throws Throwable {
		
		Thread.sleep(1000);
	    driver.findElement(By.id(config.getBtnCloseDeleteShipWithoutEmp())).click();

	}
	
	@Then("^Verify that user is redirected to Ships Screen$")
	public void verify_that_user_is_redirected_to_Ships_Screen() throws Throwable {
		String expectedShipsURL = config.getShipsURL();
	    String actualShipsUrl = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedShipsURL, actualShipsUrl);
	}
	
	@Then("^Verify that ship has been deleted$")
	public void verify_that_ship_has_been_deleted() throws Throwable {
	    
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
