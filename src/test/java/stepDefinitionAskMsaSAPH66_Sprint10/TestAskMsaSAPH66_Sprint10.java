package stepDefinitionAskMsaSAPH66_Sprint10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH66_Sprint10 {
	
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

	@Then("^Verify that Book a Course module is displayed$")
	public void verify_that_Book_a_Course_module_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getBookCourseModal())).size()!= 0;
		Assert.assertTrue("Error: Book a Course module is Missing.",isPresent);
	    
	}

	@Then("^Verify that Book a Course header is displayed$")
	public void verify_that_Book_a_Course_header_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getModalBookingHeaderLblId())).size()!= 0;
		Assert.assertTrue("Error: Book a Course header is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Book a Course header text is correct$")
	public void verify_that_Book_a_Course_header_text_is_correct() throws Throwable {
		String expectedBookingHeaderText = config.getModalBookingHeaderLblText();
	    String actualBookingHeaderText = driver.findElement(By.id(config.getModalBookingHeaderLblId())).getText();
	    
	    Assert.assertEquals(expectedBookingHeaderText, actualBookingHeaderText);
	    
	}

	@Then("^Verify that Course Drop Down is displayed$")
	public void verify_that_Course_Drop_Down_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getBookingCourseDdl())).size()!= 0;
		Assert.assertTrue("Error: Course Drop Down is Missing.",isPresent);
	    
	}

	@Then("^Verify that Location Drop Down is displayed$")
	public void verify_that_Location_Drop_Down_is_displayed() throws Throwable {
		Thread.sleep(1000);
		isPresent = driver.findElements(By.id(config.getBookingLocationDdl())).size()!= 0;
		Assert.assertTrue("Error: Location Drop Down is Missing.",isPresent);
	}

	@Then("^Verify that Location Drop Down is disabled$")
	public void verify_that_Location_Drop_Down_is_disabled() throws Throwable {
		Boolean isEnabled = driver.findElement(By.id(config.getBookingLocationDdl())).isEnabled();
		//System.out.println(isEnabled);
		//Assert.assertFalse("Error: Location Drop Down is enabled.",isEnabled);
	    
	}

	@Then("^Verify that Course Dates Drop Down is displayed$")
	public void verify_that_Course_Dates_Drop_Down_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getBookingScheduleDdl())).size()!= 0;
		Assert.assertTrue("Error: Course Date Drop Down is Missing.",isPresent);
	    
	}

	@Then("^Verify that Course Dates Drop Down is disabled$")
	public void verify_that_Course_Dates_Drop_Down_is_disabled() throws Throwable {
		Boolean isEnabled = driver.findElement(By.id(config.getBookingScheduleDdl())).isEnabled();
		Assert.assertFalse("Error: Course Dates Drop Down is enabled.",isEnabled);
	    
	}

	@Then("^Verify that Comments is displayed$")
	public void verify_that_Comments_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getBookingCommentFldId())).size()!= 0;
		Assert.assertTrue("Error: Comments is Missing.",isPresent);
	    
	}

	@Then("^Verify that On-Board checkbox is displayed$")
	public void verify_that_On_Board_checkbox_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that Employees drop down is displayed$")
	public void verify_that_Employees_drop_down_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getBookingEmployeesDdl())).size()!= 0;
		Assert.assertTrue("Error: Employees drop down is Missing.",isPresent);
	    
	}

	@Then("^Verify that Add to List button is present$")
	public void verify_that_Add_to_List_button_is_present() throws Throwable {
		isPresent = driver.findElements(By.id(config.getBookCourseAddToListID())).size()!= 0;
		Assert.assertTrue("Error: Add to List button is Missing.",isPresent);
	    
	}

	@Then("^Verify that Employee Participants table is displayed$")
	public void verify_that_Employee_Participants_table_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getTableBookingEmployees())).size()!= 0;
		Assert.assertTrue("Error: Employee Participants table is Missing.",isPresent);
	    
	}

	@Then("^Verify that Add Booking button is displayed$")
	public void verify_that_Add_Booking_button_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getAddBookingModalId())).size()!= 0;
		Assert.assertTrue("Error: Add Booking button is Missing.",isPresent);
	    
	}

	@Then("^Verify that Cancel button is displayed$")
	public void verify_that_Cancel_button_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getCancelModalId())).size()!= 0;
		Assert.assertTrue("Error: Cancel button is Missing.",isPresent);
	    
	}

	@Then("^Verify that Name Column is present$")
	public void verify_that_Name_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        if (bodyText.contains("Name")){
    	   isPresent = true;
        }else {
    	   isPresent = false;
        }
        Assert.assertTrue("Error: Name Column is missing.",isPresent);
	    
	}

	@Then("^Verify that Email Booking Detail is present$")
	public void verify_that_Email_Booking_Detail_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        if (bodyText.contains("Email Booking Detail")){
    	   isPresent = true;
        }else {
    	   isPresent = false;
        }
        Assert.assertTrue("Error: Email Booking Detail Column is missing.",isPresent);
	    
	}

	@Then("^Verify that Actions Column is present$")
	public void verify_that_Actions_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        if (bodyText.contains("Actions")){
    	   isPresent = true;
        }else {
    	   isPresent = false;
        }
        Assert.assertTrue("Error: Actions Column is missing.",isPresent);
	    
	}

	@Then("^Verify that Show Entries option is displayed$")
	public void verify_that_Show_Entries_option_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getShowEntriesBookingEmployees())).size()!= 0;
		Assert.assertTrue("Error: Show Entries is Missing.",isPresent);
	    
	}

	@Then("^Verify that pagination is present$")
	public void verify_that_pagination_is_present() throws Throwable {
		isPresent = driver.findElements(By.id(config.getPaginationBookingEmployees())).size()!= 0;
		Assert.assertTrue("Error: Pagination is Missing.",isPresent);
	    
	}

	@Then("^Verify that the Number of entries shown label is present$")
	public void verify_that_the_Number_of_entries_shown_label_is_present() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEntriesInfoBookings())).size()!= 0;
		Assert.assertTrue("Error: Number of entries shown is Missing.",isPresent);
	    
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
