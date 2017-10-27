package stepDefinitionAskMsaSAPH37_Sprint09;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH37_Sprint09 {
	
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
	
	@Then("^Click Add Ship button$")
	public void click_Add_Ship_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getAddShipButtonId())).click();	
	
	}
	
	@Then("^Click Save$")
	public void click_Save() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSaveAddShipId())).click();
	    
	}
	
	@Then("^Verify that error messages are displayed$")
	public void verify_that_error_messages_are_displayed() throws Throwable {
	    String expectedRequiredFieldMessage = config.getRequiredFieldMsgActual();
	    
	    String actualShipRequiredMessage = driver.findElement(By.xpath(config.getShipRequiredMsg())).getText();
	    String actualEmailRequiredMessage = driver.findElement(By.xpath(config.getEmailRequiredMsgId())).getText();
	    String actualFNameRequiredMessage = driver.findElement(By.xpath(config.getFNameRequiredMsgId())).getText();
	    String actualLNameRequiredMessage = driver.findElement(By.xpath(config.getLNameRequiredMsgId())).getText();
	    String actualIMORequiredMessage = driver.findElement(By.xpath(config.getIMORequiredMsgId())).getText();
	    
	    Assert.assertEquals(expectedRequiredFieldMessage, actualShipRequiredMessage);
	    Assert.assertEquals(expectedRequiredFieldMessage, actualEmailRequiredMessage);
	    Assert.assertEquals(expectedRequiredFieldMessage, actualFNameRequiredMessage);
	    Assert.assertEquals(expectedRequiredFieldMessage, actualLNameRequiredMessage);
	    Assert.assertEquals(expectedRequiredFieldMessage, actualIMORequiredMessage);
	    
	    
	}
	
	@Then("^Verify that Ship is not added in the table$")
	public void verify_that_Ship_is_not_added_in_the_table() throws Throwable {
	    
	    
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
