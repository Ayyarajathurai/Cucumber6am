package www.datadriven.com;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	
	public void readParticularData() throws IOException {

		File f=new File("C:\\Users\\320122200\\OneDrive - Philips\\Desktop\\Eclipse\\Mavenproject\\dataset\\21-Feb-2022 Daily_Ticket-status_.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);		
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(CellType.STRING))
		{
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
			
		}
		else if(cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int numericValue=(int) numericCellValue ;
			System.out.println(numericValue);
			
		}
		else {
			System.out.println("invalid commands");
		}
	}	
	
	
public static void main(String[] args) throws IOException {
		
		//readParticularData();
	ReadData rd=new ReadData ();
	rd.readParticularData();
		
	}
	
}	
	

