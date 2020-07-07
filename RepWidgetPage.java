package mars.v10.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.apache.log4j.Logger;

import Mars10.base.BaseClass;

public class RepWidgetPage extends BaseClass
{
	Logger log = Logger.getLogger(RepWidgetPage.class);
	JavascriptExecutor je = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//a[contains(text(),'MARS')]//following::span[1]")
	WebElement ClickArrow;
	@FindBy(xpath="//*[contains(text(),'Administration')]")
	WebElement ClickAdministration;
	@FindBy(xpath="//a[contains(text(),'System') and @id='navbarDropdown']")
	WebElement ClickSystem;
	@FindBy(xpath="//*[normalize-space(text())='Customize Rep Profile']")
	WebElement ClickcusRep;
	@FindBy(xpath="//*[normalize-space(text())='New Tab']")
	WebElement ClickNewTab;
	@FindBy(xpath="//*[@title='Save Tab']")
	WebElement SaveTab;
	@FindBy(xpath="//input[@id=\"undefined\"]")
	WebElement ClickName;
	@FindBy(xpath="//input[@id=\"undefined\"]/following::select[1]")
	WebElement SelectClick;
	@FindBy(xpath="//option[@value='U~MARSAUTO']")
	WebElement SelectAuto;
	@FindBy(xpath="//*[normalize-space(text())='Save']")
	WebElement Save;
	@FindBy(xpath="//*[normalize-space(text())='Automation']")
	WebElement Automation;
	@FindBy(xpath="//*[normalize-space(text())='Automation']//following::div[normalize-space(text())='New Widget']")
	WebElement NewWidget;
	@FindBy(xpath="//*[contains(text(),' Profile Customization Studio')]")
	WebElement ProfileCustomizationStudio;
	@FindBy(xpath="//*[contains(text(),'Social Links ')]")
	WebElement SocialLinks;
	
	public RepWidgetPage() {

		PageFactory.initElements(driver, this);

	}
	public void Administartion()
	{
		ClickArrow.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ClickAdministration.click();
		WebElement VerifyAdministartion=ClickAdministration;
		String Verification= VerifyAdministartion.getText();
		Assert.assertEquals(Verification,"Administration","Havent Switched to Administartion Window");
		log.info("Switched to Administration " + Verification);
		ClickSystem.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ClickcusRep.click();
		String parent=driver.getWindowHandle();
		driver.switchTo().window(parent);
		 String Verification1 = driver.getTitle();
 		 System.out.println("Switch to window title is :"+Verification1);
	}
	public void AddingWidget() 
	{
		ClickNewTab.click();
 		WebElement VerifySaveTab=SaveTab;
 		String VerifySaveTabwindow = VerifySaveTab.getText();
 		//Assert.assertEquals(VerifySaveTabwindow,"Save Tab","Verification of SaveTab Window");
 		System.out.println("SaveTab Window :" +VerifySaveTabwindow);
 		ClickName.sendKeys("Automation");
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		SelectClick.click();
 		//SelectAuto.click();
 		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		je.executeScript("arguments[0].scrollIntoView(true);",SelectAuto);
 		SelectAuto.click();
 		Save.click();
 		//Verify the USerName
 		Assert.assertEquals(true, Automation.isDisplayed() );
 		NewWidget.click();
 		//Verify the Window Title
 		Assert.assertEquals(true, ProfileCustomizationStudio.isDisplayed() );
 		
 		
		
	}
	
	
}
