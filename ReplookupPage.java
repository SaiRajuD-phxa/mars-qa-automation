package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mars10.base.BaseClass;

public class ReplookupPage extends BaseClass {

	@FindBy(xpath="//input[@data-field-name='Firm']")
	WebElement FirmName;
	
	@FindBy(xpath="//input[@data-field-name='Rep Full Name']")
	WebElement RepFullName;
	
	@FindBy(xpath="//input[@data-field-name='Last Name']")
	WebElement RepLastName;
	
	@FindBy(xpath="//input[@data-field-name='First Name']")
	WebElement RepFirstName;
	
	@FindBy(xpath="//input[@data-field-name='Office']")
	WebElement Office;
	
	@FindBy(xpath="//input[@data-field-name='Rep Nick Name']")
	WebElement RepNickName;
	
	@FindBy(xpath="//input[@data-field-name='Rep City']")
	WebElement RepCity;
	
	@FindBy(xpath="//input[@data-field-name='Rep Zip']")
	WebElement RepZip;
	
	@FindBy(xpath="//input[@data-field-name='Rep CRD']")
	WebElement RepCrd;
	
	@FindBy(xpath="//input[@data-field-name='Firm CRD']")
	WebElement FirmCRD;
	
	@FindBy(xpath="//input[@data-field-name='Rep Phone']")
	WebElement RepPhone;
	
	@FindBy(xpath="//button[text()='Reset']")
	WebElement Resetbutton;
	
	@FindBy(xpath="//button[text()='Find']")
	WebElement Findbutton;
	
	@FindBy(xpath="//span[text()='Douglas Brauer']")
	WebElement Repdrilldown;
	
	
	
	
	
	
	public ReplookupPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void enterrepname(String repf) {
		RepFullName.sendKeys(repf);
		
	}
	public void enterlastname(String replast) {
		RepLastName.sendKeys(replast);
	
}
	
	public void RepFirstName(String repfirst) {
		RepFirstName.sendKeys(repfirst);
	
}
	public void enterOffice(String offce) {
		Office.sendKeys(offce);
	
}
	public void enterRepNickName(String RepNName) {
		RepNickName.sendKeys(RepNName);
	
}
	public void enterRepCity(String Repcity) {
		RepCity.sendKeys(Repcity);
	
}
	public void enterrepzip(String Repzip) {
		RepZip.sendKeys(Repzip);
	
}
	public void enterRepCrd(String repcrd) {
		RepCrd.sendKeys(repcrd);
	
}
	public void enterfirmcrd(String firmcrd) {
		FirmCRD.sendKeys(firmcrd);
	
}
	public void enterRepPhone(String rephone) {
		RepPhone.sendKeys(rephone);
	
}
	
	public void clickfind() {
		
		Findbutton.click();
	}
	
	public void clickreset() {
		
		Resetbutton.click();
	}
	
	public void drilldownonrep() {
		
		Repdrilldown.click();
	}
	
}