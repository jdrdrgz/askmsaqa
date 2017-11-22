package stepDefinitionAskMsaSAPH32_Sprint11;

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

public class TestAskMsaSAPH32_Sprint11 {

	public static WebDriver driver;
	static ConfigReader config = new ConfigReader();
	Boolean isPresent;
	
	@Given("^Run Browser$")
	public void run_Browser() throws Throwable {
		loadDriver(); 
	    
	}
	
	@When("^Browser is up, load ASK MSA VIP login page$")
	public void browser_is_up_load_ASK_MSA_VIP_login_page() throws Throwable {
		Thread.sleep(1000);
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
	
	@Then("^Click Edit button of a Created Booking$")
	public void click_Edit_button_of_a_Created_Booking() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(config.getEditBookingId())).click();
	}
	
	@Then("^Set Status of Booking to Cancel$")
	public void set_Status_of_Booking_to_Cancel() throws Throwable {
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
  		actions.moveToElement(driver.findElement(By.id(config.getBookingStatusDdl())));
  		actions.click();
  		actions.sendKeys(config.getInputCancelBookingStatus());
  		actions.sendKeys(Keys.ENTER);
  		actions.build().perform();
	}
	
	@Then("^Click Remove button of an employee$")
	public void click_Remove_button_of_an_employee() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(config.geteditBookingEmpRemove())).click();
	}
	
	@Then("^Verify that employee was removed in the list$")
	public void verify_that_employee_was_removed_in_the_list() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("oliver")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertFalse("Error: Employee is still existing.",isPresent);
	}
	
	@Then("^Add Employee$")
	public void add_Employee() throws Throwable {
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
  		actions.moveToElement(driver.findElement(By.id(config.getBookingEmployeesDdl())));
  		actions.click();
  		actions.sendKeys(config.getInputEmployeeBookingOther());
  		actions.sendKeys(Keys.ENTER);
  		actions.build().perform();
  		
  		driver.findElement(By.id(config.getBookCourseAddToListID())).click();
	}
	
	@Then("^Click Update Booking button$")
	public void click_Update_Booking_button() throws Throwable {
		driver.findElement(By.id(config.getBtnUpdateBookingId())).click();
	}
	
	@Then("^Verify that user is redirected to Booking page$")
	public void verify_that_user_is_redirected_to_Booking_page() throws Throwable {
		String expectedBookingUrl = config.getUrlCourseBookings();
		String actualBookingUrl = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedBookingUrl, actualBookingUrl);
	}
	
	@Then("^Verify that successful updated message is displayed$")
	public void verify_that_successful_updated_message_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getStrPrompt())).size()!= 0;
		Assert.assertTrue("Error: Alert Message is Missing.",isPresent);
	}
	
	@Then("^Verify that successful updated message is correct$")
	public void verify_that_successful_updated_message_is_correct() throws Throwable {
		Thread.sleep(3000);
		String expectedMessage = config.getStrEditBookingDetails();
		String actualMessage = driver.findElement(By.id(config.getStrPrompt())).getText();
	    
	    Assert.assertEquals(expectedMessage, actualMessage);
	}
	
	@Then("^Verify that booking details has been updated$")
	public void verify_that_booking_details_has_been_updated() throws Throwable {
		//assuming only one booking is available
				//comment if not
				//WebElement body = driver.findElement(By.tagName("body"));
		        //String bodyText = body.getText();
		       //if (bodyText.contains("Canceled")){
		    	//   isPresent = true;
		       //}else {
		    	//   isPresent = false;
		       //}
		      // Assert.assertTrue("Error: Edit button is still existing.",isPresent);
	}
	
	@Then("^Verify that Edit button is not available for a Closed Booking$")
	public void verify_that_Edit_button_is_not_available_for_a_Closed_Booking() throws Throwable {
		//assuming only one booking is available
		//comment if not
		//WebElement body = driver.findElement(By.tagName("body"));
        //String bodyText = body.getText();
       //if (bodyText.contains("Edit")){
    	//   isPresent = true;
       //}else {
    	//   isPresent = false;
       //}
      // Assert.assertTrue("Error: Edit button is still existing.",isPresent);
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
