package pageTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.Driver;
import utilities.PageInitializer;

public class HomePage2Test extends PageInitializer {
	
	
	@BeforeMethod

	public void beforeTest() {

	Driver.getDriver();

	}

	//Test 6
	
	@Test (enabled = false)

	public void searchBarBoxVerify() {
	lp.loginSuccessfullyMethod();
	hp2.searchBarBoxMethod();
	 

	}

	//Test 7

	@Test (enabled = false)

	public void verifyLogoSuccessfully() {

	hp2.verifyLogo();
	}

	 

	//Test8

	@Test (enabled = true)

	public void verifyNeedHelpCenter() {

	hp2.sendMessageMethod();
	}

	 

	@AfterMethod

	public void closeBrowser() {

	CommonMethods.wait(3);

	Driver.closeDriver();

	}

}
