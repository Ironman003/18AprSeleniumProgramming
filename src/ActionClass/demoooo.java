package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoooo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://demo.guru99.com/test/simple_context_menu.html");

	driver.manage().window().maximize();
	WebElement seleClick = driver.findElement(By.xpath("//a[normalize-space(text())='Selenium']"));
	List<WebElement> sleList = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
	
	System.out.println(sleList.size());
	Actions act  = new Actions(driver);
	
	act.moveToElement(seleClick).click().build().perform();
	
	for (int i = 0; i <sleList.size(); i++) {
		sleList.get(i).getText();
		System.out.println(sleList.get(i).getText());
		
		String actualTxt="Login";
		String expectedResult = sleList.get(i).getText();
		
		if (expectedResult.equals(actualTxt)) {
			act.moveToElement(sleList.get(i)).click().build().perform();
		}
	}
}
}
