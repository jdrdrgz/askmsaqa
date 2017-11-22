package stepDefinitionAskMsaSAPH69_Sprint10;

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

public class TestAskMsaSAPH69_Sprint10 {

	public static WebDriver driver;
	static ConfigReader config = new ConfigReader();
	Boolean isPresent;
	
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
	
	@Then("^Click Course Bookings dropdown$")
	public void click_Course_Bookings_dropdown() throws Throwable {
	    driver.findElement(By.id(config.getCourseBookingsNavDD())).click();
	    
	}
	
	@Then("^Click Course Bookings$")
	public void click_Course_Bookings() throws Throwable {
		 driver.findElement(By.id(config.getCourseBookingsNav())).click();
	    
	}

	@Then("^Click Book a Course button$")
	public void click_Book_a_Course_button() throws Throwable {
	    driver.findElement(By.id(config.getBookCourseButtonID())).click();
	    
	}

	
	@Then("^Click Add Booking button$")
	public void click_Add_Booking_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getAddBookingModalId())).click();
	}
	
	@Then("^Verify that an error message is displayed in Course$")
	public void verify_that_an_error_message_is_displayed_in_Course() throws Throwable {
	    String expectedFldRequiredMsg = config.getRequiredFieldErrMsg();
	    String actualFldRequiredMsg = driver.findElement(By.id(config.getActualBookingCourseBlankMsgId())).getText();
	    
	    Assert.assertEquals(expectedFldRequiredMsg, actualFldRequiredMsg);
	}
	
	@Then("^Select a Course and click Add Booking button$")
	public void select_a_Course_and_click_Add_Booking_button() throws Throwable {
	  		Actions actions = new Actions(driver);
	  		actions.moveToElement(driver.findElement(By.id(config.getBookingCourseDdl())));
	  		actions.click();
	  		actions.sendKeys(config.getInputCourse());
	  		actions.sendKeys(Keys.ENTER);
	  		actions.build().perform();
	  		
	  		driver.findElement(By.id(config.getAddBookingModalId())).click();
	}
	
	@Then("^Verify that an error message is displayed in Location$")
	public void verify_that_an_error_message_is_displayed_in_Location() throws Throwable {
		String expectedFldRequiredMsg = config.getRequiredFieldErrMsg();
	    String actualFldRequiredMsg = driver.findElement(By.id(config.getActualBookingLocationBlankMsgId())).getText();
	    
	    Assert.assertEquals(expectedFldRequiredMsg, actualFldRequiredMsg);
	    
	}
	
	@Then("^Select a Location and click Add Booking button$")
	public void select_a_Location_and_click_Add_Booking_button() throws Throwable {
		Actions actions = new Actions(driver);
  		actions.moveToElement(driver.findElement(By.id(config.getBookingLocationDdl())));
  		actions.click();
  		actions.sendKeys(config.getInputLocation());
  		actions.sendKeys(Keys.ENTER);
  		actions.build().perform();
  		
  		driver.findElement(By.id(config.getAddBookingModalId())).click(); 	
	    
	}
	
	@Then("^Verify that an error message is displayed in Course Dates$")
	public void verify_that_an_error_message_is_displayed_in_Course_Dates() throws Throwable {
		String expectedFldRequiredMsg = config.getRequiredFieldErrMsg();
	    String actualFldRequiredMsg = driver.findElement(By.id(config.getActualBookingScheduleBlankMsgId())).getText();
	    
	    Assert.assertEquals(expectedFldRequiredMsg, actualFldRequiredMsg);
	    
	}
	
	@Then("^Select a Course Date and click Add Booking button$")
	public void select_a_Course_Date_and_click_Add_Booking_button() throws Throwable {
		Actions actions = new Actions(driver);
  		actions.moveToElement(driver.findElement(By.id(config.getBookingScheduleDdl())));
  		actions.click();
  		actions.sendKeys(config.getInputSchedule());
  		actions.sendKeys(Keys.ENTER);
  		actions.build().perform();
  		
  		driver.findElement(By.id(config.getAddBookingModalId())).click(); 
	    
	}
	
	@Then("^Verify that an error message is displayed in Employee$")
	public void verify_that_an_error_message_is_displayed_in_Employee() throws Throwable {
	    
	    
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
