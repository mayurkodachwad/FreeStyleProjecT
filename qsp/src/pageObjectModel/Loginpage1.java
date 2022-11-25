package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	
	//declare all the WebElement present on Login page
	@FindBy(name="username")private WebElement usn;
	@FindBy(name="pwd")private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox")private WebElement keepMeLoggedInCheckBox;
	@FindBy(xpath="//a[text()='License for using this software']") private WebElement licence;
	
	
	
	//initialization
	
	public Loginpage1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	
	public WebElement getUsn1() {
		return usn;
	}
	public WebElement getPass1() {
		return pass;
	}
	public WebElement getLoginBtn1() {
		return loginBtn;
	}
	public WebElement getKeepMeLoggedInCheckBox1() {
		return keepMeLoggedInCheckBox;
	}
	public WebElement getLicence1() {
		return licence;
	}
	
	//valid Login Method 
	
	public void validLoginToActiTime(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
	}
	
	//invalid login Method
	public void invalidLoginToActiTime(String validUsername,String validPassword) throws InterruptedException
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(4000);
		usn.clear();
	}
	
	
	
	}
