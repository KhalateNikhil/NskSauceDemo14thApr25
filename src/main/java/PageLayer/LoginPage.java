package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class LoginPage extends BaseClass{
	
	//create object repository using @FindBy annotation
	
	@FindBy(name="user-name")
	private WebElement uname ;
	

	@FindBy(name="password")
	private WebElement pass ;
	

	@FindBy(name="login-button")
	private WebElement logbutton;

	
	//initialize object repository using PageFactory.initElements()method in constructor
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//create associated methods for each and every object repository without entering test data
	
	public void loginFunctionality(String username, String password)
	{
		UtilsClass.sendKeys(uname, username);
		UtilsClass.sendKeys(pass, password);
		logbutton.click();
		
		
	}
	
	
	
	
	
	
	
	
	
}
