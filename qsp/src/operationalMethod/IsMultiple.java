package operationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     driver.get("file:///G:/automation/single%20select%20drop%20down.html");
	     WebElement element = driver.findElement(By.id("menu"));
	     Select sel = new Select(element);
	    boolean checkDropdown = sel.isMultiple();
        System.out.println(checkDropdown);
        Thread.sleep(2000);
        driver.navigate().to("file:///G:/automation/single%20select%20drop%20down.html");
         WebElement element1 = driver.findElement(By.id("menu"));
	      sel=new Select(element1);
	      boolean checkDropdown2 = sel.isMultiple();
	      Thread.sleep(2000);
	      System.out.println(checkDropdown);
	}
	
 
}
