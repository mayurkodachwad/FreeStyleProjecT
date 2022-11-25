package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplyed {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://127.0.0.1/login.do;jsessionid=3cd2mf7ctgkij");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    WebElement idButton = driver.findElement(By.id("loginButton"));
	    Thread.sleep(2000);
	    boolean button = idButton.isDisplayed();
	    System.out.println(button);
	}

}
