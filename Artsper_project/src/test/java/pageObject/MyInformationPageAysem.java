package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class MyInformationPageAysem extends CommonMethods{

	
	public MyInformationPageAysem() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	// MY ACCOUNT PAGE/PERSONEL INFORMATION===============================================================
	
	@FindBy(xpath = "//*[@src='/us/signup_menu']")
	public WebElement clickMyAccount;
	@FindBy (xpath="(//*[@class='card-account '])[1]")
	public WebElement myInfoButton;
	@FindBy(xpath = "//input[contains(@id,'lastName')]")
	public WebElement lastNameInputField;
	@FindBy(xpath = "//input[contains(@id,'firstName')]")
	public WebElement firstNameInputField;
	@FindBy(xpath = "//*[contains(@id,'dateOfBirth_month')]/option") // month loop
	public List<WebElement> birthMonthList;
	@FindBy(xpath = "//*[contains(@id,'dateOfBirth_day')]/option") // day loop
	public List<WebElement> birthDayList;
	@FindBy(xpath = "//*[contains(@id,'dateOfBirth_year')]/option") // year loop
	public List<WebElement> birthYearList;
	@FindBy(xpath = "(//input[contains(@id,'email')])[1]") // email input
	public WebElement emailInputField;
	@FindBy(xpath = "(//input[contains(@id,'type_phone')])[1]")
	public WebElement phoneInputField;
	@FindBy(xpath = "//input[@value='Save my information']")
	public WebElement SaveButton;
	
	
	
	// MY ACCOUNT PAGE/CHOOSE YOUR PREFERENCES======================================================

	@FindBy (xpath="//*[@id='user_config_profile_country']") //(country) Ana's xpath
	public WebElement country;
	
	
	@FindBy (xpath="//*[@id=\"user_config_profile_country\"]/option[140]")// United Kingdom
	public WebElement x;
	@FindBy (xpath="//*[@id='user_config_profile_currency']")
	public WebElement y;
	
	@FindBy(xpath = "//*[@id='user_config_profile_country']/option")
	public List<WebElement> listOfCountries;
	@FindBy(xpath = "//*[contains (@id,'profile_locale')]/option")
	public List<WebElement> listOfLanguages;
	@FindBy(xpath = "//*[contains (@id,'profile_currency')]/option")
	public List<WebElement> listOfCurrencies;
	@FindBy(xpath = "//*[contains (@id,'profile_measure')]/option")
	public List<WebElement> listOfMeasures;
	@FindBy(xpath = "//*(button[@type='submit'])[2]") 
	//*[@id=\"app-container\"]/main/article/div/section/div[1]/form/div[2]/div[5]/button
	// update preferences 
	public WebElement updateButton;
	
	
	
	// MY ACCOUNT PAGE / NEW PASSWORD===========================================================
	@FindBy(xpath = "//*[contains(@id,'current_password')]")
	public WebElement currentPasswordInputField;
	@FindBy(xpath = "//*[contains(@id,'plainPassword_first')]")
	public WebElement newPasswordInputField;
	@FindBy(xpath = "//*[contains(@id,'plainPassword_second')]")
	public WebElement repeatNewPasswordInputField;
	@FindBy(xpath = "//input[@value='Change password']")
	public WebElement changePasswordButton;
	
	// MY ACCOUNT / MY BUDGET====================================================================
		@FindBy (xpath="(//input[@type='radio'])[1]")
		public WebElement under500button;
		@FindBy(xpath = "//input[@type='radio']")
		public List<WebElement> myBudgetRadioButtons;

		// MY ACCOUNT / MY EMAIL NOTIFICATION========================================================
		@FindBy(xpath = "//input[@type='checkbox']")
		public List<WebElement> notificationCheckBox;
	
	
		
		public void PersonalInfoMethod() { //GOES MY aCCOUNT PAGE //CLEAR& FILLS UP THE PERSONAL INFO 

			Boolean result1 = mip.clickMyAccount.isDisplayed();
			System.out.println("My Account button is displayed=" + result1);
			CommonMethods.wait(3);
			mip.clickMyAccount.click();
			mip.myInfoButton.click();
		
			mip.lastNameInputField.clear();
			mip.lastNameInputField.sendKeys(ConfigurationReader.getProperty("BillingLastName"));
			mip.firstNameInputField.clear();
			mip.firstNameInputField.sendKeys(ConfigurationReader.getProperty("BillingFirstName"));
			
			
			CommonMethods.clickListOfWebElements(mip.birthMonthList, ConfigurationReader.getProperty("January"));
			CommonMethods.clickListOfWebElements(mip.birthDayList,ConfigurationReader.getProperty("day1"));
			CommonMethods.clickListOfWebElements(mip.birthYearList,ConfigurationReader.getProperty("year"));
			
			String actualEmail = mip.emailInputField.getAttribute("value");
			String expectedEmail = ConfigurationReader.getProperty("username");
			Assert.assertEquals(actualEmail, expectedEmail);
			
			mip.phoneInputField.clear();
			mip.phoneInputField.sendKeys(ConfigurationReader.getProperty("BillingPhoneNumber"));
			mip.SaveButton.click();
		}
	
		public void myBudgetMethod () {
		
			CommonMethods.ScrolByPixel(800);
		//	CommonMethods.waitForVisibility(mip.under500button);
			Boolean result2=mip.under500button.isDisplayed();
			if (result2) {
				System.out.println("It is selected");
			} else {
				CommonMethods.jsClick(mip.under500button);

			}
		Assert.assertFalse(result2);
		}
		
		
		
		
		
		
		
		
	}	
		
	/*	//CommonMethods.selectDropDownVisibleText(country,ConfigurationReader.getProperty("countryUK"));
		//CommonMethods.selectDropDownValue(country,ConfigurationReader.getProperty(""));
		CommonMethods.hover(mip.country);
		CommonMethods.clickListOfWebElements(mip.listOfCountries,ConfigurationReader.getProperty("Country"));
		CommonMethods.ScrolByPixel(700);
	//	CommonMethods.clickListOfWebElements(mip.listOfLanguages,ConfigurationReader.getProperty("Language"));
		
	//	CommonMethods.clickListOfWebElements(mip.listOfCurrencies,ConfigurationReader.getProperty("Currency"));
		
		CommonMethods.clickListOfWebElements(mip.listOfMeasures,"Cm");
		mip.updateButton.click();
		
		//String text=country.getText();
	//	System.out.println(text);
	}
	
}
		*/