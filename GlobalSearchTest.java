package Mars10.tests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.GlobalSearchPage;
import mars.v10.pages.LoginPage;
import mars.v10.pages.RepLookUp;

public class GlobalSearchTest extends BaseClass {

	LoginPage loginPage;
	DefaultPage defaultPage;
	GlobalSearchPage globalSearchPage;

	public GlobalSearchTest() {

		super();
	}

	
	@Test(priority = 1)
	public void navigateToGlobalSearch() {
		
		defaultPage = new DefaultPage();
		defaultPage.navigateToGlobalSearch();

	}
	@Test(priority = 2)
	public void navigateToRepGlobalSearch() {
		
		globalSearchPage = new GlobalSearchPage();
		globalSearchPage.repGlobalSearch();

	}
}
