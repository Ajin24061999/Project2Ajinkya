package PageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterTabs {

	WebDriver driver;
	public FooterTabs(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
		
	}
	//REpository
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
	public List<WebElement> footerOptions()
	{
		return driver.findElements(By.xpath("//ul[@class = 'social']/li/a"));
	}
	
}
