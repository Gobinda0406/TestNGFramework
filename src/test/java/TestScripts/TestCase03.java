package TestScripts;

import org.testng.annotations.Test;

import pageFactory.HomePage;
import pageFactory.Login;

public class TestCase03 extends BaseTest {

	@Test
	public void SearchCity() throws InterruptedException {
		Login login = new Login(this.driver);
		System.out.println("Into TC03 invalidLogin Method");
		login.launchURL();
		HomePage hm = new HomePage(driver);
		hm.clickCityLabel("Kolkata");
	}
}
