package stepDefinitionAskMsaSAPH20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utility.ConfigReader;

public class TestAskMsaSAPH20 {
	
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
	
	@Then("^Supply all required fields with valid values$")
	public void supply_all_required_fields_with_valid_values() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id(config.getAddEmpFNameField())).sendKeys(config.getRandomName(20));
		driver.findElement(By.id(config.getAddEmpLNameField())).sendKeys(config.getRandomName(20));
		driver.findElement(By.id(config.getAddEmpNumField())).sendKeys(config.getRandomEmpNum(10));
		
		//ship dropdown
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id(config.getAddEmpShipField())));
		actions.click();
		actions.sendKeys(config.getShipValue());
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		
		driver.findElement(By.id(config.getAddEmpEmailFld())).sendKeys(config.getInputEmail());
		
		//datepicker selection
		driver.findElement(By.id(config.getAddEmpDOBFld())).click();
		driver.findElement(By.id(config.getAddEmpDOBFld())).sendKeys(config.getAddEmpDOBVal());
		driver.findElement(By.id(config.getAddEmpDOBFld())).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id(config.getAddEmpCommentFld())).sendKeys(config.getInputComments());
		driver.findElement(By.id(config.getAddEmpAddressFld())).sendKeys(config.getAddEmpAddressVal());
		driver.findElement(By.id(config.getAddEmpZipFld())).sendKeys(config.getAddEmpZipVal());
		driver.findElement(By.id(config.getAddEmpCityFld())).sendKeys(config.getAddEmpCityVal());
		driver.findElement(By.id(config.getAddEmpCountryFld())).sendKeys(config.getAddEmpCountryVal());
		driver.findElement(By.id(config.getAddEmpPhoneFld())).sendKeys(config.getInputPhone());
	}
	
	@Then("^Click Save$")
	public void click_Save() throws Throwable {
		driver.findElement(By.id(config.getAddEmpSaveBtnId())).click();
	    
	}
	
	@Then("^Verify that Employee added successfully message is displayed$")
	public void verify_that_Employee_added_successfully_message_is_displayed() throws Throwable {
		String expectedAddEmpSuccessMsg = config.getAddEmployeeSuccessExpected();
	    String actualAddEmpSuccessMsg = driver.findElement(By.id(config.getAddEmpSuccessId())).getText();
	    
	    Assert.assertEquals(expectedAddEmpSuccessMsg, actualAddEmpSuccessMsg);
	}
	
	@Then("^Verify that user is redirected to Employees Screen$")
	public void verify_that_user_is_redirected_to_Employees_Screen() throws Throwable {
	    String expectedEmpURL = config.getEmployeeUrl();
	    String actualEmpUrl = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedEmpURL, actualEmpUrl);
	    
	}
	
	@Then("^Verify that employee is added in the table$")
	public void verify_that_employee_is_added_in_the_table() throws Throwable {
		WebElement body = driver.findElement(By.id("tblEmployee"));
        String bodyText = body.getText();
        System.out.println(bodyText);
    
       // int count = 0;
       // while (bodyText.contains("0000000")){
         //   count++;
          //  bodyText = bodyText.substring(bodyText.indexOf("0000000") + "0000000".length());
          //  System.out.println("test confirmed");
       // }
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
