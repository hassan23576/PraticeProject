package letsKodeIt;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeDemo {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/p/practice";
		
	}
	
	@Test
	public void getTextValue() {
		driver.get(baseURL);
		WebElement elementName = driver.findElement(By.id("openwindow"));
		String nameValue = elementName.getAttribute("class");
		
		System.out.println("print value of class:" + nameValue);
		
		
		
		
	}


	@After
	public void tearDown() throws Exception {
		driver.close();
	}
	


}
