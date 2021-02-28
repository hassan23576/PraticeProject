package actionsClass;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
	private WebDriver driver;
	private String baseURL;
	JavascriptExecutor jse;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jse = (JavascriptExecutor)driver;
		
	}
	@Test
	public void testMouseHoverActions() throws Exception {
		driver.get(baseURL);
		jse.executeScript("window.scrollBy(0, 600)");
		Thread.sleep(3000);
		
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		
		WebElement clickOnReload = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Reload']"));
		action.moveToElement(clickOnReload).click().perform();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
