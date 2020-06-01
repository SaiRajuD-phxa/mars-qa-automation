package Mars10.tests;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Mars10.base.BaseClass;
import mars.v10.pages.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage LoginPage;
	
	

	


	public LoginTest() {

		super();
	}
	
	@BeforeTest
	public void setupreport() {
		setExtent();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		LoginPage = new LoginPage();
	}

	@Test(groups={"Login"})
	public void Login() {
		test = extent.createTest("Login");
		LoginPage.enterunsername(prop.getProperty("username"));
		Reporter.log("Entered User Name");
		LoginPage.enterpassword(prop.getProperty("password"));
		Reporter.log("Entered Password");
		LoginPage.clicklogin();
		Reporter.log("Clicked on Login Button");
	}


	
	@AfterMethod
	public void logincomp(ITestResult result) throws IOException {
		
		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, "Testcase Failed is" + result.getName());// to add name in extent report
			test.log(Status.FAIL, "Testcase Failed is" + result.getThrowable());// to add error/exception in extent
																				// report

			String screenshotpath = BaseClass.getScreenshot(driver, result.getName());

			test.addScreenCaptureFromPath(screenshotpath);
		}

		else if (result.getStatus() == ITestResult.SKIP) {

			test.log(Status.SKIP, "Testcase Skipped is" + result.getName());

		}

		else if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(Status.PASS, "Tetscase Passed is" + result.getName());
		}
		
	}

	@AfterTest
	
	public void endreport() {
		
		endReport();

	}

}			
