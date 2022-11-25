package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	 driver.findElement(By.xpath("//span[text()='My Info']")).click();
	 Thread.sleep(4000);
	 WebElement element = driver.findElement(By.xpath("//div[text()='Afghan']"));
	  Select sel = new Select(element);
	  List<WebElement> allOps = sel.getOptions();
	 for( WebElement ops:allOps)
	 {
	
	 if(ops.getText().equals("Indian"))
	 {
		 ops.click();
		 break;
	 }
	 

	 }
	
	}
}


