package actionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("http://127.0.0.1/login.do;jsessionid=570fasppd22h6");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 driver.findElement(By.linkText("Settings")).click();
		 driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		 driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		 WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		 Actions act = new Actions(driver);
		act.doubleClick(target).perform();
	
		 
		 


	}

}
