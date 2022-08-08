package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDemo2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//file input stream obj
	//workbookfactory sheet create get and store
	//row and col	
		FileInputStream file = new FileInputStream("EXCEL/book1.xls");
		Sheet storeSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		XSSFWorkbook obj = new XSSFWorkbook("EXCEL/book1.xls");
//		XSSFSheet storeSheet = obj.getSheet("Sheet1");
		for (int row = 0; row <= storeSheet.getLastRowNum(); row++) {
			System.out.println();
//			for (int col = 0; col < storeSheet.getRow(row).getLastCellNum(); col++) {
////				String valueStore = storeSheet.getRow(row).getCell(col).getStringCellValue().toLowerCase(); 
//				System.out.print(valueStore +" ");
//				}
			System.out.println("");
		}
		
	}
}
