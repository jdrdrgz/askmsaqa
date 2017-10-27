package stepDefinitionAskMsaSAPH25_Sprint09;

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

public class TestAskMsaSAPH25_Sprint09 {

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
	
	@Then("^Click Edit button$")
	public void click_Edit_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath(config.getbtnEditPath())).click();
	}

	@Then("^Change fields with valid values$")
	public void change_fields_with_valid_values() throws Throwable {
		
		Thread.sleep(2000);
		driver.findElement(By.id(config.getShipNameTxtId())).sendKeys("test");
		driver.findElement(By.id(config.getEmailTxtId())).clear();
		driver.findElement(By.id(config.getFNameTxtId())).clear();
		driver.findElement(By.id(config.getLNameTxtId())).clear();
		driver.findElement(By.id(config.getIMOTxtId())).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.id(config.getShipNameTxtId())).sendKeys(config.getbtnEditShipName());
		driver.findElement(By.id(config.getEmailTxtId())).sendKeys(config.getbtnEditShipEmail());
		driver.findElement(By.id(config.getFNameTxtId())).sendKeys(config.getbtnEditShipFName());
		driver.findElement(By.id(config.getLNameTxtId())).sendKeys(config.getbtnEditShipLName());
		driver.findElement(By.id(config.getIMOTxtId())).sendKeys(config.getbtnEditShipIMO());
		
		//ship dropdown
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id(config.getDivisionDropDownId())));
		actions.click();
		actions.sendKeys(config.getbtnEditShipDivision());
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}

	@Then("^Click Save$")
	public void click_Save() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSaveAddShipId())).click();	
	}

	@Then("^Verify that Ship was updated successfully message is displayed$")
	public void verify_that_Ship_was_updated_successfully_message_is_displayed() throws Throwable {
		String expectedEditShipMessage = config.getSuccessEditShipMsg();
	    String actualEditShipMessage = driver.findElement(By.id(config.getAddShipSuccessMsgActual())).getText();
	    
	    Assert.assertEquals(expectedEditShipMessage, actualEditShipMessage);
	}

	@Then("^Verify that user is redirected to Ships Screen$")
	public void verify_that_user_is_redirected_to_Ships_Screen() throws Throwable {
		String expectedShipsURL = config.getShipsURL();
	    String actualShipsUrl = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedShipsURL, actualShipsUrl);
	}

	@Then("^Verify that Ship is updated in the table$")
	public void verify_that_Ship_is_updated_in_the_table() throws Throwable {

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
