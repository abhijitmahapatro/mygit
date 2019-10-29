package NewTestNGpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter {
	
  @Test
  @Parameters({"Location", "Designer"})
  public void f(String Location,String Designer) 
  {
	System.out.println("Test case for login");
	System.out.println(Location);
	System.out.println(Designer);
  }
  
  @Test
  @Parameters({"Location","Designer"})
  public void g(String Location,String Designer) 
  {
	  System.out.println("Test case for registration");
		System.out.println(Location);
		System.out.println(Designer);
  }
  @Test
  @Parameters({"Job","Location"})
  public void b(String Job,String Location) 
  {
	  System.out.println("Test case for location");
		System.out.println(Location);
		System.out.println(Job);
  }
}
