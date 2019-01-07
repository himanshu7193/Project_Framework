package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id = "user_email")
	WebElement email;
	
	@FindBy(id = "user_password")
	WebElement pwd;
	
	@FindBy(name = "commit")
	WebElement loginBtn;
	
	
	public LoginPage()  
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void logInAction(String user_email,String user_pwd) 
	{
		email.sendKeys(user_email);
		pwd.sendKeys(user_pwd);
		loginBtn.click();
	}

}
