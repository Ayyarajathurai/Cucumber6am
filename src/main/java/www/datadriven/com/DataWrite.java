package www.datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
public static void writeData() throws IOException {


	File f=new File("C:\\Users\\320122200\\OneDrive - Philips\\Desktop\\Eclipse\\Mavenproject\\dataset\\datasetwrite2.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	//wb.createSheet("data2").createRow(0).createCell(0).setCellValue("email");
	wb.getSheet("data2").getRow(0).getCell(0).setCellValue("phone number");
//	wb.getSheet("data2").getRow(0).createCell(1).setCellValue("passwordnew");
//	wb.getSheet("data2").getRow(0).createCell(2).setCellValue("password confirm");
//	wb.getSheet("data2").getRow(0).createCell(3).setCellValue("name");
//	wb.getSheet("data2").getRow(0).createCell(4).setCellValue("lastname");
//	wb.getSheet("data2").getRow(0).createCell(5).setCellValue("age");
//	wb.getSheet("data2").getRow(0).createCell(6).setCellValue("sex");
//	wb.getSheet("data2").getRow(0).createCell(7).setCellValue("Maritial status");
//	wb.getSheet("data2").getRow(0).createCell(8).setCellValue("state");
//	wb.getSheet("data2").getRow(0).createCell(9).setCellValue("Nationality");
//	wb.getSheet("data2").createRow(1).createCell(0).setCellValue("ayya@gmail");
//	wb.getSheet("data2").getRow(1).createCell(1).setCellValue("@3ayya");
//	wb.getSheet("data2").getRow(1).createCell(2).setCellValue("12$%^&*(345ayya");
//	wb.getSheet("data2").getRow(1).createCell(3).setCellValue("Ayyarajathurai");
//	wb.getSheet("data2").getRow(1).createCell(4).setCellValue("ravi");
//	wb.getSheet("data2").getRow(1).createCell(5).setCellValue("19");
//	wb.getSheet("data2").getRow(1).createCell(6).setCellValue("male");
//	wb.getSheet("data2").getRow(1).createCell(7).setCellValue("single");
//	wb.getSheet("data2").createRow(2).createCell(0).setCellValue("rajaa@gmail");
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);	
}

public static void main(String[] args) throws IOException {
	
	writeData();
	System.out.println("sucess data2");	
}


}
