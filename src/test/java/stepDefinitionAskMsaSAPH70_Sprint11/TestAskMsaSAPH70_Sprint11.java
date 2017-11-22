package stepDefinitionAskMsaSAPH70_Sprint11;

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

public class TestAskMsaSAPH70_Sprint11 {


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
	
	@Then("^Select A Course$")
	public void select_A_Course() throws Throwable {
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
  		actions.moveToElement(driver.findElement(By.id(config.getBookingCourseDdl())));
  		actions.click();
  		actions.sendKeys(config.getInputCourse());
  		actions.sendKeys(Keys.ENTER);
  		actions.build().perform();
	    
	}
	
	@Then("^Verify that Location Drop Down is Enabled$")
	public void verify_that_Location_Drop_Down_is_Enabled() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.id(config.getBookingLocationDdl())).isEnabled());
	}
	
	@Then("^Select a Location$")
	public void select_a_Location() throws Throwable {
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
  		actions.moveToElement(driver.findElement(By.id(config.getBookingLocationDdl())));
  		actions.click();
  		actions.sendKeys(config.getInputLocation());
  		actions.sendKeys(Keys.ENTER);
  		actions.build().perform();
	    
	}
	
	@Then("^Verify that Course Dates Drop Down is Enabled$")
	public void verify_that_Course_Dates_Drop_Down_is_Enabled() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.id(config.getBookingScheduleDdl())).isEnabled());
	    
	}
	
	@Then("^Select a Course Date$")
	public void select_a_Course_Date() throws Throwable {
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
  		actions.moveToElement(driver.findElement(By.id(config.getBookingScheduleDdl())));
  		actions.click();
  		actions.sendKeys(config.getInputSchedule());
  		actions.sendKeys(Keys.ENTER);
  		actions.build().perform();
	    
	}
	
	@Then("^Verify that On-Board check box is NOT ticked$")
	public void verify_that_On_Board_check_box_is_NOT_ticked() throws Throwable {
		
	    
	}
	
	@Then("^Select an Employee with registered email address and click Add to List button$")
	public void select_an_Employee_with_registered_email_address_and_click_Add_to_List_button() throws Throwable {
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
  		actions.moveToElement(driver.findElement(By.id(config.getBookingEmployeesDdl())));
  		actions.click();
  		actions.sendKeys(config.getInputEmployeeBooking());
  		actions.sendKeys(Keys.ENTER);
  		actions.build().perform();
  		
  		driver.findElement(By.id(config.getBookCourseAddToListID())).click();
	    
	}
	
	@Then("^Tick Email Booking Details checkbox if available$")
	public void tick_Email_Booking_Details_checkbox_if_available() throws Throwable {
		driver.findElement(By.id(config.getTickBookingEmp())).click();
	    
	}
	
	@Then("^Click Cancel button$")
	public void click_Cancel_button() throws Throwable {
		driver.findElement(By.id(config.getCancelModalId())).click();
	    
	}
	
	@Then("^Verify that user is redirected to Booking page$")
	public void verify_that_user_is_redirected_to_Booking_page() throws Throwable {
		String expectedBookingUrl = config.getUrlCourseBookings();
		String actualBookingUrl = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedBookingUrl, actualBookingUrl);
	    
	}
	
	@Then("^Verify that Booking is not added in the table$")
	public void verify_that_Booking_is_not_added_in_the_table() throws Throwable {
	    
	    
	}
	
	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	    
	    
	}
	
	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
}
