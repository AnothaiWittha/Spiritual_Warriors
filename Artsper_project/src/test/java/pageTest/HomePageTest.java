package pageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utilities.CommonMethods;
import utilities.Driver;
import utilities.MyIListeners;
import utilities.PageInitializer;

@Listeners(MyIListeners.class)
public class HomePageTest extends PageInitializer{

	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver();
	}


	@Test(priority = 1, enabled = true, groups = { "smokeTestSuit", "regressionSuite" })
	public void selectCountrySuccessfullly() throws IOException {
		lp.loginSuccessfullyMethod();
		hp.selectCounty();

	}

	@Test(priority = 2, enabled = true, groups = { "smokeTestSuit", "regressionSuite" })
	public void verifyALlSocialMedia() {

		hp.followArtsperText();
		hp.clickSocialMediaIcon("facebook");
		// hp.clickSocialMediaIcon("twitter");
		// hp.clickSocialMediaIcon("pinterest");
		// hp.clickSocialMediaIcon("instagram");

	}

	@Test(priority = 3, enabled = true, groups = { "smokeTestSuit", "regressionSuite" })
	public void verifyImageOnHP() {
		hp.slideImgOnHP();

	}


	@AfterMethod
	public void tearDown() {
		CommonMethods.wait(3);
		Driver.closeDriver();
	}

}
