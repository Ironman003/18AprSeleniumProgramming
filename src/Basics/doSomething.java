package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class doSomething {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("demo", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
//		Thread.sleep(3000);
		driver.navigate().back();
//		Thread.sleep(2000); /// compiler known, thats why called checked exception
		driver.navigate().forward();
//		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String s = "Rediff.com";
		String s1 = driver.getTitle();
		
		if (s.equals(s1)) {
			System.out.println("title case passed" +s1);
		}
		else {
			System.out.println("title case failed");
		}
		Dimension d = new Dimension(600,800);
		Point p = new Point(300, 500);
		
//		driver.manage().window().setSize(d);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
//		driver.close();
		
		
	}
}
