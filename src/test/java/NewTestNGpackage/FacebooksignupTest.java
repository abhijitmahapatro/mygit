package NewTestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebooksignupTest {
	static WebDriver d;
  @Test
  public void f() {
	  
	    d =  Mydriver123.getDriver("CRM");
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		WebElement firstname1=d.findElement(By.xpath("//input[@name='firstname']"));
		firstname1.sendKeys("srinivas");
		
		WebElement lastname1=d.findElement(By.xpath("//input[@name='lastname']"));
		lastname1.sendKeys("p");
		
		WebElement email1=d.findElement(By.xpath("//input[@name='reg_email__']"));
		email1.sendKeys("situn1997bam@gmail.com");
		
		WebElement remail1=d.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		remail1.sendKeys("situn1997bam@gmail.com");
		
		WebElement password1=d.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password1.sendKeys("pppp@12");
		
		WebElement birthdate=d.findElement(By.xpath("//select[@name='birthday_day']"));
		Select el1=new Select(birthdate);
		el1.selectByValue("2");
		
		WebElement birthmonth=d.findElement(By.xpath("//select[@name='birthday_month']"));
		Select el2=new Select(birthmonth);
		el2.selectByIndex(3);
		
		WebElement birthyear=d.findElement(By.xpath("//select[@name='birthday_year']"));
		Select el3=new Select(birthyear);
		el3.selectByValue("1997");
		
		WebElement gender1=d.findElement(By.xpath("//input[@value='2']"));
		gender1.click();
		
		WebElement signup=d.findElement(By.name("websubmit"));
		signup.click();
			d.close();
  }
}
