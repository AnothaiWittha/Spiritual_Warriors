package pageTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.MyIListeners;
import utilities.PageInitializer;

@Listeners(MyIListeners.class)

public class BillingPageTestAysem extends  PageInitializer{

	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver();
	}
	
	@Test (priority = 1, enabled = true, groups = { "smokeTestSuit", "regressionSuite" })
	public void searchBar() {
		lp.loginSuccessfullyMethod();
		bpa.searchBarMethod();
	}
	
	
	@Test (priority = 2, enabled = true, groups = { "smokeTestSuit", "regressionSuite" })
	public void billingInformation() {
		bpa.billingInfoMethod();
	}

	@AfterClass
	public void afterClass() {
		Driver.closeDriver();
	}

}

