package stepDefinitionAskMsaSAPH23_Sprint09;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSAPH23_Sprint09 {

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
	
	@Then("^Click Organization dropdown$")
	public void click_Organization_dropdown() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getOrganizationButtonId())).click();	
	}
	
	@Then("^Click Ships$")
	public void click_Ships() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getShipButtonId())).click();	
	
	}
	
	@Then("^Verify that Ships Page is displayed$")
	public void verify_that_Ships_Page_is_displayed() throws Throwable {
	    String expectedShipPage = config.getShipsURL();
	    String actualShipPage = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedShipPage, actualShipPage);
	    
	}
	
	@Then("^Verify that Ships header is displayed$")
	public void verify_that_Ships_header_is_displayed() throws Throwable {
		Boolean isPresent = driver.findElements(By.xpath(config.getLblShipsHeader())).size()!= 0;
		Assert.assertTrue("Error: Ships Header is Missing.",isPresent);
		
	}
	
	@Then("^Verify that Add Ship button is displayed$")
	public void verify_that_Add_Ship_button_is_displayed() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getAddShipButtonId())).size()!= 0;
		Assert.assertTrue("Error: Add Ship button is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Show Entries option is displayed$")
	public void verify_that_Show_Entries_option_is_displayed() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getShowEntriesShips())).size()!= 0;
		Assert.assertTrue("Error: Show Entries option is Missing.",isPresent);
		
	}
	
	@Then("^Verify that Search field is displayed$")
	public void verify_that_Search_field_is_displayed() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getSearchFieldShips())).size()!= 0;
		Assert.assertTrue("Error: Search Field is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that Ships table is displayed$")
	public void verify_that_Ships_table_is_displayed() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getTableShips())).size()!= 0;
		Assert.assertTrue("Error: Ships table is Missing.",isPresent);
	    
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
       Assert.assertTrue("Error: Name column is missing.",isPresent);
	}
	
	@Then("^Verify that User Name Column is present$")
	public void verify_that_User_Name_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("User Name")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: User Name column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Contact Person Column is present$")
	public void verify_that_Contact_Person_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("Contact Person")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: Contact Person column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that IMO Column is present$")
	public void verify_that_IMO_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
       if (bodyText.contains("IMO")){
    	   isPresent = true;
       }else {
    	   isPresent = false;
       }
       Assert.assertTrue("Error: IMO column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Division Column is present$")
	public void verify_that_Division_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
		String bodyText = body.getText();
	       if (bodyText.contains("Division")){
	    	   isPresent = true;
	       }else {
	    	   isPresent = false;
	       }
	       Assert.assertTrue("Error: Division column is missing.",isPresent);
	    
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
	       Assert.assertTrue("Error: Status column is missing.",isPresent);
	    
	}
	
	@Then("^Verify that Actions Column is present$")
	public void verify_that_Actions_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
		String bodyText = body.getText();
	       if (bodyText.contains("Action")){
	    	   isPresent = true;
	       }else {
	    	   isPresent = false;
	       }
	       Assert.assertTrue("Error: Action column is missing.",isPresent);
	    
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
	
	@Then("^Verify that Delete Column is present$")
	public void verify_that_Delete_Column_is_present() throws Throwable {
		WebElement body = driver.findElement(By.tagName("body"));
		String bodyText = body.getText();
	       if (bodyText.contains("Delete")){
	    	   isPresent = true;
	       }else {
	    	   isPresent = false;
	       }
	       Assert.assertTrue("Error: Delete button is missing.",isPresent);
	    
	}
	
	@Then("^Verify that pagination is present$")
	public void verify_that_pagination_is_present() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getPaginationShips())).size()!= 0;
		Assert.assertTrue("Error: Pagination is Missing.",isPresent);
	    
	}
	
	@Then("^Verify that the Number of entries shown label is present$")
	public void verify_that_the_Number_of_entries_shown_label_is_present() throws Throwable {
		Boolean isPresent = driver.findElements(By.id(config.getTableInfoShips())).size()!= 0;
		Assert.assertTrue("Error: Number of Entries is Missing.",isPresent);
	    
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
