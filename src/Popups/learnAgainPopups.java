package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnAgainPopups {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver  =  new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@ class=\"btn btn-danger\"]")).click();
			driver.findElement(By.xpath("//button[@ class=\"btn btn-info\"]")).click();
			Alert pop1 = driver.switchTo().alert();
			pop1.sendKeys("ok sended");
			pop1.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'    click the button to display')]")).click();
			Alert pop = driver.switchTo().alert();
			
			pop.accept();
			
			
	}
}
