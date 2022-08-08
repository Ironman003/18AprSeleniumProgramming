package Somedoubts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lets_Do_It{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement store = driver.findElement(By.xpath("//input[@id='fullname']"));
		store.sendKeys("Akshay");
		System.out.println("milat nahi = "+store.getText());
		System.out.println("milel = "+store.getAttribute("value"));
	
		Thread.sleep(2000);
		driver.close();
		
	}
}
