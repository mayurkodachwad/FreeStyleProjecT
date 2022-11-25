package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShopping {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_19f32o2up6_e&adgrpid=64607481971&hvpone=&hvptwo=&hvadid=486382369863&hvpos=&hvnetw=g&hvrand=2335565112919391739&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040229&hvtargid=kwd-297775402051&hydadcr=5650_2175716&gclid=Cj0KCQjwnbmaBhD-ARIsAGTPcfWX27qknrURjit01djseePVQDmXOan_qq_ev43mOChaShbE8WGdQTQaAoXUEALw_wcB");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma shoes for men");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(5000);
	
	

	}

}