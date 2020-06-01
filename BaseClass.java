package Mars10.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait Wait;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;


	
	public BaseClass() {
		
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Workspace\\Mars10POMAutomation\\src\\main\\java\\files\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			try{
			String chromeDriver = "D:\\Workspace\\Mars10POMAutomation\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriver); 
			ChromeDriverService gcservice = ChromeDriverService.createDefaultService(); 
			gcservice.start();
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			options.addArguments("chrome.switches","--disable-extensions");
			options.addArguments("chrome.switches","--disable-popup-blocking"); 
			options.addArguments("disable-infobars");
			options.addArguments("--start-maximized");
			options.setExperimentalOption("useAutomationExtension", false); 
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-extensions"));
			driver = new ChromeDriver(gcservice, options);
			//driver.navigate().to("chrome://plugins/");
		}
		catch (Exception e) 
		{
			Reporter.log(e.getMessage());
			Reporter.log("Error in initialization of GC driver");
		}
			
			
		}
			else if(browserName.equals("FF"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\Mars10POMAutomation\\drivers\\geckodriver_win32_0.24.exe");	
				driver = new FirefoxDriver(); 
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		

		
	}
	
	public void setExtent() {

		//htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir" + "/test-output/myReport.html"));
		htmlReporter = new ExtentHtmlReporter("./Reports/extent.html");
		htmlReporter.config().setEncoding("utf-g");
		htmlReporter.config().setDocumentTitle("MARS10 Report");
		htmlReporter.config().setReportName("Mars10 Test Report");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);// Attached the reporter
		extent.setSystemInfo("HostName","LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser","CHROME");
		extent.setSystemInfo("url", "V10");

	}

	public void endReport() {

		extent.flush();
	}

	public void teardown(ITestResult result) throws IOException {

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
	

	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {

		String dateName = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// after execution, you cpuld see a folder "FailedTestsScreenshots" under src
		// folder

		//String destination = System.getProperty("User.dir") + "/Screenshots" + screenshotName + dateName + ".png";
		String destination = "./Reports/Screenshot" + prop.getProperty("Release")+ "/Screenshots" + screenshotName + dateName + ".png";
		
		File finalDestination = new File(destination);

		FileUtils.copyFile(source, finalDestination);
		return destination;

	}

}
