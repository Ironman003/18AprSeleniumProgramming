package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class playWithSearchContext {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("ok", "chromedriver.exe");
//	SearchContext obj = new ChromeDriver();
	WebDriver obj2 = new ChromeDriver();
	obj2.get("https://www.google.co.in/");
	obj2.findElement(By.partialLinkText("हि")).click();
//	obj2.findElement(By.name("q")).sendKeys("ok google");
//	obj2.switchTo().window("");
//	Thread.sleep(2000);
//	obj2.close();
}
}
