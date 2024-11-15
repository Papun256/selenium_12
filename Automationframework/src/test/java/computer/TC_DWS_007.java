package computer;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.Assert;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import GenericUtility.ListenerUtility;
import Objectrepository.HomePage;

	

	@Listeners(ListenerUtility.class)
	public class TC_DWS_007 extends BaseClass
	{
	@Test
	public void clickOnComputers() throws EncryptedDocumentException, IOException
	{
	test = extReport.createTest("ClickOnComputers");
	homepage = new HomePage(driver);
	homepage.getComputerlink().click();
	Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Computers", 1, 0),"Computer page is displayed");
	test.log(Status.PASS,"Computer Page is displayed");

	}
	}


