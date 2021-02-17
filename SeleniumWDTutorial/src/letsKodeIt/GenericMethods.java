package letsKodeIt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {

	WebDriver driver;

	public GenericMethods(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement(String locator, String type) {

		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found with id: " + locator);
			return this.driver.findElement(By.id(locator));
		}

		else if (type.equals("CSS")) {
			System.out.println("Element found with cssSelector: " + locator);
			return this.driver.findElement(By.cssSelector(locator));
		} else if (type.equals("xpath")) {
			System.out.println("Element found with xpath: " + locator);
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("className")) {
			System.out.println("Element found with className: " + locator);
			return this.driver.findElement(By.className(locator));
		} else if (type.equals("tagName")) {
			System.out.println("Element found with tagName: " + locator);
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("partialLinkText")) {
			System.out.println("Element found with partialLinkText: " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		} else if (type.equals("name")) {
			System.out.println("Element found with name: " + locator);
			return this.driver.findElement(By.name(locator));
		}

		else {
			System.out.println("locator type not supported");
			return null;
		}

	}

	public List<WebElement> getElements(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found with id: " + locator);
			return this.driver.findElements(By.id(locator));
		}

		else if (type.equals("CSS")) {
			System.out.println("Element found with cssSelector: " + locator);
			return this.driver.findElements(By.cssSelector(locator));
		} else if (type.equals("xpath")) {
			System.out.println("Element found with xpath: " + locator);
			return this.driver.findElements(By.xpath(locator));
		} else if (type.equals("className")) {
			System.out.println("Element found with className: " + locator);
			return this.driver.findElements(By.className(locator));
		} else if (type.equals("tagName")) {
			System.out.println("Element found with tagName: " + locator);
			return this.driver.findElements(By.tagName(locator));
		} else if (type.equals("partialLinkText")) {
			System.out.println("Element found with partialLinkText: " + locator);
			return this.driver.findElements(By.partialLinkText(locator));
		} else if (type.equals("name")) {
			System.out.println("Element found with name: " + locator);
			return this.driver.findElements(By.name(locator));
		}

		else {
			System.out.println("locator type not supported");
			return null;
		}

	}

	public boolean isElementPresent(String locator, String type) {
		List<WebElement> elementList = getElements(locator, type);

		int size = elementList.size();

		if (size > 0) {
			return true;
		} else {
			return false;
		}

	}

}
