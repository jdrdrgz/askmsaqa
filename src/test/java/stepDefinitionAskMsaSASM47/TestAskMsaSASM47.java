package stepDefinitionAskMsaSASM47;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSASM47 {
	
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

	@Then("^Enter Values more than the character limit$")
	public void enter_Values_more_than_the_character_limit() throws Throwable {
	    Thread.sleep(1000);
		driver.findElement(By.id(config.getEditFNameFieldId())).clear();
		driver.findElement(By.id(config.getEditLNameFieldId())).clear();
		driver.findElement(By.id(config.getEditEmailFieldId())).clear();
		driver.findElement(By.id(config.getEditPhoneFieldId())).clear();
		driver.findElement(By.id(config.getEditCommentsFieldId())).clear();
		
	    driver.findElement(By.id(config.getEditFNameFieldId())).sendKeys(config.getRandomName(300));
	    driver.findElement(By.id(config.getEditLNameFieldId())).sendKeys(config.getRandomName(300));
	    driver.findElement(By.id(config.getEditEmailFieldId())).sendKeys(config.generateEmail("gmail.com",300));
	    driver.findElement(By.id(config.getEditPhoneFieldId())).sendKeys(config.getRandomPhone(70));
	    driver.findElement(By.id(config.getEditCommentsFieldId())).sendKeys(config.getRandomName(300));
	}

	
	@Then("^Click Save button$")
	public void click_Save_button() throws Throwable {
		driver.findElement(By.id(config.getEditSaveButtonId())).click();
		ConfigReader.captureScreenshot(driver, "Edit Profile Exceed Limit SASM47");
	}


	@Then("^Verify that correct error messages are displayed$")
	public void verify_that_correct_error_messages_are_displayed() throws Throwable {
		String expectedFNameLimitErr = config.getFNameErrLimitText();
		String expectedLNameLimitErr = config.getLNameErrLimitText();
		String expectedEmailLimitErr = config.getEmailErrLimitText();
		String expectedPhoneLimitErr = config.getPhoneLimitText();
		String expectedCommentsLimitErr = config.getCommentLimitText();
		
		String actualFNameLimitErr = driver.findElement(By.xpath(config.getFNameErrId())).getText();
		String actualLNameLimitErr = driver.findElement(By.xpath(config.getLNameErrId())).getText();
		String actualEmailLimitErr = driver.findElement(By.xpath(config.getEmailErrId())).getText();
		String actualPhoneLimitErr = driver.findElement(By.xpath(config.getPhoneErrId())).getText();
		String actualCommentsLimitErr = driver.findElement(By.xpath(config.getCommentErrId())).getText();

		Assert.assertEquals(expectedFNameLimitErr, actualFNameLimitErr);
		Assert.assertEquals(expectedLNameLimitErr, actualLNameLimitErr);
		Assert.assertEquals(expectedEmailLimitErr, actualEmailLimitErr);
		Assert.assertEquals(expectedPhoneLimitErr, actualPhoneLimitErr);
		Assert.assertEquals(expectedCommentsLimitErr, actualCommentsLimitErr);
	    
	}

	@Then("^Close Browser Driver$")
	public void close_Browser_Driver_for_Exceed_Character_Limit_First_Name() throws Throwable {
		driver.quit(); 
	}

	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
}
