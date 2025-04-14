package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	//create object repository by using @FindBy annotation
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement addbag ;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addcart ;
	
	
	
	//initialize object repository by using PageFactory.initElements()method in constructor
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}

	//create associated methods for each and every object repository without entering test data
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
		
	}
	
	public String getHomePageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	public void addProductToCart()
	{
		addbag.click();
		addcart.click();
	}
	
	
	
	
	
}
