package fiservTesting;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiservWindoHandles {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		baseURL = "https://www.fiserv.com/";
		
	}
	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		
	//Get the handle 
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent handle ID is: " + parentHandle);
		
		driver.findElement(By.cssSelector("#_evidon-decline-button")).click();
		
		WebElement cloverLink = driver.findElement(By.xpath("//a[@href='https://clover.com']"));
		cloverLink.click();
		
		//Get all the handles
		Set<String> handles = driver.getWindowHandles();
//		System.out.println(handles);
		
		
		for (String handle : handles) {
			System.out.println("Print all window handles:" + handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(6000);
				WebElement logInLink = driver.findElement(By.xpath("//span[text()='Log In']"));
				logInLink.click();
				driver.close();
				break;
		}
		
		}
		//Switch back to parent handle.
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//a[(@href='/en/careers.html') and contains(@title,'Careers')]")).click();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
