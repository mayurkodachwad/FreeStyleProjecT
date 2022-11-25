package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//avoid illegelstateexception
		ChromeDriver driver =new ChromeDriver();//launches chrome browser
		Thread.sleep(8000);
		driver.close();//close chrome browser
		
		

	}

}
