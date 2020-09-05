package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected WebDriver driver;
	String driverPath = "Driver\\chromedriver.exe";
	//public String baseUrl = "http://yatra.com";

	@BeforeTest
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.get("http://yatra.com");
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void quit() throws InterruptedException {
		this.driver.close();
	}

}
