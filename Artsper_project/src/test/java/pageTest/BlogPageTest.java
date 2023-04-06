package pageTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Driver;
import utilities.PageInitializer;

public class BlogPageTest extends PageInitializer{

	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver();
	}

	// Test 1 About Artsper
	@Test
	public void BlogpageTest() {
		bp.BlogClick();
		bp.ArtMoviesClick();
	}
}
