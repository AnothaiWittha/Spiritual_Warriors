package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonMethods;
import utilities.Driver;

public class FilteringItemsPageByFazli {
	
	public FilteringItemsPageByFazli() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"app-container\"]/header/section/nav[2]/ul/li[8]/a")
	public WebElement designTab; 
	@FindBy(xpath = "//*[@id=\"app-container\"]/header/section/nav[2]/ul/li[8]/div/div/ul/li[5]/a/span")
	public WebElement tablesButton; 
	@FindBy(xpath = "//*[@id=\"category-thematic\"]/div/div[2]/div/div/ul/li[6]/div/a/label/input") 
	public WebElement FineArt; 
	
	@FindBy(xpath = "//*[@id=\"catalog-artworks\"]/article[1]/figure/a/img")
	public WebElement SoucheSurItem; 
	
	
	

	
	
	public void VerifyFilteringLink() {
		CommonMethods.hover(designTab);
		CommonMethods.wait(3);
		tablesButton.click(); 
		CommonMethods.wait(3);
		CommonMethods.ScrolByPixel(800);
		FineArt.click();
		SoucheSurItem.click(); 
		
		
		
		
		
		
	}
	
	
	

}
