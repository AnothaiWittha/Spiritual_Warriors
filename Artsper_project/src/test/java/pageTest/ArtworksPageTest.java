package pageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;
import utilities.PageInitializer;

public class ArtworksPageTest extends PageInitializer {

	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver();

	}

	@Test
	public void verifyArtworksButton() {

		awp.verifyArtworksButtonMethod();
	}

	@AfterMethod
	public void tearDown() {
		// Driver.closeDriver();

	}

}
