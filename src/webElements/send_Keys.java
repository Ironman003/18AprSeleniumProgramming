package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class send_Keys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		List<WebElement> letsSee = driver.findElements(By.xpath("//input[@id='emailid']"));
//		for (WebElement webElement : letsSee) {
//			Thread.sleep(2000);
//			webElement.sendKeys("a","b");
//		}
//	List<WebElement> txts = driver.findElements(By.xpath("//input[@type='text']"));
//	
//	for (WebElement webElement : txts) {
//		System.out.println(webElement.getText());
////		webElement.get.sendKeys("a","b","c","d","e","f");
//	}
	}
}
