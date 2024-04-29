package PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCheck {

	WebDriver driver;
	public LoginCheck(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(idriver,this);
	}
	
	//Repository
	@FindBy(id = "user-name")WebElement username;
	@FindBy(id = "password")WebElement passwrd;
	@FindBy(id = "login-button")WebElement logn;
	
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
	
	public void invalidusernme()
	{
		username.sendKeys("standard");
	}
	public void invalidpassword()
	{
		passwrd.sendKeys("t_sauce");
	}
	public void BothinvalidCredenti()
	{
		username.sendKeys("standard");
		passwrd.sendKeys("t_sauce");
	}
	
	public void BothBlankCredentials()
	{
		username.sendKeys("");
		passwrd.sendKeys("");
	}
	
	
	
	
}
