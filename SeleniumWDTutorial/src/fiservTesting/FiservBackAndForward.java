package fiservTesting;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiservBackAndForward {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "http://fiserv.com";
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is " + currentUrl);
		
		String urlToNavigate = "https://www.careers.fiserv.com/";
		driver.navigate().to(urlToNavigate);
		System.out.println("Navigate to career page");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigated back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Navigated back to: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigated forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Navigated forward to:" + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("Page is refreshed");
		title = driver.getTitle();
		System.out.println("Page title is:" + title);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
