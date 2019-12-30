package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	public static void main(String[] args) throws Exception {
		
		String filePath="/Users/yusufkucukvatan/Desktop/TestData.xlsx";
		String sheetName="Sheet1";
		FileInputStream file=new FileInputStream(filePath);
		Workbook excelFile = WorkbookFactory.create(file);
		Sheet sheet = excelFile.getSheet(sheetName);
		Cell cell=null;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				cell=sheet.getRow(i).getCell(j);
				//String cellData=cell.toString();
				System.out.println(cell);
				
			}
		}
		
		
	
	}
}
