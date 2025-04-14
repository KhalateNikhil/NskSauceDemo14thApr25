package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class YourCartPage extends BaseClass{
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkout;

	
	
	//initialize or by using PageFactory.initElements()method in constructor
	
	public YourCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//create associated method for each and every or without entering test data
	
	public String getYourCartPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getYourCartPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public void clickOnCheckout()
	{
		checkout.click();
	}
	
	
	
}
