package com.crm.ClientManagementSystem.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class Baseclass {
	public  static WebDriver driver;
	FileUtils f=new FileUtils();
	SeleniumUtility sutil=new SeleniumUtility();
@BeforeSuite
 public void connectingWithDatabase() {
	Reporter.log("database is connected",true);
}


@BeforeTest
public void launchBrowser() throws IOException {
    driver=new ChromeDriver();
    
	sutil.maximizeWindow(driver);
	sutil.implicitWait(driver);
	String URL = f.readdataFromPropertyFile("url");
	sutil.navtoApp(driver, URL);
	Reporter.log("browser launched and navigate to cms",true);
}
@BeforeMethod
public void loginToCMS() throws IOException {
LoginPage lp=new LoginPage(driver);
String Un= f.readdataFromPropertyFile("username");
lp.getUntbx().sendKeys(Un);
String pwd = f.readdataFromPropertyFile("password");
lp.getPwtbx().sendKeys(pwd);
lp.getLgbtn().click();


	Reporter.log("logged in ",true);
}
@AfterMethod
public void logoutFromCMS() {
	HomePage hp=new HomePage(driver);
	WebElement element=hp.getProfile();
	sutil.mousehover(driver,element);
	hp.getSignoutlink().click();
	
	Reporter.log("logged out successfully",true);
}
@AfterTest
public void closeTheBrowser() {
	sutil.closebrowser(driver);
	Reporter.log("browser is closed",true);
}
@AfterSuite
public void disconnectWithDatabase() {
	Reporter.log("database is disconnected successfully",true);
}

	

}
