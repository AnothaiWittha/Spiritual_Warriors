package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GiftCardsPage extends CommonMethods {

	public GiftCardsPage() {

		PageFactory.initElements(Driver.getDriver(), this);

	}

	// Gift Cards Link from Homepage
	@FindBy(xpath = "//*[@id=\"app-container\"]/footer/div[2]/section/div[6]/ul/li[5]/a")
	public WebElement GiftCardsLink;

	// Scroll down to Terms and Conditions
	@FindBy(xpath = "//*[@id=\"app-container\"]/footer/div[3]/section/ul/li[1]/a")
	public WebElement TermsandConditions;

	// login to Artsper
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

	// Gift Cards amount
	@FindBy(xpath = "//*[@id=\"product_dto_price\"]")
	public WebElement GiftCardEnterAmount;
	
	@FindBy(xpath = "//*[@id=\"gift_card_save\"]")
	public WebElement AddtoCartButton;
	
	//Checkout Page
	@FindBy(xpath = "//*[@id=\"form-total\"]/form/div[2]/a[1]")
	public WebElement CheckoutButton;

	public void loginArtsper() {

		signinButton.click();
		loginLinkButton.click();
		CommonMethods.sendText(userTextBox, ConfigurationReader.getProperty("username"));
		CommonMethods.sendText(passwordTextBox, ConfigurationReader.getProperty("password"));
		loginButton.click();
	}

	public void GiftCardsClickLink() {
		CommonMethods.scrollToElement(TermsandConditions);
//		CommonMethods.ScrolByPixel(50000);
		CommonMethods.wait(5);
		GiftCardsLink.click();

	}
	
	public void GiftCardsAmount() {
		CommonMethods.sendText(GiftCardEnterAmount, "100");
		AddtoCartButton.click();
	}
	
	public void Checkout() {
		CheckoutButton.click();
	}
	
//	public void TitleofCheckoutPage() {
//		String CheckoutPage = "Step 2 : My Addresses | Artsper";
//	}

}
