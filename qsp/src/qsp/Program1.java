package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	 Thread.sleep(5000);
	 driver.findElement(By.id("newWindowBtn")).click();
	 Thread.sleep(4000);
	 Set<String> allHandles = driver.getWindowHandles();

	 for(String Handle : allHandles) {
		 System.out.println(Handle);
	 }
	 Thread.sleep(2000);
	 driver.quit();
	 

	}

}
