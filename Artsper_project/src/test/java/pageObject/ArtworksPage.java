package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonMethods;
import utilities.Driver;

public class ArtworksPage extends CommonMethods {

	public ArtworksPage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//span[contains(text(),'Artworks')]")
	public WebElement artworksTab;

	@FindBy(xpath = "//*[@id=\"app-container\"]/header/section/nav[2]/ul/li[2]/div/div/ul/li[7]/a")
	public WebElement MasterArtists;

	@FindBy(xpath = "//input[@name='categories[]' and @value='12']")
	public List<WebElement> DesignList;

	@FindBy(xpath = "//*[@id=\"category-thematic\"]/div/div[2]/div/div/ul/li[6]/div/a/label/input")
	public WebElement Design;

	@FindBy(xpath = "//*[@id=\"catalog-artworks\"]/article[2]/div/h3/cite")
	public WebElement skateBoard;

	@FindBy(xpath = "//*[@id=\"sticky\"]/div[1]/div[3]/span")
	public WebElement Price;

	@FindBy(xpath = "//*[@id=\\\"sticky\\\"]/div[1]/h1/span[2]")
	public WebElement KeithHaring;

	@FindBy(xpath = "//a[@class='artist-read-more']//span[contains(text(),'Read more')]")
	public WebElement ReadMore;

	@FindBy(xpath = "//div[@class='col-md-8 col-sm-12']//h1[contains(text(),'Robert Indiana')]")
	public WebElement Biography;

	@FindBy(xpath = "//*[@id=\"sort-by-widget\"]/div/select")
	public WebElement sort;

	@FindBy(xpath = "//*[@id=\"sort-by-widget\"]/div/select/option[3]")
	public WebElement acsendingPrice;

	@FindBy(xpath = "//*[@id=\"favorite-search-button-modal\"]/span")
	public WebElement saveMySearch;

	@FindBy(xpath = "//*[@id=\"login-registration-modal\"]/div/div")
	public WebElement registrationPage;

	public void verifyArtworksButtonMethod() {

		CommonMethods.hover(artworksTab);
		
		MasterArtists.click();
		Design.click();
		sort.click();
		CommonMethods.selectDropDownValue(awp.acsendingPrice, "Sort by ascending price");
		//acsendingPrice.click();
		saveMySearch.click();
		Assert.assertTrue(registrationPage.isDisplayed());

	}

}
