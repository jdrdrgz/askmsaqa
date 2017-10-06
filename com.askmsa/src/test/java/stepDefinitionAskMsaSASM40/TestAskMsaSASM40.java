package stepDefinitionAskMsaSASM40;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utility.ConfigReader;

public class TestAskMsaSASM40 {
	
	public static WebDriver driver;
	static ConfigReader config = new ConfigReader();
	
	Boolean isPresent;
	Boolean isRequired;
	Boolean isEnabled;
	//test add git

	@Given("^Run Browser for Edit Profile$")
	public void run_Browser_for_Edit_Profile() throws Throwable {
		loadDriver(); 
	}

	@When("^Browser is up, load ASK MSA VIP login page for Edit Profile$")
	public void browser_is_up_load_ASK_MSA_VIP_login_page_for_Edit_Profile() throws Throwable {
		driver.get(config.getASKMSAUrl()); 
	}

	@Then("^Enter Username for Edit Profile$")
	public void enter_Username_for_Edit_Profile() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getUserName())).sendKeys(config.getUserNameCred()); 
	}

	@Then("^Enter Password for Edit Profile$")
	public void enter_Password_for_Edit_Profile() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getPassword())).sendKeys(config.getPasswordCred());   
	}

	@Then("^Click Login button for Edit Profile$")
	public void click_Login_button_for_Edit_Profile() throws Throwable {
		driver.findElement(By.id(config.getbtnsubmit())).click();
	}

	@Then("^Click Profile dropdown for Edit Profile$")
	public void click_Profile_dropdown_for_Edit_Profile() throws Throwable {
		driver.findElement(By.id(config.getBtnProfileDropDown())).click();
	}

	@Then("^Click Profile option for Edit Profile$")
	public void click_Profile_option_for_Edit_Profile() throws Throwable {
		driver.findElement(By.id(config.getBtnProfileMenu())).click();
	}

	@Then("^Click Edit Profile button for Edit Profile$")
	public void click_Edit_Profile_button_for_Edit_Profile() throws Throwable {
	    driver.findElement(By.id(config.getEditProfileButtonId())).click();
	}

	@Then("^Validate that Edit Profile Page is loaded$")
	public void validate_that_Edit_Profile_Page_is_loaded() throws Throwable {
	    String expectedUrl = config.getEditProfileURL();
	    String actualUrl = driver.getCurrentUrl();
	    
	    Assert.assertEquals(expectedUrl, actualUrl);
	}

	@Then("^Validate that Edit Profile header is displayed for Edit Profile$")
	public void validate_that_Edit_Profile_header_is_displayed_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditProfileLabelId())).size()!= 0;
		Assert.assertTrue("Error: Edit Profile Header is Missing.",isPresent);
	}

	@Then("^Validate that Edit Profile header text is correct for Edit Profile$")
	public void validate_that_Edit_Profile_header_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedStrEditProfileHeader = config.getEditProfileLabelText();
		String actualStrEditProfileHeader = driver.findElement(By.id(config.getEditProfileLabelId())).getText();
		Assert.assertEquals(expectedStrEditProfileHeader, actualStrEditProfileHeader);
	    
	}

	@Then("^Validate that Personal Details header is displayed for Edit Profile$")
	public void validate_that_Personal_Details_header_is_displayed_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getPersonalDetailsLabelId())).size()!= 0;
		Assert.assertTrue("Error: Personal Details Header is Missing",isPresent);	    
	}

	@Then("^Validate that Personal Details header text is correct for Edit Profile$")
	public void validate_that_Personal_Details_header_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedStrPersonalDetailsHeader = config.getPersonalDetailsLabelText();
		String actualStrPersonalDetailsHeader = driver.findElement(By.id(config.getPersonalDetailsLabelId())).getText();
		Assert.assertEquals(expectedStrPersonalDetailsHeader, actualStrPersonalDetailsHeader);
	    
	}

	@Then("^Validate that First Name label is present for Edit Profile$")
	public void validate_that_First_Name_label_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditFNameLabelId())).size()!= 0;
		Assert.assertTrue("Error: First Name label is Missing",isPresent);	    
	}

	@Then("^Validate that First Name label text is correct for Edit Profile$")
	public void validate_that_First_Name_label_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditFNameLbl = config.getEditFNameLabelText();
		String actualEditFNameLbl = driver.findElement(By.id(config.getEditFNameLabelId())).getText();
		Assert.assertEquals(expectedEditFNameLbl, actualEditFNameLbl);
	    
	}


	@Then("^Validate that First Name textfield is present for Edit Profile$")
	public void validate_that_First_Name_textfield_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditFNameFieldId())).size()!= 0;
		Assert.assertTrue("Error: First Name field is Missing",isPresent); 
	}

	@Then("^Validate that First Name textfield value is correct for Edit Profile$")
	public void validate_that_First_Name_textfield_value_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditFNameFld = config.getEditFNameFieldText();
		String actualEditFNameFld = driver.findElement(By.id(config.getEditFNameFieldId())).getAttribute("value");
		Assert.assertEquals(expectedEditFNameFld, actualEditFNameFld);
	    
	}

	@Then("^Validate that Last Name label is present for Edit Profile$")
	public void validate_that_Last_Name_label_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditLNameLabelId())).size()!= 0;
		Assert.assertTrue("Error: Last Name Label is Missing",isPresent); 
	}

	@Then("^Validate that Last Name label text is correct for Edit Profile$")
	public void validate_that_Last_Name_label_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditLNameLbl = config.getEditLNameLabelText();
		String actualEditLNameLbl = driver.findElement(By.id(config.getEditLNameLabelId())).getText();
		Assert.assertEquals(expectedEditLNameLbl, actualEditLNameLbl);
	    
	}

	@Then("^Validate that Last Name textfield is present for Edit Profile$")
	public void validate_that_Last_Name_textfield_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditLNameFieldId())).size()!= 0;
		Assert.assertTrue("Error: Last Name field is Missing",isPresent); 
	}

	@Then("^Validate that Last Name textfield value is correct for Edit Profile$")
	public void validate_that_Last_Name_textfield_value_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditLNameFld = config.getEditLNameFieldText();
		String actualEditLNameFld = driver.findElement(By.id(config.getEditLNameFieldId())).getAttribute("value");
		Assert.assertEquals(expectedEditLNameFld, actualEditLNameFld);
	    
	}

	@Then("^Validate that Email label is present for Edit Profile$")
	public void validate_that_Email_label_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditEmailLabelId())).size()!= 0;
		Assert.assertTrue("Error: Email Label is Missing",isPresent); 
	}

	@Then("^Validate that Email label text is correct for Edit Profile$")
	public void validate_that_Email_label_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditEmailLbl = config.getEditEmailLabelText();
		String actualEditLEmailLbl = driver.findElement(By.id(config.getEditEmailLabelId())).getText();
		Assert.assertEquals(expectedEditEmailLbl, actualEditLEmailLbl);
	}


	@Then("^Validate that Email textfield is present for Edit Profile$")
	public void validate_that_Email_textfield_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditEmailFieldId())).size()!= 0;
		Assert.assertTrue("Error: Email field is Missing",isPresent);
	}

	@Then("^Validate that Email textfield value is correct for Edit Profile$")
	public void validate_that_Email_textfield_value_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditEmailFld = config.getEditEmailFieldText();
		String actualEditEmailFld = driver.findElement(By.id(config.getEditEmailFieldId())).getAttribute("value");
		Assert.assertEquals(expectedEditEmailFld, actualEditEmailFld);
	    
	}

	@Then("^Validate that Company label is present for Edit Profile$")
	public void validate_that_Company_label_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditCompanyLabelId())).size()!= 0;
		Assert.assertTrue("Error: Company Label is Missing",isPresent);
	}

	@Then("^Validate that Company label text is correct for Edit Profile$")
	public void validate_that_Company_label_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditCompanyLbl = config.getEditCompanyLabelText();
		String actualEditCompanyLbl = driver.findElement(By.id(config.getEditCompanyLabelId())).getText();
		Assert.assertEquals(expectedEditCompanyLbl, actualEditCompanyLbl);
	    
	}

	@Then("^Validate that Company textfield is present for Edit Profile$")
	public void validate_that_Company_textfield_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditCompanyFieldId())).size()!= 0;
		Assert.assertTrue("Error: Company field is Missing",isPresent);
	}

	@Then("^Validate that Company textfield value is correct for Edit Profile$")
	public void validate_that_Company_textfield_value_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditCompanyFld = config.getEditCompanyFieldText();
		String actualEditCompanyFld = driver.findElement(By.id(config.getEditCompanyFieldId())).getAttribute("value");
		Assert.assertEquals(expectedEditCompanyFld, actualEditCompanyFld);
	    
	}

	@Then("^Validate that Company textfield is disabled for Edit Profile$")
	public void validate_that_Company_textfield_is_disabled_for_Edit_Profile() throws Throwable {
		isEnabled = driver.findElement(By.id(config.getEditCompanyFieldId())).isEnabled();
		Assert.assertFalse("Error: Company field is Enabled",isEnabled);	    
	}

	@Then("^Validate that Telephone label is present for Edit Profile$")
	public void validate_that_Telephone_label_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditPhoneLabelId())).size()!= 0;
		Assert.assertTrue("Error: Phone Label is Missing",isPresent);
	}

	@Then("^Validate that Telephone label text is correct for Edit Profile$")
	public void validate_that_Telephone_label_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditPhoneLbl = config.getEditPhoneLabelText();
		String actualEditPhoneLbl = driver.findElement(By.id(config.getEditPhoneLabelId())).getText();
		Assert.assertEquals(expectedEditPhoneLbl, actualEditPhoneLbl);
	    
	}

	@Then("^Validate that Telephone textfield is present for Edit Profile$")
	public void validate_that_Telephone_textfield_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditPhoneFieldId())).size()!= 0;
		Assert.assertTrue("Error: Phone field is Missing.",isPresent);
	}

	@Then("^Validate that Telephone textfield value is correct for Edit Profile$")
	public void validate_that_Telephone_textfield_value_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditPhoneFld = config.getEditPhoneFieldText();
		String actualEditPhoneFld = driver.findElement(By.id(config.getEditPhoneFieldId())).getAttribute("value");
		Assert.assertEquals(expectedEditPhoneFld, actualEditPhoneFld);
	    
	}

	@Then("^Validate that Comments label is present for Edit Profile$")
	public void validate_that_Comments_label_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditCommentsLabelId())).size()!= 0;
		Assert.assertTrue("Error: Comments label is Missing.",isPresent);
	    
	}

	@Then("^Validate that Comments label text is correct for Edit Profile$")
	public void validate_that_Comments_label_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditCommentsid = config.getEditCommentsLabelText();
		String actualEditCommentsid = driver.findElement(By.id(config.getEditCommentsLabelId())).getText();
		Assert.assertEquals(expectedEditCommentsid, actualEditCommentsid);
	    
	}

	@Then("^Validate that Comments textfield is present for Edit Profile$")
	public void validate_that_Comments_textfield_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditCommentsFieldId())).size()!= 0;
		Assert.assertTrue("Error: Comments Field is Missing.",isPresent);
	    
	}

	@Then("^Validate that Comments textfield value is correct for Edit Profile$")
	public void validate_that_Comments_textfield_value_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditCommentsFld = config.getEditCommentsFieldText();
		String actualEditCommentsFld = driver.findElement(By.id(config.getEditCommentsFieldId())).getAttribute("value");
		Assert.assertEquals(expectedEditCommentsFld, actualEditCommentsFld);
	    
	}

	@Then("^Validate that Save Changes button is present for Edit Profile$")
	public void validate_that_Save_Changes_button_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditSaveButtonId())).size()!= 0;
		Assert.assertTrue("Error: Save Changes Button is Missing.",isPresent);
	    
	}

	@Then("^Validate that Save Changes button text is correct for Edit Profile$")
	public void validate_that_Save_Changes_button_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditSaveBtn = config.getEditSaveChangesBtnText();
		String actualEditSaveBtn = driver.findElement(By.id(config.getEditSaveButtonId())).getAttribute("value");
		Assert.assertEquals(expectedEditSaveBtn, actualEditSaveBtn);
	    
	}

	@Then("^Validate that Cancel button is present for Edit Profile$")
	public void validate_that_Cancel_button_is_present_for_Edit_Profile() throws Throwable {
		isPresent = driver.findElements(By.id(config.getEditCancelButtonId())).size()!= 0;
		Assert.assertTrue("Error: Cancel Button is Missing.",isPresent);
	    
	}

	@Then("^Validate that Cancel button text is correct for Edit Profile$")
	public void validate_that_Cancel_button_text_is_correct_for_Edit_Profile() throws Throwable {
		String expectedEditCancelBtn = config.getEditCancelBtnText();
		String actualEditCancelBtn = driver.findElement(By.id(config.getEditCancelButtonId())).getText();
		Assert.assertEquals(expectedEditCancelBtn, actualEditCancelBtn);
	    
	}

	@Then("^Close Browser Driver for Edit Profile$")
	public void close_Browser_Driver_for_Edit_Profile() throws Throwable {
		driver.quit();
	}
	
	public static void loadDriver() {
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
}
