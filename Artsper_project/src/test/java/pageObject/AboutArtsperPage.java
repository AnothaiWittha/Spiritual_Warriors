package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AboutArtsperPage extends CommonMethods {

	public AboutArtsperPage() {

		PageFactory.initElements(Driver.getDriver(), this);

	}

	// About Artsper Link from Homepage
	@FindBy(xpath = "//*[@id=\"app-container\"]/footer/div[2]/section/div[5]/ul/li[1]/a")
	public WebElement About;
	
	//YouTube video in About Page
	@FindBy(xpath ="//*[@id=\"app-container\"]/main/article/div/section[3]/iframe")
	public WebElement AboutYouTube;
	
	//Iframe YouTube video in About Page
	@FindBy(xpath ="//iframe[@src='https://www.youtube.com/embed/uQz2HwpXA1E']")
	public WebElement IframeAboutYouTube;
	
	@FindBy(tagName = "iframe")
	public WebElement youtube;
	
	@FindBy(xpath = "//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	public WebElement playButton;
	

	// About Artsper Method = click on About link from HomePage
	public void aboutArtsperMethod() {
		CommonMethods.scrollToElement(About);
		CommonMethods.wait(3);
		About.click();

	}
	
	public void ClickYoutube() {
		CommonMethods.scrollToElement(AboutYouTube);
		CommonMethods.switchToFrame(youtube);
		CommonMethods.click(playButton);

	}
	
	
}
