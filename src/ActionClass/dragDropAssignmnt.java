package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDropAssignmnt {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement debEle5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement creEle5000 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement dragBank = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
	WebElement drangBankAmt = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
	WebElement dragLoan = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
	WebElement dragLoanAmt = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
	
	Actions act = new Actions(driver);
	Thread.sleep(1000);
	act.dragAndDrop(debEle5000, drangBankAmt).build().perform();
	Thread.sleep(1000);
	act.dragAndDrop(bank, dragBank).build().perform();
	Thread.sleep(1000);
	act.dragAndDrop(creEle5000, dragLoanAmt).build().perform();
	Thread.sleep(1000);
	act.dragAndDrop(sales, dragLoan).build().perform();
	Thread.sleep(5000);
	WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
	if (perfect.isEnabled()) {
		System.out.println("test case passed ");
	}
	else {
		System.out.println("test case not passed");
	}
	driver.close();
	
}
}
