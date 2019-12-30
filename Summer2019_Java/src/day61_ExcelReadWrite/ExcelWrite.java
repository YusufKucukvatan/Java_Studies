package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
public static void main(String[] args) throws Exception {
		
		String filePath="/Users/yusufkucukvatan/Desktop/TestData.xlsx";
		String sheetName="Sheet1";
		FileInputStream file=new FileInputStream(filePath);
		Workbook excelFile = WorkbookFactory.create(file);
		Sheet sheet = excelFile.getSheet(sheetName);
		Cell cell=sheet.getRow(1).getCell(0);
		cell.setCellValue("Yusuf");
		String cellData = cell.getStringCellValue();
		System.out.println(cellData);
		
		
	
	}
}
