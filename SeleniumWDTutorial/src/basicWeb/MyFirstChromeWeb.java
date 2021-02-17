package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstChromeWeb {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://etsy.com";
		driver.get(baseURL);

	}

}
