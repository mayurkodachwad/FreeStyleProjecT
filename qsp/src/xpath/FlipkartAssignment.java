package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.flipkart.com/");
         Thread.sleep(7000);
         driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("hp  laptop");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//div[text()='Core i5']")).click();
         Thread.sleep(4000);
         driver.findElement(By.xpath("//div[text()='Brand']")).click();
         Thread.sleep(4000);
         driver.findElement(By.xpath("//div[text()='HP']")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//div[text()='Operating System']")).click();
         Thread.sleep(4000);
         driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
         Thread.sleep(3000);
         String priceOfTheFirstSuggestedlaptop = driver.findElement(By.xpath("//div[text()='HP Pavilion Core i5 11th Gen - (8 GB/512 GB SSD/Windows 10 Home) 15-eg0547TU Thin and Light Laptop']/ancestor::a[@class='_1fQZEK']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText(); 
         
         System.out.println(priceOfTheFirstSuggestedlaptop+" : this is the price of hp laptop ");
	}

}


