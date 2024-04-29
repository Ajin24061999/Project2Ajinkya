package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
	
	WebDriver driver;
	public Products(WebDriver idriver)
	{
		driver  = idriver;
		PageFactory.initElements(idriver,this);
	}
	//Repository
	@FindBy(id = "user-name")WebElement username;
	@FindBy(id = "password")WebElement passwrd;
	@FindBy(id = "login-button")WebElement logn;
	//@FindBy(className = "select_container")WebElement conTainer;
	
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
	
	
	public WebElement Container()
	{
		return driver.findElement(By.className("select_container"));
	}
	
	public String Title()
	{
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	

}
