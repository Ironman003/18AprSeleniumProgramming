package ActionClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.guru99.com/test/simple_context_menu.html");

		driver.manage().window().maximize();
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		System.out.println(rightClick.getSize());
		Actions act = new Actions(driver);

		/*
		 * // Right clicked
		 * act.moveToElement(rightClick).contextClick().build().perform();
		 * 
		 * // Traversed list of right click options for (int i = 0; i < 6; i++) {
		 * act.moveToElement(rightClick).sendKeys(Keys.DOWN).build().perform(); } //
		 * Enterd last list of element
		 * act.moveToElement(rightClick).sendKeys(Keys.ENTER).build().perform();
		 * Thread.sleep(2000);
		 * 
		 * // Switched focus to alert Alert altRightCLick = driver.switchTo().alert();
		 * System.out.println(altRightCLick.getText()); altRightCLick.accept();
		 * Thread.sleep(2000);
		 * 
		 * WebElement doubleClick =
		 * driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"
		 * )); act.moveToElement(doubleClick).doubleClick().build().perform();
		 * Thread.sleep(2000);
		 * 
		 * // Switched focus to alert Alert  altDoubleClick = driver.switchTo().alert();
		 * System.out.println(altDoubleClick.getText()); altDoubleClick.accept();
		 */
		WebElement dragDrop = driver.findElement(By.xpath("//a[text()='Table Demo']"));
		List<WebElement> dragDropsss = driver.findElements(By.xpath("//ul[@class='dropdown-menu'][1]"));
//		System.out.println(dragDrop);

		org.openqa.selenium.Point p = dragDrop.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(dragDrop.getSize());
		WebElement seleniumTab = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		act.moveToElement(seleniumTab).click().build().perform();
		Thread.sleep(2000);
//		act.moveToElement(dragDrop, 0, 31).click().build().perform();
//		act.moveToElement(dragDropsss,150,41);
		act.moveByOffset(0, 161).click().build().perform();
		
		
		
	}

}
