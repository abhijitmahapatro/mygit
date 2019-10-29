package NewTestNGpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class demowebshopexcelsheetimport {
	WebDriver d;
  @Test
  public void f() throws IOException {
//	  d =  Mydriver123.getDriver("CRM");
//	d.get("http://demowebshop.tricentis.com/");
//		d.manage().window().maximize();
	  File fin= new File("C:\\Users\\Training_h2a.06.17\\Desktop\\Excelsheetreport1.xlsx");
	  FileInputStream fis= new FileInputStream(fin);
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  XSSFSheet sh= wb.getSheetAt(0);
	  int total_rows= sh.getLastRowNum();
	  for(int i=1;i<=total_rows;i++) 
	  {   d =  Mydriver123.getDriver("CRM");
	     d.get("http://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		  d.findElement(By.linkText("Register")).click();
		  d.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
	  d.findElement(By.xpath("//input[@name='Email']")).sendKeys(sh.getRow(i).getCell(2).getStringCellValue());
	  d.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
	  d.findElement(By.xpath("//input[@name='LastName']")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
	  d.findElement(By.xpath("//input[@name='Password']")).sendKeys(sh.getRow(i).getCell(3).getStringCellValue());
	  d.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(sh.getRow(i).getCell(4).getStringCellValue());
	  d.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	  String atext= d.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
	  String etxt="Your registration completed";
	  Assert.assertEquals(etxt, atext);
	  sh.getRow(i).createCell(5).setCellValue("userregistrationcompleted");
	  FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\Training_h2a.06.17\\Desktop\\Excelsheetreport1.xlsx"));
	  wb.write(fout);
	  d.close();
	   }
	  wb.close();
  }
}
