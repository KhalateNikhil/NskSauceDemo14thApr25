package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass{
	
	private static HomePage homepage;
	@Test(priority=2)
	
	public void validateHomePageTitle()
	{
		 homepage= new HomePage();
		String actualtitle= homepage.getHomePageTitle();
		Assert.assertEquals(actualtitle, "Swag Labs");
		 
	 }
	
	  @Test(priority=3)
	  public void validateHomePageUrl()
	  {
		 String actualurl= homepage.getHomePageUrl();
		boolean b= actualurl.contains("saucedemo");
		Assert.assertTrue(b);
		
	  }
	  
	  @Test(priority=4)
	  public void validateAddProductToCart()
	  {
		  homepage.addProductToCart();
	  }
	  
	  
	  
	  
	  
	  

}
