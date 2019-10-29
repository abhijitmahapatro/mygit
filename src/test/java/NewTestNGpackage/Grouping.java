package NewTestNGpackage;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups= {"Regression","Sanity"})
  public void login() {
	  System.out.println("open log in  page for regressiuon& sanity");
  }
  @Test(groups= {"Smoke"})
  public void searchbyproduct() {
	  System.out.println("search product in  page for smoke");
  }
  @Test(groups= {"Regression"})
  public void signout() {
	  System.out.println("signout for regressiom");
  }
  
}
