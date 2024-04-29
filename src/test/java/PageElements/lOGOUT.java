package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lOGOUT {

	WebDriver driver;
	public lOGOUT(WebDriver idriver)
	{
		driver  = idriver;
		PageFactory.initElements(idriver,this);
	}
	
	
	//Repository

	@FindBy(id = "user-name")WebElement username;
	@FindBy(id = "password")WebElement passwrd;
	@FindBy(id = "login-button")WebElement logn;
	@FindBy(id = "react-burger-menu-btn")WebElement sideButt;
	@FindBy(id = "logout_sidebar_link")WebElement logOut;
	
	
	public void launuRL() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
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
	public void sidebutton()
	{
		sideButt.click();
	}
	public void logouT()
	{
		logOut.click();
	}
	
	/*public WebElement logo()
	{
		return driver.findElement(By.xpath("//nav[@class='bm-item-list']/a[3]"));
	}*/
	

	
	
	
	
}
