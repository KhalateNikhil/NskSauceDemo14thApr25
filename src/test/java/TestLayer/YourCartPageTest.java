package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.YourCartPage;

public class YourCartPageTest extends BaseClass{
	private static YourCartPage yourcartpage;
	@Test(priority=5)
	
	public void validateYourCartPageTitle()
	{
		 yourcartpage= new YourCartPage();
		 String actualtitle2=yourcartpage.getYourCartPageTitle();
		 Assert.assertEquals(actualtitle2, "Swag Labs");
	}
     
	 @Test(priority=6)
	public void validateYourCartPageUrl()
	{
		String actualurl2=yourcartpage.getYourCartPageUrl();
		boolean c=actualurl2.contains("cart");
		Assert.assertTrue(c);
		
	}
	 
	 @Test(priority=7)
	 public void validateClickOnCheckoutPage()
	 {
		 yourcartpage.clickOnCheckout();
		 
		 
	 }
			 
	
	
}
