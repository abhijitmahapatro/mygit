package NewTestNGpackage;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class internalexcelcreation {
  @Test
  public void f() throws IOException {
	  XSSFWorkbook wb= new XSSFWorkbook();
	  FileOutputStream fout=new FileOutputStream(new File("abhijit1234.xlsx"));
	  wb.write(fout);
	  wb.close();
  }
}
