package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryThis {
	public static void main() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("testing");
        WebElement list = driver.findElement(By.xpath("//ul[@class=\"G43f7e\"]//li//descendant::div[@class=\"wM6W7d\"]"));
      
       System.out.println(list.getSize());
		
	}
}
