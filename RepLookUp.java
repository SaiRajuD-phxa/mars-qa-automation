package mars.v10.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Mars10.base.BaseClass;



public class RepLookUp extends BaseClass 
{
	Logger log = Logger.getLogger(RepLookUp.class);
			
	DateFormat dt = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	DateFormat D = new SimpleDateFormat("ddMMyyyy");
	Date d = new Date();
	String Time = dt.format(d);
	String Date = D.format(d);
	Actions action = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep' and @id='navbarDropdown']")
	WebElement RepLookup;
	
	
	@FindBy(xpath="//*[@class='dropdown-item' and contains(text(),'Rep Profile')]")
	WebElement RepProfile;
	
	@FindBy(xpath = "//input[@data-field-name='Rep Full Name']")
	WebElement Repnameseacrh;

	@FindBy(xpath = "//*[@class='btn btn-primary btn-sm' and contains(text(),'Find')]")
	WebElement findwithrepname;
	
	@FindBy(xpath = "//*[@aria-selected='false']//a[contains(text(),'SID')]")
	WebElement clickrep;
	
	//RepProfile Tabs:
	
	@FindBy(xpath = "//span[contains(text(),'Main')]")
	WebElement repmaintab;
	@FindBy(xpath="//span[contains(text(),'Timeline')]")
	WebElement repTimeline;
	@FindBy(xpath="//span[contains(text(),'Classic Profile')]")
	WebElement repClassicProfile;
	@FindBy(xpath="(//span[contains(text(),'Sales')])[2]")
	WebElement repSales;
	@FindBy(xpath="//span[contains(text(),'Activities')]")
	WebElement repActivities;
	@FindBy(xpath="//span[contains(text(),'Calendar Heat Map')]")
	WebElement repCalendar;
	
	//Primary Details OR:
	
	@FindBy(xpath ="(//*[contains(text(),'Primary Details')]//following::i)[1]")
	WebElement PrimaryDetails;
	    
	@FindBy(xpath ="//*[normalize-space(text())='Middle Name']//following::div[@class='ValueText'][1]")
	WebElement MiddleName;
	
	@FindBy(xpath="//*[normalize-space(text())='Middle Name']//following::input[@id=\"txtTextBox\"]")
	WebElement MiddleName_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Last Name']//following::div[@class='ValueText'][1]")
	WebElement  RepLastName;
	
	@FindBy(xpath="//*[normalize-space(text())='Last Name']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepLastName_CT;
	
	@FindBy(xpath ="//input[(@id='txtTextBox')]//following::i[@id='saveImg'][1]")
	WebElement SaveImage;
	 
	@FindBy(xpath="//*[normalize-space(text())='Fax']//following::div[@class='ValueText'][1]")
	WebElement Fax;
	
	@FindBy(xpath="//*[normalize-space(text())='Fax']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Fax_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Website']//following::div[1]")
	WebElement Website;
	
	@FindBy(xpath="//*[normalize-space(text())='Website']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Website_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Title']//following::div[@class='ValueText'][1]")
	WebElement Title;
	
	@FindBy(xpath="//*[normalize-space(text())='Title']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Title_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Firm Source ID']//following::div[@class='ValueText'][1]")
	WebElement FirmSourceID;
	
	@FindBy(xpath="//*[normalize-space(text())='Firm Source ID']//following::input[contains(@class, 'floating-label')][1]")
	WebElement FirmSourceID_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Nick Name']//following::div[@class='ValueText'][1]")
	WebElement RepNickName;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Nick Name']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepNickName_CT;
	
	
	@FindBy(xpath="//*[normalize-space(text())='Rep CRD']//following::div[@class='ValueText'][1]")
	WebElement  RepCRD;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep CRD']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepCRD_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Phone']//following::div[@class='ValueText'][1]")
	WebElement  RepPhone;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Phone']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepPhone_CT;
	
	@FindBy(xpath="//div[normalize-space(text())='Email']//following::div[1]")
	WebElement RepEmail;
	@FindBy(xpath="//*[normalize-space(text())='Email']//following::input[@id=\"txtTextBox\"]")
	WebElement RepEmail_CT;

	
	@FindBy(xpath="//*[normalize-space(text())='Email Id 2']//following::div[@class='ValueText'][1]")
	WebElement  RepEmailID2;

	@FindBy(xpath="//*[normalize-space(text())='Email Id 2']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepEmailID2_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Mobile']//following::div[@class='ValueText'][1]")
	WebElement  RepMobile;
	@FindBy(xpath="//*[normalize-space(text())='Mobile']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepMobile_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Phone Ext.']//following::div[@class='ValueText'][1]")
	WebElement  PhoneExt;
	@FindBy(xpath="//*[normalize-space(text())='Phone Ext.']//following::input[contains(@class, 'floating-label')][1]")
	WebElement PhoneExt_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Comments']//following::div[@class='ValueText'][1]")
	WebElement  RepComments;
	@FindBy(xpath="//*[normalize-space(text())='Rep Comments']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepComments_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Rep Source ID']//following::div[1]")
	WebElement  RepSourceID;
	@FindBy(xpath="//*[normalize-space(text())='Rep Source ID']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepSourceID_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Personal Info']//following::div[@class='ValueText'][1]")
	WebElement  PersonalInfo;
	@FindBy(xpath="//*[normalize-space(text())='Personal Info']//following::input[contains(@class, 'floating-label')][1]")
	WebElement PersonalInfo_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='# of Years as Broker']//following::div[@class='ValueText'][1]")
	WebElement  Broker;
	@FindBy(xpath="//*[normalize-space(text())='# of Years as Broker']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Broker_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Alternate Name']//following::div[@class='ValueText'][1]")
	WebElement  AlternateName;
	@FindBy(xpath="//*[normalize-space(text())='Alternate Name']//following::input[contains(@class, 'floating-label')][1]")
	WebElement AlternateName_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Birthday(MM/DD/YYYY)']//following::div[@class='ValueText'][1]")
	WebElement Birthday;
	@FindBy(xpath="//*[normalize-space(text())='Birthday(MM/DD/YYYY)']//following::input[1]")
	WebElement Birthday_CT;
	@FindBy(xpath="//*[normalize-space(text())='Birthday(MM/DD/YYYY)']//following::input[contains(@class, 'floating-label')][1]//following::input[1]")
	WebElement Birthday_CTY;
	
	@FindBy(xpath="//*[normalize-space(text())='Total AUM (Self Reported)']//following::div[@class='ValueText'][1]")
	WebElement AUM;
	@FindBy(xpath="//*[normalize-space(text())='Total AUM (Self Reported)']//following::input[contains(@class, 'floating-label')][1]")
	WebElement AUM_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='First Name']//following::div[@class='ValueText'][1]")
	WebElement RepFirstName;
	@FindBy(xpath="//*[normalize-space(text())='First Name']//following::input[contains(@class, 'floating-label')][1]")
	WebElement RepFirstName_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Spouse']//following::div[@class='ValueText'][1]")
	WebElement Spouse;
	@FindBy(xpath="//*[normalize-space(text())='Spouse']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Spouse_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Assistant']//following::div[@class='ValueText'][1]")
	WebElement Assistant;
	@FindBy(xpath="//*[normalize-space(text())='Assistant']//following::input[contains(@class, 'floating-label')][1]")
	WebElement Assistant_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='Prior Firm']//following::div[@class='ValueText'][1]")
	WebElement PriorFirm;
	@FindBy(xpath="//*[normalize-space(text())='Prior Firm']//following::input[contains(@class, 'floating-label')][1]")
	WebElement PriorFirm_CT;
	
	@FindBy(xpath="//*[normalize-space(text())='(RC) UDF1']//following::div[1]")
	WebElement UDF1;
	@FindBy(xpath="(//*[normalize-space(text())='(RC) UDF1']//following::input[contains(@class, 'floating-label')])[1]")
	WebElement UDF1_CT;
	
	@FindBy(xpath="(//*[normalize-space(text())='(RC) UDF2']//following::div[@class='ValueText'])[1]")
	WebElement UDF2;
	@FindBy(xpath="(//*[normalize-space(text())='(RC) UDF2']//following::input[contains(@class, 'floating-label')])[1]")
	WebElement UDF2_CT;
	
	@FindBy(xpath="//*[@id=\"tabContainer\"]/div/tabs/div")
	WebElement Scroll;
	
	//Sales Details
	
	@FindBy(xpath="(//*[contains(text(),'Sales Details')]//following::i)[1]")
	WebElement SalesDetails;
	
	// Ctrl + Click 
	 @FindBy(xpath="//div[normalize-space(text())='Rep']//following::a[1]")
	 WebElement Repctrlclick;
	 @FindBy(xpath="//div[normalize-space(text())='Firm']//following::a[1]")
	 WebElement Firmctrlclick;
	 @FindBy(xpath="//div[normalize-space(text())='Office']//following::a[1]")
	 WebElement Officectrlclick;
	 
	 // Adding Social Links
	 
	 @FindBy(xpath="//*[normalize-space(text())='Social Links']/following::label[1]")
	 WebElement SocialLink;
	 @FindBy(xpath="//*[@title=\"Add Social Link\"]//following::select")
	 WebElement clickonSociallink;
	 @FindBy(xpath="//*[@title=\"Add Social Link\"]//following::option[normalize-space(text())='Twitter']")
	 WebElement SelectFacebook;
	 @FindBy(xpath="//a[contains(text(),'Link URL')]//following::input[2]")
	 WebElement LinkUrl;
	 @FindBy(xpath="//button[text()='Ok']")
	 WebElement Click_OK;
	 
	 //Adding Documents
	 
	 @FindBy(xpath="//*[normalize-space(text())='Documents']//following::a[contains(text(),'New Document')]")
	 WebElement NewDocument;
	 @FindBy(xpath="//*[@id='btnBrowse']")
	 WebElement BrowserBtn;
	 @FindBy(xpath="//input[@name='txtName']")
	 WebElement Document_Name;
	 @FindBy(xpath="//label[contains(text(),'Save')]")
	 WebElement Save;
	 
	// Initializing the Page Objects:
		public RepLookUp() 
		{
			
			System.out.println("Entered the Rep Lookup Page");

			PageFactory.initElements(driver, this);
			log.info("***Entered RepLookUp page***");
		}
		
		
		public void clickrep() 
		{
			//click on rep
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();", RepLookup);
	    	
	    	System.out.println("clicked on rep lookup");
	    	log.info("Clicked on Rep");    	
	    	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    	js1.executeScript("arguments[0].click();", RepProfile);
	    	
			System.out.println("clicked on rep profile");
			log.info("Clicked on Rep Profile");
		}
		
		public void repname_search()
		{
			Repnameseacrh.click();
			Repnameseacrh.sendKeys("Sid");
			System.out.println("Enter Rep Name");
			findwithrepname.click();
			clickrep.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			log.info("Entered RepName");
			//wait.until(ExpectedConditions.titleContains("Sid"));			
		}
		
		
		public void click_maintab()
		{
			repmaintab.click();
			System.out.println("Clicked Rep Main Tab");
			log.info("Click on Rep Main Tab");

		}
		 public void click_Timeline()
		 {
			 repTimeline.click();
				System.out.println("Clicked RepTimeline Tab");
				log.info("Clicked RepTimeline Tab");

		 }
		 public void click_Activities()
		 {
		 repActivities.click();
			System.out.println("Clicked RepActivities Tab");
			log.info("Clicked RepActivities Tab");
		 } 
		 public void click_ClassicProfile()
		 {
			 repClassicProfile.click();
				System.out.println("Clicked RepClassicProfile Tab");
				log.info("Clicked ClassicProfile Tab"); 
		 }
		 public void click_Sales()
		 {
			 repSales.click();
				System.out.println("Clicked RepSales Tab");
				log.info("Clicked RepSales Tab"); 
		 }
		 public void click_Calendar()
		 {
			 repCalendar.click();
			 System.out.println("Clicked RepCalendar Tab");
				log.info("Clicked RepCalendar Tab"); 
		 }
		
	public void click_PrimaryDetail()
		{
			PrimaryDetails.click();
			System.out.println("Clicked PrimaryDetails Tab");
		}
		
		public void click_SalesDetails()
		{
			SalesDetails.click();
			System.out.println("Clicked on SalesDetails Tab");
		}

		public void clear_Type_MiddleName()
 {
			MiddleName.click();
			MiddleName_CT.clear();
			MiddleName.click();
			WebElement VerifyMiddleName = MiddleName;
			String Verification= VerifyMiddleName.getText();
			//System.out.println("Should be a MiddleName: "  + Verification);
			Assert.assertEquals(Verification,"doneclose","MiddleName Haven't clear");
			MiddleName_CT.sendKeys("Mars");
			SaveImage.click();
			String Verification1 =VerifyMiddleName.getText();
			Assert.assertEquals(Verification1, "Mars", "MiddleName Doesn't match");
			//System.out.println("Should be a MiddleName: "  + Verification1);
			
 }
		public void clear_Type_Fax()
		{
			Fax.click();
			Fax_CT.clear();
			Fax.click();
			WebElement VerifyFax=Fax;
			String Verification= VerifyFax.getText();
			Assert.assertEquals(Verification,"doneclose","FaxNumber Haven't clear");
			Fax_CT.sendKeys("45265211");
			SaveImage.click();
			String Verification1 =VerifyFax.getText();
			Assert.assertEquals(Verification1,"45265211","FaxNumber Doesn't match");
			System.out.println("There should be an FaxNum: " + Verification1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public void clear_Type_Website()
		{
			Website.click();	
			Website_CT.clear();
			WebElement VerifyWebsite=Website;
			Website_CT.sendKeys("www.marsV10.com"+ Date);
			SaveImage.click();
			String Verification =VerifyWebsite.getText();
			Assert.assertEquals(Verification,"www.marsV10.com"+ Date ,"Website Doesn't match");
			System.out.println("There should be an Website:" + Verification);
			log.info("Website:" + Verification);

			
		}
		 public void clear_Type_RepTitle()
		 {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 Title.click();
			 Title_CT.clear();
			WebElement VerifyTitle =Title;
			Title_CT.sendKeys("Mr"+ Date);
			 SaveImage.click();
			 String Verification =VerifyTitle.getText();
			 Assert.assertEquals(Verification,"Mr"+Date,"Title is not Matching");
			 System.out.println("There should be an RepTitle:" + Verification);
			 log.info("RepTitle:" + Verification);
		 }
		
		public void clear_Type_FirmSourceID()
		{
			FirmSourceID.click();
			FirmSourceID_CT.clear();
			WebElement VerifyFirmSourceID =FirmSourceID;
			FirmSourceID_CT.sendKeys(Date);
			SaveImage.click();
			String Verification =VerifyFirmSourceID.getText();
			Assert.assertEquals(Verification,Date,"FirmSourceID is not Matching");
			 System.out.println("There should be an FirmSourceID:" + Verification);
			 log.info("FirmSourceID:" + Verification);
			
		}
		public void clear_Type_RepNickName()
		{
			RepNickName.click();
			RepNickName_CT.clear();
			WebElement VerifyRepNickName = RepNickName;
			RepNickName_CT.sendKeys("Phx",Date);
			SaveImage.click();
			String Verification =VerifyRepNickName.getText();
			Assert.assertEquals(Verification,"Phx"+Date,"RepNickName is not Matching");
			System.out.println("There should be an RepNickName:" + Verification);
			log.info("RepNickName:" + Verification);
			
		}
		public void clear_Type_RepCRD()
		{
			RepCRD.click();
			RepCRD_CT.clear();
			WebElement VerifyRepCRD = RepCRD;
			RepCRD_CT.sendKeys(Date);
			SaveImage.click();
			String Verification =VerifyRepCRD.getText();
			Assert.assertEquals(Verification,Date,"RepCRD is not Matching");
			System.out.println("There should be an RepCRD:" + Verification);
			log.info("RepCRD:" + Verification);
		}
		public void clear_Type_RepFirstName()
		{
			RepFirstName.click();
			RepFirstName_CT.clear();
			WebElement VerifyFirstName =RepFirstName;
			RepFirstName_CT.sendKeys("SID");
			SaveImage.click();
			String Verification =VerifyFirstName.getText();
			Assert.assertEquals(Verification,"SID","RepFirstName is not Matching");
			System.out.println("There should be an RepFirstName:" + Verification);
			log.info("RepFirstName:" + Verification);
			
		}
		public void clear_Type_RepLastName()
		{
			RepLastName.click();
			RepLastName_CT.clear();
			WebElement VerifyLastName = RepLastName;
			RepLastName_CT.sendKeys("V10");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			
			Assert.assertEquals(Verification,"V10","RepLastName is not Matching");
			System.out.println("There should be an RepLastName:" + Verification);
			log.info("RepLastName:" + Verification);
		}
		public void clear_Type_RepPhone()
		{
			RepPhone.click();
			RepPhone_CT.clear();
			WebElement VerifyLastName = RepPhone;
			RepPhone_CT.sendKeys("123456");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"123456","RepPhone is not Matching");
			System.out.println("There should be an RepPhone:" + Verification);
			log.info("RepPhone:" + Verification);
		}
		public void clear_Type_RepEmailID2()
		{
			RepEmailID2.click();
			RepEmailID2_CT.clear();
			WebElement VerifyLastName = RepEmailID2;
			RepEmailID2_CT.sendKeys("marsID2@sfs.com");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"marsID2@sfs.com","RepEmailID2 is not Matching");
			System.out.println("There should be an RepEmailID2:" + Verification);
			log.info("RepEmailID2:" + Verification);
		}
		public void clear_Type_RepEmail()
		{
			RepEmail.click();
			RepEmail_CT.clear();
			WebElement VerifyRepEmail = RepEmail;
			RepEmail_CT.sendKeys("marsID1@sfs.com");
			SaveImage.click();
			String Verification =VerifyRepEmail.getText();
			Assert.assertEquals(Verification,"marsID1@sfs.com","RepEmailID1 is not Matching");
			System.out.println("There should be an RepEmailID1:" + Verification);
			log.info("RepEmailID1:" + Verification);
		}
	
		public void clear_Type_RepMobile()
		{
			RepMobile.click();
			RepMobile_CT.clear();
			WebElement VerifyLastName = RepMobile;
			RepMobile_CT.sendKeys("7854755685");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"7854755685","RepMobile is not Matching");
			System.out.println("There should be an RepMobile:" + Verification);
			log.info("RepMobile:" + Verification);
		}
		public void clear_Type_PhoneExt()
		{
		PhoneExt.click();
		PhoneExt_CT.clear();
		WebElement VerifyLastName = PhoneExt;
		PhoneExt_CT.sendKeys("44");
		SaveImage.click();
		String Verification =VerifyLastName.getText();
		Assert.assertEquals(Verification,"44","PhoneExt is not Matching");
		System.out.println("There should be an PhoneExt:" + Verification);	
		}
		public void clear_Type_RepComments()
		{
		RepComments.click();
		RepComments_CT.clear();
		WebElement VerifyLastName = RepComments;
		RepComments_CT.sendKeys("Updated the Rep Comments",Date);
		SaveImage.click();
		String Verification =VerifyLastName.getText();
		Assert.assertEquals(Verification,"Updated the Rep Comments"+Date,"RepComments are not Matching");
		System.out.println("There should be an RepComments:" + Verification);
		log.info("RepComments:" + Verification);
		}
		public void clear_Type_RepSourceID()
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			RepSourceID.click();
			RepSourceID_CT.clear();
			WebElement VerifyLastName = RepSourceID;
			RepSourceID_CT.sendKeys("RSID",Date);
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"RSID"+Date,"RepSourceID is not Matching");
			System.out.println("There should be an RepSourceID:" + Verification);
			log.info("RepSourceID:" + Verification);
		}
		public void clear_Type_PersonalInfo()
		{
			PersonalInfo.click();
			PersonalInfo_CT.clear();
			WebElement VerifyLastName = PersonalInfo;
			PersonalInfo_CT.sendKeys("Rep_PersonalInfo",Date);
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"Rep_PersonalInfo"+Date,"PersonalInfo is not Matching");
			System.out.println("There should be an PersonalInfo:" + Verification);
			log.info("PersonalInfo:" + Verification);
		}
		public void clear_Type_Broker()
		{
			Broker.click();
			Broker_CT.clear();
			WebElement VerifyLastName = Broker;
			Broker_CT.sendKeys("5");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"5","BrokerInfo is not Matching");
			System.out.println(" # of Years as Broker :" + Verification);
			log.info("Broker :" + Verification);
		}
		public void clear_Type_AlternateName()
		{
			AlternateName.click();
			AlternateName_CT.clear();
			WebElement VerifyLastName = AlternateName;
			AlternateName_CT.sendKeys("Rep_AlternateName",Date);
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"Rep_AlternateName"+Date,"AlternateNam is not Matching");
			System.out.println(" AlternateName :" + Verification);
			log.info("AlternateName :" + Verification);
			
		}
		public void clear_Type_Birthday()
		{
			Birthday.click();
			Birthday_CT.clear();
			WebElement VerifyLastName = Birthday;
			Birthday_CT.sendKeys("03/08");
			Birthday_CTY.sendKeys("1847");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"03/08/2000","Birthday is not Matching");
			System.out.println(" Birthday :" + Verification);
			log.info("Birthday :" + Verification);
		}
		public void clear_Type_AUM()
		{
			AUM.click();
			AUM_CT.clear();
			WebElement VerifyLastName = AUM;
			AUM_CT.sendKeys("5245");
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"5245","AUM is not Matching");
			System.out.println(" Total AUM :" + Verification);
			log.info("Total AUM :" + Verification);
			
		}
		public void clear_Type_Spouse()
		{
			Spouse.click();
			Spouse_CT.clear();
			WebElement VerifyLastName = Spouse;
			Spouse_CT.sendKeys("Spouse_info",Date);
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"Spouse_info"+Date,"Spouseinfo is not Matching");
			System.out.println(" Spouseinfo:" + Verification);
			log.info("Spouseinfo:" + Verification);
		}
		public void clear_Type_Assistant()
		{
			Assistant.click();
			Assistant_CT.clear();
			WebElement VerifyLastName = Assistant;
			Assistant_CT.sendKeys("Assistant_info",Date);
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"Assistant_info"+Date,"Assistant info is not Matching");
			System.out.println(" Assistant info:" + Verification);
			log.info("Assistant info:" + Verification);
		}
		public void clear_Type_PriorFirm()
		{
			PriorFirm.click();
			PriorFirm_CT.clear();
			WebElement VerifyLastName = PriorFirm;
			PriorFirm_CT.sendKeys("Phoenix American",Date);
			SaveImage.click();
			String Verification =VerifyLastName.getText();
			Assert.assertEquals(Verification,"Phoenix American"+Date,"PriorFirm Details is not Matching");
			System.out.println("PriorFirm Details:" + Verification);
			log.info("PriorFirm Details:" + Verification);
		}
		public void clear_Type_UDF1()
		{
			try {
			UDF1.click();
			UDF1_CT.clear();
			WebElement VerifyUDF1 = UDF1;
			PriorFirm_CT.sendKeys("98761");
			SaveImage.click();
			Thread.sleep(3000);
			String Verification =VerifyUDF1.getText();
			Assert.assertEquals(Verification,"98761.00","UDF1 Details is not Matching");
			System.out.println("UDF1 Details:" + Verification);
			log.info("UDF1 Details:" + Verification);
			}
			catch(Exception exc){
				exc.printStackTrace();
				}
		
			}
			
		public void Social_link() {
			try {
			jse.executeScript("window.scrollTo(0,1600)");
			SocialLink.click();	
			clickonSociallink.click();
			SelectFacebook.click();
			LinkUrl.click();LinkUrl.sendKeys("www.facebook.com");
			Click_OK.click();
			Thread.sleep(1000);
			}
			catch(Exception exc){
				exc.printStackTrace();
				}	
		}
		
		public void Document() {
			try {
			Robot robot = new Robot();
			JavascriptExecutor je = (JavascriptExecutor)driver;
			String parent=driver.getWindowHandle();
			je.executeScript("arguments[0].scrollIntoView(true);",NewDocument);
			NewDocument.click();
			//System.out.println("Parent window id is "+parent);
		
			 Set<String>allwindows=driver.getWindowHandles();
			 //int count=allwindows.size();
			 //System.out.println("Total window"+count);
			 for(String child:allwindows)
			 {
			 if(!parent.equalsIgnoreCase(child))
			 {
			 driver.switchTo().window(child);
			 String Verification = driver.getTitle();
			 System.out.println("Switch to Window title is :" +Verification);
		      driver.switchTo().frame("legacyIframe");
			 Document_Name.sendKeys("MarsV10",Date);
			 BrowserBtn.click();
			 Assert.assertEquals(Verification,"Add Document | MARSWeb marsqa1.phxa.com","Switch to window title  not Matching");
			 log.info("Switch to Window Title:" + Verification);
			 BrowserBtn.getText();
			robot.setAutoDelay(1000);
				StringSelection stringSelection = new StringSelection("C:\\Users\\said\\Desktop\\TestNG\\ROBOTCLASS.txt");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
				
				robot.setAutoDelay(1000);
				
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				driver.switchTo().window(child);
				 Save.click();
				 
				 robot.setAutoDelay(1000);
				 
			 //System.out.println("Parent window title is"+driver.getTitle());
			//driver.close();
			 }
			 }
	 		 driver.switchTo().window(parent);

			}
			catch(Exception exc){
				exc.printStackTrace();
				}
					 }

		public void clear_Type_UDF2()
		{
			UDF2.click();
			UDF2_CT.clear();
			WebElement VerifyUDF2 = UDF2;
			UDF2_CT.sendKeys("9876");
			SaveImage.click();
			String Verification =VerifyUDF2.getText();
			Assert.assertEquals(Verification,"9876","UDF2 Details is not Matching");
			System.out.println("UDF2 Details:" + Verification);
			log.info("UDF2 Details:" + Verification);
		}
// Ctrl + click Method

	public void Rep_ctr_click()
{
		String parent=driver.getWindowHandle();
		//System.out.println("Parent window id is "+parent);
		 action.keyDown(Keys.CONTROL)
		 .click(Repctrlclick)
		 .keyUp(Keys.CONTROL)
		 .build()
		 .perform();
		 Set<String>allwindows=driver.getWindowHandles();
		 //int count=allwindows.size();
		 //System.out.println("Total window"+count);
		 for(String child:allwindows)
		 {
		 if(!parent.equalsIgnoreCase(child))
		 {
		 driver.switchTo().window(child);
		 String Verification = driver.getTitle();
		 System.out.println("Switch to Window title is :" +Verification);
		 Assert.assertEquals(Verification,"Rep Maintenance : SID V10 | MARSWeb marsqa1.phxa.com","Switch to window title  not Matching");
		 log.info("Switch to Window Title:" + Verification);
		 //driver.switchTo().window(parent);
		 //System.out.println("Parent window title is"+driver.getTitle());
		 driver.close();
		 }
		 }
 		 driver.switchTo().window(parent);
		 }
		 public void Firm_ctr_click()
		 {
		 		String parent=driver.getWindowHandle();
		 		//System.out.println("Parent window id is "+parent);
		 		 action.keyDown(Keys.CONTROL)
		 		 .click(Firmctrlclick)
		 		 .keyUp(Keys.CONTROL)
		 		 .build()
		 		 .perform();
		 		 Set<String>allwindows=driver.getWindowHandles();
		 		// int count=allwindows.size();
		 		// System.out.println("Total window"+count);
		 		 for(String child:allwindows)
		 		 {
		 		 if(!parent.equalsIgnoreCase(child))
		 		 {
		 		 driver.switchTo().window(child);
		 		 String Verification = driver.getTitle();
		 		 System.out.println("Switch to window title is :"+Verification);
		 		 Assert.assertEquals(Verification,"Firm : Blackhawk Securities Inc | MARSWeb marsqa1.phxa.com","Switch to Firm window title  not Matching");
		 		 log.info("Switch to Firm Window Title:" + Verification);
				 driver.close();
		 		 }
		 		 }
		 		 driver.switchTo().window(parent);
}

		public void Office_ctr_click() {
			String parent=driver.getWindowHandle();
	 		 action.keyDown(Keys.CONTROL)
	 		 .click(Officectrlclick)
	 		 .keyUp(Keys.CONTROL)
	 		 .build()
	 		 .perform();
	 		 Set<String>allwindows=driver.getWindowHandles();
	 		 for(String child:allwindows)
	 		 {
	 		 if(!parent.equalsIgnoreCase(child))
	 		 {
	 		 driver.switchTo().window(child);
	 		 String Verification = driver.getTitle();
	 		 System.out.println("Switch to window title is :"+Verification);
	 		 Assert.assertEquals(Verification,"Office : Blackhawk Securities Inc, 10405 E Mcdowell Mtn Rnch Rd | MARSWeb marsqa1.phxa.com","Switch to Office window title  not Matching");
	 		 log.info("Switch to Office Window Title:" + Verification);
			 driver.close();
	 		 }
	 		 }
	 		 driver.switchTo().window(parent);
			
		}

	}