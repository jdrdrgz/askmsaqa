package stepDefinitionAskMsaSAPH30_Sprint10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH30_Sprint10 {
	
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
	
	@Then("^Verify that Course Bookings Page is displayed$")
	public void verify_that_Course_Bookings_Page_is_displayed() throws Throwable {
		String expectedCourseBookingPage = config.getUrlCourseBookings();
	    String actualCourseBookingPage = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedCourseBookingPage, actualCourseBookingPage);
	    
	}
	
	@Then("^Verify that Course Bookings header is displayed$")
	public void verify_that_Course_Bookings_header_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getCourseBookingHeaderLblId())).size()!= 0;
		Assert.assertTrue("Error: Course Bookings Header is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Course Bookings header text is correct$")
	public void verify_that_Course_Bookings_header_text_is_correct() throws Throwable {
		String expectedCourseBookingHeaderText = config.getCourseBookingHeaderLblText();
	    String actualCourseBookingHeaderText = driver.findElement(By.id(config.getCourseBookingHeaderLblId())).getText();
	    
	    Assert.assertEquals(expectedCourseBookingHeaderText, actualCourseBookingHeaderText);
	    
	}
	
	@Then("^Verify that Book a Course button is displayed$")
	public void verify_that_Book_a_Course_button_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getBookCourseButtonID())).size()!= 0;
		Assert.assertTrue("Error: Book a Course button is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Show Entries option is displayed$")
	public void verify_that_Show_Entries_option_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getShowEntriesBookings())).size()!= 0;
		Assert.assertTrue("Error: Show Entries option is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Search field is displayed$")
	public void verify_that_Search_field_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getSearchFilterBookings())).size()!= 0;
		Assert.assertTrue("Error: Search field is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Bookings table is displayed$")
	public void verify_that_Bookings_table_is_displayed() throws Throwable {
		isPresent = driver.findElements(By.id(config.getTableBookings())).size()!= 0;
		Assert.assertTrue("Error: Bookings table is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Date Booked Column is present$")
	public void verify_that_Date_Booked_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        if (bodyText.contains("Date Booked")){
    	   isPresent = true;
        }else {
    	   isPresent = false;
        }
        Assert.assertTrue("Error: Date Booked Column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Reference Number Column is present$")
	public void verify_that_Reference_Number_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        if (bodyText.contains("Reference Number")){
    	   isPresent = true;
        }else {
    	   isPresent = false;
        }
        Assert.assertTrue("Error: Reference Number Column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Course Name Column is present$")
	public void verify_that_Course_Name_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        if (bodyText.contains("Course Name")){
    	   isPresent = true;
        }else {
    	   isPresent = false;
        }
        Assert.assertTrue("Error: Course Name Column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Location Column is present$")
	public void verify_that_Location_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        if (bodyText.contains("Location")){
    	   isPresent = true;
        }else {
    	   isPresent = false;
        }
        Assert.assertTrue("Error: Location Column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Schedule Column is present$")
	public void verify_that_Schedule_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        if (bodyText.contains("Schedule")){
    	   isPresent = true;
        }else {
    	   isPresent = false;
        }
        Assert.assertTrue("Error: Schedule Column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Status Column is present$")
	public void verify_that_Status_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        if (bodyText.contains("Status")){
    	   isPresent = true;
        }else {
    	   isPresent = false;
        }
        Assert.assertTrue("Error: Status Column is missing.",isPresent);
	    
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
	
	@Then("^Verify that pagination is present$")
	public void verify_that_pagination_is_present() throws Throwable {
		isPresent = driver.findElements(By.id(config.getPaginationBookings())).size()!= 0;
		Assert.assertTrue("Error: Pagination is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that the Number of entries shown label is present$")
	public void verify_that_the_Number_of_entries_shown_label_is_present() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEntriesInfoBookings())).size()!= 0;
		Assert.assertTrue("Error: Number of entries is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Edit button is present$")
	public void verify_that_Edit_button_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Edit")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Edit button is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Details Button is present$")
	public void verify_that_Details_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Details")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Details button is missing.",isPresent);
	    
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
