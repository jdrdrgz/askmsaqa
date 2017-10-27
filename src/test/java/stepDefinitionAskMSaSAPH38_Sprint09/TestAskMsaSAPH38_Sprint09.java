package stepDefinitionAskMSaSAPH38_Sprint09;

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

public class TestAskMsaSAPH38_Sprint09 {
	
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
	
	@Then("^Supply all required fields with valid values$")
	public void supply_all_required_fields_with_valid_values() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id(config.getShipNameTxtId())).sendKeys(config.getRandomName(20));
		driver.findElement(By.id(config.getEmailTxtId())).sendKeys(config.generateInvalidEmail(20));
		driver.findElement(By.id(config.getFNameTxtId())).sendKeys(config.generateInvalidName(10));
		driver.findElement(By.id(config.getLNameTxtId())).sendKeys(config.generateInvalidName(10));
		driver.findElement(By.id(config.getIMOTxtId())).sendKeys(config.getIMOTxtInput());
		
		//ship dropdown
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id(config.getDivisionDropDownId())));
		actions.click();
		actions.sendKeys(config.getDivisionDropDownInput());
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	
	}
	
	@Then("^Click Save$")
	public void click_Save() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSaveAddShipId())).click();	
	
	}
	
	@Then("^Verify that error messages are displayed$")
	public void verify_that_error_messages_are_displayed() throws Throwable {
		String expectedInvalidFNameMessage = config.getFNameInvalidMsg();
		String expectedInvalidLNameMessage = config.getLNameInvalidMsg();
		String expectedInvalidEmailMessage = config.getEmailInvalidMsg();
	    
	    String actualEmailRequiredMessage = driver.findElement(By.xpath(config.getEmailRequiredMsgId())).getText();
	    String actualFNameRequiredMessage = driver.findElement(By.xpath(config.getFNameRequiredMsgId())).getText();
	    String actualLNameRequiredMessage = driver.findElement(By.xpath(config.getLNameRequiredMsgId())).getText();
	    
	    Assert.assertEquals(expectedInvalidFNameMessage, actualEmailRequiredMessage);
	    Assert.assertEquals(expectedInvalidLNameMessage, actualFNameRequiredMessage);
	    Assert.assertEquals(expectedInvalidEmailMessage, actualLNameRequiredMessage);

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
