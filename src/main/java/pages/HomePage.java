package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//a[contains(@href,'sign_in')]")
	WebElement loginLink;
	
	@FindBy(xpath = "//span[text()='Register']")
	WebElement registerLink;
	
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}

	 
	public LoginPage clickOnLoginLink() 
	{
		loginLink.click();
		return new LoginPage();
	}
	
	public RegistrationPage clickOnRegisterLink() 
	{
		registerLink.click();
		return new RegistrationPage();
	}
}
