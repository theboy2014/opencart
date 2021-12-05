package testCases;

import testBase.BaseClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchPage;

public class TC_005_Search extends BaseClass {
	
	
	@Test
	public void test_search() throws InterruptedException {
		
		logger.info("Starting TC_005_Search");
		
		try
		{   
			
			
		driver.get(rb.getString("appURL"));
		logger.info("Home Page Displayed ");
		
		driver.manage().window().maximize();
		
		SearchPage clickonmainsearchbutton = new SearchPage(driver);
		
		clickonmainsearchbutton.mainSearchButton();
		logger.info("Clicked on main search button");
		Thread.sleep(3000);
		
		
		clickonmainsearchbutton.searchItem("HP");
		logger.info("Entered item HP ");
		Thread.sleep(3000);
		
		clickonmainsearchbutton.finalSearchButton();
		logger.info("Home Page Displayed ");
		Thread.sleep(3000);
		
		
		boolean IsItemFound = clickonmainsearchbutton.foundItem();
		
		if(IsItemFound)
		{
			logger.info("Item found");
			captureScreen(driver, "test_item");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Item not found");
			 //Capturing screenshot, becuase we have extended baseclass
			Assert.assertTrue(false);
		}
		
		}
		
		
		catch(Exception e)
		{
			logger.fatal("Search Failed");
			Assert.fail();
		}
		
		
		logger.info(" Finished TC_005_Search ");
		
		
	}

}
