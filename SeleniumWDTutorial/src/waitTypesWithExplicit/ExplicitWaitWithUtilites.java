package waitTypesWithExplicit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.waitTypes;

public class ExplicitWaitWithUtilites {
	static WebDriver driver;
	String baseURL;
	waitTypes wt;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		wt = new waitTypes(driver);
		
	}
	
	@Test
	public void test() throws IOException {
		driver.get(baseURL);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		
		WebElement emailField = wt.waitForElement(By.id("user_email"), 3);
		emailField.sendKeys("hassan");
			
		wt.clickWhenReady(By.name("commit"), 3);
		
		takeScreenshot("Letskodeit_practice_loginPage");
		
		
		
	}
	public static void takeScreenshot(String fileName) throws IOException {
		//1, take screenshot and store it as a file format
		File file =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//2. copy the screenshot to desired location using copy file method.
		FileUtils.copyFile(file, new File("/Users/hassanbhuiyan/eclipse-workspace/SeleniumWDTutorial/src/waitTypesWithExplicit/"
		+fileName+ ".jpg"));
	}

	@After
	public void tearDown() throws Exception {
		
	}

	

}
