package stepDefinitionAskMsaSASM41;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMSaSASM41 {
	
	public static WebDriver driver;
	static ConfigReader config = new ConfigReader();
	
	@Given("^Run Browser for Valid Fields$")
	public void run_Browser_for_Valid_Fields() throws Throwable {
		loadDriver();  
	}
	
	@When("^Browser is up, load ASK MSA VIP login page for Valid Fields$")
	public void browser_is_up_load_ASK_MSA_VIP_login_page_for_Valid_Fields() throws Throwable {
		driver.get(config.getASKMSAUrl());
	}
	
	@Then("^Enter Username for Valid Fields$")
	public void enter_Username_for_Valid_Fields() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getUserName())).sendKeys(config.getUserNameCred());
	}
	
	@Then("^Enter Password for Valid Fields$")
	public void enter_Password_for_Valid_Fields() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getPassword())).sendKeys(config.getPasswordCred());
	}
	
	@Then("^Click Login button for Valid Fields$")
	public void click_Login_button_for_Valid_Fields() throws Throwable {
		driver.findElement(By.id(config.getbtnsubmit())).click();
	}
	
	@Then("^Click Profile dropdown for Valid Fields$")
	public void click_Profile_dropdown_for_Valid_Fields() throws Throwable {
		driver.findElement(By.id(config.getBtnProfileDropDown())).click();
	}
	
	@Then("^Click Profile option for Valid Fields$")
	public void click_Profile_option_for_Valid_Fields() throws Throwable {
		driver.findElement(By.id(config.getBtnProfileMenu())).click();
	}
	
	@Then("^Click Edit Profile button for Valid Fields$")
	public void click_Edit_Profile_button_for_Valid_Fields() throws Throwable {
		driver.findElement(By.id(config.getEditProfileButtonId())).click();
	}
	
	@Then("^Enter Valid Values for All Valid Fields$")
	public void enter_Valid_Values_for_All_Valid_Fields() throws Throwable {
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
	
	@Then("^Click Save Changes button for Valid Fields$")
	public void click_Save_Changes_button_for_Valid_Fields() throws Throwable {
		driver.findElement(By.id(config.getEditSaveButtonId())).click();
	}
	
	@Then("^Validate Successfully Saved Message is displayed for Valid Fields$")
	public void validate_Successfully_Saved_Message_is_displayed_for_Valid_Fields() throws Throwable {
		String expectedSuccessMessage = config.getSuccessSaveMessageText();
		String actualEditSuccessMessage = driver.findElement(By.id(config.getSuccessSaveMessageId())).getText();
		Assert.assertEquals(expectedSuccessMessage, actualEditSuccessMessage);
	}

	@Then("^Validate All Values are displayed correctly for Valid Fields$")
	public void validate_All_Values_are_displayed_correctly_for_Valid_Fields() throws Throwable {
		String expectedFNameVal = config.getInputFName();
		String expectedLNameVal = config.getInputLName();
		String expectedEmailVal = config.getInputEmail();
		String expectedPhoneVal = config.getInputPhone();
		
		String actualFNameVal = driver.findElement(By.id(config.getFNameFieldId())).getText();
		String actualLNameVal = driver.findElement(By.id(config.getLNameFieldId())).getText();
		String actualEmailVal = driver.findElement(By.id(config.getEmailFieldId())).getText();
		String actualPhoneVal = driver.findElement(By.id(config.getPhoneFieldId())).getText();
	
		
		Assert.assertEquals(expectedFNameVal, actualFNameVal);
		Assert.assertEquals(expectedLNameVal, actualLNameVal);
		Assert.assertEquals(expectedEmailVal, actualEmailVal);
		Assert.assertEquals(expectedPhoneVal, actualPhoneVal);		
		
		ConfigReader.captureScreenshot(driver, "Edit Personal Info SASM 41");
	}
	
	@Then("^Revert All Values are displayed correctly for Valid Fields$")
	public void revert_All_Values_are_displayed_correctly_for_Valid_Fields() throws Throwable {
		driver.findElement(By.id(config.getEditProfileButtonId())).click();
		Thread.sleep(1000);
		driver.findElement(By.id(config.getEditFNameFieldId())).clear();
		driver.findElement(By.id(config.getEditLNameFieldId())).clear();
		driver.findElement(By.id(config.getEditEmailFieldId())).clear();
		driver.findElement(By.id(config.getEditPhoneFieldId())).clear();
		driver.findElement(By.id(config.getEditCommentsFieldId())).clear();
		driver.findElement(By.id(config.getEditFNameFieldId())).sendKeys(config.getFNameFieldText());
		driver.findElement(By.id(config.getEditLNameFieldId())).sendKeys(config.getLNameFieldText());
		driver.findElement(By.id(config.getEditEmailFieldId())).sendKeys(config.getEmailFieldText());
		driver.findElement(By.id(config.getEditPhoneFieldId())).sendKeys(config.getPhoneFieldVal());
		driver.findElement(By.id(config.getEditCommentsFieldId())).sendKeys(config.getEditCommentsFieldText());
		driver.findElement(By.id(config.getEditSaveButtonId())).click();
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
