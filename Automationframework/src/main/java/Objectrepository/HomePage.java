package Objectrepository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage
	{
        // Home page calls is modified in github
	@FindBy(linkText = "Log out")
	private WebElement logoutbutton;

	@FindBy(partialLinkText ="Books")
	private WebElement booklink;

	@FindBy(partialLinkText ="Computers")
	private WebElement computerlink;

	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutbutton() {
	return logoutbutton;
	}

	public WebElement getBooklink() {
	return booklink;
	}

	public WebElement getComputerlink() {
	return computerlink;
	}


	}



