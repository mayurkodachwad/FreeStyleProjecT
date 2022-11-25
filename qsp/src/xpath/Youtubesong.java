package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubesong{

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.youtube.com/");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("dil diya gallan");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
         Thread.sleep(4000);
         driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
         Thread.sleep(1000);
         

	}

}


