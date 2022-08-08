package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class popUpsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		/*
		 * WebElement dangerBtn =
		 * driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		 * dangerBtn.click(); Thread.sleep(2000); Alert pop = driver.switchTo().alert();
		 * Thread.sleep(2000); System.out.println(pop.getText()); pop.accept(); //
		 * pop.dismiss(); // pop.sendKeys("abc"); // gives no alert present exception
		 * driver.close();
		 */

		/*************************************************************************/

		/*
		 * WebElement alertwithokClick =
		 * driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		 * alertwithokClick.click(); WebElement btnClick = driver .findElement(By.
		 * xpath("//button[text()='click the button to display a confirm box ']"));
		 * btnClick.click(); Thread.sleep(2000); Alert pop = driver.switchTo().alert();
		 * // pop.accept(); System.out.println(pop.getText()); pop.dismiss(); //
		 * pop.accept(); WebElement gettxt =
		 * driver.findElement(By.xpath("//p[@id='demo']"));
		 * System.out.println(gettxt.getText());
		 */

		WebElement alWithTxtBoxClick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alWithTxtBoxClick.click();

		WebElement btnClick = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnClick.click();

		Alert pop = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(pop.getText());

//		JavascriptExecutor js = (JavascriptExecutor)driver;

		// Call the JavascriptExecutor methods
//        js.executeScript("arguments[0].sendKeys();", "hi");

//		pop.sendKeys("hi this is olivia");
//		Thread.sleep(5000);
//		((WebElement) pop).click();
//		
//		pop.sendKeys("huhih");

//		JavascriptExecutor jse = ((JavascriptExecutor) driver);
//		WebElement email = driver.findElement(By.id("useremail"));
//		jse.executeScript("arguments[0].value='---your email id---';", pop);
		
		Thread.sleep(2000);
		pop.accept();
		WebElement demo = driver.findElement(By.xpath("//p[@id='demo1']"));
		String txttxt = demo.getText();
		System.out.println(txttxt);
		driver.close();

	}
}
