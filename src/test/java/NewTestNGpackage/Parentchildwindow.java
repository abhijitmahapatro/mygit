package NewTestNGpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Parentchildwindow {
	WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  d=Mydriver123.getDriver("CRM");
	  d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  d.get("https://retail.onlinesbi.com/retail/login.htm");
	  String parent=d.getWindowHandle();
	  System.out.println("parent window stringid is"+parent);
	  //Thread.sleep(1000);
	  d.findElement(By.xpath("//*[@id=\"homeLoanButton\"]/a/img")).click();
	  String parent1=d.getWindowHandle();
	  System.out.println("parent window stringid is"+parent1);
	  Set<String> child_wid = d.getWindowHandles();
	  for(String s:child_wid ) 
	  {
		  d.switchTo().window(s);
		  System.out.println(d.getWindowHandle());
	  }
	  
	  d.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[13]/a/img")).click();
	  
	  
	  //d.close();
	  
  }
}
