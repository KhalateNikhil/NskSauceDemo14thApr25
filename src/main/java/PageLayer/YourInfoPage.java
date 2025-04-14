package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class YourInfoPage extends BaseClass {
	
	@FindBy(name="firstName")
	private WebElement fname ;
	
	@FindBy(name="lastName")
	private WebElement lname ;
	
	@FindBy(name="postalCode")
	private WebElement pcode;
	
	@FindBy(id="continue")
	private WebElement logclick;
	
	
	
	//initialize the OR by using PageFactory.initElements()method in constructor
	
	public YourInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//create associated methods for each and every object repository without passing test data
	
	public String getYourInfoPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public void YourInfoPageFunctionality(String firstname, String lastname, String pincode)
	{
		UtilsClass.sendKeys(fname, firstname);
		UtilsClass.sendKeys(lname, lastname);
		UtilsClass.sendKeys(pcode, pincode);
		logclick.click();
		
	}
	
	
	
	
	

}
