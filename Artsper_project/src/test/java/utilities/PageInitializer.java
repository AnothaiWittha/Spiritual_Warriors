package utilities;

import pageObject.ArtworksPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.ShoppingPage;

public class PageInitializer extends Driver {

	public static HomePage hp;
	public static LoginPage lp;
	public static ArtworksPage awp;
	public static ShoppingPage sp;

	public static void initialize() {
		Driver.getDriver();
		hp = new HomePage();
		lp = new LoginPage();
		awp = new ArtworksPage();
		sp = new ShoppingPage();
	}

}
