package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.RepLookUp;
import mars.v10.pages.RepWidgetPage;

public class RepWidgetTest extends BaseClass {
	RepWidgetPage RepWidget;
	
	public RepWidgetTest()
	{
		super();
		
	}
	@BeforeClass
	public void setUp()
	{
		
		RepWidget = new RepWidgetPage();	
	}
	@Test(priority=1)
	public void Administration()
	{
		RepWidget.Administartion();
	}
	@Test(priority=2)
	public void AddingWidget()
	{
		RepWidget.AddingWidget();
	}
	
}
