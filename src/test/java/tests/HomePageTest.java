package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage hp;
	
	public HomePageTest() 
	{
		super();
	} 
	
	@BeforeMethod
	public void setup() 
	{
		initialization();
		hp = new HomePage();
	}
	
	
	@Test
	public void verifyLoginLink() 
	{
		
		hp.clickOnLoginLink();
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}

}
