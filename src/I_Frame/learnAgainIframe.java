package I_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnAgainIframe {
	public static void main(String[] args) {
		System.setProperty("Wbdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		JavascriptExecutor sendExcutor = (JavascriptExecutor) driver;
		WebElement ok = driver.findElement(By.xpath("//input[@id=\"s\"]"));
		sendExcutor.executeScript("arguments[0].value='Webdriver';", ok);
		WebElement iframeChild = driver.findElement(By.xpath("//iframe[@name=\"globalSqa\"]"));
		driver.switchTo().frame(iframeChild);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ok.sendKeys("ok_child");
		WebElement btn = driver.findElement(By.xpath("//button[@class=\"button_search\"]"));
		btn.click();
		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
//		ok.sendKeys("ok_parent");
//		btn.click();
		
		
	}
}
