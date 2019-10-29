package NewTestNGpackage;

//
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Findingnooflinks {
	static WebDriver d;
  @Test
  public void f() {
	  d =  Mydriver123.getDriver("CRM");
		d.get("http://www.newtours.demoaut.com/");
		
		List <WebElement> T_links = d.findElements(By.tagName("a"));
		int cnt_links = T_links.size();
		System.out.println(cnt_links);
		
		for(int i=0;i<cnt_links;i++)
		{
			String txt= T_links.get(i).getText();
			System.out.println(txt);
		}
		d.close();
		
  }
  @Test
  public void b() {
	  d =  Mydriver123.getDriver("CRM");
		d.get("http://www.newtours.demoaut.com/");
		
		WebDriverWait wt1= new WebDriverWait(d,60);
		wt1.until(ExpectedConditions.presenceOfElementLocated(By.linkText("REGISTER")));
		d.close();
		
  }
}
