package NewTestNGpackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DemoWebshopexampledemo1 {
	
	
	WebDriver d;

	
  @Test
  public void f() {
	    System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://demowebshop.tricentis.com/");
		
		WebElement loginlink=d.findElement(By.linkText("Log in"));
		loginlink.click();
		
		WebElement emailid=d.findElement(By.name("Email"));
		emailid.sendKeys("abhijit1997bam@gmail.com");
		
		WebElement passwrd=d.findElement(By.name("Password"));
		passwrd.sendKeys("sinu1997");
		
		WebElement submit=d.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		submit.click();
		
		String A_title = d.getTitle();
		String E_title = "Demo Web Shop";
		Assert.assertEquals(E_title,A_title);
		System.out.println("sucess");
		d.close();
  }
  
  
}
