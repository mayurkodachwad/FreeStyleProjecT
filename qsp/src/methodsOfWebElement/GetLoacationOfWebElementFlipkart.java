package methodsOfWebElement;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLoacationOfWebElementFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/.drivers.chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 WebElement seleniumlevelsponsors = driver.findElement(By.xpath("//div[.='Selenium Level Sponsors']"));
		 org.openqa.selenium.Point point = seleniumlevelsponsors. getLocation();
         double xlocation = point.getX();
        double ylocation = point.getY();
        System.out.println("X"+xlocation+""+"y"+ylocation);
		 
		 

	}

}
