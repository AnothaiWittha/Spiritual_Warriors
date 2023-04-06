package pageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Driver;
import utilities.PageInitializer;

public class GiftCardsPageTest extends PageInitializer {

	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver();
	}

	// Test 1 About Artsper
	@Test
	public void GiftCards() {

		gc.loginArtsper();
		gc.GiftCardsClickLink();
		gc.GiftCardsAmount();
		gc.Checkout();
	}
}
