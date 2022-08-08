package Basics;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Prog3 {
	public void star() {
		/*
		 * 1 11 111 1111
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		Prog3 obj = new Prog3();
//		obj.star();
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		WebElement test = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		test.sendKeys("testing");
		WebElement store = driver.findElement(By.xpath("//span[text()='testing']//child::b[text()=' techniques']"));
		store.click();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("SCREENSHOTS/testing.png");
		FileUtils.copyFile(src, dest);

		FileInputStream objj = new FileInputStream("EXCEL/testing.xlsx");
		Sheet sheet = WorkbookFactory.create(objj).getSheet("Sheet1");
		String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);
		
		

	}
}