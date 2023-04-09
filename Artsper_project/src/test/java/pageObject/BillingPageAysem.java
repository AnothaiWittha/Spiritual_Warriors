package pageObject;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class BillingPageAysem extends CommonMethods {

	public BillingPageAysem() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	// search bar/image click/buy this artwork
	@FindBy(xpath = "//input[@class='ais-SearchBox-input']")
	public WebElement searchBar;
	@FindBy(xpath = "//*[@data-url='/us/contemporary-artworks/sculpture/1921935/mini-pop-bulldog-4']")
	public WebElement minibulldog;
	@FindBy(xpath = "//div[@class='add-to-cart-option mb-10']")
	public WebElement buyButton;
	@FindBy(xpath = "//*[@id=\"recap-contents\"]/div[1]/div[1]/div[1]/div/div[3]/ul/li[2]/label")
	public WebElement radioButtonDelivery;
	@FindBy(xpath = "//a[@class='marg-top-15 btn col-xs-12 stopper black']")
	public WebElement checkOutButton;

	// Billing Page
	@FindBy(xpath = "//input[@name='app_bundle_checkout_addresses_type[billing_address][address_firstname]']")
	public WebElement billingFirstName;
	@FindBy(xpath = "//input[@name='app_bundle_checkout_addresses_type[billing_address][address_lastname]']")
	public WebElement billingLastName;
	@FindBy(xpath = "//input[@name='app_bundle_checkout_addresses_type[billing_address][address_society]']")
	public WebElement billingCompanyName;
	@FindBy(xpath = "//input[@name='app_bundle_checkout_addresses_type[billing_address][address_phone_standard]']")
	public WebElement billingPhoneNumber;
	@FindBy(xpath = "//*[@name='app_bundle_checkout_addresses_type[billing_address][country]']/option")
	public List<WebElement> billingCountry;
	@FindBy(xpath = "//input[@name='app_bundle_checkout_addresses_type[billing_address][address_street]']")
	public WebElement billingStreetAddress;
	@FindBy(xpath = "//*[@name='app_bundle_checkout_addresses_type[billing_address][state]']/option")
	public List<WebElement> billingAddressStates;
	@FindBy(xpath = "//input[@name='app_bundle_checkout_addresses_type[billing_address][address_zipcode]']")
	public WebElement billingAddressZipCode;
	@FindBy(xpath = "//input[@name='app_bundle_checkout_addresses_type[billing_address][address_city]']")
	public WebElement billingAddressCity;
	@FindBy(xpath = "//input[@class='marg-top-15 btn col-xs-12 stopper black']")
	public WebElement myOrderNextButton;
	
	@FindBy (xpath="//*[@href='/us/checkout/cart']")
	public WebElement backtoCard;
	@FindBy (xpath="//*[@class='remove-from-cart js-remove-from-cart marg-top-5']")
	public WebElement removeItembutton;
	@FindBy (xpath="//a[@class='light-header__logo']")
	public WebElement homePage;
	@FindBy (xpath="//li[@class='navigation__item js-mini-cart']")
	public WebElement miniCartButton;
	@FindBy (xpath="//*[@id='modal-confirmation-submit']")
	public WebElement acceptDelete;
	
	@FindBy (xpath="//*[@class='intercom-notifications intercom-1wru47g e8hx9tm2']")
	public WebElement popupIntercom;
	@FindBy (xpath="//*[@class='intercom-oh1okb e8hx9tm1']")
	public WebElement intercomClearButton;
	
	public void searchBarMethod() {
		 // 1) if searchBar is visible if it is search for image1	
		Boolean result1 = bpa.searchBar.isDisplayed(); 
		System.out.println("Search Bar is displayed=" + result1);
		Assert.assertTrue(result1);
		CommonMethods.wait(3);
		bpa.searchBar.click();
		bpa.searchBar.sendKeys(ConfigurationReader.getProperty("searchkey1"));

		//2) After search the item if it is visible if not scrollDown until element is visible if it is click it
	
		CommonMethods.scrollToElement(bpa.minibulldog); 
		Boolean result4 = bpa.minibulldog.isDisplayed();
		System.out.println("MiniBuldog is displayed=" + result4);
		Assert.assertTrue(result4);
		CommonMethods.wait(3);
		CommonMethods.click(bpa.minibulldog);
	
		//3)check if buy button visible if it is click it
		Boolean result2 = bpa.buyButton.isDisplayed(); 
		System.out.println("Buy this artwork button is displayed=" + result2);
		Assert.assertTrue(result2);
		bpa.buyButton.click();

		
		//4) check if home GalleryPickup is there and selected. if it is click it
		Boolean result3 = bpa.radioButtonDelivery.isSelected(); 
		if (result3) {
			System.out.println("It is selected");
		} else {
			bpa.radioButtonDelivery.click();

		}
		// 5) click checkout button
		bpa.checkOutButton.click();
	}

	public void billingInfoMethod() { //Entering billing information
		Driver.getDriver().navigate().refresh();
		CommonMethods.wait(3);
		bpa.billingFirstName.clear();
		bpa.billingFirstName.sendKeys(ConfigurationReader.getProperty("BillingFirstName"));
		bpa.billingLastName.clear();
		bpa.billingLastName.sendKeys(ConfigurationReader.getProperty("BillingLastName"));
		bpa.billingCompanyName.clear();
		bpa.billingCompanyName.sendKeys(ConfigurationReader.getProperty("BillingCompanyName"));
		bpa.billingPhoneNumber.clear();
		bpa.billingPhoneNumber.sendKeys(ConfigurationReader.getProperty("BillingPhoneNumber"));

		for (WebElement country : bpa.billingCountry) {
			if (country.getText().contains(ConfigurationReader.getProperty("BillingCountry"))) {
				country.click();
				break;
			}
		}

		bpa.billingStreetAddress.clear();
		sendText(bpa.billingStreetAddress, (ConfigurationReader.getProperty("BillingAddressStreet")));

		/*for (WebElement state : bpa.billingAddressStates) {
			if (state.getText().contains(ConfigurationReader.getProperty("BilingAddressState"))) {
				state.click();
				break;
			}
		}
		*/
		bpa.billingAddressZipCode.clear();
		bpa.billingAddressZipCode.sendKeys(ConfigurationReader.getProperty("BillingAddressZipCode"));
		bpa.billingAddressZipCode.click();

		bpa.billingAddressCity.clear();
		bpa.billingAddressCity.sendKeys(ConfigurationReader.getProperty("BillingAddressCity"));
		bpa.billingAddressCity.click();
		bpa.myOrderNextButton.click();

		String title = Driver.getDriver().getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Payment"));
		
		
		// deleting the item in the cart
		bpa.homePage.click();
		CommonMethods.wait(3);
		bpa.miniCartButton.click();
		bpa.removeItembutton.click();
		CommonMethods.wait(3);
		//CommonMethods.acceptAlert();
		CommonMethods.hover(acceptDelete);
		bpa.acceptDelete.click();
		//bp.backtoCard.click();
		
		String emptycardtitle=Driver.getDriver().getTitle();
		System.out.println(emptycardtitle);
		Assert.assertTrue(emptycardtitle.contains("Step 1 : My cart | Artsper"));
		

		
	}
	
}
