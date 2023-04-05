package pageTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.Driver;

public class MyFavoritePageTestByFazli extends CommonMethods {
	@BeforeMethod
	public void beforeTest() {
		
		Driver.getDriver(); 


	}
	
	
	@Test
	public void testcase1() {
		mf.verifyFavoriteIcon(); 
		
		
	}
	

}
