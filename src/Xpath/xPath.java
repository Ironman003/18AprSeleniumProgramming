package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath implements lengthyWorks {

	public static void main(String[] args) throws InterruptedException {
		// 1. by attribute <input type="text">text</input> done
		// 2. by text - \\ - > text <
		// 3. by contains // nameDemo,nameDemo1 contain =name //dynamic element //done
		// 4. by index // rarely //[@][1] //done

		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(rediffReg);
		driver.findElement(By.xpath(fName)).sendKeys("Akshay Kamble");
		driver.findElement(By.xpath(reddifID)).sendKeys("akshay003");
		driver.findElement(By.xpath(btnAval)).click();
		//div[@id='recommend_text']
		String sd = driver.findElement(By.xpath("//table[@cellspacing='0'][1]")).getText();
		for (int i = 0; i < sd.length(); i++) {
			System.out.println(i);
		}
		driver.findElement(By.xpath(pswd)).sendKeys("akshay003");
		driver.findElement(By.xpath(confirmPswd)).sendKeys("akshay003");
		//need to validate pswdTxt and cPswdTxt 
		//do above step
		String pswdTxt = driver.findElement(By.xpath(pswd)).getText();	
		String cPswdTxt = driver.findElement(By.xpath(confirmPswd)).getText();
		driver.findElement(By.xpath(altEmail)).sendKeys("akshay003@gmail.com");
		WebElement sdd = driver.findElement(By.xpath("//input[contains(@name,'name')][1]"));
		System.out.println(sdd.isSelected());
		Thread.sleep(3000);
		driver.close();

	}
}
