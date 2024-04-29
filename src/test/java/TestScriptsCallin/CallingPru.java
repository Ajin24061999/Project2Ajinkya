package TestScriptsCallin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElements.Products;

public class CallingPru {


	
	WebDriver driver;
	Products pr;
	@BeforeMethod
	public void launchBroser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority = 1)
	public void TiTleofPage() throws InterruptedException
	{
		 pr = new Products(driver);
		 pr.url();
		 pr.usernme();
		 pr.password();
		 pr.login();
		String title = pr.Title();
		System.out.println("Title of page is "+title);
	}
	@Test(priority = 2)
	public void cOntainer() throws InterruptedException
	{
		 pr = new Products(driver);
		 pr.url();
		 pr.usernme();
		 pr.password();
		 pr.login();	 
	//	 pr.Container();
		 Select select  = new Select(pr.Container());
		 select.selectByValue("za");
		 
	}
	
	public void close()
	{
		driver.quit();
	}
	
}
