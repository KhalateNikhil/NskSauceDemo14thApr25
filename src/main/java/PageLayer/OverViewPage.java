package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class OverViewPage extends BaseClass{
	
	@FindBy(xpath="//button[text()='Finish']")
	private WebElement finish;
	
	
	public OverViewPage()
	{
		PageFactory.initElements(driver, this);
	}

	//create associated methods
	
	public String getOverViewPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public void overViewPageFunctionality()
	{
		finish.click();
	}
	
	
}
