package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiderlogin{

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.google.com/");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("qspiders pune");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
         driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
         Thread.sleep(4000);
         

	}

}

