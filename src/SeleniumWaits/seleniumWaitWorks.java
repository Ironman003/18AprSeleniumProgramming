package SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumWaitWorks {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	WebDriverWait obj = new WebDriverWait(driver, 12);
	WebDriverWait obj = new WebDriverWait(driver, 12);

	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.NANOSECONDS);
	
	
//	driver.findElement(By.xpath("//div[@id='skip-navigation']//ytd-button-renderer[@class='style-scope ytd-masthead style-default size-default']//a[@class='yt-simple-endpoint style-scope ytd-button-renderer']")).click();
	driver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-signin-promo-renderer/ytd-button-renderer/a")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("ok");
	System.out.println(driver.getTitle());
//	driver.close();
}
}