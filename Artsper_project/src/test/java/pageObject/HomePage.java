package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePage extends CommonMethods {

	public HomePage() {

		PageFactory.initElements(Driver.getDriver(), this);

	}

	// country icon on homepage
	@FindBy(xpath = "//li[@class='navigation__item header--show-desktop']")
	public WebElement flagButton;

	@FindBy(id = "user_config_header_country")
	public WebElement selectCountryBox;

	@FindBy(xpath = "//*[@class='btn black']")
	public WebElement updatePreferencesButton;

	// follow artsper
	@FindBy(xpath = "//*[@id=\"app-container\"]/footer/div[2]/section/div[1]/h4")
	public WebElement followArtsperText;

	@FindBy(xpath = "//ul[@class='social-networks footer__social-networks']/li")
	public List<WebElement> socialMediaList;

	@FindBy(xpath = "//ul[@class='social-networks footer__social-networks']/li[1]")
	public WebElement fbScrollDown;

	// slide image on homepage

	@FindBy(xpath = "//*[@class='carousel__heading']//h2")
	public List<WebElement> sliderHeadText;
	@FindBy(xpath = "//*[@class='carousel__container carousel__container--artwork js-carousel carousel-init flickity-enabled is-draggable']")
	public List<WebElement> artsImg;

	@FindBy(css = "#homepage .include_200:nth-child(2) [tabindex] [type='button']:nth-child(3)")
	public WebElement slideButton1;

	@FindBy(css = "#homepage .bg-grey:nth-child(5) [tabindex] [type='button']:nth-child(3)")
	public WebElement slideButton2;

	@FindBy(css = "#homepage .bg-grey:nth-child(6) [tabindex] [type='button']:nth-child(3)")
	public WebElement slideButton3;

	public void selectCounty() throws IOException {

		hp.flagButton.click();
		CommonMethods.selectDropDownVisibleText(selectCountryBox, ConfigurationReader.getProperty("usa"));
		hp.updatePreferencesButton.click();

		String url = Driver.getDriver().getCurrentUrl();
		System.out.println("The page current url is:" + url);
		Assert.assertEquals(url, "https://www.artsper.com/us/");

		// CommonMethods.takeScreenshot("selectCounty");

	}

	public void followArtsperText() {
		CommonMethods.scrollToElement(followArtsperText);
		String text = followArtsperText.getText();
		System.out.println(text);

	}

	public void clickSocialMediaIcon(String socialIconValue) {
		CommonMethods.scrollToElement(fbScrollDown);
		CommonMethods.wait(3);

		for (WebElement eachIconSocial : socialMediaList) {
			if (eachIconSocial.getText().equalsIgnoreCase(socialIconValue)) {
				System.out.println(eachIconSocial.getText());
				eachIconSocial.click();

				WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
				wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				for (String windowHandle : Driver.getDriver().getWindowHandles()) {
					Driver.getDriver().switchTo().window(windowHandle);
				}
				String currentUrl = Driver.getDriver().getCurrentUrl();
				System.out.println("Current URL: " + currentUrl);
				break;
			}

		}
	}

	public void slideImgOnHP() {

		CommonMethods.getElementsText(sliderHeadText);
		CommonMethods.ScrolByPixel(750);
		CommonMethods.wait(3);
		slideButton1.click();
		CommonMethods.wait(3);
		slideButton1.click();
		CommonMethods.wait(3);
		slideButton1.click();
		CommonMethods.wait(3);
		CommonMethods.ScrolByPixel(1850);
		CommonMethods.wait(3);
		slideButton2.click();
		CommonMethods.wait(3);
		slideButton2.click();
		CommonMethods.wait(3);
		slideButton2.click();
		CommonMethods.wait(3);
		CommonMethods.ScrolByPixel(550);
		CommonMethods.wait(3);
		slideButton3.click();
		CommonMethods.wait(3);
		slideButton3.click();
		CommonMethods.wait(3);
		slideButton3.click();
		CommonMethods.wait(3);
		CommonMethods.getElementsText(artsImg);
	}

}
