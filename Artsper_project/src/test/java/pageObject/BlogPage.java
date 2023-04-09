package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonMethods;
import utilities.Driver;

public class BlogPage {

	public BlogPage() {

		PageFactory.initElements(Driver.getDriver(), this);

	}

	// Blog Page Link from Homepage
	@FindBy(xpath = "//*[@id=\"app-container\"]/footer/div[2]/section/div[7]/ul/li[3]/a")
	public WebElement BlogLink;
	
	//Best Art Movies in Blog page
	@FindBy(xpath = "//*[@id=\"home-artstyle\"]/div[2]/div[4]/a/article/div/div[1]/div/img")
	public WebElement TheBestArtMovies;
	
	public void BlogClick() {
		CommonMethods.scrollToElement(BlogLink);
//		CommonMethods.ScrolByPixel(50000);
		CommonMethods.wait(3);
		BlogLink.click();
	}
	
	public void ArtMoviesClick() {
		CommonMethods.scrollToElement(TheBestArtMovies);
//		CommonMethods.ScrolByPixel(50000);
		CommonMethods.wait(3);
		TheBestArtMovies.click();
	}
	
	
}
