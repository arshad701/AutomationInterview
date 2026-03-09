package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.constants.Browser;

public abstract class BrowserUtility {
	
	private  WebDriver driver;

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	public BrowserUtility(Browser browserName) {
		super();
		if(browserName == Browser.CHROME) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
		}
		else if(browserName == Browser.FIREFOX) {
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--start-maximized");
				driver = new FirefoxDriver(options);
			}
		else if(browserName == Browser.EDGE) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--start-maximized");
			driver = new EdgeDriver(options);
		}
		
	}
	

	
	
	public WebDriver getDriver() {
		return driver;
	}


	public void goToUrl(String url) {
		
		driver.get(url);
	}
	
	public void clickOnElement(By locator) {
	WebElement element = driver.findElement(locator);
	element.click();
	}
	
	
	public void sendKeyToElements(By locator,String input) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(input);
		}
	
	
	public String getVisibleText(By locator) {
		WebElement element = driver.findElement(locator);
		return element.getText();
	}
	

}
