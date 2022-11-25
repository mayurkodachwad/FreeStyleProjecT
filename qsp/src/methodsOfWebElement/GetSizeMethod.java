package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://127.0.0.1/login.do;jsessionid=3cd2mf7ctgkij");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    WebElement element = driver.findElement(By.xpath("//td[.='Username:']"));
     Dimension values = element.getSize();
       int width = values.getWidth();
       int hight = values.getHeight();
       System.out.println("Hight of webelement : "+hight+"width of webelement : "+width);
  

}

}
