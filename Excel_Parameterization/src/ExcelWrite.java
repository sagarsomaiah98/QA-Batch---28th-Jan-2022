import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//https://poi.apache.org/components/spreadsheet/quick-guide.html
		
		Workbook wb = new HSSFWorkbook();
		
		try  (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\FEB_WORKSPACE\\Excel_Parameterization\\src\\TESTDATA\\Sample.xls")) {
			
			Sheet sheet1 = wb.createSheet("S1");
			Sheet sheet2 = wb.createSheet("S2");
			
			Row row = sheet1.createRow(0);
			
			Cell cell = row.createCell(0);
			row.createCell(0).setCellValue(1.2);
			row.createCell(1).setCellValue(450);
			row.createCell(2).setCellValue("true");
			
			//Second sheet entry
			
            Row row1 = sheet2.createRow(0);
			
			Cell cell1 = row.createCell(0);
			row1.createCell(0).setCellValue(852);
			row1.createCell(1).setCellValue(154);
			row1.createCell(2).setCellValue("pass");
			
		    wb.write(fileOut);
		    
		    System.out.println("CREATED");
		}
		

	}

}
