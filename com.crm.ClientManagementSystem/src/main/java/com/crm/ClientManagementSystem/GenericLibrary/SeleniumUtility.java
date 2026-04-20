package com.crm.ClientManagementSystem.GenericLibrary;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	public void launchchromeBrowser(WebDriver driver) {
		driver=new ChromeDriver();
	}
    public void maximizeWindow(WebDriver driver) {
    	driver.manage().window().maximize();
    }
    public void implicitWait(WebDriver driver) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void navtoApp(WebDriver driver,String url) {
    	driver.get(url);
    }
	public void mousehover(WebDriver driver, WebElement address) {
		Actions a=new Actions(driver);
		a.moveToElement(address).perform();
		
	}
	public void closebrowser(WebDriver driver) {
		driver.quit();
		
	}
	public void handledropdownByvisibleText(WebElement address,String text) {
		Select s=new Select(address) ;
		s.selectByVisibleText(text);
		
	}
}
