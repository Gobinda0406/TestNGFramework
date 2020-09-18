package pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(id = "signInBtn")
	WebElement loginButton;

	@FindBy(id = "userLoginBlock")
	WebElement myAccount;

	@FindBy(id = "login-input")
	WebElement loginTextBox;

	@FindBy(css = "button#login-continue-btn")
	WebElement continueButton;

	public Login(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);

	}

	public void launchURL() {
		driver.navigate().to("http://yatra.com");
		wait.until(ExpectedConditions.visibilityOf(this.myAccount));
	}

	public void clickLoginButton() throws InterruptedException {
		try{
		wait.until(ExpectedConditions.visibilityOf(this.myAccount));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", myAccount);

		Thread.sleep(1000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", loginButton);

		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(this.loginTextBox));
		loginTextBox.sendKeys(email);
		continueButton.click();
	}
}
