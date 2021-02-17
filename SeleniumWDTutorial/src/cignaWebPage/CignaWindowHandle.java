package cignaWebPage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CignaWindowHandle {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty
		("webdriver.chrome.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		baseURL = "https://www.cigna.com/";
		
	}
	
	@Test
	public void testWindowHandles() throws InterruptedException {
		driver.get(baseURL);
		//Get parent handle 
		String parentHandle = driver.getWindowHandle();
		System.out.println("ParentHandle is: " + parentHandle);
		WebElement cignaIntLink = driver.findElement(By.xpath("//a[@class='nav-link small-text link-external' and contains(text(),'Cigna')]"));
		cignaIntLink.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String handle : handles) {
			System.out.println("Print all handles:" + handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				WebElement memberLogInBtn = driver.findElement(By.xpath("//a[@href='/member-login' and contains(@role,'button')]"));
				memberLogInBtn.click();
				driver.close();
				break;
				
			
			}
		}
		driver.switchTo().window(parentHandle);
		
		WebElement LogInMyCigna = driver.findElement(By.xpath("//ul[@class='navbar-nav']//a[@href='https://my.cigna.com' and contains (@target,'_blank')]"));
		 LogInMyCigna.click();
		 
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}


}
