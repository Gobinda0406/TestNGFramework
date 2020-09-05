package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	private WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(css="a[title='Round Trip']")
	private WebElement round;
	
	@FindBy(id="BE_flight_origin_city")
	private WebElement citylabel;
	
	public void clickRoundTrip(){
		wait.until(ExpectedConditions.visibilityOf(this.round));
		round.click();
	}
	
	public void clickCityLabel(String text){
		wait.until(ExpectedConditions.visibilityOf(this.citylabel));
		citylabel.click();
		citylabel.sendKeys(text);
	}
}
