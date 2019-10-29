 package NewTestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class welcomemercurycallbymethod {
	
	static WebDriver d;
  @Test
  public void f() {
	  
	  
	   // System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		//d = new ChromeDriver();
	     d =  Mydriver123.getDriver("CRM");
		d.get("http://www.newtours.demoaut.com/");
		
		WebElement loginlink=d.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
		loginlink.click();
		
		WebElement firstname=d.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("abhijit");
		
		WebElement lastname=d.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("mahapatro");
		
		WebElement phone=d.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("9040535913");
		
		WebElement username1=d.findElement(By.xpath("//input[@name='userName']"));
		username1.sendKeys("abhijit1997bam@gmail.com");
		
		WebElement Address1=d.findElement(By.xpath("//input[@name='address1']"));
		Address1.sendKeys("suraj vihar,4th lane");
		
		WebElement city1=d.findElement(By.xpath("//input[@name='city']"));
		city1.sendKeys("berhampur");
		
		WebElement state1=d.findElement(By.xpath("//input[@name='state']"));
		state1.sendKeys("odisha");
		

		WebElement postalcode1=d.findElement(By.xpath("//input[@name='postalCode']"));
		postalcode1.sendKeys("760001");
		
		
		
		WebElement cntry=d.findElement(By.xpath("//select[@name='country']"));
		
		Select el1=new Select(cntry);
		el1.selectByValue("6");
		//el1.selectByIndex(2);
		//el1.selectByVisibleText("ANGOLA");
		
		WebElement email=d.findElement(By.name("email"));
		email.sendKeys("abhijit1997bam@gmail.com");
		
		WebElement passwrd=d.findElement(By.name("password"));
		passwrd.sendKeys("sinu1997");
		
		WebElement newpasswrd=d.findElement(By.name("confirmPassword"));
		newpasswrd.sendKeys("sinu1997");
		
		WebElement submit1=d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
		submit1.click();
		
		//String A_title = d.getTitle();
		//String E_title = "Demo Web Shop";
		//Assert.assertEquals(E_title,A_title);
		//System.out.println("sucess");
		d.close();
	  
	  
  }

@Test
public void g() {
	  
	  
	   
	     d =  Mydriver123.getDriver("CRM");
		d.get("http://www.newtours.demoaut.com/");
		

		WebElement dte=d.findElement(By.xpath("//b[contains(text(),' 2019']"));
		String s2=dte.getText();
		System.out.println(s2);
		
		System.out.println(d.getTitle());
		d.findElement(By.linkText("REGISTER")).click();
		System.out.println(d.getCurrentUrl());
		String s=d.getPageSource();
		System.out.println(s);
		
		d.close();
	  
	  
}
}

