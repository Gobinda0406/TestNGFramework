package TestScripts;

import org.testng.annotations.Test;

import pageFactory.HomePage;

public class TestCase02 extends BaseTest{

	@Test
	public void clickRoundTrip() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickRoundTrip();
	}

	
}
