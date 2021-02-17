package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFireFoxClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://google.com";
		driver.get(baseURL);

	}

}
