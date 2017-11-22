package stepDefinitionAskMsaSAPH68_Sprint11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH68_Sprint11 {
	
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
	
	@Then("^Select an Employee without registered email address and click Add to List button$")
	public void select_an_Employee_without_registered_email_address_and_click_Add_to_List_button() throws Throwable {
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
  		actions.moveToElement(driver.findElement(By.id(config.getBookingEmployeesDdl())));
  		actions.click();
  		actions.sendKeys(config.getInputEmployeeBookingWithoutEmail());
  		actions.sendKeys(Keys.ENTER);
  		actions.build().perform();
  		
  		driver.findElement(By.id(config.getBookCourseAddToListID())).click();
	    
	}
	
	@Then("^Verify that No Email Registered is displayed in the Email Booking Details column if email is not available$")
	public void verify_that_No_Email_Registered_is_displayed_in_the_Email_Booking_Details_column_if_email_is_not_available() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("No email registered")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: No Email Registered message is missing.",isPresent);
 	    
	}
	
	@Then("^Click Add Booking button$")
	public void click_Add_Booking_button() throws Throwable {
		driver.findElement(By.id(config.getAddBookingModalId())).click(); 
	    
	}
	
	@Then("^Verify that successful booking message is displayed$")
	public void verify_that_successful_booking_message_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getBookingCommentFldId())).size()!= 0;
		Assert.assertTrue("Error: Alert Message is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that successful booking message is correct$")
	public void verify_that_successful_booking_message_is_correct() throws Throwable {
		Thread.sleep(2000);
		String expectedMessage = config.getTxtSuccessAddBooking();
		String actualMessage = driver.findElement(By.id("strPrompt")).getText();
	    
	    Assert.assertEquals(expectedMessage, actualMessage);

	    
	}
	
	@Then("^Verify that user is redirected to Booking page$")
	public void verify_that_user_is_redirected_to_Booking_page() throws Throwable {
		String expectedBookingUrl = config.getUrlCourseBookings();
		String actualBookingUrl = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedBookingUrl, actualBookingUrl);
	    
	}
	
	@Then("^Verify that Booking is added in the table$")
	public void verify_that_Booking_is_added_in_the_table() throws Throwable {
	    
	    
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
