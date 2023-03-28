package pageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.MyIListeners;
import utilities.PageInitializer;

@Listeners(MyIListeners.class)
public class LoginPageTest extends PageInitializer {

	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver();
	}

	@Test(priority = 1, enabled = true, groups = { "smokeTestSuit", "regressionSuite" })
	public void loginSucessfullly() {
		lp.loginSuccessfullyMethod();
		lp.myAccountSelectDropdown(ConfigurationReader.getProperty("logout"));
	}

	@Test(priority = 2, enabled = true, groups = { "smokeTestSuit", "regressionSuite" })
	public void loginFail() {
		lp.loginErrorMethod();

	}


	@AfterMethod
	public void tearDown() {
		Driver.closeDriver();
	}

}