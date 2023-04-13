package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class MyFavoritePageByFazli {
	
	public MyFavoritePageByFazli() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	

    @FindBy(xpath= "//a[@href='/us/authentication']")
    public WebElement registerButton; 

    @FindBy(xpath= "//input[@id='email']")
    public WebElement emailTextBox; 
    
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox; 
    
    @FindBy(xpath = "//*[@id=\"authentication\"]/a")
    public WebElement returnButton;


    // Click on the "Sign In/Register" button in the top right corner of the page
    @FindBy(xpath = "//a[@class='header__button-register']")
    public WebElement signInButton;

    // Click on "Log in" link under "Register" button
   @FindBy(xpath = "//a[contains(text(), 'Log in')]")
   public WebElement loginLink;

    // Enter a valid email address and password in the login form
    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement loginEmail;
    
    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement typePassword; 

    // Click on the "Log in" button
    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement loginClick; 


    // Hover over on the heart icon on the top right corner of the page
    @FindBy(xpath = "//button[@aria-label='My favorite artworks']")
    public WebElement heartIcon; 

    // Click on "My favourite artworks" link/button
   @FindBy(xpath = "//a[contains(text(), 'My favourite artworks')]")
    public WebElement linkButton; 

    // Click on "See all artworks" button
   @FindBy(css= "[class='col-xs-12 col-sm-6'] [href]")
    public WebElement ArtWorkbutton;
   
   // Click on "Sort by popularity" then click on "Sort by ascending price"
   @FindBy(xpath ="//select[@class='ais-SortBy-select']")
   public WebElement SortByPopularity; 


    // Click on Heart icon at the bottom right of the image
    @FindBy(xpath = "//section[@id='catalog-artworks']/article[1]//i")
    public WebElement HeartIcon2; 

   
   /* @FindBy(xpath = "//*[@id=\"app-container\"]/header/section/nav[1]/ul/li[3]/button/span")
    public WebElement HeartIcon3; */

 
    
    public void verifyFavoriteIcon() {
    	registerButton.click(); 
    	loginLink.click();
//    	CommonMethods.waitForVisibility(emailTextBox);
    	CommonMethods.wait(3);
    	CommonMethods.hover(returnButton);
    	emailTextBox.sendKeys(ConfigurationReader.getProperty("Email"));
    	passwordTextBox.sendKeys(ConfigurationReader.getProperty("Password"));
    	loginClick.click(); 
    	String actualUrl = Driver.getDriver().getCurrentUrl(); 
    	String HomePageUrl = "https://www.artsper.com/us/"; 
    	Assert.assertTrue(actualUrl.startsWith(HomePageUrl)); 
    	heartIcon.click(); 
    	CommonMethods.ScrolByPixel(500);
    	CommonMethods.wait(3);
    	ArtWorkbutton.click();
    	CommonMethods.wait(3);
    	SortByPopularity.click(); 
    	//CommonMethods.selectDropDownVisibleText(SortByPopularity, "Sort by popularity");
    	CommonMethods.selectDropDownVisibleText(SortByPopularity, "Sort by ascending price");
    	CommonMethods.wait(3);
    	CommonMethods.ScrolByPixel(200);
    	CommonMethods.wait(2);
    	HeartIcon2.click(); 
    	CommonMethods.wait(2);
    	heartIcon.click(); 
    	CommonMethods.ScrolByPixel(200);

	}  
    
    




}
