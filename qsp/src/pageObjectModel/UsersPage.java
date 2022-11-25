package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	
	//declaration for all the WebElement present on users page
	
	@FindBy(linkText="Users")private WebElement users;
	@FindBy(xpath="//input[@value='Create New User']")private WebElement createnewuser;
	
	
	//initialaization
	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//utilization
	public WebElement getUsers() {
		return users;
	}
	public WebElement getCreatenewuser() {
		return createnewuser;
	}
	
	
	
	

}
