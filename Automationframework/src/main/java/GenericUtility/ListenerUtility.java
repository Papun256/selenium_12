package GenericUtility;
	import java.io.File;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	import com.aventstack.extentreports.Status;

	public class ListenerUtility extends BaseClass implements ITestListener
	{
	@Override
	public void onTestFailure(ITestResult results)
	{
	test.log(Status.FAIL, results.getName()+ "is failed");
	TakesScreenshot screenshot= (TakesScreenshot) driver;
	test.addScreenCaptureFromBase64String(screenshot.getScreenshotAs(OutputType.BASE64)); //to add screenshot in extent reports

	//to add screenshots in screenshots folder
	File temp = screenshot.getScreenshotAs(OutputType.FILE);
	File dest= new File("./screenshots/"+results.getName()+jUtil.getSystemTime()+".png");
	try
	{
	org.openqa.selenium.io.FileHandler.copy(temp, dest) ;
	}
	catch (Exception e)
	{
	e.printStackTrace();
	}


	}
	}



