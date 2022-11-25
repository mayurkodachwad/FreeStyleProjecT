package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    WebElement element = driver.findElement(By.xpath("//button[contains(@class,'_acap _acas')]"));
	    Thread.sleep(2000);
	    boolean button = element.isEnabled();
	    System.out.println(button);
		
	}

}
