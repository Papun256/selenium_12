package GenericUtility;


	import java.util.Set;

	import org.openqa.selenium.Dimension;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class WebDriverUtility
	{
	 /**
	 * This method is used to maximize the Window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
	driver.manage().window().maximize();
	}

	/**
	* This method is used to capture size of a Window
	* @param driver
	* @return
	*/
	public Dimension getSize(WebDriver driver)
	{
	return driver.manage().window().getSize();
	}

	/**
	* This method is used to switch the driver control to Window based on URL.
	* @param driver
	* @param URL
	*/
	public void switchWindow(WebDriver driver, String url)
	{
	//step1: capture window ID
	Set<String> allwindow = driver.getWindowHandles();

	//step2: Navigate through all the windows
	for(String id : allwindow)
	{
	driver.switchTo().window(id);
	String actualURL = driver.getCurrentUrl();

	if(actualURL.contains(url))
	{
	break;
	}
	}

	}
	/**
	* This method is used to perform rightClick.
	* @param driver
	*/
	public void rightClick(WebDriver driver)
	{
	Actions act = new Actions(driver);
	act.contextClick().perform();
	}

	/**
	* This method is used to perform clickAndHold.
	* @param driver
	* @param element
	*/
	public void clickAndHold(WebDriver driver, WebElement element)
	{
	Actions act = new Actions(driver);
	act.clickAndHold(element).perform();
	}
	/**
	* This method is used to perform mouseHover.
	* @param driver
	* @param element
	*/
	    public void mouseHover(WebDriver driver, WebElement element)
	{
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
	}

	/**
	* This method is used to perform mouseHover
	* @param driver
	* @param x
	* @param y
	*/
	public void mouseHover(WebDriver driver, int x, int y)
	{
	Actions act = new Actions(driver);
	act.moveByOffset(x, y).perform();
	}

	/**
	* This method is used to perform swichToFrame
	* @param driver
	* @param index
	*/
	public void swichToFrame(WebDriver driver, int index)
	{
	driver.switchTo().frame(index);
	}

	/**
	* This method is used to perform swichToFrame
	* @param driver
	* @param nameorId
	*/
	public void swichToFrame(WebDriver driver, String nameorId)
	{
	driver.switchTo().frame(nameorId);
	}

	/**
	* C
	* @param driver
	* @param element
	*/
	public void swichToFrame(WebDriver driver, WebElement element)
	{
	driver.switchTo().frame(element);
	}

	/**
	* his method is used to perform switchToMainPage
	* @param driver
	*/
	public void switchToMainPage(WebDriver driver)
	{
	driver.switchTo().defaultContent();
	}
	/**
	*
	* @param element
	* @param index
	*/
	public void selectDropDownByIndex(WebElement element, int index)
	{
	Select select = new Select(element);
	select.selectByIndex(index);
	}

	/**
	*
	* @param element
	* @param index
	*/
	public void selectDropDownByValue(WebElement element, String index)
	{
	Select select = new Select(element);
	select.selectByValue(index);
	}

	/**
	*
	* @param element
	* @param text
	*/
	public void selectDropDownByVisibleText(WebElement element, String text)
	{
	Select select = new Select(element);
	select.selectByVisibleText(text);
	}

	}

