package Synchronization;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeExp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("login page title matched | Test case pass|");
			
		}
		else
		{
			System.out.println("login page title not matched | Test case fail |");
			
		}
		driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        
        String actualHomePageTitle = driver.getTitle();
        if(actualHomePageTitle.equals("actiTime-Enter Time-Track"))
        {
        	 System.out.println("Home page title matched | Test case pass |");
        	 
        }
        else
        {
        	System.out.println("Home page title not matched | Test case fail |");
        }
		
             

	}

}
