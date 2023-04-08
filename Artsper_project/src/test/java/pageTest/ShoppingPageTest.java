package pageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import utilities.Driver;
import utilities.PageInitializer;

public class ShoppingPageTest extends PageInitializer {

	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver();
	}

	@Test
	public void loginSuccessfully() {
		lp.loginSuccessfullyMethod();

	}

	@Test
	public void buyArtworkMethod() {
		sp.buyArtworkMethod();
	}

	@Test
	public void removeItemsMethod() {
		sp.removeItemsMethod();
		sp.isCarEmpty();

	}

	@AfterMethod
	public void tearDown() {
		Driver.closeDriver();

	}

}

