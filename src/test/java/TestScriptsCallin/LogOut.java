package TestScriptsCallin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageElements.lOGOUT;

public class LogOut {

	WebDriver driver;
	lOGOUT lo;
	

	@BeforeSuite
	public void launchB()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void logOut() throws InterruptedException
	{
		lo = new lOGOUT(driver);
		lo.launuRL();
		lo.usernme();
		lo.password();
		lo.login();
		lo.sidebutton();	
		lo.logouT();	
		
	}
}
