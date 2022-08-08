package RediffAutomate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class solveThis {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		FileInputStream file = new FileInputStream("EXCEL/firstTsstCaseData.xlsx");
		Sheet storeSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		List<WebElement> elementsByTxt = driver.findElements(By.xpath("//input[@type='text']"));
//		List<WebElement> elementsByTxt = driver.findElements(By.tagName("input"));
//		System.out.println(elementsByTxt.size());
	
//		for (int i = 0; i < elementsByTxt.size(); i++) {
//			elementsByTxt.get(i);
//			for (int row = 0; row <= storeSheet.getLastRowNum(); row++) {
//				for (int col = 0; col < storeSheet.getRow(row).getLastCellNum(); col++) {
//					if (col == i) {
//						elementsByTxt.get(i).sendKeys(storeSheet.getRow(row).getCell(col).getStringCellValue());
//					}
//				}
//			}
//		}
//		List<WebElement> elementsByPass = driver.findElements(By.xpath("//input[@type='password']"));
//		System.out.println(elementsByPass);
//		for (int iii = 0; iii < elementsByPass.size(); iii++) {
//			System.out.println(elementsByPass.get(iii));
//			for (int row = 0; row <= storeSheet.getLastRowNum(); row++) {
//				for (int col = 9; col <storeSheet.getRow(row).getLastCellNum();col++) {
//					if (col == 9 && col<=10) {
//						elementsByPass.get(iii).sendKeys(storeSheet.getRow(row).getCell(col).getStringCellValue());
//					}
//				}
//			}
//			
//		}
		WebElement genderSlection = driver.findElement(By.xpath("//input[@value='m']"));
		genderSlection.click();

		List<WebElement> select = driver.findElements(By.tagName("select"));
		for (int ii = 0; ii < select.size(); ii++) {
			WebElement s = select.get(ii);
			System.out.println(s);
//			System.out.println(select.get(ii));
			for (int row = 0; row <= storeSheet.getLastRowNum(); row++) {
				for (int col = 6; col <storeSheet.getRow(row).getLastCellNum(); col++) {
//					System.out.println(storeSheet.getRow(row).getLastCellNum());
					if (col >= 6 && col<9) {
					select.get(ii).sendKeys(storeSheet.getRow(row).getCell(col).getStringCellValue());
					System.out.println(storeSheet.getRow(row).getCell(col));
					}
				}
			}
		}
		
		Thread.sleep(1000);
//		driver.close();
	}
	

}
