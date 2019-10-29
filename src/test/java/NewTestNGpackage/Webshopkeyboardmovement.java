package NewTestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Webshopkeyboardmovement {
	WebDriver d;

	@Test(enabled=false)
  public void keywordmovement() throws InterruptedException {
		d=Mydriver123.getDriver("CRM");
		d.get("http://demowebshop.tricentis.com/");
		WebElement el1= d.findElement(By.name("q"));
	Actions act1 = new Actions(d);
	act1.keyDown(el1, Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(1000);
	act1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	d.close();
  }
	@Test(enabled=false)
	  public void hovering() throws InterruptedException {
			d=Mydriver123.getDriver("CRM");
			d.get("https://www.spicejet.com/");
			WebElement el2= d.findElement(By.id("highlight-addons"));
			WebElement el3= d.findElement(By.id("highlight-book"));
			Actions act2 = new Actions(d);
			act2.moveToElement(el2).build().perform();
			Thread.sleep(1000);
			el3.click();
		//d.close();
	  }
	@Test(enabled=false)
	  public void displayed() throws InterruptedException {
			d=Mydriver123.getDriver("CRM");
			d.get("https://www.spicejet.com/");
			
			WebElement el_check= d.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]"));
			WebElement el_button= d.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]"));
		System.out.println("check button is"+el_check.isDisplayed());
		System.out.println("button is"+el_button.isEnabled());
		//d.close();
	  }
	
	
	@Test
	  public void dragdrop() throws InterruptedException {
			d=Mydriver123.getDriver("CRM");
			d.get("https://demos.telerik.com/aspnet-ajax/");
			WebElement dst= d.findElement(By.xpath("//input[@name='DemoSearch_SearchBox']"));
			
			WebElement src= d.findElement(By.xpath("//*[@id=\"overview-controls\"]/div/div[3]/div[1]/ul/li/a"));
			Actions act2 = new Actions(d);
			act2.dragAndDrop(src,dst).build().perform();
			
			 
		    Thread.sleep(1000);
				
	  }
}
