package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	WebElement btnforgottenpassword;
	
	@FindBy(xpath="//h1[normalize-space()='Forgot Your Password?']")
	WebElement fpmsgHeading;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement inputemail;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement clickcontinu;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement Isemailsent;
	
	
	
	public void forgottenPassword()
	{
		btnforgottenpassword.click();
	}
	
	public void inputEmail(String email)
	{
		inputemail.sendKeys(email);
	}
	
	public void continuebutton()
	{
		clickcontinu.click();
	}
	
	public boolean isEmailsent()
	{
		try {
	        driver.findElement((By) Isemailsent);
	        return true;
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
	
	
	
	
	
	
	
	

}
