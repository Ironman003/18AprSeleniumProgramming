package webElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleWebElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("marvel");
		Thread.sleep(2000);
		List<WebElement> store = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		
//		for (WebElement webElement : store) {
//			webElement.getText();
//		
//			System.out.println(webElement.getText());
//		}

//		for (int i = 0; i < store.size(); i++) {
//
//			System.out.println("getText = " + store.get(i).getText());
//			System.out.println("isDisplayed = " + store.get(i).isDisplayed());
//			System.out.println("getTagName = " + store.get(i).getTagName());
//			System.out.println("getDomProperty = " + store.get(i).getDomProperty("name"));
//			System.out.println("getRect = " + store.get(i).getRect());
//			System.out.println("isEnabled = " + store.get(i).isEnabled());
//			System.out.println("isselected = " + store.get(i).isSelected());
//			System.out.println(
//					"index of element =  " + store.get(i).findElement(By.xpath("//li[@role='presentation'][1]")));
//			System.out.println("getAccessibleName = " + store.get(i).getAccessibleName());
//			System.out.println("===================================================================");
//			
//		}
		ArrayList<WebElement> obj =  new ArrayList<>(store);
		for (int i = 0; i < obj.size(); i++) {
			
			obj.get(i);
//			System.out.println(obj.get(i));
			System.out.println(obj.get(i).getText());
			System.out.println(obj.contains(obj.isEmpty()));
		}
		Thread.sleep(2000);
		driver.close();
	}
}
