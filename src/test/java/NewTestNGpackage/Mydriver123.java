package NewTestNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mydriver123 {

	public static WebDriver getDriver(String BrNm) {
		
		
		if(BrNm.equals("CRM"))
		{

			  System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
			  return new ChromeDriver();
		}
		    else if(BrNm.equals("IEEE"))
			{System.setProperty("webdriver.ie.driver","C:\\MyDrivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			return new InternetExplorerDriver();
			}
		    else
		// TODO Auto-generated method stub
		return null;

	}

}
