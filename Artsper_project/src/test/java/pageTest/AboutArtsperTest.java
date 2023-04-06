package pageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.Driver;
import utilities.PageInitializer;

public class AboutArtsperTest extends PageInitializer{

	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver();
	}
	
	//Test 1 About Artsper
	@Test
	public void AboutArtspert() {
	
	ab.aboutArtsperMethod();
	ab.ClickYoutube();
	}
	
	@AfterMethod
	public void tearDown() {
		CommonMethods.wait(3);
		Driver.closeDriver();
	}
	
	
	
}
