package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonMethods;
import utilities.Driver;

public class PDFPageAysem extends CommonMethods {

	
	public PDFPageAysem () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath="//a[contains (@href,'artsper_2023_en.pdf')]")
	public WebElement pdffile;
	
	
	// Method for only this page
	
	// Scroll to button "Collect art in 2023" ,switch and validate
		public void pdfWindowMethod () {
		CommonMethods.scrollToElement(pdfp.pdffile);
		CommonMethods.jsClick(pdfp.pdffile);
		CommonMethods.switchtoChildWindow();
		String actualTitle=Driver.getDriver().getCurrentUrl();
		String expectedTitle="https://media.artsper.com/public/pdf/ebook/artsper_2023_en.pdf";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		
		}
	
	
	
}
