package bloomingsdaleAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SearchPage {
	public static WebElement element = null;
	
	//close cookie policy.
	public static WebElement closeCookieBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='CCPA_banner']//button[@class='close-small']"));
		element.click();
		return element;
	}

	 //navigate to men boot section.
	public static WebElement hoverOverMen(WebDriver driver) throws Exception {
		element = driver.findElement(By.xpath("//a[contains(text(),'MEN') and contains (@href,'-MEN-')]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(3000);
		WebElement shoes = driver.findElement(By.xpath("//ul//li[@class='category-rail-subnav-label']//a[contains(@href,'/shop/mens/designer-shoes')]"));
		shoes.click();
		return element;
	}
//	public static WebElement clickOnBoots(WebDriver driver) {
//		element = driver.findElement(By.xpath("//a[contains(text(),'Boots')]"));
//		Actions action = new Actions(driver);
//		action.moveToElement(element).click().perform();
//		return element;
//	}
		
	
	

}
