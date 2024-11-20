package book;

	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import Objectrepository.HomePage;


	public class TC_DWS_006_Test extends BaseClass
	{
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException
	{
	test=extReport.createTest("clickOnBooks");
	homepage = new HomePage(driver);
	homepage.getBooklink().click();
	Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Books", 1, 0),"book page is not displayed");
	test.log(Status.PASS, "Books page is displayed");
	}
	}



