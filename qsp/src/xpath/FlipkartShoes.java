package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartShoes {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("shoes");;
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 
	 
	 
	 
	 
	 

	}

}
