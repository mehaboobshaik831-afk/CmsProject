package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.Baseclass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtils;
import com.crm.ClientManagementSystem.GenericLibrary.ListenerImplementation;
import com.crm.ClientManagementSystem.GenericLibrary.SeleniumUtility;

import objectRepository.HomePage;
import objectRepository.OrganizationPage;
@Listeners(ListenerImplementation.class)
public class CreateOrganizationTest extends Baseclass {
@Test
public void create() throws EncryptedDocumentException, IOException {
	HomePage hp=new HomePage(driver);
	hp.getOrganizationslink().click();
	OrganizationPage op=new OrganizationPage(driver);
	op.getplusicon().click();
	FileUtils f=new FileUtils();
    String organizationname = f.readDataFromExcel("TestingData", 1, 1);
    
    String email = f.readDataFromExcel("TestingData", 1, 2);
	WebElement address = op.getIndustrydrop();
	SeleniumUtility s=new SeleniumUtility();
    s.handledropdownByvisibleText(address, "Engineering");
  String billaddress = f.readDataFromExcel("TestingData", 1, 3);
  String shipaddress = f.readDataFromExcel("TestingData", 1, 4);
  String billcity = f.readDataFromExcel("TestingData", 1, 5);
  String shipcity1= f.readDataFromExcel("TestingData", 1, 6);
  String billstate2= f.readDataFromExcel("TestingData", 1, 7);
  String shipstate2= f.readDataFromExcel("TestingData", 1, 7);
  String billcounty = f.readDataFromExcel("TestingData", 1, 8);
  String shipcounty = f.readDataFromExcel("TestingData", 1, 9);
  String desc1 = f.readDataFromExcel("TestingData", 1, 10);
  
  
  
  op.createOrg(driver, organizationname, email, billaddress, shipaddress, billcity, shipcity1, billstate2, shipstate2, billcounty, shipcounty, desc1);
}
}
