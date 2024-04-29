package TestScriptsCallin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageElements.SideMenu;

public class Itemsip {

	WebDriver driver;
	SideMenu sm;
	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
				}
	@Test(priority = 1)
	public void bajuKeop() throws InterruptedException
	{
		sm = new SideMenu(driver);
		sm.url();
		sm.usernme();
		sm.password();
		sm.login();
		sm.sideMenu();
		sm.iTem();
		
		
	}
	@Test(priority = 2)
	public void aboutpage() throws InterruptedException
	{
		sm = new SideMenu(driver);
		sm.url();
		sm.usernme();
		sm.password();
		sm.login();
		sm.sideMenu();
		sm.abut();
	}
	@Test(priority = 3)
	public void reset() throws InterruptedException
	{
		sm = new SideMenu(driver);
		sm.url();
		sm.usernme();
		sm.password();
		sm.login();
		sm.sideMenu();
		sm.rEset();
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
