package I_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameDemo {
	public static void main(String[] args) throws InterruptedException {
		//Step 1: Parent search & click.
		//Step 2: Navigate back.
		//Step 3: I_frame search $ click.
		//Step 4: I_frame search suggestions 1st link click.
		//Step 5: Parent Home click.
		//Step 6: Close.
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		WebElement finda = driver.findElement(By.xpath("//input[@name='s']"));
//		.sendKeys("Webdriver");
		
		JavascriptExecutor sendExcutor = (JavascriptExecutor) driver;
		sendExcutor.executeScript("arguments[0].value='Webdriver';", finda);
		WebElement searchMain = driver.findElement(By.xpath("//button[@class='button_search']"));
		
		JavascriptExecutor parentSearchExecutor = (JavascriptExecutor) driver;
		parentSearchExecutor.executeScript("arguments[0].click();", searchMain);
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		WebElement iFrameName = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));

		driver.switchTo().frame(iFrameName);

		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("ChromeDriver");
		WebElement searchFrame = driver.findElement(By.xpath("//button[@class='button_search']"));
		searchFrame.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Permalink to Handle Browser Notification using Selenium']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		WebElement homeClick = driver.findElement(By.xpath("//a[text()='Home'][1]"));
		Thread.sleep(2000);
		homeClick.click();
		
		driver.switchTo().parentFrame();
		
		WebElement clickHome = driver.findElement(By.xpath("//span[text()='Home']"));
		
		JavascriptExecutor parentHomeExcutor = (JavascriptExecutor) driver;
		parentHomeExcutor.executeScript("arguments[0].click();", clickHome);
		Thread.sleep(2000);
		System.out.println("Atomation Executed Successfully");
		
		driver.close();

	}
}
