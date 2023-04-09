package utilities;

import pageObject.BillingPageAysem;
import pageObject.ArtworksPage;
import pageObject.FilteringItemsPageByFazli;
import pageObject.HomePage;
import pageObject.HomePage2;
import pageObject.LeasingPageLinkByFazli;
import pageObject.LoginPage;
import pageObject.MyFavoritePageByFazli;
import pageObject.MyInformationPageAysem;
import pageObject.PDFPageAysem;
import pageObject.ShoppingPage;



public class PageInitializer extends Driver {

	public static HomePage hp;
	public static LoginPage lp;
	public static HomePage2 hp2;
	public static MyFavoritePageByFazli mf;
	public static LeasingPageLinkByFazli lp2;
	public static FilteringItemsPageByFazli vf; 
	public static MyInformationPageAysem mip;
	public static BillingPageAysem bpa;
	public static PDFPageAysem pdfp;
	public static ArtworksPage awp;
	public static ShoppingPage sp;



	
	public static void initialize() {
		//Driver.getDriver();
		hp = new HomePage();
		lp = new LoginPage();		
		hp2 = new HomePage2();
		mf = new MyFavoritePageByFazli();
		lp2 = new LeasingPageLinkByFazli();
		vf = new FilteringItemsPageByFazli(); 
		mip= new MyInformationPageAysem();
		bpa= new BillingPageAysem();
		pdfp=new PDFPageAysem();
		vf = new FilteringItemsPageByFazli();
		awp = new ArtworksPage();
		sp = new ShoppingPage();

		
	}

}
