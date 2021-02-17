package switchToText;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPopHandling {
	private WebDriver driver;
	private String baseURL;	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.get(baseURL);
	}
	@Test
	public void test() {
		driver.findElement(By.id("name")).sendKeys("Hassan");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	@Test
	public void test1() {
		driver.findElement(By.id("name")).sendKeys("Hassan");
		driver.findElement(By.id("confirmbtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
