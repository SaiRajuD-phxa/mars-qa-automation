package mars.v10.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Mars10.base.BaseClass;

public class FirmMaintenancePage extends BaseClass {

	@FindBy(xpath = "//*[@id='txtFirmName']")
	WebElement FirmName;

	@FindBy(xpath = "//*[@id='txtFirmShortName']")
	WebElement FirmSName;

	@FindBy(xpath = "//*[@id='cboFirmStatusListBox']")
	WebElement FirmStatus;

	@FindBy(xpath = "//*[@id='cmbFirmType']")
	WebElement FirmType;

	@FindBy(xpath = "//*[@id='cmbFirmNewType']")
	WebElement NewFirmType;

	@FindBy(xpath = "//*[@id='btnConvert']")
	WebElement Convertbtn;

	@FindBy(xpath = "//*[@id='btnDeleteFirm']")
	WebElement Deletebtn;

	@FindBy(xpath = "//*[@id='txtFirmCrdId']")
	WebElement FirmCrd;

	@FindBy(xpath = "//*[@id='txtSECNumber']")
	WebElement SecNumber;

	@FindBy(xpath = "//*[@id='txtSourceID']")
	WebElement FirmSourceId;

	@FindBy(xpath = "//*[@id='txtWebSite']")
	WebElement FirmWebsite;

	@FindBy(xpath = "//*[@id='lstRepTerritoriesBy']")
	WebElement FirmTerrBy;

	@FindBy(xpath = "//*[@id='txtNSCC']")
	WebElement FirmNSCC;

	@FindBy(xpath = "//*[@id='chkSDR']")
	WebElement SDRCheck;

	@FindBy(xpath = "//*[@id='objSegmentationListBox']")
	WebElement FRMSegmentation;

	@FindBy(xpath = "//*[@id='priorsegmentation']")
	WebElement PriorSeg, entation;

	@FindBy(xpath = "//*[@id='cboConcentrationListBox']")
	WebElement FirmConcentration;

	@FindBy(xpath = "//*[@id='lstCompBasis']")
	WebElement CompBasis;

	@FindBy(xpath = "//*[@id='txtNoOfRegStates']")
	WebElement States;

	@FindBy(xpath = "//*[@id='txtFirmComments']")
	WebElement FirmComments;

	public FirmMaintenancePage() {

		PageFactory.initElements(driver, this);

	}

	public void Editfirmmain() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		FirmName.clear();
		Reporter.log("Cleared Firm Name");
		FirmName.sendKeys("Maxwel Firm Corp");
		Reporter.log("Entered Firm Name");

		FirmSName.clear();
		Reporter.log("Cleared Firm Short Name");
		FirmSName.sendKeys("Maxwel Firm Cor");
		Reporter.log("Entered Firm Short Name");

	}

	public void editprimaryinfo() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		FirmCrd.clear();
		Reporter.log("Cleared Firm CRD");
		FirmCrd.sendKeys("MAX174WEDN");
		Reporter.log("Entered Firm CRD");

		SecNumber.clear();
		Reporter.log("Cleared Firm Sec Number");
		SecNumber.sendKeys("12345");
		Reporter.log("Entered Firm Sec");

		FirmSourceId.clear();
		Reporter.log("Cleared Firm Source ID");
		FirmSourceId.sendKeys("12345");
		Reporter.log("Entered Firm Source ID");

		FirmWebsite.clear();
		Reporter.log("Cleared Firm WebSite");
		FirmWebsite.sendKeys("www.google.com");
		Reporter.log("Entered Firm WebSite");

	}

}
