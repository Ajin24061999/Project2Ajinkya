package TestScriptsCallin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageElements.FooterTabs;

public class FooterCall {

	WebDriver driver;
	FooterTabs ft;
	@Test(priority =1)
	public void launchBrow() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority =2)
	public void opTionscheck() throws InterruptedException
	{
		ft = new FooterTabs(driver);
		ft.url();
		ft.usernme();
		ft.password();
		ft.login();
		
		
	Actions act = new Actions(driver);
	for(int i=0;i<ft.footerOptions().size();i++)
	{
		act.moveToElement(ft.footerOptions().get(i)).build().perform();
	}
	}
	
}
