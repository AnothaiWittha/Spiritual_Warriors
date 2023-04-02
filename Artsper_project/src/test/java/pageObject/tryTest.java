package pageObject;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.Driver;


public class tryTest {
	

		@BeforeTest
		public void beforeTest() {
			Driver.getDriver();
		}
		
	
	
	@Test
	public void test1() {
		System.out.println("run test 1");
	}
	}
	
	

