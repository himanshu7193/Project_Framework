package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegistrationPage extends TestBase{
	
	@FindBy(id = "user_name")
	WebElement fullName;
	
	@FindBy(id = "user_email")
	WebElement email;
	
	@FindBy(id = "user_password")
	WebElement pwd;
	
	@FindBy(id = "user_password_confirmation")
	WebElement conf_pwd;
	
	@FindBy(id = "user_unsubscribe_from_marketing_emails")
	WebElement promoChkBx;
	
	@FindBy(id = "user_agreed_to_terms")
	WebElement termsChkBx;
	
	@FindBy(name = "commit")
	WebElement signUpBtn;
	
	public RegistrationPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void register(String full_name,String user_email, String user_pwd, String user_conf_pwd) 
	{
		fullName.sendKeys(full_name);
		email.sendKeys(user_email);
		pwd.sendKeys(user_pwd);
		conf_pwd.sendKeys(user_conf_pwd);
		promoChkBx.click();
		termsChkBx.click();
		signUpBtn.click();
		
		
	}
	
	
	
	
	
	

}
