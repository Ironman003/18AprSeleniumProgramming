package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelDemo {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream obj = new FileInputStream("EXCEL/book1.xls");
		Sheet sheetStore = WorkbookFactory.create(obj).getSheet("Sheet1");
		
		
		for (int row = 0; row <= sheetStore.getLastRowNum(); row++) {
			try {
			String valueStore;
				for (int col = 0; col <= sheetStore.getRow(row).getLastCellNum(); col++) {
					valueStore = sheetStore.getRow(row).getCell(col).getStringCellValue();
					System.out.print(valueStore+"  ");					
				}
			} catch (Exception e) {
				// TODO: handle exception
//				System.out.println(e);
			}
			System.out.println("");
		}

	}
}
