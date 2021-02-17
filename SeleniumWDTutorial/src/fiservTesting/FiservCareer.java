package fiservTesting;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiservCareer {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		String baseURL = "https://fiserv.com";
		
		System.setProperty("webdriver.chrome.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//button[@id='_evidon-decline-button']")).click();
		
		driver.findElement(By.cssSelector("li>a[href='/en/careers.html']")).click();
		
		driver.findElement(By.cssSelector(".search-keyword")).sendKeys("Senior Qa test Automation");
		
		driver.findElement(By.cssSelector(".search-location")).sendKeys("11218");
		
		driver.findElement(By.cssSelector(".mindreader-results>li>a[href='#']")).click();
		
		//driver.findElement(By.cssSelector("#search-submit-a1249c1821")).click();
		
		takeScreenshot("fiservCareer_page");
		
		
	}
	
	public static void takeScreenshot(String fileName) throws IOException {
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("/Users/hassanbhuiyan/eclipse-workspace/SeleniumWDTutorial/src/fiservTesting/"+fileName+".jpg"));
	}

}
