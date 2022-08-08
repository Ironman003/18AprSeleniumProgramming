package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class letsSeeWhatHappns {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://demo.guru99.com/test/simple_context_menu.html");

	driver.manage().window().fullscreen();
	driver.manage().window().maximize();
	WebElement seleClick = driver.findElement(By.xpath("//a[normalize-space(text())='Selenium']"));
//	List<WebElement> sleList = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
	Actions act = new Actions(driver);
	
	act.moveToElement(seleClick).click().build().perform();
	//0 317
	
	
	act.moveByOffset(0, 291).click().build().perform();
}
}
