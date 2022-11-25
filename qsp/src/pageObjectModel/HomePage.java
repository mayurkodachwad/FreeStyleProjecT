package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declaration for all the webElement present on the home page
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createNewTask;
	@FindBy(xpath="//a[text()='Logout']")private WebElement logout;
	@FindBy(xpath="//a[@id='profile-link']")private WebElement profileLink;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//initialization
	
	
	
	//utilization
	
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getProfileLink() {
		return profileLink;
	}
	
	//logout method
	
	public void logOutmethod()
	{
	    logout.click();
	}
	
}
