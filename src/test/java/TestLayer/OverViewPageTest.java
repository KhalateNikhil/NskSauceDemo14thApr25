package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.OverViewPage;

public class OverViewPageTest extends BaseClass{
	private static OverViewPage overviewpage;
	@Test(priority=10)
	public void validategetOverviewPageUrl()
	{
		 overviewpage= new OverViewPage();
		 String actualUrl4=overviewpage.getOverViewPageUrl();
		 boolean d=actualUrl4.contains("checkout");
		 Assert.assertTrue(d);
	}
	
	@Test(priority=11)
	public void validateOverViewPageFunctionality()
	{
		overviewpage.overViewPageFunctionality();
	}

}
