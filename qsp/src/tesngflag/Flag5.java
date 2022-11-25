package tesngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(invocationCount=6)
  public void verifyloginButtonEnableDisableStatus() 
  {
	  Reporter.log("disabled !!",true);
  }
}
