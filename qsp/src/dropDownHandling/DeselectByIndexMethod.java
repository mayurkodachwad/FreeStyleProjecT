package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("file:///G:/automation/drop%20down%20multiple.html");
	  Thread.sleep(4000);
	WebElement sdropdown = driver.findElement(By.id("menu"));
       Select sel = new Select (sdropdown);
       sel.selectByVisibleText("fish");
       Thread.sleep(4000);
       sel.deselectByIndex(6);
	
	  
	  
	  

	}

}
