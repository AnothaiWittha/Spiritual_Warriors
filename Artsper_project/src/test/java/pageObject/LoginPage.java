package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage extends CommonMethods {

	public LoginPage() {
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

	@FindBy(xpath = "//span[contains(text(),'My account')]")
	public WebElement myAccountButton;

	@FindBy(xpath = "//h2[contains(text(),'My information')]")
	public WebElement myInfoText;

	@FindBy(xpath = "//ul[@class=\"navigation__list\"]//li")
	public List<WebElement> MyAccountDropDown;

	@FindBy(xpath = "//*[@class='col-xs-12 form-errors-container']//li")
	public WebElement loginFailText;

	public void loginSuccessfullyMethod() {

		signinButton.click();
		loginLinkButton.click();
		CommonMethods.sendText(userTextBox, ConfigurationReader.getProperty("username"));
		CommonMethods.sendText(passwordTextBox, ConfigurationReader.getProperty("password"));
		loginButton.click();
		myAccountButton.click();

		String myInfo = myInfoText.getText();
		System.out.println("verify message on My account page: " + myInfo);
		Assert.assertEquals(myInfo, "My information");

		CommonMethods.hover(myAccountButton);
		// CommonMethods.takeScreenshot("loginsuccessfully");
	}

	public void myAccountSelectDropdown(String menuValue) {

		for (WebElement logoutDropdown : MyAccountDropDown) {

			if (logoutDropdown.getText().equalsIgnoreCase(menuValue)) {
				logoutDropdown.click();
				break;

			}
			// CommonMethods.takeScreenshot("myaccountselectdropdown");

		}
	}

	public void loginErrorMethod() {

		signinButton.click();
		loginLinkButton.click();
		CommonMethods.sendText(userTextBox, ConfigurationReader.getProperty("invalidUsername"));
		CommonMethods.sendText(passwordTextBox, ConfigurationReader.getProperty("invalidPassword"));
		loginButton.click();

		String errorMsg = loginFailText.getText();
		System.out.println("verify Error message: " + errorMsg);
		Assert.assertEquals(errorMsg, "Invalid e-mail or password. Please try again");

	}
}