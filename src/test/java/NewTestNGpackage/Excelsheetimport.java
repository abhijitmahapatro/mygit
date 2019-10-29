package NewTestNGpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelsheetimport {
  @Test
  public void f() throws IOException {
	  File fin= new File("C:\\Users\\Training_h2a.06.17\\Desktop\\Excelsheetreport.xlsx");
	  FileInputStream fis= new FileInputStream(fin);
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  XSSFSheet sh= wb.getSheetAt(0);
	  int total_rows= sh.getLastRowNum();
	  System.out.println("total_rows");
	  for(int i=0;i<=total_rows;i++) 
	  {
		  String uname=sh.getRow(i).getCell(0).getStringCellValue();
		  System.out.println(uname);
		  String passwrd= sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(passwrd);
		  sh.getRow(i).createCell(2).setCellValue("validuser");
		  FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\Training_h2a.06.17\\Desktop\\Excelsheetreport.xlsx"));
		  wb.write(fout);
	  }
	  
	  wb.close();
  }
}
