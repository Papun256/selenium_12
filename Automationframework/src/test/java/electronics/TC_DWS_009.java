package electronics;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import Objectrepository.HomePage;

	

	public class TC_DWS_009 extends BaseClass
	{
	@Test
	public void clickOnElectronics() throws EncryptedDocumentException, IOException
	{
	extReport.createTest("ClickOnElectronics");
	homepage= new HomePage(driver);
	Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Electronics", 1, 0), "Electronics Page is not displayed");
	test.log(Status.PASS, "Electronics Page is displayed");
	}
}


