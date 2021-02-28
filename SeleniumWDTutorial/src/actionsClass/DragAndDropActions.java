package actionsClass;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		baseURL = "https://www.globalsqa.com/demo-site/draganddrop/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testDragAndDrop() {
		driver.get(baseURL);
		
		driver.switchTo().frame(2);
		
		WebElement fromElement = driver.findElement(By.xpath("//h5[contains(@class,'ui-widget-header') and (text()='High Tatras')]"));
		WebElement toElement = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		
		//Drag and Drop action
		//action.dragAndDrop(fromElement, toElement).build().perform();
		
		action.clickAndHold(fromElement).moveToElement(toElement).build().perform();
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
