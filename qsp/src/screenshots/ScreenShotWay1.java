package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    ChromeDriver chrome = new ChromeDriver();
    chrome.manage().window().minimize();
    chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    chrome.get("https://www.selenium.dev/");
    File src = chrome.getScreenshotAs(OutputType.FILE);
    File dest = new File("./ScreenShots/screenshot1.jpg");
    Files.copy(src, dest);
    
	}

}
