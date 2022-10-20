package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.TestBase;
import TestObject.PageObject;


public class LoginTc_001 extends TestBase
{
	
	@Test(priority=1)
	public void Login_01()
	
	{
		PageObject po = new PageObject(driver);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		po.UserID();
		po.UserIDText();
		
		if(po.UserIDText())
		{
			Assert.assertTrue(true);
			System.out.println("UserID Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("UserID Text is not verified");
		}
		
		po.Password();
		po.PasswordText();
		
		if(po.UserIDText())
		{
			Assert.assertTrue(true);
			System.out.println("Password Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Password Text is not verified");
		}
		
		po.RESETText();
		if(po.UserIDText())
		{
			Assert.assertTrue(true);
			System.out.println("RESET Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("RESET Text is not verified");
		}		
		
		po.LOGIN();
		
	}
	
}
				