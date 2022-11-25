package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandleMethod {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	Thread.sleep(4000);
	String parentHandle = driver.getWindowHandle();
	System.out.println(parentHandle+" is because we used getwindowHandle");
	Set<String> allhandles = driver.getWindowHandles();
	
	for(String handle:allhandles)
	{
		System.out.println(handle+ " is because of getWindowHandles");
		
	}

	}

}
