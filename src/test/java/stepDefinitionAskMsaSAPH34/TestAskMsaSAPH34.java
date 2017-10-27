package stepDefinitionAskMsaSAPH34;

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

public class TestAskMsaSAPH34 {
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

	@Then("^Supply fields with invalid values$")
	public void supply_fields_with_invalid_values() throws Throwable {
	    
		Thread.sleep(2000);
		driver.findElement(By.id(config.getAddEmpFNameField())).sendKeys(config.generateInvalidName(20));
		driver.findElement(By.id(config.getAddEmpLNameField())).sendKeys(config.generateInvalidName(20));
		
		//Employee Number - free text
		driver.findElement(By.id(config.getAddEmpNumField())).sendKeys(config.getRandomEmpNum(10));
		
		driver.findElement(By.id(config.getAddEmpEmailFld())).sendKeys(config.generateInvalidEmail(20));
		driver.findElement(By.id(config.getAddEmpPhoneFld())).sendKeys(config.generateInvalidPhone(10));
		
		//ship dropdown - cannot be invalid value
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id(config.getAddEmpShipField())));
		actions.click();
		actions.sendKeys(config.getShipValue());
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}

	@Then("^Click Save$")
	public void click_Save() throws Throwable {
		driver.findElement(By.id(config.getAddEmpSaveBtnId())).click();
	    
	}

	@Then("^Verify that an error message is displayed$")
	public void verify_that_an_error_message_is_displayed() throws Throwable {
	    
	    String expectedInvalidFNameMessage = config.getFNameInvalidMsg();
		String expectedInvalidLNameMessage = config.getLNameInvalidMsg();
		String expectedInvalidEmailMessage = config.getEmailInvalidMsg();
		String expectedInvalidPhoneMessage = config.getPhoneInvalidText();
		
		String actualFNameErr = driver.findElement(By.id(config.getBlankFNameEmp())).getText();
	    String actualLNameErr = driver.findElement(By.id(config.getBlankLNameEmp())).getText();
	    String actualEmailErr = driver.findElement(By.id(config.getEmployeeEmailErrorMessageId())).getText();
	   //phone String actualEmailErr = driver.findElement(By.id(config.getEmployeeEmailErrorMessageId())).getText();
	    
	    String actualEmailRequiredMessage = driver.findElement(By.xpath(config.getEmailRequiredMsgId())).getText();
	    String actualFNameRequiredMessage = driver.findElement(By.xpath(config.getFNameRequiredMsgId())).getText();
	    String actualLNameRequiredMessage = driver.findElement(By.xpath(config.getLNameRequiredMsgId())).getText();
	    
	    Assert.assertEquals(expectedInvalidFNameMessage, actualFNameErr);
	    Assert.assertEquals(expectedInvalidLNameMessage, actualLNameErr);
	    Assert.assertEquals(expectedInvalidEmailMessage, actualEmailErr);
	   // Assert.assertEquals(expectedInvalidPhoneMessage, actualEmailErr);
	    
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
