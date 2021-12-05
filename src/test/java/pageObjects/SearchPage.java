package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		
			
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	  
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbtn;
	
	
	@FindBy(xpath="//input[@id='input-search']")
	WebElement searchitem;
	
	
	@FindBy(xpath="//input[@id='button-search']")
	WebElement btnsearch;
	
	@FindBy(xpath="//p[contains(text(),'Stop your co-workers in their tracks with the stun')]")
	WebElement itemdescription;
	
	
	public void mainSearchButton() {
		
		searchbtn.click();
		
	}
	
	public void searchItem(String item) {
		
		searchitem.sendKeys(item);
		
	}
	
	public void finalSearchButton() {
		
		btnsearch.click();

	}
	
	public boolean foundItem()
	{
		try
		{
		return (itemdescription.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	
	
	

	
}
