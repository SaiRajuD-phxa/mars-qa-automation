package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Mars10.base.BaseClass;

public class FirmLookupPage extends BaseClass {

	@FindBy(xpath = "//*[@data-field-name='Firm']")
	WebElement FirmName;

	@FindBy(xpath = "//*[@data-field-name='Firm Alias']")
	WebElement FirmAlias;

	@FindBy(xpath = "//*[@data-field-name='Firm ZIP']")
	WebElement Firmzip;

	@FindBy(xpath = "//*[@data-field-name='Firm CRD']")
	WebElement Firmcrd;

	@FindBy(xpath = "//*[@data-field-name='External Firm ID']")
	WebElement ExternalFirmId;

	@FindBy(xpath = "//*[@data-field-name='Firm ID']/following::input[1]")
	WebElement FirmId;

	@FindBy(xpath = "//*[@class='k-multiselect-wrap k-floatwrap']")
	WebElement Firmtype;

	@FindBy(xpath = "//*[text()=' Active ']/parent::select")
	WebElement FirmStatus;

	@FindBy(xpath = "//*[text()='Segmentation']/preceding::select[1]")
	WebElement Frimsegmentation;

	@FindBy(xpath = "//*[text()='Firm Record Type']/preceding::select[1]")
	WebElement Firmrecordtype;

	@FindBy(xpath = "//*[text()='Parent/Child Firm']/preceding::select[1]")
	WebElement Parentchildfirm;

	@FindBy(xpath = "//*[text()='Country']/preceding::select[1]")
	WebElement FirmCountry;

	@FindBy(xpath = "//*[text()='State']/preceding::select[1]")
	WebElement Firmstate;

	@FindBy(xpath = "//*[text()='TA']/preceding::select[1]")
	WebElement Firmta;

	@FindBy(xpath = "//*[text()='Find' and @type='button']")
	WebElement Findbutton;

	@FindBy(xpath = "//*[text()='Reset' and @type='button']")
	WebElement Resetbutton;

	@FindBy(xpath = "//*[@class='GridLinkLabelText']/a[contains(text(),'RUSSELL INVESTMENTS INC')]")
	WebElement Firmdrilldown;

	public FirmLookupPage() {

		PageFactory.initElements(driver, this);

	}

	public void enterfirmname(String Firmname) {
		FirmName.sendKeys(Firmname);
		Reporter.log("Entered Firm Name in Lookup Screen");

	}

	public void clickfind() {
		Findbutton.click();
		Reporter.log("Clicked on Find Button");
	}

	public void firmdrilldown() {

		Firmdrilldown.click();
		Reporter.log("Navigated to Firm profile");
	}

}
