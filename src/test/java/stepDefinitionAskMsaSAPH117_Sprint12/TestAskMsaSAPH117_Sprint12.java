package stepDefinitionAskMsaSAPH117_Sprint12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH117_Sprint12 {
	
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

	@Then("^Click Details button of a Regular Booking$")
	public void click_Details_button_of_a_Regular_Booking() throws Throwable {
	    driver.findElement(By.xpath(config.getBtnRegularBookingDetails())).click();
	    
	}

	@Then("^Verify that Booking Details page is displayed$")
	public void verify_that_Booking_Details_page_is_displayed() throws Throwable {
	    //page has no id
	    
	}

	@Then("^Verify that Reference Number is displayed$")
	public void verify_that_Reference_Number_is_displayed() throws Throwable {
		//page has no id
	    
	}

	@Then("^Verify that Course is displayed$")
	public void verify_that_Course_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that Ordered Date is displayed$")
	public void verify_that_Ordered_Date_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that Course Code is displayed$")
	public void verify_that_Course_Code_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that Project Code is displayed$")
	public void verify_that_Project_Code_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that Start Date is displayed$")
	public void verify_that_Start_Date_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that End Date is displayed$")
	public void verify_that_End_Date_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that Unknown is displayed if no date is available$")
	public void verify_that_Unknown_is_displayed_if_no_date_is_available() throws Throwable {
	    
	    
	}

	@Then("^Verify that Price is displayed$")
	public void verify_that_Price_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that Price value is not contractual$")
	public void verify_that_Price_value_is_not_contractual() throws Throwable {
	    
	    
	}

	@Then("^Verify that price is Not available if (\\d+) or null$")
	public void verify_that_price_is_Not_available_if_or_null(int arg1) throws Throwable {
	    
	    
	}

	@Then("^Verify that Location is displayed$")
	public void verify_that_Location_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that Location Description is displayed$")
	public void verify_that_Location_Description_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that employees table is present$")
	public void verify_that_employees_table_is_present() throws Throwable {
	    
	    
	}

	@Then("^verify that employees table is not empty$")
	public void verify_that_employees_table_is_not_empty() throws Throwable {
	    
	    
	}

	@Then("^Verify that Show Entries option is displayed$")
	public void verify_that_Show_Entries_option_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that Search field is displayed$")
	public void verify_that_Search_field_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify that pagination is present$")
	public void verify_that_pagination_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that the Number of entries shown label is present$")
	public void verify_that_the_Number_of_entries_shown_label_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Date Booked Column is present$")
	public void verify_that_Date_Booked_Column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Employee Column is present$")
	public void verify_that_Employee_Column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Employee Number Column is present$")
	public void verify_that_Employee_Number_Column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Ship Column is present$")
	public void verify_that_Ship_Column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Actions Column is present$")
	public void verify_that_Actions_Column_is_present() throws Throwable {
	    
	    
	}

	@Then("^Verify that Booking button is present$")
	public void verify_that_Booking_button_is_present() throws Throwable {
	    
	    
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		//driver.close();
	    
	}

	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
