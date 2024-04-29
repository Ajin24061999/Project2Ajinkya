package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideMenu {

	WebDriver driver;
	public SideMenu(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(idriver,this);
	}
	@FindBy(id = "user-name")WebElement username;
	@FindBy(id = "password")WebElement passwrd;
	@FindBy(id = "login-button")WebElement logn;
	@FindBy(id = "react-burger-menu-btn")WebElement sideop;
	@FindBy(id = "inventory_sidebar_link")WebElement itemall;
	@FindBy(id = "about_sidebar_link")WebElement about;
	@FindBy(id = "reset_sidebar_link")WebElement reset;
	public void url() throws InterruptedException
	{
		driver.get(" https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	public void usernme()
	{
		username.sendKeys("standard_user");
	}
	public void password()
	{
		passwrd.sendKeys("secret_sauce");
	}
	public void login()
	{
		logn.click();
	}
	
	public void sideMenu()
	{
		sideop.click();
	}
	public void iTem()
	{
		itemall.click();
	}
	
	public void abut()
	{
		about.click();
	}
	
	public void rEset()
	{
		reset.click();
	}
}
