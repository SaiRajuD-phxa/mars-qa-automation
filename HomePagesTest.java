package Mars10.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Mars10.base.BaseClass;
import mars.v10.pages.HomePages;

public class HomePagesTest extends BaseClass
{

	HomePages HomePages;
	
	public HomePagesTest()
	{
		super();
	}
	
	@BeforeClass
	public void setUp()
	{
		
		HomePages = new HomePages();	
	}
	
	@Test
	public void loginHomePageTitleTest()
	{
		String title = HomePages.validatePageHomeTitle();
		Assert.assertEquals(title, "MARSWeb [marsqa1.phxa.com]");
		System.out.println("Verified HomepageTitle Success");
	}
	
	@Test(dependsOnMethods = {"loginHomePageTitleTest"})
    public void  MarsHomeLogoImageTest()
	 { 
		//System.out.println("MarsHomeLogoImageTest");
		boolean flag =HomePages.validateMarsHomeImage(); 
		Assert.assertTrue(flag);
		System.out.println("Verified MarsImage Logo ");
		
	 }
	
}
