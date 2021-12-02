package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass { //we extend base class to use it method 
	
	
	

	//@Test(groups={"regression","master"})
	
	@Test
	public void test_account_Registration()
	{
		try
		{
		logger.info("Startign testcase account registration");
		
		driver.get("https://demo.opencart.com/");
		//driver.get(rb.getString("appURL"));
		logger.info("Home page displayed");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver); //home pgae is imported from page object package 
		hp.clickMyAccount();
		logger.info("click on my account");
		hp.clickRegister();
		logger.info("click on register");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstName("John");
		logger.info("set first name ");
		regpage.setLastName("Canedy");
		logger.info("set last name");
		regpage.setEmail(randomestring()+"@gmail.com");
		logger.info("set email");
		regpage.setTelephone("65656565");
		logger.info("st phone number");
		regpage.setPassword("abcxyz");
		logger.info("set password");
		regpage.setConfirmPassword("abcxyz");
		logger.info("set password confirmation");
		regpage.setPrivacyPolicy();
		logger.info("set privacy policy");
		
		regpage.clickContinue();
		logger.info("click continue");
		
		String confmsg=regpage.getConfirmationMsg();
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
			logger.info("Account creation successfull");
		}
		else
		{
			logger.error("Account Registration Failed ");
			captureScreen(driver, "test_accout_Registration"); //Capturing screenshot
			Assert.assertTrue(false);
		}
		} 
		
		catch(Exception e)
		{
			logger.error("Account registration failed");
			Assert.assertTrue(false);
		}
		
		logger.info(" Finished test case account registration");
		
	}

}
