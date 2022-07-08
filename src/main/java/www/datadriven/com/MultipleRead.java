package www.datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleRead {
	
	public static void readMultiData() throws IOException {

		File f=new File("C:\\Users\\320122200\\OneDrive - Philips\\Desktop\\Eclipse\\Mavenproject\\dataset\\multidata.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
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
			
			}
		}
		public static void main(String[] args) throws IOException {
			
			readMultiData();
			
			System.out.println("success");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	


