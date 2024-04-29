package TestScriptsCallin;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageElements.AddToCart;

public class aDDToCart {

	WebDriver driver;
	
	AddToCart at;
	@BeforeSuite
	public void launchbro() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority =1)
	public void AddingMultiProducts() throws InterruptedException
	{
		
		at = new AddToCart(driver);
		at.launchURL();
		at.usernme();
		at.password();
		at.login();
		
		Actions act = new Actions(driver);
		
		for(int i=0;i<at.ListOfProduct().size();i++)
		{
			act.moveToElement(at.ListOfProduct().get(i)).build().perform();
			Thread.sleep(2000);
		}	
        Set<String> windows = driver.getWindowHandles();    //will return 6 windows 1 parent bak child & will give windows id's

		
		System.out.println(windows);
		
		Iterator<String>itr = windows.iterator();
		while(itr.hasNext())                              //recheck with maam
		{
			driver.switchTo().window(itr.next());
			String title = driver.getTitle();
					System.out.println(title);
		}
	}
}
