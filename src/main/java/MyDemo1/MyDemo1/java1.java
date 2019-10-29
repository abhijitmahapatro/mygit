package MyDemo1.MyDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class java1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Sample;
		System.setProperty("webdriver.ie.driver","C:\\MyDrivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		Sample = new InternetExplorerDriver();
		Sample.get("http://10.232.237.143:443/TestMeApp/");
        Thread.sleep(5000);
        
		//Sample.manage().window().maximize();
		//Sample.close();
	}

}