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
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty
		("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/p/practice";
	}
	
	@Test
	public void testmethod() throws InterruptedException {
		driver.get(baseURL);
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		System.out.println("Select by value");
		sel.selectByValue("orange");
		
		Thread.sleep(2000);
		System.out.println("Deselect by value");
		sel.deselectByValue("orange");
		
		Thread.sleep(2000);
		System.out.println("Select by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select by visible text");
		sel.selectByVisibleText("Apple");
		
		Thread.sleep(2000);
		System.out.println("Deselect all");
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		for (WebElement option : selectedOptions) {
			System.out.println(option.getText());
			
		}
	}
		
		
		
		
	
	


	@After
	public void tearDown() throws Exception {
	}

	

}
