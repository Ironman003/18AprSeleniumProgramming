package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();

		WebElement newWindow = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		newWindow.click();

		Set<String> storeWindows = driver.getWindowHandles();
		System.out.println(storeWindows);

		Iterator<String> itr = storeWindows.iterator();

		String[] save = new String[10];
		int count=0;
		for (int i = 0; i < storeWindows.size(); i++) { // 2
			save[i] = itr.next();
			count++;
			
		}
//		System.out.println(count);
		WebDriver mainWindow = driver.switchTo().window(save[0]);
		System.out.println(driver.getTitle());

		WebDriver subWindow = driver.switchTo().window(save[1]);
		Thread.sleep(1000);
		mainWindow.close();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement search1 = driver.findElement(By.xpath("//a[@class='submit text-disable'][1]"));
		search1.click();
		
		WebElement search2 = driver.findElement(By.xpath("//input[@title='Search form'][1]"));
		search2.sendKeys("ok");
		Thread.sleep(2000);
		System.out.println("how? = " + search2.getAttribute("value"));
		driver.close();

	}
}
