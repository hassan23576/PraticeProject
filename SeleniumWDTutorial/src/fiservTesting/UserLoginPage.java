package fiservTesting;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserLoginPage {
	WebDriver driver;
	String baseURL;
	
	
	


	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver = new FirefoxDriver();
		baseURL= "http://fiserv.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.xpath("//button[@id='_evidon-decline-button']")).click();
		driver.findElement(By.className("sign-in__link")).click();
		System.out.println("clicked on sign in button");
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("hassan");
		System.out.println("entered username");
		
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("semp1990");
		System.out.println("entered password");
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		System.out.println("clicked on sign in");
	}

	@After
	public void tearDown() throws Exception {
	}

	
}
