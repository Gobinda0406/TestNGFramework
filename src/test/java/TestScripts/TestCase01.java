package TestScripts;

import org.testng.annotations.Test;

import pageFactory.Login;

public class TestCase01 extends BaseTest{

	
	@Test
	public void invalidLogin() throws InterruptedException {
		
		Login login = new Login(this.driver);
		System.out.println("Into TC01 invalidLogin Method");
		login.launchURL();
		login.clickLoginButton();
		login.enterEmail("Gobinda.Roy682@gmail.com");
	}

	
}
