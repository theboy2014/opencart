package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ForgotPasswordPage;
import testBase.BaseClass;

public class TC_004_ForgottenPassword extends BaseClass {
	
	@Test
	public void test_forgottenpassword() throws InterruptedException
	{
		logger.info(" TC_004_ForgottenPassword");
	
	   
		driver.get(rb.getString("appURL"));
		logger.info("Home Page Displayed ");
		
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My Account ");
		hp.clickLogin();
		logger.info("Clicked on Login ");
		
		ForgotPasswordPage lo=new ForgotPasswordPage(driver);
		
		lo.forgottenPassword();
		Thread.sleep(3000);
		
		
		lo.inputEmail(rb.getString("email"));
		logger.info("Enterred email");
		Thread.sleep(3000);
		
		lo.continuebutton();
		logger.info("Clicked on continue button");
		Thread.sleep(3000);
		
		
}
		
}
