package chap_7;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.*;
public class Main5 {
public static void main(String[] args) {
	Workbook book = new XSSFWorkbook();
	Sheet sheet = book.createSheet();
	Row row = sheet.createRow(0);
	row.creteCell(0).setCellValue("ひのきのぼう");
	row.creteCell(1).setCellValue(5);
	row.creteCell(2).setCellValue(22);
	row.creteCell(3).setCellValue("B1*C1");

	try (OutputStream file = new FileOutputStream("workbook.xlsx")){
		book.write(file);
	}
	
}
}
