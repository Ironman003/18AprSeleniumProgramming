package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ok implements lengthyPaths {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(store);
	WebElement dd = (WebElement) driver.findElements(By.xpath(cmn));

	
}
}
