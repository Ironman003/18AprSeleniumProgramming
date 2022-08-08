package Popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowCheckThis {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();

		WebElement newWindow = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		newWindow.click();
		
		Set<String> windows = driver.getWindowHandles();

		System.out.println(windows.size());// 2
		Iterator<String> itr = windows.iterator();
		System.out.println(itr);
		String[] store = new String[10];
		for (int i = 0; i < windows.size(); i++) {
			store[i] = itr.next();
			Thread.sleep(2000);
			System.out.println(store[i]);
			WebDriver windowSore = driver.switchTo().window(store[i]);
			if (store[i].equals("CDwindow - AA6677FC78A249418998956F4A4EDD7C")) {
				
				driver.switchTo().window(store[i]);
			System.out.println("title  = " +driver.getTitle());
			}
			
		}

		Thread.sleep(2000);
		driver.close();
	}
}
