package utility;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class ConfigReader {
    
        Properties pro;
        
        public ConfigReader()
        
        {
        
        try {
            File src=new File("./Configuration/Config.property");
            
            FileInputStream fis=new FileInputStream(src);
            
            pro=new Properties();
            
            pro.load(fis);
            }
        
            catch (Exception e) {
            
            System.out.println("Exception is =="+e.getMessage());
                
        }
        
        }
        
        public String getChromePath()
        {
            String path=pro.getProperty("ChromeDriver");
            
            return path;
        }
        
        public String getIEPath()
        {
            String path=pro.getProperty("IEDriver");
        
            return path;
        }
        
        public String getFireFoxPath()
        {
            String path=pro.getProperty("FireFoxDriver");
        
            return path;
            
        }
        
        public String getEdgePath()
        {
            String path=pro.getProperty("EdgeDriver");
        
            return path;
            
                }
        
        public String getVIPUrl()
        
                {
            
            return pro.getProperty("STGURLVIP");
            
                }
        
        public String getCMSUrl()
            
                {
                
            return pro.getProperty("STGURLCMS");
                }
            
            
        public String getASKMSAUrl()
            
                {
                
            return pro.getProperty("STGURLASKMSA");
                }
                
        public String getvipun1()
                
                {
                    
            return pro.getProperty("STGVIPusername1");
                }
        public String getvipun2()
            
                {
                
            return pro.getProperty("STGVIPusername2");
                
                }
            
       public String getvippw1()
                
                {
                    
            return pro.getProperty("STGVIPpasword1");
                }
                    
        public String getvippw2()
                    
                {
                        
            return pro.getProperty("STGVIPpasword2");
                    
                }
        public String getviploginbutton()
                
                {
                    
            return pro.getProperty("STGVIPLoginbutton");
                }
                
        public String getCMSun1()
                
                {
                    
            return pro.getProperty("STGCMSusername1");
                }
        public String getCMSun2()
                
                {
                    
            return pro.getProperty("STGCMSusername2");
                }
        
        public String getCMSpw1()
                
                {
                    
            return pro.getProperty("STGCMSpassword1");
                
    }
        public String getCMSpw2()
        
        {
            
            return pro.getProperty("STGCMSpassword2");
            
        }
        
        
        //Personal Information Header
        public String getPersonalInfoHeaderId() {
        	return pro.getProperty("txtPersonalInfoHeader");
        }

        public String getPersonalInfoHeaderText() {
        	return pro.getProperty("strPersonalInfoHeader");
        }
        
        //View Profile Full Name
        public String getFullNameFieldId() {
        	return pro.getProperty("txtFullName");
        }
        
        //Edit Profile
        public String getEditProfileButtonId() {
        	return pro.getProperty("btnEditProfile");
        }

        public String getEditProfileButtonText() {
        	return pro.getProperty("strEditProfileBtn");
        }
        
        //retrieves View Personal Info First Name
        public String getFNameLabelId() {
        	return pro.getProperty("lblName");
        }

        public String getFNameLabelText() {
        	return pro.getProperty("strNameLabel");
        }

        public String getFNameFieldId() {
        	return pro.getProperty("txtfldName");
        }
        
        public String getFNameFieldText() {
        	return pro.getProperty("strName");
        }
        
        //retrieves View Personal Info Last Name
        public String getLNameLabelId() {
        	return pro.getProperty("lblLastName");
        }

        public String getLNameLabelText() {
        	return pro.getProperty("strLastNameLabel");
        }

        public String getLNameFieldId() {
        	return pro.getProperty("txtfldLastName");
        }
        
        public String getLNameFieldText() {
        	return pro.getProperty("strLastName");
        }
        
        //retrieves View Personal Info Company
        public String getEmailLabelId() {
        	return pro.getProperty("lblEmail");
        }

        public String getEmailLabelText() {
        	return pro.getProperty("strEmailLabel");
        }

        public String getEmailFieldId() {
        	return pro.getProperty("txtfldEmail");
        }
        
        public String getEmailFieldText() {
        	return pro.getProperty("strEmail");
        }
        
        
       //retrieves View Personal Info Company Label
        public String getCompanyLabelId() {
        	return pro.getProperty("lblCompany");	
        }
        
        public String getCompanyLabelText()
        {
        	return pro.getProperty("strCompanyLabel");
        }
        
        public String getCompanyFieldId() {
        	return pro.getProperty("txtfldCompany");	
        }
        
        public String getCompanyFieldText()
        {
        	return pro.getProperty("strCompany");
        }
        
        //retrieves View Personal Info Telephone Label
        public String getPhoneLabel() {
        	return pro.getProperty("lblPhone");	
        }

        public String getPhoneLabelText() {
        	return pro.getProperty("strPhoneLabel");
        }

        public String getPhoneFieldId()
        {
        	return pro.getProperty("txtfldPhone");
        }

        public String getPhoneFieldVal() {
        	return pro.getProperty("strTelephoneValue");
        }
        
        //username
        public String getUserName() {
        	return pro.getProperty("txtUsername");
        }
        
      //pwd
        public String getPassword() {
        	return pro.getProperty("txtPassword");
        }
        
        //username
        public String getUserNameCred() {
        	return pro.getProperty("username");
        }
        
      //pwd
        public String getPasswordCred() {
        	return pro.getProperty("password");
        }
        
      //pwd
        public String getbtnsubmit() {
        	return pro.getProperty("btnSubmit");
        }
        
        //profile dropdown
        public String getBtnProfileDropDown()
        {
        	return pro.getProperty("btnProfileDropDown");
        }
        
      //profile dropdown
        public String getBtnProfileMenu()
        {
        	return pro.getProperty("btnProfileView");
        }
        
        public String getEditProfileURL() {
        	return pro.getProperty("EditProfileUrl");
        }
        
        public String getEditProfileLabelId() {
        	return pro.getProperty("lblEditProfile");
        }
        
        public String getEditProfileLabelText() {
        	return pro.getProperty("strEditProfile");
        }
        
        public String getPersonalDetailsLabelId() {
        	return pro.getProperty("lblPersonalDetails");
        }
        
        public String getPersonalDetailsLabelText() {
        	return pro.getProperty("strPersonalDetails");
        }
        
       //retrieves Edit Personal Info First Name
        public String getEditFNameLabelId() {
        	return pro.getProperty("lblEditFirstname");
        }

        public String getEditFNameLabelText() {
        	return pro.getProperty("strEditFirstName");
        }

        public String getEditFNameFieldId() {
        	return pro.getProperty("txtfldEditFirstName");
        }
        
        public String getEditFNameFieldText() {
        	return pro.getProperty("strName");
        }
        
      //retrieves Edit Personal Info Last Name
        public String getEditLNameLabelId() {
        	return pro.getProperty("lblEditLastName");
        }

        public String getEditLNameLabelText() {
        	return pro.getProperty("strEditLastName");
        }

        public String getEditLNameFieldId() {
        	return pro.getProperty("txtfldEditLastName");
        }
        
        public String getEditLNameFieldText() {
        	return pro.getProperty("strLastName");
        }
        
        //retrieves Edit Personal Info Last Name
        public String getEditEmailLabelId() {
        	return pro.getProperty("lblEditEmail");
        }

        public String getEditEmailLabelText() {
        	return pro.getProperty("strEditEmail");
        }

        public String getEditEmailFieldId() {
        	return pro.getProperty("txtfldEditEmail");
        }
        
        public String getEditEmailFieldText() {
        	return pro.getProperty("strEmail");
        }
        
      //retrieves Edit Personal Info Company
        public String getEditCompanyLabelId() {
        	return pro.getProperty("lblEditCompany");
        }

        public String getEditCompanyLabelText() {
        	return pro.getProperty("strEditCompany");
        }

        public String getEditCompanyFieldId() {
        	return pro.getProperty("txtfldEditCompany");
        }
        
        public String getEditCompanyFieldText() {
        	return pro.getProperty("strCompany");
        }
        
        //retrieves Edit Personal Info Phone
        public String getEditPhoneLabelId() {
        	return pro.getProperty("lblEditPhone");
        }

        public String getEditPhoneLabelText() {
        	return pro.getProperty("strEditPhone");
        }

        public String getEditPhoneFieldId() {
        	return pro.getProperty("txtfldEditPhone");
        }
        
        public String getEditPhoneFieldText() {
        	return pro.getProperty("strTelephoneValue");
        }
        
        //retrieves Edit Personal Info Comments
        public String getEditCommentsLabelId() {
        	return pro.getProperty("lblEditComments");
        }

        public String getEditCommentsLabelText() {
        	return pro.getProperty("strEditComments");
        }

        public String getEditCommentsFieldId() {
        	return pro.getProperty("txtfldEditComments");
        }
        
        public String getEditCommentsFieldText() {
        	return pro.getProperty("strComments");
        }
        
        //retrieves Edit Personal Info save changes
        public String getEditSaveButtonId() {
        	return pro.getProperty("btnEditSaveChanges");
        }

        public String getEditSaveChangesBtnText() {
        	return pro.getProperty("strEditSaveChanges");
        }
        
      //retrieves Edit Personal Info Cancel changes
        public String getEditCancelButtonId() {
        	return pro.getProperty("btnEditCancelChanges");
        }

        public String getEditCancelBtnText() {
        	return pro.getProperty("strEditCancelChanges");
        }
        
        public static void captureScreenshot(WebDriver driver,String screenshotName)
        {
        
        try {
            TakesScreenshot ts=(TakesScreenshot)driver;
            
            File source=ts.getScreenshotAs(OutputType.FILE);
            
            FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
            
            System.out.println("Screenshot Taken");
            
        }
        
        catch (Exception e) 
        {
            
            System.out.println("Exception while taking Screenshot"+e.getMessage());
    
        }
        
        }
        }