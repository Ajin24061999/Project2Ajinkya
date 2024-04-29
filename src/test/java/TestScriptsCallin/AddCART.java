package TestScriptsCallin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageElements.AddToCart;
@Test(groups = {"ClassLevelGroup"})
public class AddCART {

	WebDriver driver;
	AddToCart ac;
	@BeforeSuite
	public void LuBrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority =1)
	public void LuURL() throws InterruptedException
	{
		ac = new AddToCart(driver);
		ac.launchURL();
	}
	@Test(priority =2)
	
	public void login() throws InterruptedException
	{
		ac = new AddToCart(driver);
		ac.launchURL();
		ac.usernme();
		ac.password();
		ac.login();
		Thread.sleep(3000);
		
	}
	@Test (dependsOnMethods = "login",priority =3)
	public void AddTocartFromhomepage() throws InterruptedException
	{
		
		ac.AddCartFromHomepage();
		Thread.sleep(3000);
		
	}
	
	@Test(groups = {"Sanity"},dependsOnMethods = "login",priority = 4)
	public void GotoCartCheck() throws InterruptedException
	{
	
		
		//ac.AddCartFromHomepage();
		ac.CartChec();
		
		if(ac.ProductPresent().isDisplayed())
		{
			System.out.println("Product is Present");
		}
		else
		{
			System.out.println("Product is absent");
		}
		System.out.println("Test2{\"Sanity\"}");
	}
	@Test(groups = {"Reggression"},dependsOnMethods = "GotoCartCheck",priority =6)
	public void removeFromCart() throws InterruptedException
	{
		Thread.sleep(3000);
		ac.removebutton();
		System.out.println("Test3{\"Reggression\"}");
	}
	
	@Test(groups = {"Windows.Retest"},dependsOnMethods = "removeFromCart",priority =7)
	public void ContinueShoping() throws InterruptedException
	{
		Thread.sleep(3000);
		ac.ContinueShop();
	
		System.out.println("Test3{\"Retest\"}");
	}
	

}
