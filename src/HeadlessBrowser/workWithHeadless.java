package HeadlessBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class workWithHeadless {
public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	ChromeOptions chOp = new ChromeOptions();
	chOp.addArguments("headless");
	WebDriver driver = new ChromeDriver(chOp);
	driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
}
}
