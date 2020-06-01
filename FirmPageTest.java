package Mars10.tests;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.FirmLookupPage;
import mars.v10.pages.FirmPage;
import mars.v10.pages.ReplookupPage;

public class FirmPageTest extends BaseClass {

	// DefaultPage DefaultPage;
	FirmPage FirmPage;
	ReplookupPage ReplookupPag;

	public FirmPageTest() {

		super();
	}

	@BeforeClass
	public void setup() {

		// DefaultPage= new DefaultPage();
		FirmPage = new FirmPage();
		ReplookupPag = new ReplookupPage();

	}

	@Test(priority = 1)

	public void clickontabs() {

		FirmPage.clickontab();

	}

	@Test(priority = 3)
	public void Editfirm() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		FirmPage.editfirmwebsite();
	}

	@Test(priority = 2)
	public void addexistingcontact() throws NoSuchElementException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FirmPage.clickaddexistingcontact();

		ReplookupPag.enterrepname(prop.getProperty("RepName"));
		ReplookupPag.clickfind();
		ReplookupPag.drilldownonrep();
		FirmPage.editcontact();

	}
}
