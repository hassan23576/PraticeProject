package frameWorkBegining;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiservPageFactory {
	WebDriver driver;
	
	@FindBy(id="_evidon-decline-button")
	WebElement cookieNoticeBanner;
	
	@FindBy(xpath="//a[@href='/en/careers.html' and @title='Careers']")
	WebElement careers;
	
	@FindBy(xpath="//p//input[@placeholder='Keyword']")
	WebElement searchJobs;
	
	@FindBy(xpath="//p//input[@class='search-location']")
	WebElement location;
	
	@FindBy(xpath="//span[@id='search-location-2221bf57b5-mindreader-status']//following-sibling::ul//li//a[contains(text(),'Brooklyn')]")
	WebElement selectLocation;
	
	@FindBy(css=".search-radius")
	WebElement radius;
	
	@FindBy(xpath="//select[@class='search-radius']//option[contains(text(),'25')]")
	WebElement miles;
	
	@FindBy(id="search-submit-2221bf57b5")
	WebElement search;
	
	public FiservPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void clickOnCareers() throws Exception {
		cookieNoticeBanner.click();
		careers.click();
		Thread.sleep(300);
		
	}
	
	public void searchJobKeyword(String keyword) {
		searchJobs.sendKeys(keyword);
	}
	
	public void searchLocation(String typeLocation) {
		location.sendKeys(typeLocation);
	}
	
	public void clickLocation() {
		selectLocation.click();
	}
	
	public void selectDistance() {
		radius.click();
		miles.click();
		
	}
	
	public void clickOnSearchBtn() {
		search.click();
	}
	
	

}
