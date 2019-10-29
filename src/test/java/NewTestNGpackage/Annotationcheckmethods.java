package NewTestNGpackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationcheckmethods {
	@BeforeSuite
	public void new5() {
		System.out.println("1111");
	}
	@AfterSuite
	public void new4() {
		System.out.println("11`1111");
	}
	@BeforeClass
	public void new6() {
		System.out.println("2222");
	}
	@AfterClass
	public void new7() {
		System.out.println("222----2");
	}
	@AfterTest
	public void new2() {
		System.out.println("no");
	}
	@BeforeTest
	public void new1() {
		System.out.println("hiiiii");
	}
	@BeforeMethod
	public void launch() {
		System.out.println("launch the application");
	}
	@AfterMethod
	public void close() {
		System.out.println("close the application");
	}
  @Test(invocationCount=3,enabled=false)
  public void f() {
	  System.out.println("Hi all iam here");
  }
  @Test(invocationCount=2,priority=1)
  public void g() {
	  System.out.println("Hi all iam there");
	 
  } 
  
}
