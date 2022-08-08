package RediffAutomate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class reddifWithExcelautomateFinfElements {
	static int count;
	static int row;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		FileInputStream file = new FileInputStream("EXCEL/firstTsstCaseData.xlsx");
		Sheet storeSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		List<WebElement> elementsByTxt = driver.findElements(By.xpath("//input[@type='text']"));
//		List<WebElement> elementsByTxt = driver.findElements(By.tagName("input"));
//		System.out.println(elementsByPass.size());
//		int lastRow = storeSheet.getRow(arg0)();
		System.out.println(storeSheet.getFirstRowNum());

		for (int i = 0; i < elementsByTxt.size(); i++) {// elements
//			elementsByTxt.get(i);
			for (row = 0; row <= storeSheet.getLastRowNum(); row++) {

				for (int col = 0; col < storeSheet.getRow(row).getLastCellNum(); col++) {
					if (col == i) {
						elementsByTxt.get(i).sendKeys(storeSheet.getRow(row).getCell(col).getStringCellValue());
						Thread.sleep(1000);
					}
				}
			}
			
		}
		

//		List<WebElement> elementsByPass = driver.findElements(By.xpath("//input[@type='password']"));
////		System.out.println(elementsByPass);
//		for (int i = 0; i < elementsByPass.size(); i++) {
////			System.out.println(elementsByPass.get(i));
//			for (int row = 0; row <= storeSheet.getLastRowNum(); row++) {
//				for (int col = 9; col <storeSheet.getRow(row).getLastCellNum();col++) {
//					if (col == 9 && col<=10) {
//						elementsByPass.get(i).sendKeys(storeSheet.getRow(row).getCell(col).getStringCellValue());
//						Thread.sleep(1000);
//					}
//				}
//			}
//		}
//		WebElement genderSlection = driver.findElement(By.xpath("//input[@value='m']"));
//		genderSlection.click();
//		WebElement day = driver.findElement(By.xpath("//select[@id='date_day']"));
//		WebElement month = driver.findElement(By.xpath("//select[@id='date_mon']"));
//		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
//		Select sDay = new Select(day);
//		Select sMonth = new Select(month);
//		Select sYear = new Select(year);
//		sDay.selectByVisibleText(storeSheet.getRow(0).getCell(6).getStringCellValue());
//		Thread.sleep(1000);
//		sMonth.selectByVisibleText(storeSheet.getRow(0).getCell(7).getStringCellValue());
//		Thread.sleep(1000);
//		sYear.selectByVisibleText(storeSheet.getRow(0).getCell(8).getStringCellValue());
//		driver.findElement(By.xpath("//input[@type='submit']")).click();;
//		Thread.sleep(2000);
//		System.out.println("Automtion done!!!.");
//		driver.close();
	}

}
