package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("file:///G:/automation/drop%20down%20multiple.html");
         Thread.sleep(4000);
         driver.findElement(By.xpath("menu")).click();
         Thread.sleep(4000);
         driver.close();

	}

}


