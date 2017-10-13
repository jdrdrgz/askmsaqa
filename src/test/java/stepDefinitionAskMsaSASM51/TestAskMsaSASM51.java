package stepDefinitionAskMsaSASM51;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSASM51 {

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

	@Then("^Enter Invalid values$")
	public void enter_Invalid_values() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getEditFNameFieldId())).clear();
		driver.findElement(By.id(config.getEditLNameFieldId())).clear();
		driver.findElement(By.id(config.getEditEmailFieldId())).clear();
		driver.findElement(By.id(config.getEditPhoneFieldId())).clear();

		
	    driver.findElement(By.id(config.getEditFNameFieldId())).sendKeys(config.generateInvalidName(100));
	    driver.findElement(By.id(config.getEditLNameFieldId())).sendKeys(config.generateInvalidName(100));
	    driver.findElement(By.id(config.getEditEmailFieldId())).sendKeys(config.generateInvalidEmail(50));
	    driver.findElement(By.id(config.getEditPhoneFieldId())).sendKeys(config.generateInvalidPhone(25));

	}

	@Then("^Click Save Changes button$")
	public void click_Save_Changes_button() throws Throwable {
		driver.findElement(By.id(config.getEditSaveButtonId())).click();
		ConfigReader.captureScreenshot(driver, "Edit Profile Invalid Format SASM51");
	}

	@Then("^Validate Error Message$")
	public void validate_Error_Message() throws Throwable {
		String expectedFNameInvalidErr = config.getFNameErrInvalidText();
		String expectedLNameInvalidErr = config.getLNameErrInvalidText();
		String expectedEmailInvalidErr = config.getEmailErrInvalidText();
		String expectedPhoneInvalidErr = config.getPhoneInvalidText();
		
		String actualFNameInvalidErr = driver.findElement(By.xpath(config.getFNameErrId())).getText();
		String actualLNameInvalidErr = driver.findElement(By.xpath(config.getLNameErrId())).getText();
		String actualEmailInvalidErr = driver.findElement(By.xpath(config.getEmailErrId())).getText();
		String actualPhoneInvalidErr = driver.findElement(By.xpath(config.getPhoneErrId())).getText();
		
		Assert.assertEquals(expectedFNameInvalidErr, actualFNameInvalidErr);
		Assert.assertEquals(expectedLNameInvalidErr, actualLNameInvalidErr);
		Assert.assertEquals(expectedEmailInvalidErr, actualEmailInvalidErr);
		Assert.assertEquals(expectedPhoneInvalidErr, actualPhoneInvalidErr);
	}

	@Then("^Close Browser Driver$")
	public void close_Browser_Driver() throws Throwable {
		driver.quit(); 
	}
	
	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
}
