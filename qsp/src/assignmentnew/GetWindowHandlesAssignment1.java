package assignmentnew;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesAssignment1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("nothing phone");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 Thread.sleep(4000);
	 String parentHandle = driver.getWindowHandle();//89
	 driver.findElement(By.xpath("(//div[text()='Nothing Phone (1) (White, 256 GB)'])[1]")).click();
	 Thread.sleep(4000);
	 Set<String> bothHandles = driver.getWindowHandles();
	 for(String handle:bothHandles)
	 {
		 if(!parentHandle.equals(handle))
		 {
			 driver.switchTo().window(handle);
		 }
		 else
		 {
			 
		 }
	 }
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[text()='Black']/ancestor::li[@id='swatch-0-color']/descendant::a")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//a[text()='12 GB']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411033");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//span[text()='Check']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[text()='Remove']")).click();
	 
	 
	 

	}

}
