package stepDefinitionAskMsaSASM58;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSASM58 {
	
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
	
	@Then("^Click Profile dropdown$")
	public void click_Profile_dropdown() throws Throwable {
		driver.findElement(By.id(config.getBtnProfileDropDown())).click();
	}
	
	@Then("^Click Profile option$")
	public void click_Profile_option() throws Throwable {
		driver.findElement(By.id(config.getBtnProfileMenu())).click();
	}
	
	@Then("^Click Edit Profile button$")
	public void click_Edit_Profile_button() throws Throwable {
		driver.findElement(By.id(config.getEditProfileButtonId())).click();
	}
	
	@Then("^Enter Valid Values on all Fields$")
	public void enter_Valid_Values_on_all_Fields() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getEditFNameFieldId())).clear();
		driver.findElement(By.id(config.getEditLNameFieldId())).clear();
		driver.findElement(By.id(config.getEditEmailFieldId())).clear();
		driver.findElement(By.id(config.getEditPhoneFieldId())).clear();
		driver.findElement(By.id(config.getEditCommentsFieldId())).clear();
		
		driver.findElement(By.id(config.getEditFNameFieldId())).sendKeys(config.getInputFName());
		driver.findElement(By.id(config.getEditLNameFieldId())).sendKeys(config.getInputLName());
		driver.findElement(By.id(config.getEditEmailFieldId())).sendKeys(config.getInputEmail());
		driver.findElement(By.id(config.getEditPhoneFieldId())).sendKeys(config.getInputPhone());
		driver.findElement(By.id(config.getEditCommentsFieldId())).sendKeys(config.getInputComments());
	}
	
	@Then("^Click Cancel button$")
	public void click_Cancel_button() throws Throwable {
		driver.findElement(By.id(config.getEditCancelButtonId())).click();
	}
	
	@Then("^Validate that the User was redirected to previous page$")
	public void validate_that_the_User_was_redirected_to_previous_page() throws Throwable {
		String expectedCancelURL = config.getViewProfileURL();
		String actualCancelURL = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedCancelURL, actualCancelURL);
	}
	
	@Then("^Validate that no changes was made$")
	public void validate_that_no_changes_was_made() throws Throwable {
		String expectedFNameVal = config.getFNameFieldText();
		String expectedLNameVal = config.getLNameFieldText();
		String expectedEmailVal = config.getEmailFieldText();
		String expectedPhoneVal = config.getPhoneFieldVal();
		
		String actualFNameVal = driver.findElement(By.id(config.getFNameFieldId())).getText();
		String actualLNameVal = driver.findElement(By.id(config.getLNameFieldId())).getText();
		String actualEmailVal = driver.findElement(By.id(config.getEmailFieldId())).getText();
		String actualPhoneVal = driver.findElement(By.id(config.getPhoneFieldId())).getText();
		
		Assert.assertEquals(expectedFNameVal, actualFNameVal);
		Assert.assertEquals(expectedLNameVal, actualLNameVal);
		Assert.assertEquals(expectedEmailVal, actualEmailVal);
		Assert.assertEquals(expectedPhoneVal, actualPhoneVal);	
	}
	
	@Then("^Close Browser Driver for All fields are valid$")
	public void close_Browser_Driver_for_All_fields_are_valid() throws Throwable {
		driver.quit(); 
	}

	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
}
