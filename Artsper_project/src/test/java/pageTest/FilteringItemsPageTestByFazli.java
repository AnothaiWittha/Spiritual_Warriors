package pageTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.Driver;

public class FilteringItemsPageTestByFazli extends CommonMethods{
	
	@BeforeMethod
	public void beforeTest() {
		
		Driver.getDriver(); 


	}
	
	
	@Test
	public void testcase3() {
		vf.VerifyFilteringLink(); 
		
		
	}
	

}
