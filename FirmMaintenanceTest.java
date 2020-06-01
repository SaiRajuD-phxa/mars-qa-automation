package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.FirmMaintenancePage;
import mars.v10.pages.FirmPage;

public class FirmMaintenanceTest extends BaseClass {

	FirmMaintenancePage FirmMaintenancePage;
	DefaultPage DefaultPage;
	FirmPage FirmPage;

	public FirmMaintenanceTest() {

		super();
	}

	@BeforeClass
	public void setup() {
		DefaultPage = new DefaultPage();
		FirmPage = new FirmPage();
		FirmMaintenancePage = new FirmMaintenancePage();
	}

	@Test(priority = 1)
	public void editpriminfo() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FirmMaintenancePage.Editfirmmain();
		FirmMaintenancePage.editprimaryinfo();
	}

}
