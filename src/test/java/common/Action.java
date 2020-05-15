package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.LoadBrowser;

public class Action {
	
	WebDriver driver;
	
	public Action(){
	
		driver = LoadBrowser.driver;	
	}
	
	/**
	 * Used to launch application
	 * @param url -- Url used to login
	 * @throws Exception 
	 */
	public void launch(String url) throws Exception {
		
		driver.get(url);
	    Thread.sleep(3000);		
	}
	
	
	public void click(By locator) throws Exception {
		
		driver.findElement(locator).click();
		Thread.sleep(3000);
	}
	
	
	public void insertTxt(By locator, String insertValue) throws Exception {
		
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(insertValue);
		Thread.sleep(3000); 
	}

	
}
