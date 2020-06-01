package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.FirmLookupPage;
import mars.v10.pages.LoginPage;

public class FirmLookupTest extends BaseClass {

	LoginPage LoginPage;
	DefaultPage DefaultPage;
	FirmLookupPage FirmLookupPage;

	public FirmLookupTest() {

		super();
	}

	@BeforeClass
	public void setup() {

		DefaultPage = new DefaultPage();
		FirmLookupPage = new FirmLookupPage();
	}

	@Test(priority = 1)
	public void nav2firm() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DefaultPage.navigatetoFirmlookup();

	}

	@Test(priority = 2)
	public void searchforfirm() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FirmLookupPage.enterfirmname(prop.getProperty("firmname"));
		FirmLookupPage.clickfind();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FirmLookupPage.firmdrilldown();

	}

}
