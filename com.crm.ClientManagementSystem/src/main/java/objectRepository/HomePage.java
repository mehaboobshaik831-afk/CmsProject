package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement profile;

@FindBy(linkText="Sign Out")
private WebElement signoutlink;

@FindBy(linkText="Calendar")
private WebElement calenderlink;

@FindBy(xpath="//a[text()='Leads']")
private WebElement leadslink;

@FindBy(xpath="//a[text()='Organizations']/parent::td[@class='tabUnSelected']")
private WebElement organizationslink;

@FindBy(linkText="Contacts")
private WebElement contactslink;

@FindBy(xpath="//a[text()='Opportunities']/parent::td[@class='tabUnSelected']")
private WebElement opportunities;
@FindBy(xpath="//a[text()='Products']")
private WebElement productslink;
@FindBy(xpath="//a[text()='Documents']")
private WebElement documentslink;
@FindBy(xpath="//a[text()='Email']")
private WebElement emailslink;
@FindBy(linkText="Trouble Tickets")
private WebElement troubleticketslink;
@FindBy(linkText="Dashboard") 
private WebElement dashboardlink;

 
public HomePage(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
public WebElement getProfile() {
	return profile;
	
}
public WebElement getSignoutlink() {
	return signoutlink;
	
}
public WebElement getCalenderlink() {
	return calenderlink;
}
public WebElement getLeadslink() {
	return leadslink;
}
public WebElement getOrganizationslink() {
	return organizationslink;
}
public WebElement getContactslink() {
	return contactslink;
}
public WebElement getOpportunities() {
	return opportunities;
}
public WebElement getProductslink() {
	return productslink;
}
public WebElement getDocumentslink() {
	return documentslink;
}
public WebElement getEmailslink() {
	return emailslink;
}
public WebElement getTroubleticketslink() {
	return troubleticketslink;
}
public WebElement getDashboardlink() {
	return dashboardlink;
}

}
