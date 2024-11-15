package GenericUtility;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Objectrepository.HomePage;
import Objectrepository.LoginPage;
import Objectrepository.WelcomePage;


	public class BaseClass
	{
	public WebDriver driver;
	public static ExtentReports extReport;
	public ExtentTest test;
	
	
	public JavaUtility jUtil = new JavaUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public FileUtility fUtil = new FileUtility();
	public ExcelUtility eUtil= new ExcelUtility();

	public WelcomePage welcomepage;
	public LoginPage loginpage;
	public HomePage homepage;
	
	

	@BeforeSuite
	public void reportConfig()
	{
	ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Report/ExtentReport_"+jUtil.getSystemTime()+".html");
	extReport= new ExtentReports();
	extReport.attachReporter(spark);
	}
	@Parameters("Browser")
	

	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) throws IOException
	{
	if(browserName.equalsIgnoreCase("chrome"))
	{
	driver= new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("firefox"))
	{
	driver= new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("Edge"))
	{
	driver = new EdgeDriver();
	}
	wUtil.maximizeWindow(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(fUtil.getDataFromProperty("url"));
	}

	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
	welcomepage= new WelcomePage(driver);
	welcomepage.getLoginLink().click();

	loginpage= new LoginPage(driver);
	loginpage.getEmailTF().sendKeys(fUtil.getDataFromProperty("email"));
	loginpage.getPasswordTF().sendKeys(fUtil.getDataFromProperty("password"));
	loginpage.getLoginButton().click();

	Thread.sleep(5000);

	}

	@AfterMethod
	public void logout()
	{
	homepage= new HomePage(driver);
	homepage.getLogoutbutton().click();
	}

	@AfterClass
	public void closeBrowser()
	{
	driver.quit();
	}
	@AfterSuite
	public void reportBackup()
	{
	extReport.flush();

	}
}


