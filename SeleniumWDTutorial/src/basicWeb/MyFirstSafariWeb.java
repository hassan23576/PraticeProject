package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyFirstSafariWeb {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		
		String baseURL = "http://apple.com";
		driver.get(baseURL);

	}

}
