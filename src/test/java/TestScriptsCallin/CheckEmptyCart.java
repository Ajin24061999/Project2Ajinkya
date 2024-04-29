package TestScriptsCallin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageElements.AddToCart;

public class CheckEmptyCart {

	WebDriver driver ;
	AddToCart ar;
	@Test(priority = 1)
	public void launchBroser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void AddandRemovefromCart() throws InterruptedException
	{
		ar = new AddToCart(driver);
		ar.launchURL();
		ar.usernme();
		ar.password();
		ar.login();
		ar.AddCartFromHomepage();
		
		if(ar.reMoveButtonHomepage().isDisplayed())
		{
			System.out.println("Product is present in cart is remove button is present on homepae of products after adding ");
			ar.removebutton();
		}
		else
		{
			System.out.println("Product is not present after adding into cart");
		}	
	}
	@Test(priority =3,dependsOnMethods = "AddandRemovefromCart")
	public void CheckEmptyCart()
	{
		if(ar.aDDcartButton().isDisplayed())
		{
			System.out.println("Cart is empty ");
		}
		else
		{
			System.out.println("Cart is not empty");
		}
		
	}
}
