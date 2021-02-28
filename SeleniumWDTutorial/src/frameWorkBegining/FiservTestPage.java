package frameWorkBegining;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiservTestPage {
	private WebDriver driver;
	private String baseURL;
	FiservPageFactory careerPage;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		baseURL = "https://www.fiserv.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(baseURL);
		careerPage = new FiservPageFactory(driver);
		
		
	}
	
	@Test
	public void test() throws Exception {
		careerPage.clickOnCareers();
		careerPage.searchJobKeyword("Qa tester");
		careerPage.searchLocation("11218");
		careerPage.clickLocation();
		careerPage.selectDistance();
		careerPage.clickOnSearchBtn();
	}

	@After
	public void tearDown() throws Exception {
	}

	
}
