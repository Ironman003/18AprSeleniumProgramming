package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_Scroll {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/");
	driver.manage().window().maximize();
	
	
	WebElement specificElement = driver.findElement(By.xpath("//a[text()='Get Started for Free']"));
	//	String javascript = "window.scrollBy(0,500)";  
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
//	jsExecutor.executeScript("window.scrollBy(0,2000)");
//	Thread.sleep(2000);
//	jsExecutor.executeScript("arguments[0].scrollIntoView();",	specificElement);
//	Thread.sleep(2000);
//	jsExecutor.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
//	WebElement startPoint = driver.findElement(By.xpath("//a[text()='JavaScript Reference'][1]"));
//	startPoint.click();
	System.out.println(specificElement.isDisplayed());
	jsExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	Thread.sleep(1000);
//	driver.close();
}
}
