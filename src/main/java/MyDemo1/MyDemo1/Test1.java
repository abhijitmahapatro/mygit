package MyDemo1.MyDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Some;
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		Some = new ChromeDriver();
		Some.get("http://10.232.237.143:443/TestMeApp/");
		
		WebElement SignInLink = Some.findElement(By.linkText("SignIn"));
		SignInLink.click();
		
		WebElement username= Some.findElement(By.name("userName"));
		username.sendKeys("lalitha");
		
		WebElement password= Some.findElement(By.name("password"));
		password.sendKeys("Password123");
		
		WebElement login= Some.findElement(By.name("Login"));
		login.click();
		
		String A_title= Some.getTitle();
		String E_title= "Home";
		if(A_title.equals(E_title))
           System.out.println("login sucessful");
		else
			
			System.out.println("login not sucessful");
		Some.close();
		

		
	}

}
