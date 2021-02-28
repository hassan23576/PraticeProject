package bloomingsdaleAutomation;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPage {
	WebDriver driver;
	String baseURL;
	SearchPage searchPage = new SearchPage();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		baseURL = "https://www.bloomingdales.com/";
		
	}
	@Test
	public void testMenSearchTab() throws Exception {
		driver.get(baseURL);
		SearchPage.closeCookieBox(driver);
		SearchPage.hoverOverMen(driver);
//		SearchPage.clickOnBoots(driver);
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

}
