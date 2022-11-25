package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.flipkart.com/");
         Thread.sleep(7000);
         driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("hp laptop");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
         Thread.sleep(3000);
         String priceOfHplaptop = driver.findElement(By.xpath("//div[text()='HP Athlon Dual Core 3050U - (8 GB/512 GB SSD/Windows 11 Home) 15s- eq1559AU Thin and Light Laptop']/ancestor::a[@class='_1fQZEK']/descendant::div[@class='_25b18c']")).getText(); 
         
         System.out.println(priceOfHplaptop+" : this is the price of hp laptop ");
	}

}


