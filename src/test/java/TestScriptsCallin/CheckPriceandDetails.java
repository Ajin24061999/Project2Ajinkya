package TestScriptsCallin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElements.CheckOut;

public class CheckPriceandDetails {

	WebDriver driver;
	CheckOut cd;
	@BeforeMethod
	public void launchBro() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority = 1)
	public void CheckPrice() throws InterruptedException
	{
		cd = new CheckOut(driver);
		cd.launchUrl();
		cd.usernme();
		cd.password();
		cd.login();
		cd.AddCartFromHomepage();
		cd.CartChec();
		cd.CheckOutinfor();
		cd.CheckFirstname("Ajinkya");
		cd.Lastnamee("Londhe");
		cd.pin("411017");
		
		Thread.sleep(3000);
		cd.conTin();
		Thread.sleep(3000);
		//Assert.assertTrue(cd.pricecheck().isDisplayed(), "Price is correct");
		if(cd.pricecheck().isDisplayed())
		{
			System.out.println("Price is correct");
		}
		else
		{
			System.out.println("Price is incorrect");
		}
		//cd.finIshbut();
		//cd.HomeBack();
	}
	@Test(priority = 2)
	public void TotalPrice() throws InterruptedException
	{
		cd = new CheckOut(driver);
		cd.launchUrl();
		cd.usernme();
		cd.password();
		cd.login();
		cd.AddCartFromHomepage();
		cd.CartChec();
		cd.CheckOutinfor();
		cd.CheckFirstname("Ajinkya");
		cd.Lastnamee("Londhe");
		cd.pin("411017");
		
		Thread.sleep(3000);
		cd.conTin();
		Thread.sleep(3000);
		if(cd.toTalPri().isDisplayed())
		{
			System.out.println("Total price is correct");
		}
		else
		{
			System.out.println("Total price is incorrect");
		}
	//	cd.finIshbut();
	//	cd.HomeBack();
		
	}
	@Test(priority = 3)
	public void Productname() throws InterruptedException
	{

		cd = new CheckOut(driver);
		cd.launchUrl();
		cd.usernme();
		cd.password();
		cd.login();
		cd.AddCartFromHomepage();
		cd.CartChec();
		cd.CheckOutinfor();
		cd.CheckFirstname("Ajinkya");
		cd.Lastnamee("Londhe");
		cd.pin("411017");
		
		Thread.sleep(3000);
		cd.conTin();
		Thread.sleep(3000);
		if(cd.NameOfProduct().isDisplayed())
		{
			System.out.println("Produt name is correct");
		}
		else
		{
			System.out.println("Product name is incorrect");
		}
		
	/*	cd.finIshbut();
		cd.HomeBack();
		cd.canCelbutton().click();*/
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	
	
}
