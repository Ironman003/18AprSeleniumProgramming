package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	
		WebElement select = driver.findElement(By.xpath("//button[normalize-space(text())='Select']"));

		
		 
		
		List<WebElement> dropDownValues = driver.findElements(By.xpath("//ul[@class='dropdown-menu'][1]//li"));
		System.out.println(dropDownValues.size());
		int stored = dropDownValues.size();

		Actions act = new Actions(driver);
		act.moveToElement(select).click().build().perform();
		
		for (int i = 0; i < stored; i++) {
		act.moveToElement(select).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.moveToElement(select).click().build().perform();
		}
		
		Thread.sleep(2000);
		driver.close();

	}
}
