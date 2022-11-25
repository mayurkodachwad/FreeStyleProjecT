package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import readExcelData.Flib;

public class TestActiTimeValidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=120ivxiclow9o");
		Thread.sleep(4000);
		Flib flib = new Flib();
		//read the valid username
		String validUsername = flib.readExcelData("./data/testdata.xlsx","validdata", 1, 0);
		driver.findElement(By.name("username")).sendKeys(validUsername);
		//read the valid password
		String validPassword = flib.readExcelData("./data/testdata.xlsx","validdata", 1, 1);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(4000);
		driver.findElement(By.id("loginButton")).click();

	}

}