package mars.v10.pages;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Mars10.base.BaseClass;

public class FirmPage extends BaseClass {

	Actions action = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor) driver;

	@FindBy(xpath = "//*[@class='nav-item mx-3']/span[text()='Others']")
	WebElement Otherstab;

	@FindBy(xpath = "//*[@class='nav-item mx-3']/span[text()='Activities']")
	WebElement Activitiestab;

	@FindBy(xpath = "//*[@class='nav-item mx-3']/span[text()='Classic Firm Profile']")
	WebElement ClassicFirmProfiletab;

	@FindBy(xpath = "//*[@class='nav-item mx-3']/span[text()='Sales & Assets']")
	WebElement SalesAssetstab;

	@FindBy(xpath = "//*[@class='nav-item mx-3']/span[text()='market Share docs']")
	WebElement Marketsharetab;

	@FindBy(xpath = "//*[@class='nav-item mx-3']/span[text()='Agreements']")
	WebElement Agreementstab;

	@FindBy(xpath = "//*[@data-field-name='Firm Website']//div[@class='text-truncate'][1]")
	WebElement FirmWebsite;

	@FindBy(xpath = "//*[@data-field-name='Firm Website']//input[@id='txtTextBox']")
	WebElement EnterFirmWebsite;

	@FindBy(xpath = "//*[@data-field-name='Firm Website']/div/i[@id='saveImg'][1]")
	WebElement FirmWebsitesave;

	@FindBy(xpath = "//*[@data-field-name='Firm CRD']//div[@class='text-truncate'][1]")
	WebElement FirmCRD;

	@FindBy(xpath = "//*[@data-field-name='Firm CRD']//input[@id='txtTextBox']")
	WebElement EnterFirmCRD;

	@FindBy(xpath = "//*[@data-field-name='Firm CRD']/div/i[@id='saveImg'][1]")
	WebElement FirmCRDsave;

	@FindBy(xpath = "//*[@data-field-name='External Firm ID']//div[@class='text-truncate'][1]")
	WebElement FirmEXTID;

	@FindBy(xpath = "//*[@data-field-name='External Firm ID']//input[@id='txtTextBox']")
	WebElement EnterEXTIDCRD;

	@FindBy(xpath = "//*[@data-field-name='External Firm ID']/div/i[@id='saveImg'][1]")
	WebElement FirmEXTIDsave;

	@FindBy(xpath = "//*[@data-field-name='Firm Source ID']//div[@class='text-truncate'][1]")
	WebElement FirmSourceID;

	@FindBy(xpath = "//*[@data-field-name='Firm Source ID']//input[@id='txtTextBox']")
	WebElement EnterFSourceID;

	@FindBy(xpath = "//*[@data-field-name='Firm Source ID']/div/i[@id='saveImg'][1]")
	WebElement FirmSourceIDDsave;

	@FindBy(xpath = "//*[@data-field-name='SEC Number']//div[@class='text-truncate'][1]")
	WebElement FirmSECNum;

	@FindBy(xpath = "//*[@data-field-name='SEC Number']//input[@id='txtTextBox']")
	WebElement EnterFSECNum;

	@FindBy(xpath = "//*[@data-field-name='SEC Number']/div/i[@id='saveImg'][1]")
	WebElement FirmSecSave;

	@FindBy(xpath = "//*[@data-field-name='Firm Comments']//div[@class='text-truncate'][1]")
	WebElement FirmComments;

	@FindBy(xpath = "//*[@data-field-name='Firm Comments']//input[@id='txtTextBox']")
	WebElement EnterFirmComments;

	@FindBy(xpath = "//*[@data-field-name='Firm Comments']/div/i[@id='saveImg'][1]")
	WebElement FirmCommentsSave;

	@FindBy(xpath = "//*[@data-field-name='Firm Call Code']//span[@class='label'][1]")
	WebElement FirmCallCode;

	@FindBy(xpath = "//*[@data-field-name='Firm Call Code']/div/i[@id='saveImg'][1]")
	WebElement FirmCallCodesSave;

	@FindBy(xpath = "//*[@data-field-name='Firm Mail Code']//span[@class='label'][1]")
	WebElement FirmMailCode;

	@FindBy(xpath = "//*[@data-field-name='Firm Mail Code']/div/i[@id='saveImg'][1]")
	WebElement FirmMailCodesSave;

	@FindBy(xpath = "//*[@data-field-name='Firm Status']//span[@class='label'][1]")
	WebElement FirmStatus;

	@FindBy(xpath = "//*[@data-field-name='Firm Status']/div/i[@id='saveImg'][1]")
	WebElement FirmStatusSave;

	@FindBy(xpath = "//*[@data-field-name='Firm Email Code']//span[@class='label'][1]")
	WebElement FirmEMailCode;

	@FindBy(xpath = "//*[@data-field-name='Firm Email Code']/div/i[@id='saveImg'][1]")
	WebElement FirmEMailCodesSave;

	@FindBy(xpath = "//*[@data-field-name='Firm Short Name']//div[@class='text-truncate'][1]")
	WebElement FirmShortName;

	@FindBy(xpath = "//*[@data-field-name='Firm Short Name']//input[@id='txtTextBox']")
	WebElement EnterFirmShortName;

	@FindBy(xpath = "//*[@data-field-name='Firm Short Name']/div/i[@id='saveImg'][1]")
	WebElement FirmShortNameSave;

	@FindBy(xpath = "//*[@data-field-name='(FC) Text']//div[@class='text-truncate'][1]")
	WebElement FCText;

	@FindBy(xpath = "//*[@data-field-name='(FC) Text']//input[@id='txtTextBox']")
	WebElement EnterFCText;

	@FindBy(xpath = "//*[@data-field-name='(FC) Text']/div/i[@id='saveImg'][1]")
	WebElement FCTextSave;

	@FindBy(xpath = "//*[@class='nav-item mx-3']/span[text()='Main']")
	WebElement Maintab;

	@FindBy(xpath = "//a[contains(@href,'EditFirm') and contains(text(),'RUSSELL INVESTMENTS INC') ][1]")
	WebElement Firmdrilldown;

	@FindBy(xpath = "//*[contains(@class, 'LinkLabelText') and text()='New Contact']")
	WebElement NewContact;

	@FindBy(xpath = "//*[contains(@class, 'LinkLabelText') and text()='Add Existing Contact']")
	WebElement AddExistingContact;

	@FindBy(xpath = "//*[contains(@class, 'LinkLabelText ') and @title='Add'][1]")
	WebElement AddCategory;

	@FindBy(xpath = "//*[contains(@class, 'LinkLabelText ') and @title='Add'][2]")
	WebElement AddList;

	@FindBy(xpath = "//*[@placeholder='Type here to add Category']/div/input")
	WebElement TypeCategoryType;

	@FindBy(xpath = "//span[contains(text(), 'Contacts')]/i[text()='keyboard_arrow_right']")
	WebElement Contactcollapse;

	@FindBy(xpath = "//span[contains(text(), 'Firm Dynamic Details')]/i[text()='keyboard_arrow_right']")
	WebElement Firmdetailscollapse;

	@FindBy(xpath = "//select[@id='placeholder']")
	WebElement EditcontactContacttype;

	@FindBy(xpath = "//textarea")
	WebElement Editcontactcomments;

	@FindBy(xpath = "//button[text()='OK']")
	WebElement Editcontactokbutton;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement Edicontactcancelbutton;

	@FindBy(xpath = "//button[text()='Remove Contact']")
	WebElement Edicontactremovecontact;

	@FindBy(xpath = "//span[contains(text(), 'Categories')]/i[text()='keyboard_arrow_right']")
	WebElement Categoriescollapse;

	@FindBy(xpath = "//span[contains(text(), 'Lists')]/i[text()='keyboard_arrow_right']")
	WebElement FirmListcollapse;

	@FindBy(xpath = "//label[contains(@class, 'LinkLabelText ') and text()='Add'][1]")
	WebElement Addcategory;

	@FindBy(xpath = "//label[contains(@class, 'LinkLabelText ') and text()='Add'][2]")
	WebElement Addlist;

	public FirmPage() {

		PageFactory.initElements(driver, this);
		// PageFactory.initElements((WebDriver) Wait, this);

	}

	public void clickontab() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Otherstab.click();
		Reporter.log("Clicked on Others Tab");
		Activitiestab.click();
		Reporter.log("Clicked on Activities Tab");
		SalesAssetstab.click();
		Reporter.log("Clicked on Sales & Assets Tab");
		Marketsharetab.click();
		Reporter.log("Clicked on MarketShare Tab");
		Agreementstab.click();
		Reporter.log("Clicked on Agreements Tab");
		Maintab.click();
		Reporter.log("Clicked on Main Tab");

	}

	public void editfirmwebsite() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Edit Firm WebSite

		Reporter.log("Clicked on Firm Website to enable it");
		FirmWebsite.click();
		EnterFirmWebsite.clear();
		Reporter.log("Clear Firm WebSite");
		EnterFirmWebsite.sendKeys("www.google.com");
		Reporter.log("Entered Firm Website");
		FirmWebsitesave.click();
		Reporter.log("Clicked on Save icon in Website Field");

		// Edit Firm CRD
		FirmCRD.click();
		Reporter.log("Clicked on Firm CRD");
		EnterFirmCRD.clear();
		Reporter.log("Cleared Firm CRD");
		EnterFirmCRD.sendKeys(prop.getProperty("crd"));
		Reporter.log("Entered Firm CRD");
		FirmCRDsave.click();
		Reporter.log("Save Firm CRD");

		// Edit Firm External Id
		FirmEXTID.click();
		Reporter.log("Clicked on Firm External ID");
		EnterEXTIDCRD.clear();
		Reporter.log("Firm External ID is Cleared");
		EnterEXTIDCRD.sendKeys("125478");
		Reporter.log("Enetered Firm External ID");
		FirmEXTIDsave.click();
		Reporter.log("Saved Firm External ID");

		// Edit Firm Source ID
		FirmSourceID.click();
		Reporter.log("Clicked on Firm Source ID");
		EnterFSourceID.clear();
		Reporter.log("Firm Source ID is cleared");
		EnterFSourceID.sendKeys("125478");
		Reporter.log("Firm Source ID is entered");
		FirmSourceIDDsave.click();
		Reporter.log("Saved Firm Source ID");

		// Edit Firm Sec#
		FirmSECNum.click();
		Reporter.log("Clicked on Firm Sec#");
		EnterFSECNum.clear();
		Reporter.log("Firm Sec# is cleared");
		EnterFSECNum.sendKeys("125478");
		Reporter.log("Entered Firm Sec#");
		FirmSecSave.click();
		Reporter.log("Saved Firm Sec#");

		// Edit Firm Comments
		FirmComments.click();
		Reporter.log("Clicked on Firm Comments");
		EnterFirmComments.clear();
		Reporter.log("Cleared Firm Comments");
		EnterFirmComments.sendKeys("125478");
		Reporter.log("Entered Firm Comments");
		FirmCommentsSave.click();
		Reporter.log("Saved Firm Comments");

		// Edit FirmShort Name
		FirmShortName.click();
		Reporter.log("Clicked on Firm Short Name");
		EnterFirmShortName.clear();
		Reporter.log("Cleared Firm Short Name");
		EnterFirmShortName.sendKeys("125478");
		Reporter.log("Entered Firm Short Name");
		FirmShortNameSave.click();
		Reporter.log("Saved Fimr Short Name");

		// Edit Firm (FC) Text
		FCText.click();
		Reporter.log("Clicked on FC Text");
		EnterFCText.clear();
		Reporter.log("Cleared FC Text");
		EnterFCText.sendKeys("125478");
		Reporter.log("Entered FC Text");
		FCTextSave.click();
		Reporter.log("Saved FC Text");

	}

	public void nav2firmmaintenance() {

		Wait = new WebDriverWait(driver, 10);
		boolean firmdetailopen = Firmdrilldown.isEnabled();

		if (firmdetailopen) {

			Firmdetailscollapse.click();
		}
		Wait.until(ExpectedConditions.elementToBeClickable((By) Firmdrilldown));

		Firmdrilldown.click();

	}

	public void clickaddexistingcontact() throws NoSuchElementException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// jse.executeScript("arguments[0].scrollIntoView(true)", Contactcollapse);
		boolean contactopen = AddExistingContact.isDisplayed();
		if (contactopen) {
			jse.executeScript("arguments[0].scrollIntoView(true)", Contactcollapse);
			Contactcollapse.click();
		}

		else {

			jse.executeScript("arguments[0].scrollIntoView(true)", AddExistingContact);
			AddExistingContact.click();
		}

	}

	public void editcontact() {

		Editcontactcomments.sendKeys("Primary Contact");
		Editcontactokbutton.click();
	}

}
