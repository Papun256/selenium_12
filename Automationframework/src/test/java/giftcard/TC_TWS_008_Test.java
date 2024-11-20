package giftcard;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;
import Objectrepository.HomePage;

	

	public class TC_TWS_008_Test extends BaseClass
	{
	@Test
	public void clickOnGiftCards() throws IOException
	{
	extReport.createTest("ClickOnGiftCard");
	homepage = new HomePage(driver);
	Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Giftcard", 1, 0),"Giftcard page is npot displayed");
	test.log(Status.PASS, "Giftcard page is displayed");
	}
}



