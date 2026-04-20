package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

//declaration
	@FindBy(name="user_name")
	private WebElement untbx;
	@FindBy(name="user_password")
	private WebElement pwtbx;
	@FindBy(id="submitButton")
	private WebElement lgbtn;
	//intialisation
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getUntbx() {
		return untbx;
	}
	public WebElement getPwtbx() {
		return pwtbx;
	}
	public WebElement getLgbtn() {
		return lgbtn;
	}
	
}
