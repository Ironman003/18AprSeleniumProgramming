package RediffAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demooooo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver obj = new ChromeDriver();
		obj.get("https://is.rediff.com/signup/register");
		WebElement demo = obj.findElement(By.xpath("//input[@id='fullname']"));
		demo.sendKeys("Akshay");
		Thread.sleep(2000);
		System.out.println(demo.getAttribute("value"));	

	}
}
