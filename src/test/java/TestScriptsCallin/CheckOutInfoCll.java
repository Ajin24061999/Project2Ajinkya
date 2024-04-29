package TestScriptsCallin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageElements.CheckOut;

public class CheckOutInfoCll {

	WebDriver driver;
	CheckOut co;
	@BeforeSuite
	public void launchBro() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 1)
	public void AddingTocart() throws InterruptedException
	{
		co = new CheckOut(driver);
		co.launchUrl();
		co.usernme();
		co.password();
		co.login();
		co.AddCartFromHomepage();
		co.CartChec();
		co.CheckOutinfor();	
	}
	@Test(groups = "smoke",dependsOnMethods = "AddingTocart",priority = 2)
	public void checkInfovalid() throws InterruptedException
	{
		co.CheckFirstname("Ajinkya");
		co.Lastnamee("Londhe");
		co.pin("411017");
		
		Thread.sleep(3000);
		co.conTin();
		Thread.sleep(3000);
	//	Assert.assertEquals(co.pricecheck().isDisplayed(),"Price is correctly displayed");
		co.finIshbut();
		co.HomeBack();
		System.out.println("Test1{\"smoke\"}");
		
	}
	@Test(groups = "sanity",priority = 3)
	
	public void checkInfoAllBlankCredentials() throws InterruptedException
	{
		co = new CheckOut(driver);
		co.launchUrl();
		co.usernme();
		co.password();
		co.login();
		co.AddCartFromHomepage();
		co.CartChec();
		co.CheckOutinfor();	
		co.CheckFirstname("");
		co.Lastnamee("");
		co.pin("");
		Thread.sleep(3000);
		co.conTin();
		Thread.sleep(3000);
		
		System.out.println("Test2{\"sanity\"}");
	}
	
}