package basicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleElementEnabled {
	WebDriver driver;
	

	@Before
	public void setUp() throws Exception {
		String baseURL = "https://google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@Test
	public void test() {
		WebElement googleSearch = driver.findElement(By.xpath("//input[@title='Search']"));
		System.out.println("is the button enabled? " + googleSearch.isEnabled());
	
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
