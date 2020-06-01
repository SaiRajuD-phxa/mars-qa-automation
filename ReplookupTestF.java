package Mars10.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.FirmLookupPage;
import mars.v10.pages.LoginPage;
import mars.v10.pages.ReplookupPage;

public class ReplookupTestF extends BaseClass{
	
	ReplookupPage ReplookupPag;
	
	
	public ReplookupTestF() {

		super();
	}
	
	@BeforeClass
	public void setup() {

		ReplookupPag = new ReplookupPage();
		
	}
	
	@Test(priority = 1)
	public void EnterLookupfilters() {
		
		ReplookupPag.enterrepname(prop.getProperty("RepName"));
		
		
		
	}
	

}
