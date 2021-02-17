package CalenderDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpediaDateSelection {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "https://www.expedia.com/";
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		WebElement clickOnCheckIn = driver.findElement(By.id("d1-btn"));
		clickOnCheckIn.click();
		WebElement clickOnDate = driver.findElement(By.xpath("//button[@data-day='31']"));
		clickOnDate.click();
		
	}
	@Test
	public void test1() {
		driver.get(baseURL);
		
		
	}

	@After
	public void tearDown() throws Exception {
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		
		WebElement departingField = driver.findElement(By.id("d1-btn"));
		departingField.click();
		
		List<WebElement> allValidDates = departingField.findElements(By.tagName("button"));
	
		Thread.sleep(3000);
		
		for (WebElement date : allValidDates) {
			if (date.getText().equals("31")) {
				date.click();
				break;
			}
		}
	}

	

}
