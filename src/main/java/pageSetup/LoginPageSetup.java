package pageSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class LoginPageSetup 
{
		WebDriver driver;
		
		@FindBy(id="email")
		WebElement emailField;
		
		@FindBy(xpath="//input[@id='pass']")
		WebElement password;
		
		@FindBy(xpath="//button[@name='login']")
		WebElement login;
		
		@FindBy(xpath="//h2[contains(text(),\"connect\")]")
		WebElement message;
		
		public LoginPageSetup(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void enterEmail(String email)
		{
			emailField.sendKeys(email);
		}
		
		public void enterPass(String pass)
		{
			password.sendKeys(pass);
		}
		
		public boolean verifyMessage()
		{
			return message.isDisplayed();
		}
		
		public String returnTitle()
		{
			return driver.getTitle();
		}
		
		public boolean verifyEmailField() 
		{
			return emailField.isDisplayed();
		}
		
		public boolean verifyPasswordField() 
		{
			return password.isDisplayed();
		}
		
		
}	
