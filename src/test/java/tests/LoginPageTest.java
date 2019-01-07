package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	public LoginPage lp;
	public HomePage hp;
	public LoginPageTest() 
	{
		super();
	}
	
	@BeforeMethod 
	public void setup() 
	{
		initialization();
		lp = new LoginPage();
	}
	
	@Test
	public void verifyLogin() 
	{
		hp = new HomePage();
		hp.clickOnLoginLink();
		lp.logInAction(prop.getProperty("user_email"), prop.getProperty("user_pwd"));
		
	}
	
	@AfterMethod()
	public void tearDown() 
	{
		driver.close();
	}
	
	
	

}
