package day61_ExcelReadWrite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWrite {
	
	String filePath;
	String sheetName;
	FileInputStream file;
	Workbook book;
	Sheet sheet;
	Cell cell;
	

	public Cell readData(int rowNum, int cellNum) {
		try {

		file = new FileInputStream(this.filePath);
		book = WorkbookFactory.create(file);
		sheet = book.getSheet(this.sheetName);
		cell = sheet.getRow(rowNum).getCell(cellNum);
		}catch(Exception e) {
			System.out.println("Could not find the cell");
		}
		return cell;

	}

	public Cell writeData(int rowNum, int cellNum, String newValue) {
		
		try {
		file = new FileInputStream(this.filePath);
		book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet(this.sheetName);
		cell = sheet.getRow(rowNum).getCell(cellNum);
		cell.setCellValue(newValue);
		}catch(Exception e) {
			System.out.println("Could not find the cell");
		
		}
		return cell;

	}
	public static void main(String[] args) {

		ExcelReadWrite obj=new ExcelReadWrite();
		obj.filePath="/Users/yusufkucukvatan/Desktop/TestData.xlsx";
		obj.sheetName="Sheet1";
		
		Cell cell1=obj.readData(1, 0);
		System.out.println(cell1);
		
		Cell cell2=obj.writeData(1, 0, "Murat");
		System.out.println(cell2);
		
	}

}
