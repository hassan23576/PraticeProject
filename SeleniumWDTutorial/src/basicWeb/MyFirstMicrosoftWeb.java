package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstMicrosoftWeb {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "/Users/hassanbhuiyan/Documents/WorkSpace_Personal/libs/selenium/drivers/msedgedriver");
		WebDriver driver = new EdgeDriver();
		String baseURL = "http://bing.com";
		driver.get(baseURL);
	}

}
