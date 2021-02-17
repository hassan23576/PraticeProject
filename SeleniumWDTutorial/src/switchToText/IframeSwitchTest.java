package switchToText;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSwitchTest {
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
		
		
	}
	
	@Test
	public void testIframe() throws Exception {
		driver.get(baseURL);
		
		//Switch to frame from ID
//		driver.switchTo().frame("courses-iframe");
		
		//Switch to frame by name
//		driver.switchTo().frame("iframe-name");
		
		//Switch to frame by number
		driver.switchTo().frame(0);
		
		WebElement searchCourses = driver.findElement(By.id("search-courses"));
		searchCourses.sendKeys("Java");
		
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		WebElement inputName = driver.findElement(By.id("name"));
		inputName.sendKeys("hassan");
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
