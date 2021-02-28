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

public class SliderActions {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", 
					"/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
			driver = new ChromeDriver();
			baseURL = "https://www.globalsqa.com/demo-site/sliders/#Range";
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void testSliderActions() {
		driver.get(baseURL);
		driver.switchTo().frame(3);
		
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 169, 0).build().perform();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}


}
