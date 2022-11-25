package tesngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test
  public void loginMethod() 
  {
	  Reporter.log("logging in....",true);
  }
  @Test(dependsOnMethods="loginMethod")
  public void createUser() 
  {
	  Reporter.log("creating user...",true);
  }
  @Test(priority=1)
  public void logoutmethod() 
  {
	  Reporter.log("logging out....",true);
  }
}
