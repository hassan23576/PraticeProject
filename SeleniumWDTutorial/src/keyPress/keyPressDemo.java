package keyPress;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyPressDemo {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testKeyPress() {
		driver.get(baseURL);
		WebElement clickLogIn = driver.findElement(By.xpath("//a[contains(@href,'sign_in')]"));
		clickLogIn.click();
		
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
