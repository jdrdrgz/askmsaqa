package stepDefinitionAskMsaSASM29;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.ConfigReader;

public class TestAskMsaSASM29 {

	public static WebDriver driver;
	static ConfigReader config=new ConfigReader();
	
	public boolean isPresent;
	
	@Given("^Run Browser for View Personal Information$")
	public void run_Browser_for_View_Personal_Information() throws Throwable {
		loadDriver();   
	}

	@When("^Browser is up, load ASK MSA VIP login page for View Personal Information$")
	public void browser_is_up_load_ASK_MSA_VIP_login_page_for_View_Personal_Information() throws Throwable {
		driver.get(config.getASKMSAUrl()); 
	}

	@Then("^Enter Username for View Personal Information$")
	public void enter_Username_for_View_Personal_Information() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getUserName())).sendKeys(config.getUserNameCred()); 
	}

	@Then("^Enter Password for View Personal Information$")
	public void enter_Password_for_View_Personal_Information() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getPassword())).sendKeys(config.getPasswordCred());
	}

	@Then("^Click Login button for View Personal Information$")
	public void click_Login_button_for_View_Personal_Information() throws Throwable {
		driver.findElement(By.id(config.getbtnsubmit())).click(); 
	}

	@Then("^Click Profile dropdown for View Personal Information$")
	public void click_Profile_dropdown_for_View_Personal_Information() throws Throwable {
		driver.findElement(By.id(config.getBtnProfileDropDown())).click();
	}

	@Then("^Click Profile option for View Personal Information$")
	public void click_Profile_option_for_View_Personal_Information() throws Throwable {
		driver.findElement(By.id(config.getBtnProfileMenu())).click();
		
		ConfigReader.captureScreenshot(driver, "View Personal Info");
	}
	
	@Then("^Validate that Full Name field is displayed for View Personal Information$")
	public void validate_that_Full_Name_field_is_displayed_for_View_Personal_Information() throws Throwable {
		isPresent = driver.findElements(By.id(config.getFNameLabelId())).size()!= 0;
		   if (isPresent == true){
		    System.out.println("Name Label is Present");
		  } else{
		    System.out.println("Error: Name Label is Missing");
		   }
	}
	
	@Then("^Validate that Full Name text is correct for View Personal Information$")
	public void validate_that_Full_Name_text_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrFullName = config.getFNameFieldText() + " " + config.getLNameFieldText();
		String actualStrFulllName = driver.findElement(By.id(config.getFullNameFieldId())).getText();
		Assert.assertEquals(expectedStrFullName, actualStrFulllName);
	}
	
	@Then("^Validate that Personal Information header is displayed for View Personal Information$")
	public void validate_that_Personal_Information_header_is_displayed_for_View_Personal_Information() throws Throwable {
		isPresent = driver.findElements(By.id(config.getPersonalInfoHeaderId())).size()!= 0;
		   if (isPresent == true){
		   System.out.println("Name Label is Present");
		   } else{
		    System.out.println("Error: Name Label is Missing");
		   }
	}
	
	@Then("^Validate that Personal Information text is correct for View Personal Information$")
	public void validate_that_Personal_Information_text_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrPersonalInfo = config.getPersonalInfoHeaderText();
		String actualStrPersonalInfo = driver.findElement(By.id(config.getPersonalInfoHeaderId())).getText();
		
		Assert.assertEquals(expectedStrPersonalInfo, actualStrPersonalInfo);
	}
	
	@Then("^Validate that Edit Profile button is displayed for View Personal Information$")
	public void validate_that_Edit_Profile_button_is_displayed_for_View_Personal_Information() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditProfileButtonId())).size()!= 0;
		   if (isPresent == true){
		    System.out.println("Edit Profile Button is Present");
		   } else{
		    System.out.println("Error: Name Label is Missing");
		  }
	}
	
	@Then("^Validate that Edit Profile button text is correct for View Personal Information$")
	public void validate_that_Edit_Profile_button_text_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrEditProfile = config.getEditProfileButtonText();
		String actualStrEditProfile = driver.findElement(By.id(config.getEditProfileButtonId())).getText();
		
		Assert.assertEquals(expectedStrEditProfile, actualStrEditProfile);
	}
	
	@Then("^Validate that Name label is displayed for View Personal Information$")
	public void validate_that_Name_label_is_displayed_for_View_Personal_Information() throws Throwable {
		isPresent = driver.findElements(By.id(config.getFNameLabelId())).size()!= 0;
		   if (isPresent == true){
		    System.out.println("Name Label is Present");
		   } else{
		    System.out.println("Error: Name Label is Missing");
		   }
	}
	
	@Then("^Validate that Name label text is correct for View Personal Information$")
	public void validate_that_Name_label_text_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrFName = config.getFNameLabelText();
		String actualStrFName = driver.findElement(By.id(config.getFNameLabelId())).getText();
		
		Assert.assertEquals(expectedStrFName, actualStrFName);
	}
	
	@Then("^Validate that Name Field is displayed for View Personal Information$")
	public void validate_that_Name_Field_is_displayed_for_View_Personal_Information() throws Throwable {
		if (driver.findElement(By.id(config.getFNameFieldId())).isDisplayed()) {
			System.out.println("Name Value is present");  
		} else {
			System.out.println("Error: Name Value is missing");
		}
	}
	
	@Then("^Validate that Name Field Value is correct for View Personal Information$")
	public void validate_that_Name_Field_Value_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrFNameValue = config.getFNameFieldText();
		String actualStrFNameValue = driver.findElement(By.id(config.getFNameFieldId())).getText();
		
		Assert.assertEquals(expectedStrFNameValue, actualStrFNameValue);
	}
	
	@Then("^Validate that Last Name label is displayed for View Personal Information$")
	public void validate_that_Last_Name_label_is_displayed_for_View_Personal_Information() throws Throwable {
		isPresent = driver.findElements(By.id(config.getLNameLabelId())).size()!= 0;
		   if (isPresent == true){
		    System.out.print("Last Name Label is Present");
		   } else{
		    System.out.print("Error: Last Name Label is Missing");
		   }
	}
	
	@Then("^Validate that Last Name label text is correct for View Personal Information$")
	public void validate_that_Last_Name_label_text_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrLName = config.getLNameLabelText();
		String actualStrLName = driver.findElement(By.id(config.getLNameLabelId())).getText();
		
		Assert.assertEquals(expectedStrLName, actualStrLName);
	}
	
	@Then("^Validate that Last Name Field is displayed for View Personal Information$")
	public void validate_that_Last_Name_Field_is_displayed_for_View_Personal_Information() throws Throwable {
		if (driver.findElement(By.id(config.getLNameFieldId())).isDisplayed()) {
			System.out.println("Last Name Value is present");  
		} else {
			System.out.println("Error: Last Name Value is missing");
		}
	}
	
	@Then("^Validate that Last Name Field Value is correct for View Personal Information$")
	public void validate_that_Last_Name_Field_Value_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrLNameValue = config.getLNameFieldText();
		String actualStrLNameValue = driver.findElement(By.id(config.getLNameFieldId())).getText();
		
		Assert.assertEquals(expectedStrLNameValue, actualStrLNameValue);
	}
	
	@Then("^Validate that Email label is displayed for View Personal Information$")
	public void validate_that_Email_label_is_displayed_for_View_Personal_Information() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEmailLabelId())).size()!= 0;
		   if (isPresent == true){
		    System.out.print("Email Label is Present");
		   } else{
		    System.out.print("Error: Email Label is Missing");
		   }
	}
	
	@Then("^Validate that Email label text is correct for View Personal Information$")
	public void validate_that_Email_label_text_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrEmail = config.getEmailLabelText();
		String actualStrEmail = driver.findElement(By.id(config.getEmailLabelId())).getText();
		
		Assert.assertEquals(expectedStrEmail, actualStrEmail);
	}
	
	@Then("^Validate that Email Field is displayed for View Personal Information$")
	public void validate_that_Email_Field_is_displayed_for_View_Personal_Information() throws Throwable {
		if (driver.findElement(By.id(config.getEmailFieldId())).isDisplayed()) {
			System.out.println("Email Value is present");  
		} else {
			System.out.println("Error: Email Value is missing");
		}
	}
	
	@Then("^Validate that Email Field Value is correct for View Personal Information$")
	public void validate_that_Email_Field_Value_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrEmailValue = config.getEmailFieldText();
		String actualStrEmailValue = driver.findElement(By.id(config.getEmailFieldId())).getText();
		
		Assert.assertEquals(expectedStrEmailValue, actualStrEmailValue);
	}
	
	@Then("^Validate that Company label is displayed for View Personal Information$")
	public void validate_that_Company_label_is_displayed_for_View_Personal_Information() throws Throwable {
		isPresent = driver.findElements(By.id(config.getCompanyLabelId())).size()!= 0;
		   if (isPresent == true){
		    System.out.print("Company Label is Present");
		   } else{
		    System.out.print("Error: Company Label is Missing");
		   }
	}
	
	@Then("^Validate that Company label text is correct for View Personal Information$")
	public void validate_that_Company_label_text_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrCompany = config.getCompanyLabelText();
		String actualStrCompany = driver.findElement(By.id(config.getCompanyLabelId())).getText();
		
		Assert.assertEquals(expectedStrCompany, actualStrCompany);
	}
	
	@Then("^Validate that Company Field is displayed for View Personal Information$")
	public void validate_that_Company_Field_is_displayed_for_View_Personal_Information() throws Throwable {
		if (driver.findElement(By.id(config.getCompanyFieldId())).isDisplayed()) {
			System.out.println("Company Value is present");  
		} else {
			System.out.println("Error: Company Value is missing");
		}
	}
	
	@Then("^Validate that Company Field Value is correct for View Personal Information$")
	public void validate_that_Company_Field_Value_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrCompanyValue = config.getCompanyFieldText();
		String actualStrCompanyValue = driver.findElement(By.id(config.getCompanyFieldId())).getText();
		
		Assert.assertEquals(expectedStrCompanyValue, actualStrCompanyValue);
	}

	@Then("^Validate that Telephone label is displayed for View Personal Information$")
	public void validate_that_Telephone_label_is_displayed_for_View_Personal_Information() throws Throwable {
		isPresent = driver.findElements(By.id(config.getPhoneLabel())).size()!= 0;
	    if (isPresent == true){
			System.out.println("Telephone Label is present");  
		} else {
			System.out.println("Error: Telephone Label is missing");
		}
	}
	
	@Then("^Validate that Telephone label text is correct for View Personal Information$")
	public void validate_that_Telephone_label_text_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrTelephone = config.getPhoneLabelText();
		String actualStrTelephone = driver.findElement(By.id(config.getPhoneLabel())).getText();
		
		Assert.assertEquals(expectedStrTelephone, actualStrTelephone);
	}
	
	@Then("^Validate that Telephone Field is displayed for View Personal Information$")
	public void validate_that_Telephone_Field_is_displayed_for_View_Personal_Information() throws Throwable {

		isPresent = driver.findElements(By.id(config.getPhoneFieldId())).size()!= 0;
		if (isPresent == true){
			System.out.println("Telephone Value is present");  
		} else {
			System.out.println("Error: Telephone Value is missing");
		}
	}
	
	@Then("^Validate that Telephone Field Value is correct for View Personal Information$")
	public void validate_that_Telephone_Field_Value_is_correct_for_View_Personal_Information() throws Throwable {
		String expectedStrTelephoneValue = config.getPhoneFieldVal();
		String actualStrTelephoneValue = driver.findElement(By.id(config.getPhoneFieldId())).getText();
		
		Assert.assertEquals(expectedStrTelephoneValue, actualStrTelephoneValue);
	}
	
	@Then("^Close Browser Driver for View Personal Information$")
	public void close_Browser_Driver_for_View_Personal_Information() throws Throwable {
		driver.quit();
	}
	
	
	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
}
