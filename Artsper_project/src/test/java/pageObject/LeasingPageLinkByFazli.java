package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LeasingPageLinkByFazli {
	
	public LeasingPageLinkByFazli() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Artsper Leasing')]")
	public WebElement LeasingButton;
	
	@FindBy(xpath = "//a[starts-with(@href, '#contact-page')]")
	public WebElement ContactButton;
	
	@FindBy(xpath = "//*[@id=\"leasing_professional_submit\"]")
	public WebElement ContactRequestButton;
	
	@FindBy(xpath = "//*[@id=\"leasing_professional_username\"]")
	public WebElement yourName;
	
	@FindBy(xpath = "//*[@id=\"leasing_professional_email\"]")
	public WebElement yourEmail;
	
	@FindBy(xpath = "//*[@id=\"leasing_professional_company\"]")
	public WebElement yourCompany;

	@FindBy(xpath = "//*[@id=\"leasing_professional_phone\"]")
	public WebElement yourPhone;
	
	@FindBy(xpath = "//*[@id=\"leasing_professional_message\"]")
	public WebElement yourMessage;
	
	@FindBy(xpath = "//*[@id=\"leasing_professional_submit\"]")
	public WebElement ContactRequestButton2;
	
	@FindBy(xpath = "//*[@id=\"leasing_professional_submit\"]")
			public WebElement CaptchaButton; 
	
	
	
	 public void VerifyLeasingLink() {
		 CommonMethods.scrollToElement(LeasingButton);
		 CommonMethods.wait(3);
		 LeasingButton.click(); 
		 CommonMethods.scrollToElement(ContactButton);
		 CommonMethods.wait(3);
		 ContactButton.click(); 
		 CommonMethods.wait(3);
		 CommonMethods.scrollToElement(ContactRequestButton);
		 ContactRequestButton.click();
		 CommonMethods.wait(3);
		 CommonMethods.sendText(yourName, ConfigurationReader.getProperty("Name"));
	     CommonMethods.sendText(yourEmail, ConfigurationReader.getProperty("Email"));
	     CommonMethods.sendText(yourCompany, ConfigurationReader.getProperty("CompanyName"));
	     CommonMethods.sendText(yourPhone, ConfigurationReader.getProperty("YourPhone"));
	     CommonMethods.sendText(yourMessage, ConfigurationReader.getProperty("YourMessage"));
	     ContactRequestButton2.click(); 
	//     Assert.assertTrue(CaptchaButton.isDisplayed());
	
		 
		 
	 }
	 
	 
	 
	 }
	

