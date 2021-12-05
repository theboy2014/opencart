package testCases;

import testBase.BaseClass;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductCompare;
import pageObjects.SearchPage;



public class TC_006_CompareProduct extends BaseClass {
	
	@Test
	public void test_Product_compare()
	
	{
		
		logger.info(" Starting TC_006_CompareProduct ");
		
		
		
		try 
		{   
			
			driver.get(rb.getString("appURL"));
			logger.info("Home Page Displayed ");
			
			driver.manage().window().maximize();
			
			//display home page 
			ProductCompare clickonmainsearchbutton = new ProductCompare(driver);
			
			clickonmainsearchbutton.mainSearchButton();
			logger.info("Clicked on main search button");
			Thread.sleep(3000);
			
			
			clickonmainsearchbutton.searchItem("mac");
			logger.info("Entered item mac ");
			Thread.sleep(3000);
			
			clickonmainsearchbutton.finalSearchButton();
			logger.info("Home Page Displayed ");
			Thread.sleep(3000);
			
			clickonmainsearchbutton.firstItem();
			logger.info("selected first item");
			Thread.sleep(4000);
			
			clickonmainsearchbutton.secondItem();
			logger.info("selected second item");
			Thread.sleep(5000);
			
			clickonmainsearchbutton.compareSelectedProduct();
			logger.info("click on compare selected item");
			Thread.sleep(3000);
			
			
			
			
			boolean targetpage=clickonmainsearchbutton.isComparePageVisible();
			
			if(targetpage)
			{
				logger.info("Comparation success");
				Assert.assertTrue(true);
			}	
			else
			{
				logger.error("Comparation Failed");
				captureScreen(driver, "test_comparation"); //Capturing screenshot, becuase we have extended baseclass
				Assert.assertTrue(false);
			}
		}
		
		catch(Exception e)
		{
			logger.fatal("Product Compare Failed");
			Assert.fail();
			
		}
		
		
		logger.info(" Finished TC_006_CompareProduct ");
		
		
	}

}
