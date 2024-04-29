package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {

	WebDriver driver;
	public CheckOut(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "user-name")WebElement username;
	@FindBy(id = "password")WebElement passwrd;
	@FindBy(id = "login-button")WebElement logn;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")WebElement AddCart;
	@FindBy(className = "shopping_cart_link")WebElement CartCheck;
	@FindBy(id = "checkout")WebElement checkbutt;
	@FindBy(id = "first-name")WebElement firstName;
	@FindBy(id = "last-name")WebElement Lastname;
	@FindBy(id = "postal-code")WebElement pincode;
	@FindBy(id = "continue")WebElement conTinueButt;
	@FindBy(id = "finish")WebElement finishbutt;
	@FindBy(id = "back-to-products")WebElement BackHomepage;
	
	
	public void launchUrl() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
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
	public void AddCartFromHomepage()
	{
		
		AddCart.click();
	}
	public void CartChec()
	{
		CartCheck.click();
	}
	
	public void CheckOutinfor()
	{
		checkbutt.click();
	}
	
	public void CheckFirstname(String fn)
	{
		firstName.sendKeys(fn);		
		;
	}
	
	public void Lastnamee(String ln)
	{
		Lastname.sendKeys(ln);
	}

	public void pin(String pn)
	{
		pincode.sendKeys(pn);
	}

	public void conTin()
	{
		conTinueButt.click();
	}

	public void finIshbut()
	{
		finishbutt.click();
	}
	public void HomeBack()
	{
		BackHomepage.click();
	}

	public WebElement pricecheck()
	{
		return driver.findElement(By.className("inventory_item_price"));
	}
	public WebElement toTalPri()
	{
		return driver.findElement(By.xpath("//div[@class='summary_info']/child::div[8]"));
	}
	public WebElement NameOfProduct()
	{
		return driver.findElement(By.className("inventory_item_name"));
	}
	public WebElement canCelbutton()
	{
		return driver.findElement(By.id("cancel"));
	}
}
