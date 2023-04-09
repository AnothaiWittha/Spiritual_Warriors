package pageTest;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Driver;
import utilities.PageInitializer;

public class PDFPageTestAysem extends PageInitializer {

		@BeforeMethod
		public void beforeTest() {
			Driver.getDriver();
		}
		
		@Test(enabled = true)
		public void windowHandle () { 
		pdfp.pdfWindowMethod();
		
		}	
		
		@AfterClass
		public void afterTest() {
			Driver.closeDriver();
		}
	}
	

