package stepDefinitionAskMsaCancelEmp;

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

public class TestCancelEmp {
	
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

	@Then("^Supply fields with valid values$")
	public void supply_fields_with_valid_values() throws Throwable {
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

	@Then("^Click Cancel$")
	public void click_Cancel() throws Throwable {
		driver.findElement(By.id("btnModalclose")).click();

	}

	@Then("^Verify that user is redirected to Employees Screen$")
	public void verify_that_user_is_redirected_to_Employees_Screen() throws Throwable {
		String expectedEmpURL = config.getEmployeeUrl();
	    String actualEmpUrl = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedEmpURL, actualEmpUrl);

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
