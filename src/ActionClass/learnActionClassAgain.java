package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learnActionClassAgain {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.guru99.com/test/simple_context_menu.html");

		driver.manage().window().maximize();

		WebElement rightClick = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Actions act = new Actions(driver);

		act.moveToElement(rightClick).contextClick().build().perform();

		act.moveToElement(rightClick).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.accept();
		 
		
	}
}
