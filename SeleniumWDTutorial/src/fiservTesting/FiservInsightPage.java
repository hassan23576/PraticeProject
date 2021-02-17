package fiservTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiservInsightPage {

	public static void main(String[] args) {
		
		String baseURL = "http://fiserv.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//button[@id='_evidon-decline-button']")).click();
		
		driver.findElement(By.xpath("//a[@title='Insights']")).click();
		
		driver.findElement(By.xpath("//a[@href='/en/about-fiserv/the-point/introducing-carat.html']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'more than half of consumers bought groceries online')]")).click();
		
		driver.findElement(By.xpath("//div[@class='cmp-text']//a[text()='ecommerce accounted for 16.1 percent of all U.S. sales']")).click();
		
		driver.findElement(By.xpath("//div[@class='feature-promo']//a[contains(@class,'button')]")).click();
		

	}

}
