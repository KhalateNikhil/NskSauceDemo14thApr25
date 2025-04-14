package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.YourInfoPage;

public class YourInfoPageTest extends BaseClass{

	private static YourInfoPage yourinfopage;
	@Test(priority=8)
	public void validateYourInfoPagetitle()
	{ yourinfopage= new YourInfoPage();
	String actualtitle3=yourinfopage.getYourInfoPageTitle();
	Assert.assertEquals(actualtitle3, "Swag Labs");
	}
	
	@Test(priority=9)
	public void ValidateYourInfoPageFunctionality()
	{
		
		yourinfopage.YourInfoPageFunctionality("Rushi", "Khalate", "415123");
	}
	
	
	
	
	
	
	
	
}
