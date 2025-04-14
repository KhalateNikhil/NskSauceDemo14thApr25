package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class FindMultipleElements extends BaseClass{
	
	public static void findAllElements(List<WebElement>ls,String value)
	{
		
		for(WebElement wb:ls)
		{
			if(wb.getText().equalsIgnoreCase(value))
			{
				wb.click();
				break;
			}
		}
	}

}
