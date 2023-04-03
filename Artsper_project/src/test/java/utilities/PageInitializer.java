package utilities;


import pageObject.HomePage;
import pageObject.HomePage2;
import pageObject.LoginPage;

public class PageInitializer extends Driver {

	public static HomePage hp;
	public static LoginPage lp;
	public static HomePage2 hp2;

	
	public static void initialize() {
		//Driver.getDriver();
		hp = new HomePage();
		lp = new LoginPage();		
		hp2 = new HomePage2();

		
	}

}
