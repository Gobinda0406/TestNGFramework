package TestScripts;

import org.testng.annotations.Test;

import pageFactory.HomePage;
import pageFactory.Login;

public class TestCase02 extends BaseTest{

	@Test
	public void clickRoundTrip() throws InterruptedException {
		Login login = new Login(this.driver);
		System.out.println("Into TC02 invalidLogin Method");
		login.launchURL();
		HomePage hp = new HomePage(driver);
		hp.clickRoundTrip();
	}

	
}
