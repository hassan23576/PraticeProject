package letsKodeIt;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementListDisplayed {
	WebDriver driver;
	String baseURL;
	GenericMethods gm;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/p/practice";
		gm = new GenericMethods(driver);
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		List<WebElement> elementList = gm.getElements("//input[@type='text']", "xpath");
		
		int size = elementList.size();
		System.out.println("size of this element is: " + size);
		
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	

}
