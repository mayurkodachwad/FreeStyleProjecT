package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://127.0.0.1/login.do;jsessionid=3cd2mf7ctgkij");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    WebElement element = driver.findElement(By.id("keepLoggedInCheckBox"));
    String value = element.getAttribute("type");
    System.out.println(value);
  

}
}
