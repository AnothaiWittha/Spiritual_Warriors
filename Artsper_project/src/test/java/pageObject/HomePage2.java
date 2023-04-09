package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePage2 extends CommonMethods {
	
	
	public HomePage2() {

		PageFactory.initElements(Driver.getDriver(), this);

		}

		 
		// Verify-search bar box

		@FindBy(xpath = "//*[@class='ais-SearchBox-input']")

		public WebElement searchBarBox;

		@FindBy(xpath = "//*[@id=\"searchbox\"]/div/form/button[1]")

		public WebElement clickButton;

		@FindBy(xpath = "//*[@id='catalog-artworks']")

		public WebElement getFarandoleText;

		 

		// verify Artsper Logo on the Website.

		@FindBy(xpath = "//*[@class='header__logo']")

		public WebElement logo;

		 

		//verify Help center page

		@FindBy (xpath = "//*[contains(text(),'Need some help?')]")

		public WebElement helpCenterPage ;

		@FindBy (xpath = "//*[@id='artsper_email']")

		public WebElement emailBox ;

		@FindBy (xpath = "//*[@id='artsper_message']")

		public WebElement messageBox ;

		@FindBy (xpath = "//*[@id='artsper_submit']")

		public WebElement sendMessageButton ;

		 

		//Verify Help center page

		@FindBy (xpath = "//*[@class='alert alert-success']")

		public WebElement alertMessage  ;

		@FindBy (xpath = "//*[@class='need-help__close js-hide-help']")

		public WebElement closeButton ;

		 

		// Verify-search bar box

		public void searchBarBoxMethod() {

		logo.click();
		searchBarBox.click();
		searchBarBox.sendKeys("Testa 2 Fernando Alday");
		CommonMethods.wait(3);
		clickButton.click();


		String text = getFarandoleText.getText();

		System.out.println(text);

		}



		//Verify Help center page

		public void verifyLogo() {

		boolean haveLogo = logo.isDisplayed();

		if (haveLogo)

		System.out.println("Logo is displayed");

		else

		System.out.println("Logo is not displayed");

		logo.click();

		 
		String logoTitle = Driver.getDriver().getTitle();

		System.out.println("Title of page is " + logoTitle);

		}

		 

		 

		//Verify Help center page

		public void sendMessageMethod() {

		helpCenterPage.click();

		emailBox.sendKeys(ConfigurationReader.getProperty("username"));

		messageBox.click();

		messageBox.sendKeys("Your art is amazing");

		sendMessageButton.click();


		String getText = alertMessage.getText();

		        System.out.println(getText);

		        closeButton.click();

		        String url = Driver.getDriver().getCurrentUrl();

		        System.out.println("The page current url is:" + url);

		}
	


}
