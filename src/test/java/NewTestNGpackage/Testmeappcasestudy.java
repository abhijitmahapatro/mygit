package NewTestNGpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testmeappcasestudy {
	WebDriver d;
	
  @Test
  public void f() {
	  d=Mydriver123.getDriver("CRM");
	  d.get("http://10.232.237.143:443/TestMeApp/");
	  d.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span")).click();
	  d.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span")).click();
	  d.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span")).click();
	  Set<String> child_wid = d.getWindowHandles();
	  for(String s:child_wid ) 
	  {
		  d.switchTo().window(s);
		  //System.out.println(d.getWindowHandle());
	  }
	  d.switchTo().frame(d.findElement(By.name("menu_page")));
	  WebElement c_wid=d.findElement(By.xpath("/html/body/div[1]/div/div/div"));
	  String f = c_wid.getText();
	  System.out.println(f);
	 	  
	  
  }
}
