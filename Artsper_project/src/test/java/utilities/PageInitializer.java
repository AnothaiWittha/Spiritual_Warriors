package utilities;

import pageObject.HomePage;
import pageObject.LoginPage;

public class PageInitializer extends Driver {

	public static HomePage hp;
	public static LoginPage lp;

	public static void initialize() {
		Driver.getDriver();
		hp = new HomePage();
		lp = new LoginPage();
	}

}
