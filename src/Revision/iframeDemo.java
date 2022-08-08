package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframeDemo {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
//		WebElement iframeName = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame("globalSqa");
		WebElement store = driver.findElement(By.xpath("//input[@id=\"s\"]"));
		WebElement paraSearch = driver.findElement(By.xpath("//a[@href=\"https://in.pinterest.com/globalsqa/\"][1]"));
		WebElement goThere = driver.findElement(By.xpath("//div[text()='+91-9910979218'][1]"));
		store.sendKeys("ok");
		
//		JavascriptExecutor jse = ((JavascriptExecutor)driver);
//		jse.executeScript(null, args);
//		jse.executeAsyncScript("arguments[0].scrollIntoView",paraSearch);
//		jse.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
//		jse.executeScript("window.scrollBy(0,0)");
//		store.sendKeys("parent search");
//		jse.executeAsyncScript("arguments[0].value='Webdriver", store);
		Actions act =  new Actions(driver);
		act.moveToElement(goThere).build().perform();
		driver.switchTo().parentFrame();
		paraSearch.sendKeys("ok parent");
//		driver.close();
	}
}
