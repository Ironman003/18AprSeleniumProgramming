package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lernChildWindowAgain {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		WebElement newWindow = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		newWindow.click();
		
		/* Set<String> windows = driver.getWindowHandles();
		  Iterator<String> itr = windows.iterator();
		  System.out.println(itr);
		  String[] store = new String[10];
		  for (int i = 0; i <= windows.size(); i++) {
			store[i] = itr.next();
			System.out.println(store[i]);
			driver.switchTo().window(store[0]);
			driver.manage().window().maximize();
		
		}*/
		
		Set<String> windows = driver.getWindowHandles();
		 Iterator <String>  it = windows.iterator();
		 String[] storeWindows = new String[10];
		 for(int i = 0 ; i <= windows.size();i++) {
			 storeWindows[i] = it.next();
			 if (storeWindows[i].equals("")) {
				 driver.switchTo().window(storeWindows[i]);
				
			}
			 
		 }
	}
}
