package TestScripts;

import org.testng.annotations.Test;

import pageFactory.HomePage;

public class TestCase03 extends BaseTest {

	@Test
	public void SearchCity() throws InterruptedException {
		HomePage hm = new HomePage(driver);
		hm.clickCityLabel("Kolkata");
	}
}
