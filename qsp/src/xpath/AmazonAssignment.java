package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_1jyasdi57f_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486459496700&hvpos=&hvnetw=g&hvrand=16092104491020594704&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040229&hvtargid=kwd-295905178780&hydadcr=14451_2154369&gclid=CjwKCAjw-rOaBhA9EiwAUkLV4hrGHLS2GzjiE567PAV4W7XrAlR0KX8b9zwb4P6xCKZDuZJ1BsmBexoCg1QQAvD_BwE");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung mobile");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Samsung']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='256 GB & above']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='8 GB & above']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='4000 mAh & More']")).click();
        Thread.sleep(5000);
       
	}

}
