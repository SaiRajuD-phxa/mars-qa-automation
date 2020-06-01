package mars.v10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mars10.base.BaseClass;

public class LoginPage extends BaseClass {

	// OR: LOGIN
	@FindBy(id = "txtuserId")
	WebElement username;

	@FindBy(id = "txtpassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement Loginbutton;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void enterunsername(String un) {
		username.sendKeys(un);

	}

	public void enterpassword(String pw) {

		password.sendKeys(pw);
	}

	public void clicklogin() {

		Loginbutton.click();
		

	}
}
