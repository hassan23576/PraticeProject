package letsKodeIt;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtionWithList {
	
	private WebDriver driver;
	private String baseURL;
	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty
		("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/p/practice";
		
		
		
	}
	
	@Test
	public void test() throws InterruptedException{
		driver.get(baseURL);
		boolean isChecked = false;
		List<WebElement> radioButtons = driver.findElements(
				By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		int size = radioButtons.size();
		System.out.println("size of the list: " + size);
		for(int i =0; i<size; i++) {
			isChecked = radioButtons.get(i).isSelected();
			
			if(!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}
			
		}
		
	}

	@After
	public void tearDown() throws Exception {
	}


}
