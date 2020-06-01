package mars.v10.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlib.CommonLib;

import Mars10.base.BaseClass;
public class GlobalSearchPage extends BaseClass{
	CommonLib clib=PageFactory.initElements(driver, CommonLib.class);
	
    @FindBy(xpath = "//h3[normalize-space(text()='Search MARS')]")
	public WebElement SearchContext;
    
    @FindBy(xpath = "//div[normalize-space(text()='Search For :')]//ul//li//span[(text()='Rep')]")
	public WebElement Rep;
    
    @FindBy(xpath = "//div[(text()=' Hint:')]")
	public WebElement Hint;
    
    
    
    public GlobalSearchPage() {

		PageFactory.initElements(driver, this);
		
		}
    
    public void repGlobalSearch(){
    	
    	clib.verifyElementDisplay(SearchContext,"Search MARS");
    	clib.verifyElementDisplay(Hint,"Hint");
    	clib.verifyElementDisplay(Rep,"Rep Icon");
    	clib.click(Rep,"Rep Icon");
    	clib.verifyElementDisplay(Hint,"Hint");		
    }
	
}
