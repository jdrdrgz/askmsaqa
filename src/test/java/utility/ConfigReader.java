package utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
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
        
        //retrieves View Personal Info Email
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
        
        //input valid fields
        public String getInputFName() {
        	return pro.getProperty("inputFName");
        }
        
        public String getInputLName() {
        	return pro.getProperty("inputLName");
        }
        
        public String getInputEmail() {
        	return pro.getProperty("inputEmail");
        }
        
        public String getInputPhone() {
        	return pro.getProperty("inputPhone");
        }
        
        public String getInputComments() {
        	return pro.getProperty("inputComments");
        }
        
        public String getSuccessSaveMessageId() {
        	return pro.getProperty("lblSuccessMessage");
        }
        
        public String getSuccessSaveMessageText() {
        	return pro.getProperty("strSuccessMessage");
        }
        
        //blank fields error validation using xpath - reusable
        public String getFNameErrId() {
        	return pro.getProperty("lblFNameErr");
        }
        
        public String getLNameErrId() {
        	return pro.getProperty("lblLNameErr");
        }
        
        public String getEmailErrId() {
        	return pro.getProperty("lblEmailErr");
        }
        
        public String getPhoneErrId() {
        	return pro.getProperty("lblPhoneErr");
        }
        
        public String getCommentErrId() {
        	return pro.getProperty("lblCommentsErr");
        }
        
       //blank fields error validation
        public String getFNameErrText() {
        	return pro.getProperty("strFNameReqErr");
        }
        
        public String getLNameErrText() {
        	return pro.getProperty("strLNameReqErr");
        }
        
        public String getEmailErrText() {
        	return pro.getProperty("strEmailReqErr");
        }
        
        public String getRandomName(int count) {
        	return RandomStringUtils.randomAlphabetic(count);
        }
        
        public String generateEmail(String domain, int length) {
            return RandomStringUtils.randomAlphanumeric(length) + "@" + domain;
        }

        
        public String getRandomPhone(int count) {
        	return RandomStringUtils.random(count,"1234567890()+-");
        }
        
        public String generateInvalidName(int length) {
        	return RandomStringUtils.randomNumeric(length);
        }
        
        public String generateInvalidPhone(int length) {
        	return RandomStringUtils.randomAlphabetic(length);
        }
        
        public String generateInvalidEmail(int length) {
        	return RandomStringUtils.random(length,"abcdefghijklmnopqrstuvwxyz!@#$%^&*()1234567890.-");
        }
        
        //Exceed Limit fields error validation        
        public String getFNameErrLimitText() {
        	return pro.getProperty("strFNameLimitErr");
        }
        
        public String getLNameErrLimitText() {
        	return pro.getProperty("strLNameLimitErr");
        }
        
        public String getEmailErrLimitText() {
        	return pro.getProperty("strEmailLimitErr");
        }
       
        public String getPhoneLimitText() {
        	return pro.getProperty("strPhoneLimitErr");
        }
        
        public String getCommentLimitText() {
        	return pro.getProperty("strCommentLimitErr");
        }
        
        //Invalid fields error validation        
        public String getFNameErrInvalidText() {
        	return pro.getProperty("strFNameInvalidErr");
        }
        
        public String getLNameErrInvalidText() {
        	return pro.getProperty("strLNameInvalidErr");
        }
        
        public String getEmailErrInvalidText() {
        	return pro.getProperty("strEmailInvalidErr");
        }
       
        public String getPhoneInvalidText() {
        	return pro.getProperty("strPhoneInvalidErr");
        }
        
        //View profile URL
        public String getViewProfileURL() {
        	return pro.getProperty("strViewProfileURL");
        }
        
        //add emp
        public String getAddEmpButtonId(){
        	return pro.getProperty("btnAddEmp");
        }
        
        public String getAddEmpFNameField(){
        	return pro.getProperty("addEmpFName");
        }
        
        public String getAddEmpLNameField(){
        	return pro.getProperty("addEmpLName");
        }
        
        public String getAddEmpNumField(){
        	return pro.getProperty("addEmpNum");
        }
        
        public String getAddEmpShipField(){
        	return pro.getProperty("addEmpShip");
        }
        
        public String getRandomEmpNum(int count) {
        	return RandomStringUtils.randomNumeric(count);
        }
        
        public String getEmpActiveTabId() {
        	return pro.getProperty("lblEmpActiveTab");
        }
        
        public String getEmpInactiveTabId() {
        	return pro.getProperty("lblEmpInactiveTab");
        }
    	
    	 public String getEmpActiveTable() {
        	return pro.getProperty("tblActiveEmp");
        }
        
        public String getEmpInactiveTable() {
        	return pro.getProperty("tblInactiveEmp");
        }
        
        public String getShipValue() {
        	return pro.getProperty("inputShip");
        }
        
        public String getAddEmpSaveBtnId() {
        	return pro.getProperty("btnAddEmpSave");
        }
        
        public String getAddEmpEmailFld() {
        	return pro.getProperty("addEmpEmail");
        }
        
        public String getAddEmpDOBFld() {
        	return pro.getProperty("addEmpDOB");
        }
        
        public String getAddEmpDOBVal() {
        	return pro.getProperty("inputEmpDOB");
        }
        
        public String getAddEmpCommentFld() {
        	return pro.getProperty("addEmpComment");
        }
        
        public String getAddEmpAddressFld() {
        	return pro.getProperty("addEmpAddress");
        }
        
        public String getAddEmpAddressVal() {
        	return pro.getProperty("inputAddress");
        }
        
        public String getAddEmpZipFld() {
        	return pro.getProperty("addEmpZip");
        }
        
        public String getAddEmpZipVal() {
        	return pro.getProperty("inputZip");
        }
        
        public String getAddEmpCityFld() {
        	return pro.getProperty("addEmpCity");
        }
        
        public String getAddEmpCityVal() {
        	return pro.getProperty("inputCity");
        }
        
        public String getAddEmpCountryFld() {
        	return pro.getProperty("addEmpCountry");
        }
        
        public String getAddEmpCountryVal() {
        	return pro.getProperty("inputCountry");
        }
        
        public String getAddEmpPhoneFld() {
        	return pro.getProperty("addEmpPhone");
        }
        
        public String getEmployeeUrl() {
        	return pro.getProperty("EmployeesUrl");
        }
        
        public String getEmpMessageId() {
        	return pro.getProperty("lblEmpAddSuccess");
        }
        
        public String getAddEmployeeSuccessExpected() {
        	return pro.getProperty("strSuccessEmpAdd");
        }
        
        public String getRequiredFieldErrMsg() {
        	return pro.getProperty("strRequiredField");
        }
        
        public String getBlankFNameEmp() {
        	return pro.getProperty("addBlankFNameErr");
        }
        
        public String getBlankLNameEmp() {
        	return pro.getProperty("addBlankLNameErr");
        }
        
        public String getBlankEmpNum() {
        	return pro.getProperty("addBlankEmpNumErr");
        }
        
        public String getBlankShipEmp() {
        	return pro.getProperty("addBlankShipErr");
        }
        
        public String getInvalidAddEmpName() {
        	return pro.getProperty("strNameFormatErr");
        }
        
        public String getEditEmpFNameValue() {
        	return pro.getProperty("strEditFName");
        }
        
        public String getEditEmpLNameValue() {
        	return pro.getProperty("strEditLName");
        }
        
        public String getEditEmpNumValue() {
        	return pro.getProperty("strEditEmpNum");
        }
        
        public String getEditEmpSuccessString() {
        	return pro.getProperty("strEmpInfoUpdated");
        }
        
        public String getEditEmp() {
        	return pro.getProperty("btnEditEmp");
        }
        
        public String getDeleteEmp() {
        	return pro.getProperty("btnDeleteEmp");
        }
        
        public String getDeleteConfirmationEmp() {
        	return pro.getProperty("modalDeletePrompt");
        }
        
        public String getDeleteConfirmationBtnEmp() {
        	return pro.getProperty("btnDeleteConf");
        }
        
        public String getDeleteEmpMessage() {
        	return pro.getProperty("lblDeleteEmp");
        }
        
        public String getStrEditBookingDetails() {
        	return pro.getProperty("strEditBookingDetails");
        }
        
        /**   Ship Management  */
        public String getOrganizationButtonId() {
        	return pro.getProperty("btnOrganizationId");
        }
        
        public String getShipButtonId() {
        	return pro.getProperty("btnShipsId");
        }
        
        public String getAddShipButtonId() {
        	return pro.getProperty("btnAddShipId");
        }
        
        public String getShipNameTxtId() {
        	return pro.getProperty("txtShipNameId");
        }
        
        public String getEmailTxtId() {
        	return pro.getProperty("txtEmailId");
        }
        
        public String getFNameTxtId() {
        	return pro.getProperty("txtFNameId");
        }
        
        public String getLNameTxtId() {
        	return pro.getProperty("txtLNameId");
        }
        
        public String getIMOTxtId() {
        	return pro.getProperty("txtIMOId");
        }
        
        public String getDivisionDropDownId() {
        	return pro.getProperty("txtDivisionDropDownId");
        }
        
        public String getShipNameTxtInput() {
        	return pro.getProperty("inputShipName");
        }
        
        public String getEmailTxtInput() {
        	return pro.getProperty("inputEmail");
        }
        
        public String getFNameTxtInput() {
        	return pro.getProperty("inputFName");
        }
        
        public String getLNameTxtInput() {
        	return pro.getProperty("inputLName");
        }
        
        public String getIMOTxtInput() {
        	return pro.getProperty("inputIMO");
        }
        
        public String getDivisionDropDownInput() {
        	return pro.getProperty("inputDivision");
        }
        
        public String getSaveAddShipId() {
        	return pro.getProperty("btnSaveShipId");
        }
        
        public String getShipsURL() {
        	return pro.getProperty("urlShips");
        }
        
        public String getAddShipSuccessMsg() {
        	return pro.getProperty("txtSuccessAddShipMsg");
        }
        
        public String getAddShipSuccessMsgActual() {
        	return pro.getProperty("txtSuccessAddShipActualPath");
        }
        
        public String getRequiredFieldMsgActual() {
        	return pro.getProperty("txtFieldIsRequiredMsg");
        }
        
        public String getShipRequiredMsg() {
        	return pro.getProperty("txtRequiredShipId");
        }
        
        public String getEmailRequiredMsgId() {
        	return pro.getProperty("txtRequiredEmailId");
        }
        
        public String getFNameRequiredMsgId() {
        	return pro.getProperty("txtRequiredFNameId");
        }
        
        public String getLNameRequiredMsgId() {
        	return pro.getProperty("txtRequiredLNameId");
        }
        
        public String getIMORequiredMsgId() {
        	return pro.getProperty("txtRequiredIMOId");
        }
        
        public String getFNameInvalidMsg() {
        	return pro.getProperty("txtInvalidFName");
        }
        
        public String getLNameInvalidMsg() {
        	return pro.getProperty("txtInvalidLName");
        }
        
        public String getEmailInvalidMsg() {
        	return pro.getProperty("txtInvalidEmail");
        }
        
        public String getbtnEditPath() {
        	return pro.getProperty("btnEditPath");
        }
        
        public String getbtnEditShipName() {
        	return pro.getProperty("inputEditShipName");
        }
        
        public String getbtnEditShipEmail() {
        	return pro.getProperty("inputEditShipEmail");
        }
        
        public String getbtnEditShipFName() {
        	return pro.getProperty("inputEditShipFName");
        }
        
        public String getbtnEditShipLName() {
        	return pro.getProperty("inputEditShipLName");
        }
        
        public String getbtnEditShipIMO() {
        	return pro.getProperty("inputEditShipIMO");
        }
        
        public String getbtnEditShipDivision() {
        	return pro.getProperty("inputEditShipDivision");
        }
        
        public String getSuccessEditShipMsg() {
        	return pro.getProperty("txtSuccessEditShip");
        }
        
        public String getBtnDeleteShipWithEmpPath() {
        	return pro.getProperty("btnDeleteWithEmpPath");
        }
        
        public String getBtnDeleteShipWithoutEmpPath() {
        	return pro.getProperty("btnDeleteWithoutEmpPath");
        }
        
        public String getBtnCloseDeleteShipWithEmp() {
        	return pro.getProperty("btnCloseDeleteShipWithEmp");
        }
        
        public String getBtnCloseDeleteShipWithoutEmp() {
        	return pro.getProperty("btnCloseDeleteShipWithoutEmp");
        }
        
        public String getBtnCancelAddShip() {
        	return pro.getProperty("btnCancelAddShip");
        }
        
        public String getLblShipsHeader() {
        	return pro.getProperty("labelShipsHeader");
        }
        
        public String getShowEntriesShips() {
        	return pro.getProperty("showEntriesShips");
        }
        
        public String getSearchFieldShips() {
        	return pro.getProperty("searchFilterShip");
        }
        
        public String getTableInfoShips() {
        	return pro.getProperty("entriesInfoShips");
        }
        
        public String getPaginationShips() {
        	return pro.getProperty("paginationShips");
        }
        
        public String getEmployeeEmailErrorMessageId() {
        	return pro.getProperty("emailErrorMessageID");
        }
        
        public String getEmployeeHeader() {
        	return pro.getProperty("employeeLabel");
        }
        
        public String getInvalidPhoneEmployeeMessageID() {
        	return pro.getProperty("phoneErrorMessageID");
        }
        
        //retrieve table IDs
        public String getTableShips() {
        	return pro.getProperty("tableShips");
        }
        
        public String getTableBookings() {
        	return pro.getProperty("tableBookings");
        }
        
        public String getTableBookingEmployees() {
        	return pro.getProperty("tableBookingEmployees");
        }
        
        //datatable components
        public String getShowEntriesEmployee() {
        	return pro.getProperty("showEntriesEmployee");
        }
        
        public String getSearchFilterEmployee() {
        	return pro.getProperty("searchFilterEmployee");
        }
        
        public String getPaginationEmployees() {
        	return pro.getProperty("paginationEmployees");
        }
        
        public String getEntriesInfoEmployee() {
        	return pro.getProperty("entriesInfoEmployee");
        }
        
        public String getShowEntriesBookings() {
        	return pro.getProperty("showEntriesBookings");
        }
        
        public String getSearchFilterBookings() {
        	return pro.getProperty("searchFilterBookings");
        }
        
        public String getPaginationBookings() {
        	return pro.getProperty("paginationBookings");
        }
        
        public String getEntriesInfoBookingEmployees() {
        	return pro.getProperty("showEntriesBookingEmployees");
        }
        
        public String getShowEntriesBookingEmployees() {
        	return pro.getProperty("showEntriesBookings");
        }
        
        public String getPaginationBookingEmployees() {
        	return pro.getProperty("paginationBookingEmployees");
        }
        
        public String getEntriesInfoBookings() {
        	return pro.getProperty("entriesInfoBookingEmployees");
        }
        
        //Retrieve IDs of VIP navigation menu
        public String getCourseBookingsNavDD() {
        	return pro.getProperty("navCourseBookingsDD");
        }
        
        public String getCourseBookingsNav() {
        	return pro.getProperty("navCourseBookings");
        }
        
        //Retrieve URLs of vip pages
        public String getUrlCourseBookings() {
        	return pro.getProperty("urlCourseBookings");
        }
        
        //retrieve label header IDs
        public String getCourseBookingHeaderLblId() {
        	return pro.getProperty("courseBookingHeaderLblId");
        }
        
        public String getModalBookingHeaderLblId() {
        	return pro.getProperty("modalBookingHeaderLblId");
        }
        
        //retrieve label header text
        public String getCourseBookingHeaderLblText() {
        	return pro.getProperty("courseBookingHeaderLblText");
        }
        
        public String getModalBookingHeaderLblText() {
        	return pro.getProperty("modalBookingHeaderLblText");
        }
        
        //retrieve button ids
        public String getBookCourseButtonID() {
        	return pro.getProperty("bookCourseButtonId");
        }
        
        public String getBookCourseAddToListID() {
        	return pro.getProperty("bookCourseAddToListId");
        }
        
        public String getAddBookingModalId() {
        	return pro.getProperty("addBookingModalId");
        }
        
        public String getCancelModalId() {
        	return pro.getProperty("btnCancelModal");
        }
        
        public String getBtnUpdateBookingId() {
        	return pro.getProperty("btnUpdateBookingId");
        }
        
        //retrieve modal ids
        public String getBookCourseModal() {
        	return pro.getProperty("bookCourseModal");
        }
        
        //retrieve drop down IDs
        public String getBookingCourseDdl() {
        	return pro.getProperty("bookingCourseDdl");
        }
        
        public String getBookingLocationDdl() {
        	return pro.getProperty("bookingLocationDdl");
        }
        
        public String getBookingScheduleDdl() {
        	return pro.getProperty("bookingScheduleDdl");
        }
        
        public String getBookingStatusDdl() {
        	return pro.getProperty("bookingStatusDdl");
        }
        public String getBookingEmployeesDdl() {
        	return pro.getProperty("bookingEmployeesDdl");
        }
        
        //retrieve text field IDs
        public String getBookingCommentFldId() {
        	return pro.getProperty("bookingCommentFldId");
        }
        
        //retrieve course input for booking
        public String getInputCourse() {
        	return pro.getProperty("inputCourse");
        }
        
        public String getInputLocation() {
        	return pro.getProperty("inputLocation");
        }
        
        public String getInputSchedule() {
        	return pro.getProperty("inputSchedule");
        }
        
        public String getInputEmployeeBooking() {
        	return pro.getProperty("inputEmployeeBooking");
        }
        
        public String getInputEmployeeBookingOther() {
        	return pro.getProperty("inputEmployeeBookingOther");
        }
        
        public String getInputEmployeeBookingWithoutEmail() {
        	return pro.getProperty("inputEmployeeBookingWithoutEmail");
        }
        
        public String getInputCancelBookingStatus() {
        	return pro.getProperty("inputCancelBookingStatus");
        }
        
        
        //required fields error message ids
        public String getActualBookingCourseBlankMsgId() {
        	return pro.getProperty("actualBookingCourseBlankMsgId");
        }
        
        public String getActualBookingLocationBlankMsgId() {
        	return pro.getProperty("actualBookingCourseLocationBlankMsgId");
        }
        
        public String getActualBookingScheduleBlankMsgId() {
        	return pro.getProperty("actualBookingCourseScheduleBlankMsgId");
        }
        
        //alert message ids
        public String getAlertMessageId() {
        	return pro.getProperty("alertMessageId");
        }
        
        //expected messages
        public String getTxtSuccessAddBooking() {
        	return pro.getProperty("txtSuccessAddBooking");
        }
        
        //retrieve tickbox ids
        public String getTickBookingEmp() {
        	return pro.getProperty("tickBookingEmp");
        }
        
        public String getTickBookingEmpOther() {
        	return pro.getProperty("tickBookingEmpOther");
        }
        
        //retrieve edit booking id
        public String getEditBookingId() {
        	return pro.getProperty("editBookingId");
        }
        
        public String geteditBookingEmpRemove() {
        	return pro.getProperty("editBookingEmpRemove");
        }
        
        
        public String getStrPrompt() {
        	return pro.getProperty("strPrompt");
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