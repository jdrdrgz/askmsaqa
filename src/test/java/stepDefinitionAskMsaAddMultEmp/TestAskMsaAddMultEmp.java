package stepDefinitionAskMsaAddMultEmp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaAddMultEmp {
	
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
		
	    
	}

	@Then("^Supply all required fields with valid values multiple times and click Save$")
	public void supply_all_required_fields_with_valid_values_multiple_times_and_click_Save() throws Throwable {
		
		int i;
		
		for (i = 1; i < 150; i ++) {
			Thread.sleep(2000);
			driver.findElement(By.id(config.getAddEmpButtonId())).click();
			Thread.sleep(2000);
			driver.findElement(By.id(config.getAddEmpFNameField())).sendKeys(config.getRandomName(20));
			driver.findElement(By.id(config.getAddEmpLNameField())).sendKeys(config.getRandomName(20));
			driver.findElement(By.id(config.getAddEmpNumField())).sendKeys(config.getRandomEmpNum(10));
			
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.id("select2-ddlShip-container")));
			actions.click();
			actions.sendKeys("ship11");
			actions.sendKeys(Keys.ENTER);
			actions.build().perform();
			Thread.sleep(2000);
			driver.findElement(By.id("btnModalSave")).click();
		}
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
