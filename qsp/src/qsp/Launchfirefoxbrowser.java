package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefoxbrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//avoid IllegalStateException
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(8000);
		driver.close();


	}

}
