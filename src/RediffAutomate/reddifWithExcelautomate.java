package RediffAutomate;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reddifWithExcelautomate {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();

		WebElement fnameText = driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement eidTxt = driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement passText = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement repassText = driver.findElement(By.xpath("//input[@id='repass']"));

		FileInputStream file = new FileInputStream("EXCEL/firstTsstCaseData.xlsx");
		Sheet sheetStore = WorkbookFactory.create(file).getSheet("Sheet1");
		fnameText.sendKeys(sheetStore.getRow(0).getCell(0).getStringCellValue());
		eidTxt.sendKeys(sheetStore.getRow(0).getCell(1).getStringCellValue());
		passText.sendKeys(sheetStore.getRow(0).getCell(2).getStringCellValue());
		repassText.sendKeys(sheetStore.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(2000);
//		driver.close();
		driver.getWindowHandle();
		
		
		String win[] = new  String[10];
		System.out.println(""+win.length);

	}

}
