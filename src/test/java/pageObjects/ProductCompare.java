package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCompare {

	WebDriver driver;
	public ProductCompare (WebDriver driver )
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}		
		
		
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchbtn;
	
	
	@FindBy(xpath="//input[@id='input-search']")
	WebElement searchitem;
	
	
	@FindBy(xpath="//input[@id='button-search']")
	WebElement btnsearch;
	
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]//i[1]")
	WebElement btnfirst_producttocompare;
	
	@FindBy(xpath="//div[@id='product-search']//div[2]//div[1]//div[2]//div[2]//button[3]")
	WebElement btnsecond_producttocompare;
	
	@FindBy(xpath="//a[@id='compare-total']")
	WebElement btnproductcompare;
	
	@FindBy(xpath="//h1[normalize-space()='Product Comparison']")
	WebElement productcomparationtext;
	
	
    public void mainSearchButton() {
		
		searchbtn.click();
		
	}
	
	public void searchItem(String item) {
		
		searchitem.sendKeys(item);
		
	}
	
	public void finalSearchButton() {
		
		btnsearch.click();

	}
	
	public void firstItem() {
		
		btnfirst_producttocompare.click();
		 
	}
	
	public void secondItem()
	{
		
		btnsecond_producttocompare.click();
		
	}	
	
	public void compareSelectedProduct()
	
	{
		btnproductcompare.click();
	}
	
	public boolean isComparePageVisible()
	
	{
		
		try
		{
		return (productcomparationtext.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	
	
	
}
