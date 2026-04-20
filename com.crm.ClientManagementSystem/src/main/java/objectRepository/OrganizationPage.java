package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement plusicon;
	
	@FindBy(name="accountname")
	private WebElement orgname;
	
	public WebElement getPlusicon() {
		return plusicon;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getIndustrydrop() {
		return industrydrop;
	}

	public WebElement getTypedrop() {
		return typedrop;
	}

	public WebElement getRadiogroup() {
		return radiogroup;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getShippingaddress() {
		return shippingaddress;
	}

	public WebElement getBillcity() {
		return billcity;
	}

	public WebElement getShipcity() {
		return shipcity;
	}

	public WebElement getBillcountry() {
		return billcountry;
	}

	public WebElement getShipcountry() {
		return shipcountry;
	}

	public WebElement getDesc() {
		return desc;
	}

	@FindBy(name="email2")
	private WebElement email;	
	
	@FindBy(name="industry")
	private WebElement industrydrop;
	
	@FindBy(name="accounttype")
	private WebElement typedrop;
	
	@FindBy(name="assigntype")
	private WebElement radiogroup;
	
	@FindBy(name="bill_street")
	private WebElement billaddress;
	
	@FindBy(name="ship_street")
	private WebElement shippingaddress;
	
	@FindBy(name="bill_city")
	private WebElement billcity;
	
	@FindBy(name="ship_city")
	private WebElement shipcity;
	
	@FindBy(name="bill_state")
	private WebElement billstate;
	
	@FindBy(name="ship_state")
	private WebElement shipstate;
	
	public WebElement getBillstate() {
		return billstate;
	}

	public WebElement getShipstate() {
		return shipstate;
	}

	@FindBy(name="bill_country")
	private WebElement billcountry;
	@FindBy(name="ship_country")
	private WebElement shipcountry;
	@FindBy(name="description")
	private WebElement desc;
	@FindBy(name="button")
	private WebElement savebtn;
	

	public WebElement getSavebtn() {
		return savebtn;
	}

	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	public WebElement getplusicon() {
		return plusicon;
		
	}
	
	public void createOrg(WebDriver driver,String organizationname, String email,
			String billaddress, String shipaddress, String billcity, String shipcity1, String billstate2,
			String shipstate2,String billcounty,String shipcounty,String desc1) {
		OrganizationPage op = new OrganizationPage(driver);
	   	op.getOrgname().sendKeys(organizationname);
	    op.getEmail().sendKeys(email);
		op.getBilladdress().sendKeys(billaddress);
		  op.getShippingaddress().sendKeys(shipaddress);
		  op.getBillcity().sendKeys(billcity);
		  op.getShipcity().sendKeys(shipcity1);
		  op.getBillstate().sendKeys(billstate2);
		  op.getShipstate().sendKeys(shipstate2);
		  op.getBillcountry().sendKeys(billcounty);
		  op.getShipcountry().sendKeys(shipcounty);
		  op.getDesc().sendKeys(desc1);
		  op.getSavebtn().click();
		
	}

	
}
