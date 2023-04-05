package utilities;


import pageObject.FilteringItemsPageByFazli;
import pageObject.HomePage;
import pageObject.HomePage2;
import pageObject.LeasingPageLinkByFazli;
import pageObject.LoginPage;
import pageObject.MyFavoritePageByFazli;

public class PageInitializer extends Driver {

	public static HomePage hp;
	public static LoginPage lp;
	public static HomePage2 hp2;
	public static MyFavoritePageByFazli mf;
	public static LeasingPageLinkByFazli lp2;
	public static FilteringItemsPageByFazli vf; 

	
	public static void initialize() {
		//Driver.getDriver();
		hp = new HomePage();
		lp = new LoginPage();		
		hp2 = new HomePage2();
		mf = new MyFavoritePageByFazli();
		lp2 = new LeasingPageLinkByFazli();
		vf = new FilteringItemsPageByFazli(); 
		

		
	}

}
