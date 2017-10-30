package stepDefinitionAskMsaSAPH30_Sprint10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestASkMsaSAPH30_Sprint10 {
	
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
	    
	    
	}
	
	@Then("^Verify that Course Bookings header is displayed$")
	public void verify_that_Course_Bookings_header_is_displayed() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Book a Course button is displayed$")
	public void verify_that_Book_a_Course_button_is_displayed() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Show Entries option is displayed$")
	public void verify_that_Show_Entries_option_is_displayed() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Search field is displayed$")
	public void verify_that_Search_field_is_displayed() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Bookings table is displayed$")
	public void verify_that_Bookings_table_is_displayed() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Date Booked Column is present$")
	public void verify_that_Date_Booked_Column_is_present() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Course Name Column is present$")
	public void verify_that_Course_Name_Column_is_present() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Location Column is present$")
	public void verify_that_Location_Column_is_present() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Schedule Column is present$")
	public void verify_that_Schedule_Column_is_present() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Status Column is present$")
	public void verify_that_Status_Column_is_present() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that Actions Column is present$")
	public void verify_that_Actions_Column_is_present() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that pagination is present$")
	public void verify_that_pagination_is_present() throws Throwable {
	    
	    
	}
	
	@Then("^Verify that the Number of entries shown label is present$")
	public void verify_that_the_Number_of_entries_shown_label_is_present() throws Throwable {
	    
	    
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
