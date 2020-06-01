package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.genericlib.CommonLib;

import Mars10.base.BaseClass;

public class DefaultPage extends BaseClass {
	
	CommonLib clib=PageFactory.initElements(driver, CommonLib.class);
	
	
	@FindBy(xpath = "//*[@class='MARSLogo' or @href='/MARSWeb2/Dashboard']")
	WebElement MarsLogo;

	@FindBy(xpath = "//*[@title='Global Search']")
	WebElement Globalsearch;

	@FindBy(xpath = "//*[@title='Add Activities']")
	WebElement AddActivityIcon;

	@FindBy(xpath = "//*[@title='Add Favorites']")
	WebElement AddFavIcon;

	@FindBy(xpath = "//*[@title='Add Favorites']/following::button[1]")
	WebElement usermenu;

	@FindBy(xpath = "//*[@title='Manage Views']")
	WebElement ManageView;

	@FindBy(xpath = "//*[contains(text(), 'Dashboard For')]")
	WebElement DashboardHeader;

	// Tab in Dashboard
	@FindBy(xpath = "//*[contains(text(), 'Completed Reports')][1]")
	WebElement CompletedReportsTab;

	// Tab in Dashboard
	@FindBy(xpath = "//*[contains(text(), 'Dashboard - Interactive Report')][1]")
	WebElement InteractiveReportTab;

	// Menu Options(Sales)

	@FindBy(xpath = "//*[normalize-space(text())='Firm']//parent::a[@role='button']")
	WebElement Firmmenu;

	@FindBy(xpath = "//*[normalize-space(text())='Rep']//parent::a[@role='button']")
	WebElement RepMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Sales & Assets']//parent::a[@role='button']")
	WebElement SalesAssetsMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Compliance']//parent::a[@role='button']")
	WebElement ComplianceMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Accounts']//parent::a[@role='button']")
	private WebElement AccountsMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Product']//parent::a[@role='button']")
	WebElement ProductMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Tools']//parent::a[@role='button']")
	WebElement ToolsMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Market Share']//parent::a[@role='button']")
	WebElement marketshareMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Analytics']//parent::a[@role='button']")
	WebElement AnalyticsMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Office']//parent::a[@role='button']")
	WebElement OfficeMenu;

	// Firm Menu Options
	@FindBy(xpath = "//*[normalize-space(text())='Firm Profile' and @class='dropdown-item']")
	WebElement FirmProfile;

	public DefaultPage() {

		PageFactory.initElements(driver, this);
		
		}

	public void navigatetoFirmlookup() {

		Firmmenu.click();
		Reporter.log("Clicked on Firm menu option");
		FirmProfile.click();
		Reporter.log("Clicked on Firm Profile option in Firm Menu");

	}
	
	public void navigateToGlobalSearch() {
		
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(Globalsearch));  
		clib.click(Globalsearch,"Global Icon");
}
}