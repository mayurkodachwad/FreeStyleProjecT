package readPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeLogin {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://127.0.0.1/login.do;jsessionid=x6sq7x5rajde");
	Flib flib = new Flib();
	String validUsername = flib.readPropertyData("./data/config.properties","Username");
    driver.findElement(By.name("username")).sendKeys(validUsername);
    String validPassword = flib.readPropertyData("./data/config.properties","Password");
    driver.findElement(By.name("pwd")).sendKeys(validPassword);
    driver.findElement(By.id("loginButton")).click();
	}

}
