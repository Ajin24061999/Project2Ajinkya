package PageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	WebDriver driver;
	public AddToCart(WebDriver idriver) throws InterruptedException
	{
		driver = idriver;
		PageFactory.initElements(idriver,this);
	}

	//Repository
	@FindBy(id = "user-name")WebElement username;
	@FindBy(id = "password")WebElement passwrd;
	@FindBy(id = "login-button")WebElement logn;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")WebElement AddCart;
	
	@FindBy(id = "remove-sauce-labs-backpack")WebElement remove; 
	@FindBy(className = "shopping_cart_link")WebElement CartCheck;
	@FindBy(id = "continue-shopping")WebElement ContinuSho;
	@FindBy(xpath = "//div[@class='inventory_list']/child::div/child::div[2]/child::div[2]/child::button[@class='btn btn_primary btn_small btn_inventory ']")WebElement aDDCartlist;
	
	public void launchURL() throws InterruptedException
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
	public void removebutton()
	{
		remove.click();
	}
	public void CartChec()
	{
		CartCheck.click();
	}
	public WebElement ProductPresent()
	{
		return driver.findElement(By.className("inventory_item_name"));
	}
	public void ContinueShop()
	{
	
		ContinuSho.click();
	}
	public WebElement itemCart()
	{
		return driver.findElement(By.className("removed_cart_item"));
	}
	public WebElement MultiProd()
	{
	
		return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
	}
	public List<WebElement> ListOfProduct()
	{
		return driver.findElements(By.xpath("//div[@class='inventory_list']/child::div/child::div[2]/child::div/a"));
	}
	
	public WebElement Container()
	{
		return driver.findElement(By.className("cart_contents_container"));
	}
	
	public WebElement reMoveButtonHomepage()
	{
		return driver.findElement(By.id("remove-sauce-labs-backpack"));
	}
	public WebElement aDDcartButton()
	{

		return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	}
	
}
