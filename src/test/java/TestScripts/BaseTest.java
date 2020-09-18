package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException, MalformedURLException {

		String host="localhost";
		DesiredCapabilities capability;
		
		if(System.getProperty("BROWSER")!=null && System.getProperty("BROWSER").equals("firefox")){
			 capability = DesiredCapabilities.firefox();
		}else{
			
			 capability = DesiredCapabilities.chrome();
		}
		
		if(System.getProperty("HUB_HOST")!=null){
			host=System.getProperty("HUB_HOST");
		}
		String completeURL = "http://"+host+":4444/wd/hub";
		this.driver = new RemoteWebDriver(new URL(completeURL), capability);

		// System.setProperty("webdriver.chrome.driver", driverPath);
		// this.driver = new ChromeDriver();
		// this.driver.manage().window().maximize();
		// this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void quit() throws InterruptedException {
		this.driver.quit();
	}

}
