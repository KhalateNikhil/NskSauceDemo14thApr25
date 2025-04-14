package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass{
	private LoginPage loginpage;
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
@Test
	public void validateLoginFunctionality()
	{
		 loginpage= new LoginPage();
		 loginpage.loginFunctionality("standard_user", "secret_sauce");
		
	}
	

     @AfterTest
     public void tearDown() throws InterruptedException
     {
    	 Thread.sleep(5000);
    	 driver.quit();
     }





}
