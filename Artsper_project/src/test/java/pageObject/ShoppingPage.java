package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.CommonMethods;
import utilities.Driver;

public class ShoppingPage extends CommonMethods {

	public ShoppingPage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//ul[@class='navigation__list navigation__list--row']//a")
	public WebElement signinButton;

	@FindBy(xpath = "//*[@name='app_customer_registration']//a")
	public WebElement loginLinkButton;

	@FindBy(xpath = "//*[@id='email']")
	public WebElement userTextBox;

	@FindBy(xpath = "//*[@id='password']")
	public WebElement passwordTextBox;

	@FindBy(xpath = "//button[@id='_submit']")
	public WebElement loginButton;

	@FindBy(xpath = "//a[@class='navbar-brand']")
	public WebElement HomePage;

	@FindBy(xpath = "//*[@class='ais-SearchBox-input']") // then click and then type in a keyword 'Trabys'
	public WebElement searchBar;

	@FindBy(xpath = "//*[contains(@alt, 'Dormir sous')]")
	public WebElement Dormir;

	@FindBy(xpath = "//button[contains(@class,'add-to-cart')]")
	public WebElement buyArtwork;

	@FindBy(xpath = "//*[@id=\"recap-contents\"]/div[1]/div[1]/div[1]/div/div[3]/ul/li[2]/label")
	public WebElement radioButton;

	@FindBy(xpath = "//a[@class='marg-top-15 btn col-xs-12 stopper black']")
	public WebElement checkOut;

	// second test of shoppingpage

	@FindBy(xpath = "//*[@id=\"app-container\"]/header/section/nav[2]/ul/li[4]/a")
	public WebElement sculpturesMenu;

	@FindBy(xpath = "//*[@id=\"app-container\"]/header/section/nav[2]/ul/li[4]/div/div/ul/li[5]/a/span")
	public WebElement animalSculptures;

	@FindBy(xpath = "//*[@id=\"catalog-artworks\"]/article[3]/figure/a/img")
	public WebElement chim;

	@FindBy(xpath = "//*[@id=\"recap-contents\"]/div[1]/div[1]/div[1]/div/p")
	public WebElement removeItem;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/a[2]")
	public WebElement confirmDelete;

	@FindBy(xpath = "//*[@id=\"recap-contents\"]/div[1]/div/div[1]/div[1]/span")
	public WebElement cartEmpty;

	// verify buy artwork.

	public void buyArtworkMethod() {

		searchBar.click();
		searchBar.sendKeys("Trabys");
		Dormir.click();
		buyArtwork.click();
		radioButton.click();
		checkOut.click();

	}

	public void removeItemsMethod() {

		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(sculpturesMenu).build().perform();
		actions.moveToElement(animalSculptures).click().perform();

		chim.click();
		buyArtwork.click();
		removeItem.click();
		confirmDelete.click();
	}

	public boolean isCarEmpty() {
		return cartEmpty.isDisplayed();

	}

}