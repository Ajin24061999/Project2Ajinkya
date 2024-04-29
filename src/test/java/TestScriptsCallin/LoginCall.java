package TestScriptsCallin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageElements.LoginCheck;

public class LoginCall {

	WebDriver driver;
	LoginCheck lc;
	
	@BeforeSuite
	public void launchBrow() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	public void launchurl() throws InterruptedException
	{
		lc = new LoginCheck(driver);
		lc.url();
	}
	
	@Test(priority = 2)
	public void loginWithValidCredentials() throws InterruptedException
	{
		lc = new LoginCheck(driver);
		lc.url();
		lc.usernme();
		lc.password();
		lc.login();
		Thread.sleep(2000);
	}
	@Test(priority = 3)
	public void loginwithinValidusername() throws InterruptedException
	{
		lc = new LoginCheck(driver);
		lc.url();
		lc.invalidusernme();
		lc.password();
		lc.login();
		Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void loginwithinValidpassword() throws InterruptedException
	{
		lc = new LoginCheck(driver);
		lc.url();
		lc.usernme();
		lc.invalidpassword();
		lc.login();
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void loginwithBothinValidCredentials() throws InterruptedException
	{
		lc = new LoginCheck(driver);
		lc.url();
		lc.invalidusernme();
		lc.invalidpassword();
		lc.login();
		Thread.sleep(2000);
	}
	@Test(priority = 6)
	public void loginwithBothBlankCredentials() throws InterruptedException
	{
		lc = new LoginCheck(driver);
		lc.url();
		lc.BothBlankCredentials();
		lc.login();
		Thread.sleep(2000);
	}
	
	
}
