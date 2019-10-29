package NewTestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderexample {
	static WebDriver d;
  @Test(dataProvider="dp",priority=1)
  public void f(String s1,String s2)
  {
	     d =  Mydriver123.getDriver("CRM");
		d.get("http://www.newtours.demoaut.com/");
		d.manage().window().maximize();
		d.findElement(By.name("userName")).sendKeys(s1);
		d.findElement(By.name("password")).sendKeys(s2);
	  d.findElement(By.name("login")).click();
	  d.close();
  }
  @DataProvider
  public Object[][] dp(){
	  
	  return new Object[][] {
		  new Object[] {"demo","demo2"},
		  new Object[] {"demo3","demo4"},
		  
	  };
  }
}
