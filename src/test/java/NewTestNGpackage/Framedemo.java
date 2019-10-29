package NewTestNGpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Framedemo {
	WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  d=Mydriver123.getDriver("CRM");
	  d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	  d.switchTo().frame(d.findElement(By.name("iframeResult")));
	  d.findElement(By.xpath("//button[text()='Try it']")).click();
	  Thread.sleep(1000);
	  if(ExpectedConditions.alertIsPresent()!=null)
	  {
		  Alert altr1=d.switchTo().alert();
		  String A_txt = altr1.getText();
		  altr1.accept();
	  }
	  d.switchTo().defaultContent();
	  //String A_text2=d.findElement(By.xpath(""));
  }
}
