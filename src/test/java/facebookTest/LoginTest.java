package facebookTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageSetup.LoginPageSetup;
import util.BaseTest;

public class LoginTest extends BaseTest
{
	@Test(priority=2)
	public void emailValidation() 
	{
		LoginPageSetup loginPage=new LoginPageSetup(driver);
		Assert.assertTrue(loginPage.verifyEmailField(),"Email field is verified");
		
	}
	@Test(priority=1)
	public void messageVerification()
	{
		LoginPageSetup loginPage=new LoginPageSetup(driver);
		Assert.assertTrue(loginPage.verifyMessage(),"Message is present on the page");
	}
	
	@Test
	public void passwordVerification() 
	{
		LoginPageSetup loginPage = new LoginPageSetup(driver);
		Assert.assertTrue(loginPage.verifyPasswordField(),"Passsword is verified");
		
	}
}
