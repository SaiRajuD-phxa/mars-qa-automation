package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.RepLookUp;

public class RepLookUpTest extends BaseClass
{
	
	RepLookUp RepLookUp;
	
	public RepLookUpTest()
	{
		super();
		
	}
	
	@BeforeClass
	public void setUp()
	{
		
		RepLookUp = new RepLookUp();	
	}
	
	@Test(priority=1)
	public void replookuplogin()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.clickrep();
	}
	
	@Test(priority=2,groups= {"Rep"})
	public void repnamesearch()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.repname_search();
	}
	
	@Test(priority=3,groups= {"Rep"})
	public void repmaintab()
	{
	
		RepLookUp.click_maintab();
	}
	
	@Test(priority=5,groups= {"Rep"})
	 public void MiddleName()
	 {
		 RepLookUp.clear_Type_MiddleName();
	 }
	 @Test(priority=6,enabled=false,groups= {"Rep"})
	 public void Fax()
	 {
		 RepLookUp.clear_Type_Fax();
	 }
	 @Test(priority=7,groups= {"Rep"})
	 public void Website()
	 {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 RepLookUp.clear_Type_Website();
		 
	 }
	 @Test(priority=8,groups= {"Rep"})
	 public void Title()
	 {
		 RepLookUp.clear_Type_RepTitle();
	 }
	 @Test(priority=9,groups= {"Rep"})
	 public void FirmSourceID()
	 {
		 RepLookUp.clear_Type_FirmSourceID();
	 }
	 @Test(priority=10,groups= {"Rep"})
	 public void RepNickName()
	 {
		 RepLookUp.clear_Type_RepNickName();
	 }
	 @Test(priority=11,groups= {"Rep"})
	 public void RepCRD()
	 {
		 RepLookUp.clear_Type_RepCRD();
	 }
	 @Test(priority=12,groups= {"Rep"})
	 public void RepFirstName()
	 {
		 RepLookUp.clear_Type_RepFirstName();
	 }
	 @Test(priority=13,groups= {"Rep"})
	 public void RepLastName()
	 {
		 RepLookUp.clear_Type_RepLastName();
	 }
	 @Test(priority=14,enabled=false,groups= {"Rep"})
	 public void RepPhone()
	 {
		 RepLookUp.clear_Type_RepPhone();
	 }
	 @Test(priority=15,groups= {"Rep"})
	 public void RepEmailID2()
	 {
		 RepLookUp.clear_Type_RepEmailID2();
	 }
	@Test(priority=16,enabled=false,groups= {"Rep"})
	public void RepMobile()
	{
		RepLookUp.clear_Type_RepMobile();
	}
	 
	@Test(priority=17,enabled=false,groups= {"Rep"})
	public void PhoneExt()
	{
		RepLookUp.clear_Type_PhoneExt();
	}
	@Test(priority=18,groups= {"Rep"})
	public void RepComments()
	{
		RepLookUp.clear_Type_RepComments();
	}
	@Test(priority=19,groups= {"Rep"})
	public void PersonalInfo()
	{
		RepLookUp.clear_Type_PersonalInfo();
	}
	@Test(priority=20,groups= {"Rep"})
	public void RepSourceID()
	{
		RepLookUp.clear_Type_RepSourceID();
	}
	@Test(priority=21,enabled=false,groups= {"Rep"})
	public void Broker()
	{
		RepLookUp.clear_Type_Broker();
	}
	@Test(priority=22,groups= {"Rep"})
	public void AlternateName()
	{
		RepLookUp.clear_Type_AlternateName();
	}
	@Test(priority=23,groups= {"Rep"})
	public void Birthday()
	{
		RepLookUp.clear_Type_Birthday();
	}
	@Test(priority=24,groups= {"Rep"})
	public void AUM()
	{
		RepLookUp.clear_Type_AUM();
	}
	@Test(priority=25,groups= {"Rep"})
	public void Spouse()
	{
		RepLookUp.clear_Type_Spouse();
	}
	@Test(priority=26,groups= {"Rep"})
	public void Assistant()
	{
		RepLookUp.clear_Type_Assistant();
	}
	@Test(priority=27,groups= {"Rep"})
	public void PriorFirm()
	{
		RepLookUp.clear_Type_PriorFirm();
	}
	@Test(priority=28,groups= {"Rep"})
	public void UDF1()
	{
		RepLookUp.clear_Type_UDF1();
	}
	@Test(priority=29,groups= {"Rep"})
	public void AddDocument()
	{
		RepLookUp.Document();
	}
	
	@Test(priority=30,groups= {"Rep"})
	public void AddSociallinks()
	{
		RepLookUp.Social_link();
	}
	@Test(priority=31,groups= {"Rep"})
	 public void RepEmail()
	 {
		 RepLookUp.clear_Type_RepEmail();
	 }	
	@Test(priority=32)
	public void Repctrlclick()
	{
		RepLookUp.Rep_ctr_click();
	}
	@Test(priority=33)
	public void Firmctrlclick()
	{
		RepLookUp.Firm_ctr_click();
	}
	@Test(priority=34)
	public void Officectrlclick()
	{
		RepLookUp.Office_ctr_click();
	}
	@Test(priority=35)
	public void repClassicProfile()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.click_ClassicProfile();
	}
	@Test(priority=36)
	public void repSales()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.click_Sales();
	}
	
	@Test(priority=37)
	public void repActivities()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.click_Activities();
	}
	
	@Test(priority=38)
	public void repCalendar()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.click_Calendar();
	}
	@Test(priority=39)
	public void repTimeline()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		RepLookUp.click_Timeline();
	} 

}


 	
